public class Jogo {

    private Tabuleiro tabuleiro;
    private Pacman pacman;
    private Fantasma fantasma;

    public Jogo() {

        tabuleiro = new Tabuleiro();
        pacman = new Pacman(1, 1);
        fantasma = new Fantasma(8, 5);
    }

    public void jogar() {

        String comando = "";

        while (!comando.equals("q")) {

            IO.println("");
            tabuleiro.mostrar(pacman, fantasma);

            IO.println("");
            IO.println("W = cima");
            IO.println("S = baixo");
            IO.println("A = esquerda");
            IO.println("D = direita");
            IO.println("Q = sair");

            IO.println("Digite um comando:");

            comando = IO.readln().toLowerCase();

            if (!comando.equals("q")) {

                pacman.mover(comando, tabuleiro);
                fantasma.mover(tabuleiro);
            }

            if (pacman.getX() == fantasma.getX()
                    && pacman.getY() == fantasma.getY()) {

                IO.println("");
                IO.println("GAME OVER!");

                break;
            }
        }

        IO.println("Fim do jogo!");
    }
}