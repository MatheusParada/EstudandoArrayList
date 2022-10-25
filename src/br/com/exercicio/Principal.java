package br.com.exercicio;

public class Principal {
    public static void main(String[]args) {

        Carro c1 = new Carro();
        c1.nome = "Palio";
        c1.cor = "Cinza";

        Carro c2 = new Carro();
        c2.nome = "Gol";
        c2.cor = "Preto";

        Carro c3 = new Carro();
        c3.nome = "Fusca";
        c3.cor = "Azul";

        Carro c4 = new Carro();
        c4.nome = "Azera";
        c4.cor = "Cinza";

        Agencia ag = new Agencia();
        ag.nome = "Agencia Duart's transporte";
        ag.adicionarCarro(c1);
        ag.adicionarCarro(c2);
        ag.adicionarCarro(c3);
        ag.adicionarCarro(c4);

        int qtdeCarros = ag.getQuantidadeCarros();

        System.out.println("A lista de carros da agencia" + ag.nome  + "possui "  + qtdeCarros);


    }
}
