package br.edu.ifpb.entity;

import br.edu.ifpb.entity.enums.GeneroEnum;
import org.junit.Assert;
import org.junit.Test;

public class TestDoador {

    @Test
    public void testDoador(){
        Doador doador = new Doador();
        SituacaoMedica situacaoMedicaDoador = new SituacaoMedica();
        Doador falsoDoador = new Doador();
        SituacaoMedica situacaoMedicaFalsoDoador = new SituacaoMedica();
        Doador falsoDoador2 = new Doador();

        //testes positivos
        doador.setName("Erickson");
        doador.setPeso(85.4);
        doador.setDataDeNascimento("19/01/1996");
        doador.setGenero(2);
        doador.setNovoDoador("V");

        // testes Doador
        Assert.assertEquals("Erickson",doador.getName());
        Assert.assertNotNull(doador.getDataNascimento());
        Assert.assertEquals(25,doador.getIdade());
        Assert.assertEquals(GeneroEnum.MASCULINO,doador.getGenero());
        Assert.assertEquals("V",doador.getNovoDoador());
        Assert.assertNotNull(doador.getGenero());
        Assert.assertNotNull(doador.getNovoDoador());

        // dados médicos
        situacaoMedicaDoador.setAmamentando("F");
        situacaoMedicaDoador.setGravida("F");
        situacaoMedicaDoador.setFebre("F");
        doador.setSituacaoMedica(situacaoMedicaDoador);


        if (doador.getGenero().equals(2)){
            Assert.assertEquals("F", doador.getSituacaoMedica().getAmamentando());
            Assert.assertEquals("F", doador.getSituacaoMedica().getGravida());
            Assert.assertNotNull(doador.getSituacaoMedica().getFebre());
            Assert.assertNull(doador.getSituacaoMedica().getMesesPosParto());
            Assert.assertNull(doador.getSituacaoMedica().getDiaDoParto());
        }



        //testes negativos
        falsoDoador.setName("ABC123");
        falsoDoador.setPeso(-25.1);
        falsoDoador.setDataDeNascimento("19/01/1800");
        falsoDoador.setGenero(1);
        falsoDoador.setNovoDoador("Verdadeiro");


        Assert.assertNull(falsoDoador.getName());
        Assert.assertNull(falsoDoador.getDataNascimento());
        Assert.assertNull(falsoDoador.getPeso());
        Assert.assertThrows(IllegalArgumentException.class, () ->{
            falsoDoador.setGenero(4);
        });
        Assert.assertNull(falsoDoador.getNovoDoador());

        falsoDoador.setNovoDoador("F");
        Assert.assertEquals("F",falsoDoador.getNovoDoador());

        //testes negativos
        falsoDoador2.setName("123 AbC");
        falsoDoador2.setPeso(0.0);
        falsoDoador2.setDataDeNascimento("19/01/2050");

        Assert.assertNull(falsoDoador2.getName());
        Assert.assertNull(falsoDoador2.getPeso());
        Assert.assertNull(falsoDoador2.getDataNascimento());
        Assert.assertEquals(0, falsoDoador2.getIdade());
    }
}
