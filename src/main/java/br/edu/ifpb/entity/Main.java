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
        doador2.setName("João");
        doador2.setPeso(72.00);
        doador2.setDataDeNascimento("19/05/1960");
        doador2.setGenero(2);
        doador2.setNovoDoador("V");

        Doador doador3 = new Doador();
        doador3.setName("Gabriel");
        doador3.setPeso(65.00);
        doador3.setDataDeNascimento("19/05/1999");
        doador3.setGenero(2);
        doador3.setNovoDoador("V");

        System.out.println(doador3.getIdade());
        System.out.println(doador.getIdade());
        System.out.println(doador2.getIdade());
    }
}
