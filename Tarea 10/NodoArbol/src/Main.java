public class Main {
    public static void main(String[] args) {
        // Árbol 1
        NodoArbol nodo1 = new NodoArbol(1);
        NodoArbol nodo5 = new NodoArbol(5, nodo1, null);
        NodoArbol nodo25 = new NodoArbol(25);
        NodoArbol nodo15 = new NodoArbol(15, null, nodo25);
        NodoArbol raiz1 = new NodoArbol(10, nodo5, nodo15);

        System.out.println("Árbol 1:");
        System.out.println(raiz1);

        // Árbol 2
        NodoArbol nodoSusan = new NodoArbol("Susan");
        NodoArbol nodoDiana = new NodoArbol("Diana");
        NodoArbol nodoPedro = new NodoArbol("Pedro", nodoSusan, nodoDiana);
        NodoArbol nodoMario = new NodoArbol("Mario");
        NodoArbol raiz2 = new NodoArbol("Diego", nodoPedro, nodoMario);

        System.out.println("\nÁrbol 2:");
        System.out.println(raiz2);
    }
}