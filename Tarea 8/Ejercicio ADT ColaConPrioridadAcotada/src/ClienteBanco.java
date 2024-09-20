public class ClienteBanco {
    private String nombre;
    private String tipoCliente;
    private double saldo;

    public ClienteBanco(String nombre, String tipoCliente, double saldo) {
        this.nombre = nombre;
        this.tipoCliente = tipoCliente;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println(nombre + " retiró $" + cantidad);
        } else {
            System.out.println(nombre + " no tiene suficiente saldo.");
        }
    }

    @Override
    public String toString() {
        return nombre +" (" + tipoCliente + ") " + "saldo: " + " (" + saldo  + ")";
    }
}
