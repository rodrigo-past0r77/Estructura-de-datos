public class SmartPhone {
    private String marca;
    private String modelo;
    private int precio;

    public SmartPhone(String marca, String modelo, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "SmartPhone: " + marca + '\'' + " --- modelo: '" + modelo + '\'' + "--- precio= " + precio;
    }


}