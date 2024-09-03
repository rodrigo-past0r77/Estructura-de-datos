public class Main {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        SmartPhone sp1 = new SmartPhone("Apple", "iPhone 13", 16999);
        SmartPhone sp2 = new SmartPhone("Samsung", "Galaxy S21", 13599);
        SmartPhone sp3 = new SmartPhone("Google", "Pixel 6", 11899);
        SmartPhone sp4 = new SmartPhone("OnePlus", "9 Pro", 16489);
        SmartPhone sp5 = new SmartPhone("Sony", "Xperia 1 III", 22099);

        lista.agregarAlFinal(sp1);
        lista.agregarAlFinal(sp2);
        lista.agregarAlFinal(sp3);
        lista.agregarAlFinal(sp4);
        lista.agregarAlFinal(sp5);

        System.out.println("Contenido de la lista:");
        lista.transversal();

        lista.eliminar(2);
        System.out.println("\nContenido de la lista después de eliminar la posición 2:");
        lista.transversal();

        SmartPhone nuevoSP = new SmartPhone("Huawei", "P50 Pro", 20399);
        lista.actualizar(sp2, nuevoSP);
        System.out.println("\nContenido de la lista después de actualizar el segundo elemento:");
        lista.transversal();

        SmartPhone sp6 = new SmartPhone("Xiaomi", "Mi 11", 12749);
        SmartPhone sp7 = new SmartPhone("Oppo", "Find X3 Pro", 19549);
        lista.agregarAlInicio(sp6);
        lista.agregarAlFinal(sp7);
        System.out.println("\nContenido de la lista después de agregar un elemento al inicio y otro al final:");
        lista.transversal();

        lista.eliminarElPrimero();
        System.out.println("\nContenido de la lista después de eliminar el primer elemento:");
        lista.transversal();
    }
}
