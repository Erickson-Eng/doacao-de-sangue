package br.edu.ifpb.entity;

import br.edu.ifpb.entity.enums.GeneroEnum;
import org.junit.Assert;
import org.junit.Test;

public class TestDoador {

    @Test
    public void testDoador(){
        Doador doador = new Doador();
        Doador falsoDoador = new Doador();
        Doador falsoDoador2 = new Doador();

        //testes positivos
        doador.setName("Erickson");
        doador.setPeso(85.4);
        doador.setDataNascimento("19/01/1996");
        doador.setGenero(GeneroEnum.MASCULINO);
        doador.setNovoDoador("V");

        Assert.assertEquals("Erickson",doador.getName());
        Assert.assertNotNull(doador.getDataNascimento());
        Assert.assertEquals(25,doador.getIdade());
        Assert.assertEquals(GeneroEnum.MASCULINO,doador.getGenero());
        Assert.assertEquals("V",doador.getNovoDoador());
        Assert.assertNotNull(doador.getGenero());
        Assert.assertNotNull(doador.getNovoDoador());

        //testes negativos
        falsoDoador.setName("ABC123");
        falsoDoador.setPeso(-25.1);
        falsoDoador.setDataNascimento("19/01/1800");
        falsoDoador.setGenero(GeneroEnum.FEMININO);
        falsoDoador.setNovoDoador("Verdadeiro");
        falsoDoador.setNovoDoador("F");

        Assert.assertNull(falsoDoador.getName());
        Assert.assertNull(falsoDoador.getDataNascimento());
        Assert.assertNull(falsoDoador.getPeso());
        Assert.assertNotEquals(GeneroEnum.MASCULINO,falsoDoador.getGenero());
        Assert.assertNull(falsoDoador.getNovoDoador());
        Assert.assertEquals("F",falsoDoador.getNovoDoador());
        //testes negativos
        falsoDoador2.setName("123 AbC");
        falsoDoador2.setPeso(0.0);
        falsoDoador2.setDataNascimento("19/01/2050");

        Assert.assertNull(falsoDoador2.getName());
        Assert.assertNull(falsoDoador2.getPeso());
        Assert.assertNull(falsoDoador2.getDataNascimento());
        Assert.assertEquals(0, falsoDoador2.getIdade());
    }
}
