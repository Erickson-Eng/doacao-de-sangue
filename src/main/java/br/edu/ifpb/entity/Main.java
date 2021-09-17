package br.edu.ifpb.entity;

public class Main {
    public static void main(String[] args) {
        Triagem triagem = new Triagem();
        TriagemMedica medica = new TriagemMedica();


        SituacaoMedica situacaoMedica = new SituacaoMedica("F","F","10","F");
        Doador doador = new Doador();

        doador.setName("José");
        doador.setPeso(80.00);
        doador.setDataDeNascimento("19/05/1958");
        doador.setGenero(2);
        doador.setNovoDoador("F");
        doador.setSituacaoMedica(situacaoMedica);

        System.out.println(triagem.verificarDoador(doador));
        System.out.println(medica.verificacaoMedica(doador));
        System.out.println();



        SituacaoMedica situacaoMedica1 = new SituacaoMedica("F","F","10","V");
        Doador doador2 = new Doador("João", 2, 72.00,"20/01/2010","V",situacaoMedica1);

        System.out.println(triagem.verificarDoador(doador2));
        System.out.println(medica.verificacaoMedica(doador2));
        System.out.println();

        SituacaoMedica situacaoMedica2 = new SituacaoMedica("V","F","10/09/2021","F");
        Doador doador3 = new Doador("Suzana",1, 65.00,"19/05/1999","F", situacaoMedica2);

        System.out.println(triagem.verificarDoador(doador3));
        System.out.println(medica.verificacaoMedica(doador3));
        System.out.println();

        SituacaoMedica situacaoMedica3 = new SituacaoMedica("F","V","10/09/2020","F");
        Doador doador4 = new Doador("Joyce",1, 65.00,"19/05/1999","F", situacaoMedica3);
        System.out.println(triagem.verificarDoador(doador4));
        System.out.println(medica.verificacaoMedica(doador4));

    }
}
