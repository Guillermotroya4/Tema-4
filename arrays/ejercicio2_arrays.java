/**
 * En este programa le diremosque meta un array de 100 números de forma aleatoria del 1 al 10 y pedirle un número y decir en que posición está
 * @author Guillermo Troya Albarrán
 */
public class ejercicio2_arrays {
    public static void main(String[] args) {
//variables
        int contador = 0;
        int num[] = new int[100];
        //Generamos un número random y lo metemos en el array
        for (int i = 0; i < num.length; i++) {
            int random = (int)((Math.random()*10)+1);               
            num[i] = random;
        }

        System.out.println("Por favor, un número");
        int real=Integer.parseInt(System.console().readLine());
        for (int i = 0; i < num.length; i++) {                               
            System.out.println(num[i]);

            if (num[i] == real) {
                contador++;
                System.out.println("el numero " + num[i] + " está en la posición " + i);
            }
        }
        System.out.println("hay un total de: " + contador);

    }
}
