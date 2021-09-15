package br.edu.ifpb.entity;

import br.edu.ifpb.entity.enums.GeneroEnum;
import org.junit.Test;

public class TestDoador {

    @Test
    public void criaDoador(){
        Doador doador = new Doador();
        doador.setName("Erickson");
        doador.setPeso(85.4);
        doador.setDataNascimento("19/01/1996");
        doador.setGenero(GeneroEnum.MASCULINO);
        doador.setEstaDoente(false);
        doador.setNovoDoador(false);

    }
}
