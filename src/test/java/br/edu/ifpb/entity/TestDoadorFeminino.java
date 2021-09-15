package br.edu.ifpb.entity;

import br.edu.ifpb.entity.enums.GeneroEnum;
import org.junit.Test;

public class TestDoadorFeminino {

    @Test
    public void TestDoadorFeminino(){
        DoadorFeminino feminino = new DoadorFeminino();

        feminino.setName("Erickson");
        feminino.setPeso(85.4);
        feminino.setDataNascimento("19/01/1996");
        feminino.setGenero(GeneroEnum.MASCULINO);
    }
}
