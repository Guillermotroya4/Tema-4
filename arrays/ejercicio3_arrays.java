/***
 * En este programa le pediremos una serie de alturas y le diremos cual es el máximno, cual es el mínimo y cual es la media 
 * @author Guillermo Troya Albarrán
 */
public class ejercicio3_arrays {
    public static void main(String[] args) {

        System.out.println("Por favor, introduce un número");
        int opcion=Integer.parseInt(System.console().readLine());
        float[] num = new float[opcion];

        float maximo = Integer.MIN_VALUE;
        float minimo = Integer.MAX_VALUE;
        float media = 0;
        int i;
        int contador=0;

        System.out.println("Vaya introduciendo la altura y pulsando ENTER:");

        //Aquí haremos un bucle para que lea la altura tantas veces como le hemos dicho en el array
        for (i = 0; i < num.length; i++) {
            String linea = System.console().readLine();           
            float altura = Float.parseFloat(linea);
            num[i] = altura;

            if (num[i] < minimo) { 
                minimo = num[i];
            }

            if (num[i] > maximo) {
                maximo = num[i];
            }

            media = media + num[i];
        }

        System.out.println();

        media = media / opcion;   //Esto hara la media, metera todos los número y los dividirá entre el número de arrays que le hayamos puesto
        System.out.println("La media es " + media);

        for (i = 0; i < num.length; i++) {  //Aquí lo que haremos es imprimir lo hecho anteriormete y le añadiremos lo que esta abajo
            System.out.print(num[i]);

            if (num[i] == maximo) {
                System.out.print(" máximo");       //Aquí diremos si es el número máximo
            }

            if (num[i] == minimo) {
                System.out.print(" mínimo");       //Aquí diremos si es el número máximo
            }

            System.out.println();
            if (num[i]>media) {                //Contador para aumentar la cantidad de números por encima de la media
                contador ++;
                
            }
            
        }
    System.out.println("Por encima de la media, hay: " + contador);   
        
    }

}
