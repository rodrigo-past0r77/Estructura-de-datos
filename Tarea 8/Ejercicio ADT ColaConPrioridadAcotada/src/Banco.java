public class Banco {
    public static void main(String[] args) {
        ColaConPrioridadAcotada<ClienteBanco> colaBanco = new ColaConPrioridadAcotada<>(5);

        System.out.println("Llegan 2 clientes nuevos (Prioridad baja):");
        ClienteBanco cliente1 = new ClienteBanco("Juan", "Cliente nuevo", 5000);
        ClienteBanco cliente2 = new ClienteBanco("Ana", "Cliente nuevo", 7000);
        colaBanco.encolar(4, cliente1);
        colaBanco.encolar(4, cliente2);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println("------------------------------------------");

        System.out.println("Llegan 3 personas que no son clientes (Prioridad muy baja):");
        ClienteBanco cliente3 = new ClienteBanco("Pedro", "No es cliente", 0);
        ClienteBanco cliente4 = new ClienteBanco("Luis", "No es cliente", 0);
        ClienteBanco cliente5 = new ClienteBanco("Mario", "No es cliente", 0);
        colaBanco.encolar(5, cliente3);
        colaBanco.encolar(5, cliente4);
        colaBanco.encolar(5, cliente5);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(cliente5);
        System.out.println("------------------------------------------");

        System.out.println("Llega una celebridad (Prioridad muy alta):");
        ClienteBanco celebridad = new ClienteBanco("Carlos", "Celebridad", 100000);
        colaBanco.encolar(1, celebridad);
        System.out.println(celebridad);
        System.out.println("------------------------------------------");

        System.out.println("Estado de la cola con prioridad acotada:");
        System.out.println(colaBanco);
        System.out.println("------------------------------------------");

        System.out.println("Atender al siguiente cliente (la celebridad) y retira $10,000:");
        colaBanco.desEncolar();
        celebridad.retirar(10000);
        System.out.println("------------------------------------------");

        System.out.println("Llegan dos clientes más (uno frecuente y uno premium):");
        ClienteBanco cliente6 = new ClienteBanco("Sofia", "Cliente frecuente", 20000);
        ClienteBanco cliente7 = new ClienteBanco("Miguel", "Cliente premium", 50000);
        colaBanco.encolar(3, cliente6);
        colaBanco.encolar(2, cliente7);
        System.out.println(cliente6);
        System.out.println(cliente7);
        System.out.println("------------------------------------------");

        System.out.println("Atender al siguiente cliente:");
        colaBanco.desEncolar();
        System.out.println("------------------------------------------");

        System.out.println("Estado de la cola después de dos atenciones:");
        System.out.println(colaBanco);
        System.out.println("------------------------------------------");

        System.out.println("Atender a todos los clientes restantes:");
        while (!colaBanco.estaVacia()) {
            colaBanco.desEncolar();
        }
        System.out.println("------------------------------------------");

        System.out.println("Estado final de la cola:");
        System.out.println(colaBanco);
    }
}
