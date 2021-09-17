package br.edu.ifpb.entity;

import junit.framework.TestCase;
import org.junit.Test;

public class TriagemMedicaTest extends TestCase {

    @Test
    public void testVerificacaoMedica() {
        TriagemMedica triagemMedica = new TriagemMedica();

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
    }

    public void testVerificarFebre() {
    }

    public void testVerificarGravidez() {
    }

    public void testVerificarAmamentacao() {
    }
}