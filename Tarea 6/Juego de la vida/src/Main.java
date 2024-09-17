public class Main {
    public static void main(String[] args) {
        JuegoDeLaVida juego = new JuegoDeLaVida(6, 6, 6);

        juego.setInitialState(1, 2);
        juego.setInitialState(2, 2);
        juego.setInitialState(3, 2);
        juego.setInitialState(4,2);

        juego.jugar();
    }
}