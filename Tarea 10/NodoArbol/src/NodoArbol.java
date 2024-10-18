import java.util.Objects;

public class NodoArbol {
        private Object dato;
        private NodoArbol hijoIzquierdo;
        private NodoArbol hijoDerecho;

        public NodoArbol() {
        }

        public NodoArbol(Object dato) {
            this.dato = dato;
        }

        public NodoArbol(Object dato, NodoArbol hijoIzquierdo, NodoArbol hijoDerecho) {
            this.dato = dato;
            this.hijoIzquierdo = hijoIzquierdo;
            this.hijoDerecho = hijoDerecho;
        }

        public Object getDato() {
            return dato;
        }

        public void setDato(Object dato) {
            this.dato = dato;
        }

        public NodoArbol getHijoIzquierdo() {
            return hijoIzquierdo;
        }

        public void setHijoIzquierdo(NodoArbol hijoIzquierdo) {
            this.hijoIzquierdo = hijoIzquierdo;
        }

        public NodoArbol getHijoDerecho() {
            return hijoDerecho;
        }

        public void setHijoDerecho(NodoArbol hijoDerecho) {
            this.hijoDerecho = hijoDerecho;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            NodoArbol nodoArbol = (NodoArbol) object;
            return Objects.equals(dato, nodoArbol.dato);
        }

        @Override
        public int hashCode() {
            return Objects.hash(dato);
        }

        @Override
        public String toString() {
            return "NodoArbol{" +
                    "dato=" + dato +
                    ", hijoIzquierdo=" + hijoIzquierdo +
                    ", hijoDerecho=" + hijoDerecho +
                    '}';
        }
    }
