public class Clinica {
    public static void main(String[] args) {

        ColaADT<Paciente> colaPacientes = new ColaADT<>();

        System.out.println("Se agregan 3 pacientes a la cola.");
        Paciente p1 = new Paciente("Juan");
        Paciente p2 = new Paciente("María");
        Paciente p3 = new Paciente("Carlos");
        colaPacientes.encolar(p1);
        colaPacientes.encolar(p2);
        colaPacientes.encolar(p3);

        System.out.println("\nMostrar el contenido de la cola:");
        System.out.println("Pacientes en la cola: " + colaPacientes);

        System.out.println("\nMostrar el paciente que sigue (sin sacarlo de la cola):");
        System.out.println("Paciente que sigue: " + colaPacientes.frente());

        System.out.println("\nAtender al siguiente paciente:");
        System.out.println("Atendiendo a: " + colaPacientes.desEncolar());

        System.out.println("\nMostrar el contenido de la cola después de atender:");
        System.out.println("Pacientes en la cola: " + colaPacientes);

        System.out.println("\nAgregar 2 nuevos pacientes a la cola.");
        Paciente p4 = new Paciente("Lucía");
        Paciente p5 = new Paciente("Pedro");
        colaPacientes.encolar(p4);
        colaPacientes.encolar(p5);

        System.out.println("\nAtender al siguiente paciente:");
        System.out.println("Atendiendo a: " + colaPacientes.desEncolar());

        System.out.println("\nMostrar el contenido de la cola después de atender:");
        System.out.println("Pacientes en la cola: " + colaPacientes);

        if (colaPacientes.estVacia()) {
            System.out.println("\nNo hay pacientes esperando.");
        } else {
            System.out.println("\nPacientes aún en espera.");
        }
    }
}

