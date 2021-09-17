package br.edu.ifpb.entity;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TriagemTest extends TestCase {

    @Test
    public void testVerificarIdade() {
        Triagem triagem = new Triagem();

        Doador doador = new Doador();
        doador.setName("Alexandre");
        doador.setPeso(79.2);
        doador.setDataDeNascimento("19/05/1994");
        doador.setGenero(2);
        doador.setNovoDoador("V");

        Doador doador2 = new Doador();
        doador2.setName("João");
        doador2.setPeso(45.00);
        doador2.setDataDeNascimento("19/05/2010");
        doador2.setGenero(1);
        doador2.setNovoDoador("V");

        Assert.assertTrue(triagem.verificarIdade(doador));
        Assert.assertFalse(triagem.verificarIdade(doador2));
    }

    @Test
    public void testVerificarIdadeMaior60() {
        Triagem triagem = new Triagem();

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

        Assert.assertTrue(triagem.verificarIdadeMaior60(doador));
        Assert.assertFalse(triagem.verificarIdadeMaior60(doador2));
    }

    public void testVerificarPeso() {
    }
}