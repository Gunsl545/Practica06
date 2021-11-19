/**
 *@author Adrián Lima García
 * @version 1.0
 */


/**
 *Clase Parametro, este programa muestra la diferencia entre paso de parámetro por valor, y por referencia.
 */
public class Parametro{
    public static void main(String[] args){
	// Primero definimos un entero (a) y le asignamos un valor
	int a = 1545;
	// Definimos ahora el espacio de memoria de un arreglo (b) de 5 elementos [0,1,2,3,4]
	int [] b = new int[5];
	// Al elemento a le aplicamos el metodo mult
	mult(a);
	// Posterior a aplicar el metodo mult a "a" imprimomos su valor, y notamos que sigue siendo el mismo que cuando lo definimos
	System.out.println(a);
	// Ahora aplicamos el metodo mult a b mismo que solo modificara el 4 elemento [0,1,2,25,4]
	mult(b);
	// imprimimos el valor del cuarto elemento de b (4)
	System.out.println(b[3]);
	// Mandamos a llamar al metodo que imprime el valor de multiplicar a por si mismo
	imp(a);
    }
    // Metodo para multiplicar a "a" por si mismo
    public static void mult(int a){
	a *= a;
    }
    // Método para modificar el cuarto elemento de un arreglo
    public static void mult(int [] b){
	b[3] = 25;
    }
    // Método para multiplicar a "a" por si mismo e imprimirlo
    public static void imp(int a){
	System.out.println(a*a);
    }
}
