public class Fantasma extends Personagem {

    public Fantasma(int x, int y) {

        super(x, y, "F");
    }

    @Override
    public void mover(Tabuleiro tabuleiro) {

        int novoX = getX() - 1;

        if (tabuleiro.podeAndar(novoX, getY())) {

            setX(novoX);
        }
    }
}