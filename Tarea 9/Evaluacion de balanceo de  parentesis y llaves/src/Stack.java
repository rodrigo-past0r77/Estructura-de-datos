import java.util.ArrayList;

class Stack<T> {
    private ArrayList<T> data;

    public Stack() {
        data = new ArrayList<>();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public int length() {
        return data.size();
    }

    public T pop() {
        if (!isEmpty()) {
            return data.remove(data.size() - 1);
        } else {
            return null;  // o lanzar excepción si lo prefieres
        }
    }

    public T peek() {
        if (!isEmpty()) {
            return data.get(data.size() - 1);
        } else {
            return null;  // o lanzar excepción si lo prefieres
        }
    }

    public void push(T value) {
        data.add(value);
    }

    public void printStack() {
        System.out.println("-----");
        for (int i = data.size() - 1; i >= 0; i--) {
            System.out.println(data.get(i) + "\n|---|");
        }
    }
}
