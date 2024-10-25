import java.util.Stack;

public class PilaRecursiva {

    public static int obtenerValorMedio(Stack<Integer> pila, int tamaño, int contador) {

        if (contador == tamaño / 2) {
            return pila.pop();
        }

        int temp = pila.pop();
        int valorMedio = obtenerValorMedio(pila, tamaño, contador + 1);

        pila.push(temp);

        return valorMedio;
    }

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        int tamaño = pila.size();
        int valorMedio = obtenerValorMedio(pila, tamaño, 0);

        System.out.println("Valor en la posición media: " + valorMedio);
    }
}

