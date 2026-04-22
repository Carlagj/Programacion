package tema7.ejer2;

import java.sql.*;
import java.util.Scanner;

public class Paises {
    private static final String url = "jdbc:mysql://localhost:3306/geografia_db";
    private static final String user = "root";
    private static final String pass = "password";
    private Connection conexion;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            Connection conn = DriverManager.getConnection(url, user, pass);

            System.out.print("Introduce continente: ");
            String continente = sc.nextLine();
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT c.nombre, p.nombre, c.poblacion " +
                            "FROM ciudad c JOIN pais p ON c.id_pais = p.id " +
                            "WHERE p.continente = ?"
            );
            ps.setString(1, continente);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(
                        "Ciudad: " + rs.getString(1) +
                                " | País: " + rs.getString(2) +
                                " | Población: " + rs.getInt(3)
                );
            }

            conn.setAutoCommit(false);
            try {
                Statement st = conn.createStatement();
                st.executeUpdate("UPDATE ciudad SET poblacion = poblacion + 50000 WHERE nombre='Madrid'");
                // error intencional
                st.executeUpdate("UPDATE ciudadd SET poblacion = poblacion - 50000 WHERE nombre='Barcelona'");
                conn.commit();
                System.out.println("OK");
            } catch (Exception e) {
                conn.rollback();
                System.out.println("Rollback hecho");
            }

            CallableStatement cs = conn.prepareCall("{CALL calcular_poblacion_continente(?, ?)}");
            cs.setString(1, "Asia");
            cs.registerOutParameter(2, Types.INTEGER);
            cs.execute();
            System.out.println("Total Asia: " + cs.getInt(2));

            PreparedStatement ps2 = conn.prepareStatement(
                    "SELECT * FROM ciudad WHERE id_pais = 4"
            );
            ResultSet rs2 = ps2.executeQuery();
            while (rs2.next()) {
                System.out.println(
                        rs2.getString("nombre") + " - " +
                                rs2.getInt("poblacion")
                );
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
