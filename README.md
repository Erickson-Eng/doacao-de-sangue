# doacao-de-sangue

## IMPORTÂNCIA DE DOAR SANGUE

A doação de sangue é um gesto solidário de doar uma pequena quantidade do próprio sangue para salvar a vida de pessoas que se submetem a tratamentos e intervenções médicas de grande porte e complexidade, como transfusões, transplantes, procedimentos oncológicos e cirurgias.

Uma única doação pode salvar até quatro vidas. Um simples gesto de amor e solidariedade pode gerar muitos sorrisos. Faça sua parte, independentemente de parentesco entre o doador e quem receberá a doação

## PROJETO - PARTE 1

Utilizando orientação à objetos e encapsulamento (GET e SET), crie uma classe que conterá os seguintes atributos e métodos:
- Nome;
- Idade;
- Peso;
- Sexo;
- Está grávida?
- Está amamentando?
- O parto ocorreu há pelo menos 12 meses?
- Já doou sangue antes?
- Está com febre?

Em seguida, crie uma classe de teste para criar testes de unidade para cada um dos atributos e métodos acima. Lembre-se de testar alguns estados diferentes de cada atributo/método utilizando encapsulamento.

## PROJETO - PARTE 2

Após a realização da primeira parte do sistema, escreva um programa que será utilizado na triagem de doadores de sangue, obedecendo as normas abaixo.

Vejam que alguns novos atributos e métodos irão surgir:
- Etapa da triagem: etapa em que o doador de sangue foi impedido de doar sangue ou em que se encontra apto para doação;
- Mensagem de aprovação ou reprovação para doação de sangue;
- Justificativa em caso de reprovação para doação.

## TRIAGEM – ETAPA 1

Para doar sangue, é necessário ter entre 16 e 69 anos;
Pessoas acima de 60 anos podem doar, se já tiverem doado sangue alguma vez antes dessa idade;
Pesar no mínimo 60 kg se for do sexo masculino e 50 kg se for do sexo feminino;

Se uma das condições da Etapa 1 não seja satisfeita, deve ser exibida duas mensagens:
1) “Não é possível doar sangue”
2) Mensagem mostrando a justificativa do(a) doador(a) ter sido rejeitado(a) para a Etapa 2 da triagem.

Caso todas as condições da etapa 1 sejam satisfeitas, deve ser exibida a seguinte mensagem “Você está apto(a) para a Etapa 2” e novos requisitos serão realizados nesta Etapa 2.

## TRIAGEM – ETAPA 2

Existem alguns requisitos de quem não pode doar sangue:
- Estiver com febre no dia da doação;
- Estiver grávida;
- Estiver amamentando, a menos que o parto tenha ocorrido há mais de 12 meses.

Se uma das condições da Etapa 2 não seja satisfeita, deve ser exibida duas mensagens:
1) “Não é possível doar sangue”
2) Mensagem mostrando a justificativa do(a) doador(a) ter sido rejeitado(a) para a Etapa 2 da triagem.

Caso todas as condições da etapa 2 sejam satisfeitas, deve ser exibida a seguinte mensagem “Por favor, aguarde na fila para doação”.

Em seguida, crie uma classe de teste para criar testes de unidade para cada um dos atributos e métodos acima. Lembre-se de testar alguns estados diferentes de cada atributo/método utilizando encapsulamento e as técnicas de partição de equivalência e análise de valor limite, sempre que for possível.

## Organização arquitetural do projeto
![Estrutura do projeto](src/main/resources/img/Estrutura.png)

### EQUIPE

* Erickson Tulio Rodrigues Azevedo
* Alexandre dos Santos Oliveira