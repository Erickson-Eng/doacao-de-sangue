package br.edu.ifpb.entity;

import br.edu.ifpb.entity.enums.GeneroEnum;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Triagem triagem = new Triagem();
        TriagemMedica medica = new TriagemMedica();
        SituacaoMedica situacaoMedica = new SituacaoMedica();

        System.out.println("Primeira etapa da Triagem!");
        //Formulário de Triagem
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite seu peso: ");
        Double peso = input.nextDouble();

        System.out.println("Digite sua data de nascimento: ex.(00/00/0000)");
        String nascimento = input.next();

        System.out.println("Digite seu sexo (1 - Feminino) (2 - Masculino): ");
        int sexo = input.nextInt();


        System.out.println("Você é um novo doador? (V - sim) (F - não): ");
        String novoDoador = input.next();

        Doador doador = new Doador();

        doador.setName(nome);
        doador.setPeso(peso);
        doador.setDataDeNascimento(nascimento);
        doador.setGenero(sexo);
        doador.setNovoDoador(novoDoador);

        String situacao = (triagem.verificarDoador(doador));
        String aux = doador.getName() + " Você está apto(a) para a Etapa 2.";
        if (situacao.equals(aux)){
            System.out.println(situacao);
            System.out.println();
            if (doador.getGenero() == GeneroEnum.MASCULINO) {
                System.out.println("Triagem - Etapa 2");
                System.out.println("Você está com febre? (V - sim) (F - não): ");
                String febre = input.next();
                situacaoMedica.setFebre(febre);
                doador.setSituacaoMedica(situacaoMedica);
                System.out.println(medica.verificacaoMedica(doador));
            }
            else {
                System.out.println("Triagem - Etapa 2");
                System.out.println("Você está com febre? (V - sim) (F - não): ");
                String febre = input.next();
                situacaoMedica.setFebre(febre);
                System.out.println("Você está grávida? (V - sim) (F - não): ");
                String gravida = input.next();
                situacaoMedica.setGravida(gravida);
                System.out.println("Você está com amamentando? (V - sim) (F - não): ");
                String amamentando = input.next();
                if (amamentando.equals("V")) {
                    System.out.println("Qual o dia do seu parto?");
                    String dataParto = input.next();
                    situacaoMedica.setDiaDoParto(dataParto);

                    doador.setSituacaoMedica(situacaoMedica);
                    System.out.println(medica.verificacaoMedica(doador));
                }else {
                    doador.setSituacaoMedica(situacaoMedica);
                    System.out.println(medica.verificacaoMedica(doador));
                }
            }
        }
        else{
            System.out.println(situacao);
        }

        //System.out.println(medica.verificacaoMedica(doador));
        //System.out.println();



/*        doador.setSituacaoMedica(situacaoMedica);

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
        System.out.println(medica.verificacaoMedica(doador4));*/

    }
}
