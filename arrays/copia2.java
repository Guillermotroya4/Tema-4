public class copia2 {
    public static void main(String[] args) {
        float[] numero = new float[10];

        float maximo = Integer.MIN_VALUE;
        float minimo = Integer.MAX_VALUE;
        float media = 0;
        int i;

        System.out.println("Introduce 10 alturas");
        System.out.println("Vaya introduciendo la altura y pulsando INTRO:");

        for (i = 0; i < numero.length; i++) {
            String linea = System.console().readLine();
            float altura = Float.parseFloat(linea);
            numero[i] = altura;

            if (numero[i] < minimo) {
                minimo = numero[i];
            }

            if (numero[i] > maximo) {
                maximo = numero[i];
            }

            media += numero[i];
        }

        System.out.println();

        for (i = 0; i <numero.length; i++) {
            System.out.print(numero[i]);

            if (numero[i] == maximo) {
                System.out.print(" máximo");
            }

            if (numero[i] == minimo) {
                System.out.print(" mínimo");
            }

            System.out.println();
        }

        media /= i;
        System.out.println("La media es " + media);
    }
}