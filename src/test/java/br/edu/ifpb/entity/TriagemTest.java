package br.edu.ifpb.entity;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TriagemTest extends TestCase {

    @Test
    public void testVerificacaoMedica() {
        Triagem triagem = new Triagem();

        Doador doador = new Doador();
        doador.setName("Felipe");
        doador.setPeso(80.00);
        doador.setDataDeNascimento("19/05/1958");
        doador.setGenero(2);
        doador.setNovoDoador("V");

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

        Assert.assertEquals("Felipe não está apto para doação! Pessoas maiores de 60 precisam ter doado uma vez antes dessa idade!",
                triagem.verificarDoador(doador));
        Assert.assertEquals("Gabriel Você está apto(a) para a Etapa 2.", triagem.verificarDoador(doador2));
        Assert.assertEquals("Moises não está apto para doação! Não tem o peso permitido para doação!",
                triagem.verificarDoador(doador3));
    }

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
        doador2.setGenero(2);
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
        Triagem triagem = new Triagem();

        Doador doador = new Doador();
        doador.setName("Maria");
        doador.setPeso(55.00);
        doador.setDataDeNascimento("19/05/1997");
        doador.setGenero(1);
        doador.setNovoDoador("F");

        Doador doador2 = new Doador();
        doador2.setName("Julia");
        doador2.setPeso(49.00);
        doador2.setDataDeNascimento("19/05/1998");
        doador2.setGenero(1);
        doador2.setNovoDoador("V");

        Assert.assertTrue(triagem.verificarPeso(doador));
        Assert.assertFalse(triagem.verificarPeso(doador2));
    }
}