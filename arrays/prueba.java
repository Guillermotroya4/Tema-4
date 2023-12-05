public class prueba {
    public static void main(String[] args) {
        float[] numero = new float[5];

        float maximo = Integer.MIN_VALUE;
        float minimo = Integer.MAX_VALUE;
        float media;
        int i;
        System.out.println("Vaya introduciendo números enteros y pulsando INTRO:");
        for (i = 0; i < 5; i++) {

            String linea = System.console().readLine();
            float altura = Float.parseFloat(linea);
            numero[i] = altura;
            if (numero[i] < minimo) {
                minimo = numero[i];
            }
            if (numero[i] > maximo) {
                maximo = numero[i];
            }
        }
        System.out.println();
        for (i = 0; i < 5; i++) {
            System.out.print(numero[i]);
            if (numero[i] == maximo) {
                System.out.print(" máximo");
            }
            if (numero[i] == minimo) {
                System.out.print(" mínimo");
            }
        }
            media = numero[i] / i;
            System.out.println();
        System.out.println("La media es " + media);
    }
}
