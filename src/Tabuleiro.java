public class Tabuleiro {

    private char[][] mapa = {

            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '.', '.', '.', '.', '.', '.', '.', '.', '#'},
            {'#', '.', '#', '#', '.', '#', '#', '.', '.', '#'},
            {'#', '.', '.', '.', '.', '.', '.', '.', '.', '#'},
            {'#', '.', '#', '#', '.', '#', '#', '.', '.', '#'},
            {'#', '.', '.', '.', '.', '.', '.', '.', '.', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
    };

    public boolean podeAndar(int x, int y) {

        if (x < 0 || y < 0) {
            return false;
        }

        if (y >= mapa.length || x >= mapa[0].length) {
            return false;
        }

        return mapa[y][x] != '#';
    }

    public void mostrar(Pacman pacman, Fantasma fantasma) {

        for (int y = 0; y < mapa.length; y++) {

            String linha = "";

            for (int x = 0; x < mapa[y].length; x++) {

                if (x == pacman.getX() && y == pacman.getY()) {

                    linha += "P ";

                } else if (x == fantasma.getX()
                        && y == fantasma.getY()) {

                    linha += "F ";

                } else {

                    linha += mapa[y][x] + " ";
                }
            }

            IO.println(linha);
        }
    }
}