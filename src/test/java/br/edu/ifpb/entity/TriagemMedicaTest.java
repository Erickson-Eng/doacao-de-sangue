package br.edu.ifpb.entity;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TriagemMedicaTest extends TestCase {

    @Test
    public void testVerificacaoMedica() {
        TriagemMedica triagemMedica = new TriagemMedica();
        SituacaoMedica situacaoDoador = new SituacaoMedica();
        Doador doador = new Doador();
        doador.setName("Felipe");
        doador.setPeso(80.00);
        doador.setDataDeNascimento("19/05/1958");
        doador.setGenero(2);
        doador.setNovoDoador("V");
        situacaoDoador.setFebre("F");
        situacaoDoador.setGravida("V");

        Assert.assertNotEquals("F", situacaoDoador.getGravida());


        Doador doador2 = new Doador();
        doador2.setName("Gabriel");
        doador2.setPeso(65.00);
        doador2.setDataDeNascimento("19/05/2000");
        doador2.setGenero(2);
        doador2.setNovoDoador("V");

        Doador doador3 = new Doador();
        doador3.setName("Moises");
        doador3.setPeso(59.00);
        doador3.setDataDeNascimento("19/05/1999");
        doador3.setGenero(2);
        doador3.setNovoDoador("V");
    }

    public void testVerificarFebre() {
        SituacaoMedica situacaoMedica = new SituacaoMedica("V","V","19/01/2000","F");
        Doador doador = new Doador("Erickson",2, 85.5,"19/01/1996","F",situacaoMedica);

        Assert.assertEquals("F", doador.getSituacaoMedica().getFebre());

        SituacaoMedica situacaoMedica1 = new SituacaoMedica("F","V","10/09/2021","V");
        Doador doador1 = new Doador("Erickson",2, 85.5,"19/01/1996","F",situacaoMedica1);

        Assert.assertEquals("V", doador1.getSituacaoMedica().getFebre());
    }

    public void testVerificarGravidez() {
        SituacaoMedica situacaoMedica = new SituacaoMedica("V","V","10","F");
        Doador doador = new Doador("Erickson",2, 85.5,"19/01/1996","F",situacaoMedica);

        Assert.assertEquals("F", doador.getSituacaoMedica().getGravida());


        SituacaoMedica situacaoMedica1 = new SituacaoMedica("V","F","05/05/2021","F");
        Doador doador1 = new Doador("Isabelle",1, 60.0,"19/01/1996","F",situacaoMedica1);

        Assert.assertEquals("V", doador1.getSituacaoMedica().getGravida());
    }

    public void testVerificarAmamentacao() {

        SituacaoMedica situacaoMedica = new SituacaoMedica("V","V","10/01/2019","F");
        Doador doador = new Doador("Erickson",2, 85.5,"19/01/1996","F",situacaoMedica);

        Assert.assertEquals("F", doador.getSituacaoMedica().getAmamentando());


        SituacaoMedica situacaoMedica1 = new SituacaoMedica("F","V","10/08/2021","F");
        Doador doador1 = new Doador("Isabelle",1, 60.00,"19/01/1996","F",situacaoMedica1);

        Assert.assertEquals("V", doador1.getSituacaoMedica().getAmamentando());
        Assert.assertSame(1,doador1.getSituacaoMedica().getPeriodoPosParto());
    }

    @Test
    public void testDiaDoParto() {
        SituacaoMedica situacaoMedica = new SituacaoMedica("V","V","10","F");
        Doador doador = new Doador("Erickson",2, 85.5,"19/01/1996","F",situacaoMedica);
        // testando data invalida
        assertNull(doador.getSituacaoMedica().getDiaDoParto());



        SituacaoMedica situacaoMedica1 = new SituacaoMedica("F","V","10/08/2021","F");
        Doador doador1 = new Doador("Isabelle",1, 60.00,"19/01/1996","F",situacaoMedica1);
        // testando data valida e também se periodo está correto
        Assert.assertSame(1,doador1.getSituacaoMedica().getPeriodoPosParto());
    }
}