public class ContadorRegresivo {

    public static void contadorRegresivo(int numero) {

        if (numero <= 0) {
            System.out.println("¡Tiempo terminado!");
            return;
        }

        System.out.println(numero);
        contadorRegresivo(numero - 1);
    }

    public static void main(String[] args) {
        int inicio = 10;
        System.out.println("Iniciando contador regresivo desde " + inicio);
        contadorRegresivo(inicio);
    }
}

