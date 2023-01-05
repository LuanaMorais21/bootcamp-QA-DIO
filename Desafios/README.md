# _DESAFIOS - Bootcamp QA_

### _1 - Média de Idade_

Faça um programa que peça para 3 pessoas a sua idade, ao final o programa deverá verificar se a média de idade da turma varia entre 0 e 25, 26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.

_Entrada_
A entrada consiste em três números inteiros que representam a idade das pessoas.
_Saída_
A saída imprimirá a média de idade da turma, conforme o exemplo abaixo:

| Entrada | Saída  |
| :-----: | :----: |
|   70    | Idosa! |
|   60    | Idosa! |
|   61    | Idosa! |
|    7    | Jovem! |
|   14    | Jovem! |
|   22    | Jovem! |

### _2 - Qual é o seu turno?_

Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.

_Entrada_
A entrada consiste em um caractere(char) M , N ou V que informará o turno em que você estuda.

_Saída_
A saída mostrará uma mensagem que informa conforme o seu turno. Veja o exemplo:

| Entrada |      Saída      |
| :-----: | :-------------: |
|    M    |    Bom Dia!     |
|    N    |   Boa Noite!    |
|    T    | Valor Inválido! |

### _3 - A Fila do Banco_

Elabore um programa que simule uma fila de atendimento bancário. O programa deve ler o nome de 3 pessoas (clientes do banco), armazenando-os em uma fila.
_Entrada_
A entrada será o nome de três pessoas (clientes do banco).

_Saída_
O programa deve imprimir como saída na tela o nome da pessoa e sua posição na fila.

| Entrada |       Saída        |
| :-----: | :----------------: |
|   Ana   | esta na posicao: 1 |
|  Sofia  | esta na posicao: 2 |
|  Lucas  | esta na posicao: 3 |

### _4 - Encontrando o Percentual de Desconto_

O gerente de uma loja resolveu aplicar descontos em todos os seus produtos! A tarefa é calcular a Porcentagem de Desconto aplicada a esses produtos.
_Entrada_
A entrada deverá ser feita por dois valores M e D, onde a primeira linha deverá receber o valor marcado do produto, e na segunda linha o valor do produto com o desconto já aplicado.

_Saída_
A saída deverá retornar o percentual de desconto que foi aplicado no produto, conforme exemplo abaixo.

| Entrada |         Saída         |
| :-----: | :-------------------: |
| M - 40  |                       |
| D - 30  | O desconto foi de 25% |

### _5 - Descubra o Menor Múltiplo_

Dado um inteiro positivo n , retorne o menor inteiro positivo que é um múltiplo 2 de e n .
_Entrada_
A entrada consiste em um int, do qual podemos calcular seu menor multiplo.

_Saída_
A entrada consiste em um retorno, que será o menor multiplo digitado e 2.

| Entrada |      Saída       |
| :-----: | :--------------: |
|    5    |                  |
|    O    | Zresultado eh:10 |

### _6 - Flecha, Escudo ou Espada_

Você e seus amigos estão em uma aula de criação de jogos. Para inspirar os alunos e treinar, o professor pediu para que vocês fizessem um jogo que já existe com alguma modificação. A escolha de vocês foi "Pedra, Papel e Tesoura" e a modificação foi mudar Pedra para Flecha, Papel para Escudo e Tesoura para Espada.

Então, vocês escolheram um número para representar cada um dos parâmetros. Sendo:

1 - Flecha
2 - Escudo
3 - Espada

_Entrada_
A entrada vão ser dois números representando cada um dos parâmetros. Sendo a primeira entrada o jogador e a segunda o inimigo.

_Saída_
A saída deve ser se o jogador ganhou, empatou ou perdeu após a análise das duas entradas. A saída deve ser sem as aspas.
ENTRADA  |  SAÍDA
:-----:  | :-----:
1 - 1    |  "Empatou"
1 - 2    |  "Perdeu"
3 - 2    |  "Ganhou"