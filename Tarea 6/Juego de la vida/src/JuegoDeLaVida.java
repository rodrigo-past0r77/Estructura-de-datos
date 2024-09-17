public class JuegoDeLaVida {
    private Array2d grid;
    private int generations;

    // Constructor para inicializar el juego
    public JuegoDeLaVida(int ren, int col, int generations) {
        this.grid = new Array2d(ren, col);
        this.grid.clear('M');
        this.generations = generations;
    }

    // Método para colocar una célula viva
    public void setInitialState(int ren, int col) {
        this.grid.setItem(ren, col, 'V');
    }


    private int contarVecinosVivos(int ren, int col) {
        int vecinosVivos = 0;


        for (int i = ren - 1; i <= ren + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {

                if (i == ren && j == col) {
                    continue;
                }

                if (i >= 0 && i < grid.getRowSize() && j >= 0 && j < grid.getColSize()) {
                    if (grid.getItem(i, j) == 'V') {
                        vecinosVivos++;
                    }
                }
            }
        }
        return vecinosVivos;
    }


    public void siguienteGeneracion() {

        Array2d nuevaRejilla = new Array2d(grid.getRowSize(), grid.getColSize());
        nuevaRejilla.clear('M');


        for (int i = 0; i < grid.getRowSize(); i++) {
            for (int j = 0; j < grid.getColSize(); j++) {
                int vecinos = contarVecinosVivos(i, j);
                char estadoActual = grid.getItem(i, j);


                if (estadoActual == 'V') {
                    if (vecinos == 2 || vecinos == 3) {
                        nuevaRejilla.setItem(i, j, 'V');
                    } else {
                        nuevaRejilla.setItem(i, j, 'M');
                    }
                } else {
                    if (vecinos == 3) {
                        nuevaRejilla.setItem(i, j, 'V');
                    }
                }
            }
        }

        this.grid = nuevaRejilla;
    }

    public void jugar() {
        for (int gen = 1; gen <= generations; gen++) {
            System.out.println("Generación " + gen + ":");
            System.out.println(grid.toString());
            siguienteGeneracion();
        }
    }
}