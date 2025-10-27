Enunciados

1. Implementa un método recursivo que determine si un número es primo.

2. Escribe un método recursivo para calcular la serie de Fibonacci hasta n.

3. Haz un método llamado esVocal(), al que se le pasa como parámetro un carácter y retorna un valor true en caso de que
el carácter sea una vocal, y un valor false en caso contrario.

4. Realiza un método redondear() al que se le pasa como parámetro un numero float y los decimales que deben quedar
después de redondear, y retorna el numero redondeado.
Ejemplo: redondear( 234.49234 , 3 )
Da como resultado : 234.492

5. Método factorial(), que calculará el factorial del número que se le pasa como parámetro. Retornará el resultado del
cálculo del factorial, o bien un -1 en caso de que el parámetro pasado sea negativo, y un -2 en caso de que el parámetro
pasado sea cero.

6. Escribe el método inverso(), que recibe un numero y retorna el inverso (si recibe el 1234 da como retorno el 4321).
Prohibido usar método reverse().

7. Método repite(), que recibe como parámetro una cadena de caracteres y un número, y retorna un nuevo String donde
aparece repetida la cadena de caracteres tantas veces como indique el numero pasado como parámetro.

8. Haz dos métodos, una para cifrar() y otro para descifrar() una cadena de caracteres. Estos métodos reciben un String
y retornan ese String ya cifrado o descifrado. Para hacer el cifrado de un String, se cambia cada letra por la que está
dos puestos mas adelante( la a se cambia por la c), teniendo en cuenta que el cambio es circular, es decir, la z se
cambiará por la b. El proceso de descifrado es el contrario. Los caracteres que no sean alfabéticos no registrarán
ningún cambio.

9. Realiza varios métodos para convertir un numero decimal en binario, octal o hexadecimal. Para convertir un numero a
binario se hacen divisiones entre 2 y se guardan los restos; para convertir a octal se divide entre 8 y para convertir a
hexadecimal se divide por 16 (si el resto es 10 se sustituye por una A, si es 11 se sustituye por B, 12 -> C,&, 15->F).
Cada método recibe un número entero y da como resultado un String con el número convertido.
Ejemplo:
Escribe un número: 58
Dará como resultado:
Binario : 111010
Octal : 72
Hexadecimal : 3ª

10. Haz programa que ordene alfabéticamente las letras de una frase. El programa debe pedir por teclado una frase y
escribirla con las letras ordenadas.
Ejemplo: Tecleando la palabra “hola”
Escribirá “ahlo”
El trabajo de ordenar la frase lo realizará un método llamado ordenar() al que se le pasará la frase y la retornará
ordenada. Este método realizará el trabajo de la siguiente manera:
Repetir tantas veces como letras tenga la frase
{
Obtener la letra menor
Añadir esa letra al resultado
Eliminar la letra de la frase original
}
El proceso de obtener la letra menor lo realizará un método llamado
obtenerLetraMenor() al que se le pasa la frase y nos da la letra mas pequeña.
Asimismo el trabajo de eliminar la letra de la frase original lo realizará otro
método llamado eliminarLetra() al que se le pasa la frase y la letra a eliminar y nos da como resultado la frase
modificada.