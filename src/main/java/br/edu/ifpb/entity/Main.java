package br.edu.ifpb.entity;

public class Main {
    public static void main(String[] args) {
        Doador doador = new Doador();
        doador.setName("José");
        doador.setPeso(80.00);
        doador.setDataDeNascimento("19/05/1958");
        doador.setGenero(2);
        doador.setNovoDoador("F");

        Doador doador2 = new Doador();
        doador.setName("João");
        doador.setPeso(72.00);
        doador.setDataDeNascimento("19/05/1960");
        doador.setGenero(2);
        doador.setNovoDoador("V");

        System.out.println(doador.getIdade());
    }
}
