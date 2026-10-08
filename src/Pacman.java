public class Pacman extends Personagem {

    public Pacman(int x, int y) {

        super(x, y, "P");
    }

    public void mover(String comando, Tabuleiro tabuleiro) {

        int novoX = getX();
        int novoY = getY();

        if (comando.equals("w")) {
            novoY--;
        }

        if (comando.equals("s")) {
            novoY++;
        }

        if (comando.equals("a")) {
            novoX--;
        }

        if (comando.equals("d")) {
            novoX++;
        }

        if (tabuleiro.podeAndar(novoX, novoY)) {

            setX(novoX);
            setY(novoY);
        }
    }

    @Override
    public void mover(Tabuleiro tabuleiro) {
    }
}