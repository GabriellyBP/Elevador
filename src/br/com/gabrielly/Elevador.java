package br.com.gabrielly;

public class Elevador {

    private int nPessoas, idElevador, dBotao;

    private long andarAtual;

    private final int capTotal = 10, totalAndar = 10;
    private final long menorAndar = -2;

    public Elevador(int idElevador, long andarAtual, int nPessoas) {
        this.andarAtual = andarAtual;
        this.idElevador = idElevador;
        this.nPessoas = nPessoas;
    }

    public int getIdElevador() {
        return idElevador;
    }

    public void setIdElevador(int idElevador) {
        this.idElevador = idElevador;
    }

    public int getIdBotoeira() {
        return dBotao;
    }

    public void setIdBotoeirar(int dBotao) {
        this.dBotao = dBotao;
    }

    public int getCapTotal() {
        return this.capTotal;
    }

    public int getPessoas() {
        return this.nPessoas;
    }

    public int getTotal() {
        return this.totalAndar;
    }
    
    public long getMenorAndar() {
        return menorAndar;
    }
    
    public long getAtual() {
        return this.andarAtual;
    }

    public void setAndarAtual(long andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void setnPessoas(int nPessoas) {
        this.nPessoas = nPessoas;
    }

//    public void Entra(Elevador elevador) {
//        this.nPessoas += 1;
//    }
//
//    public void Sai() {
//        this.nPessoas -= 1;
//    }
//
//    public void Sobe() {
//        this.andarAtual += 1;
//    }
//
//    public void Desce() {
//        this.andarAtual -= 1;
//    }
}
