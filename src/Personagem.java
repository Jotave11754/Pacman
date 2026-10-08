public abstract class Personagem {

    private int x;
    private int y;
    private String simbolo;

    public Personagem(int x, int y, String simbolo) {

        this.x = x;
        this.y = y;
        this.simbolo = simbolo;
    }

    public int getX() {

        return x;
    }

    public int getY() {

        return y;
    }

    public String getSimbolo() {

        return simbolo;
    }

    public void setX(int x) {

        this.x = x;
    }

    public void setY(int y) {

        this.y = y;
    }

    public abstract void mover(Tabuleiro tabuleiro);
}