/**
 * 
 */
public class ejercicio1_arrays {
    public static void main(String[] args) {

        int contador = 0;
        float num[] = new float[100];
        for (int i = 0; i < num.length; i++) {
            float random = (float) Math.random();
            num[i] = random;
        }

        System.out.println("Por favor, un número");
        String linea=System.console().readLine();
        float real =Float.parseFloat(linea);

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);

            if (num[i] >= real) {
                contador++;
            }
        }
        System.out.println("hay un total de: " + contador + " iguales o mayores");

    }
}
