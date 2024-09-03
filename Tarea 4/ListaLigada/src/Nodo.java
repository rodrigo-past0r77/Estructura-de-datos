public class Nodo {
    SmartPhone dato;
    Nodo siguiente;

    public Nodo(SmartPhone dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

class ListaLigada {
    private Nodo head;
    private int tamanio;

    public ListaLigada() {
        head = null;
        tamanio = 0;
    }

    public boolean estaVacia() {
        return head == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void agregarAlFinal(SmartPhone valor) {
        Nodo nuevo = new Nodo(valor);
        if (estaVacia()) {
            head = nuevo;
        } else {
            Nodo aux = head;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
        tamanio++;
    }

    public void agregarAlInicio(SmartPhone valor) {
        Nodo nuevo = new Nodo(valor);
        if (!estaVacia()) {
            nuevo.siguiente = head;
        }
        head = nuevo;
        tamanio++;
    }

    public void agregarDespuesDe(SmartPhone referencia, SmartPhone valor) {
        Nodo aux = head;
        while (aux != null && !aux.dato.equals(referencia)) {
            aux = aux.siguiente;
        }
        if (aux != null) {
            Nodo nuevo = new Nodo(valor);
            nuevo.siguiente = aux.siguiente;
            aux.siguiente = nuevo;
            tamanio++;
        }
    }

    public void eliminar(int posicion) {
        if (posicion >= 0 && posicion < tamanio) {
            if (posicion == 0) {
                head = head.siguiente;
            } else {
                Nodo aux = head;
                for (int i = 0; i < posicion - 1; i++) {
                    aux = aux.siguiente;
                }
                aux.siguiente = aux.siguiente.siguiente;
            }
            tamanio--;
        }
    }

    public void eliminarElPrimero() {
        if (!estaVacia()) {
            head = head.siguiente;
            tamanio--;
        }
    }

    public void eliminarElFinal() {
        if (!estaVacia()) {
            if (tamanio == 1) {
                head = null;
            } else {
                Nodo aux = head;
                while (aux.siguiente.siguiente != null) {
                    aux = aux.siguiente;
                }
                aux.siguiente = null;
            }
            tamanio--;
        }
    }

    public int buscar(SmartPhone valor) {
        Nodo aux = head;
        int posicion = 0;
        while (aux != null) {
            if (aux.dato.equals(valor)) {
                return posicion;
            }
            aux = aux.siguiente;
            posicion++;
        }
        return -1;
    }

    public void actualizar(SmartPhone aBuscar, SmartPhone valor) {
        Nodo aux = head;
        while (aux != null) {
            if (aux.dato.equals(aBuscar)) {
                aux.dato = valor;
                return;
            }
            aux = aux.siguiente;
        }
    }

    public void transversal() {
        Nodo aux = head;
        while (aux != null) {
            System.out.println(aux.dato);
            aux = aux.siguiente;
        }
    }
}
