package br.com.gabrielly;

public abstract class Botoeira {

    public static void subirAndar(Elevador elev) {
        if (elev.getAtual() < elev.getTotal()) {
            elev.setAndarAtual(elev.getAtual() + 1);
        } else {
            System.out.printf("\n\n Elevador %d está no ultimo andar. ", elev.getIdElevador());
        }
    }

    public static void descerAndar(Elevador elev) {
        if (elev.getAtual() > elev.getMenorAndar()) {
            elev.setAndarAtual(elev.getAtual() - 1);
            if (elev.getAtual() == 0) {
                System.out.printf("\n\n Elevador %d está no térreo. ", elev.getIdElevador());
            }
        } else {
            System.out.printf("\n\n Elevador %d está no andar mais baixo. ", elev.getIdElevador());
        }
    }

    public static void entrarPessoa(Elevador elev) {
        if (elev.getPessoas() < elev.getCapTotal()) {
            elev.setnPessoas(elev.getPessoas() + 1);
        } else {
            System.out.printf("\n\n Elevador %d está na capacidade máxima. ", elev.getIdElevador());
        }
    }

    public static void sairPessoa(Elevador elev) {
        if (elev.getPessoas() > 0) {
            elev.setnPessoas(elev.getPessoas() - 1);
        } else {
            System.out.printf("\n\n Elevador %d está vazio ", elev.getIdElevador());
        }
    }

    public static int chamaElevador(Elevador elev1, Elevador elev2, Elevador elev3, Elevador elev4) {
        Elevador elevador1 = elev1; 
        Elevador elevador2 = elev2; 
        Elevador elevador3 = elev3; 
        Elevador elevador4 = elev4; 
        Elevador elevRetorno;
        int retornoElevador;
        long andar = Math.min(Math.min(elevador1.getAtual(), elevador2.getAtual()), Math.min(elevador3.getAtual(), elevador4.getAtual()));
        if (andar == elevador1.getAtual() && elevador1.getPessoas() == 0) {
            elevador1.setnPessoas(0);
            elevador1.setAndarAtual(0);
            retornoElevador = 0;
        } else if (andar == elevador2.getAtual() && elevador2.getPessoas() == 0) {
            elevador2.setnPessoas(0);
            elevador2.setAndarAtual(0);
            retornoElevador = 1;
        } else if (andar == elevador3.getAtual() && elevador3.getPessoas() == 0) {
            elevador3.setnPessoas(0);
            elevador3.setAndarAtual(0);
            retornoElevador = 2;
        } else if (andar == elevador4.getAtual() && elevador4.getPessoas() == 0) {
            elevador4.setnPessoas(0);
            elevador4.setAndarAtual(0);
            retornoElevador = 3;
        } else {
            retornoElevador = 5;
        }
        return retornoElevador;
    }

    public static void statusElevador(Elevador elev) {
        System.out.printf("Elevador escolhido: %d\n", elev.getIdElevador());
        System.out.printf("Quantidade de Pessoas: %d\n", elev.getPessoas());
        System.out.printf("Capacidade Suportada: %d\n", elev.getCapTotal());
        System.out.printf("Andar Atual: %d\n", elev.getAtual());
        System.out.printf("Quantidade de Andares: %d\n", elev.getTotal());
    }

    public static void menu() {
        System.out.println("\n\n > Botões do elevador ");
        System.out.printf("\n  Digite 1 Para Subir de Andar ");
        System.out.printf("\n  Digite 2 Para Descer de Andar ");
        System.out.printf("\n  Digite 3 Para Entrar  ");
        System.out.printf("\n  Digite 4 Sai Pessoa ");
        System.out.printf("\n  Digite 5 Para Status ");
        System.out.printf("\n  Digite 6 Para Chamar elevador ");
        System.out.printf("\n  Digite 7 Para Sair ");
        System.out.printf("\n > R: ");
    }

    public static void btnSolitarElevador() {
        System.out.println("\n\n > Chamar elevador ");
        System.out.printf("\n  Digite 1 Para Chamar elevador ");
        System.out.printf("\n > R: ");
    }
}
