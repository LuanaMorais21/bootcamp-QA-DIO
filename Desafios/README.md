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

### _7- Número Feliz_
Um número feliz é um número definido pelo seguinte processo:

• Começando com qualquer número inteiro positivo, substitua o número pela soma dos quadrados de seus dígitos.
• Repita o processo até que o número seja igual a 1 (onde ficará), ou faça um loop infinito em um ciclo que não inclua 1.
• Aqueles números para os quais esse processo termina em 1 são felizes.
• Retorna true se n for um número feliz e false se não for.

Escreva um algoritmo para determinar se o número n é feliz.

_Entrada_
A entrada será feita por um número inteiro, correpondente ao valor de entrada para verificar se  o número é feliz ou não.

_Saída_
Retorne true, caso o número seja feliz, e retorne false, caso o número não seja feliz.

Confira exemplo abaixo:

Exemplo 1

Entrada | Saída
:------:| :----:
19      | true

Explicação:
1² + 9² = 82
8² + 2² = 68
6² + 8² = 100
1² + 0² + 0² = 1

### _8 - Quantidade Necessaria_
Cada pizza é composta por 4 fatias. Há N amigos e cada amigo precisa de exatamente X fatias.
Você deverá criar um código capaz de calcular o número mínimo de pizzas que eles devem pedir para satisfazer seu apetite.

_Entrada_
A primeira linha de entrada conterá um único inteiro T, indicando o número de casos de teste.
Cada caso de teste consiste em dois inteiros. N para o número de amigos e X para a quantidade de fatia que cada amigo deseja.

_Saída_
Para cada caso de teste, produza o número mínimo de pizzas necessário, conforme o exemplo a baixo:
Existe apenas 1 amigo que precisa 5 fatias. Se ele mandar 1 pizza, ele receberá apenas 4 fatias. Assim, pelo menos 2 pizzas devem ser encomendadas
para ter o número necessário de fatias.

Entrada | Saída
:------:|:------:
1, 1, 5 | 2

Explicação: Existe apenas 1 amigo que precisa 5 fatias. Se ele mandar 1 pizza, ele receberá apenas 4 fatias. Assim, pelo menos 2 pizzas devem ser encomendadas para ter o número necessário de fatias.

### _9 - Diferença entre Dígitos_
O desafio consiste em um número inteiro n, onde será necessário calcular a diferença entre o produto e a soma dos seus digitos.

_Entrada_
• Para encontrar o produto do valor, os dígitos deverão ser multiplicados.
• A soma, basta realizar uma adição entre os dígitos.
• A diferença, é necessário substrair o resultado final dos dois valores.

_Saída_
A saída deverá retornar o valor final da diferença entre o produto e a soma dos digitos.

Entrada | Saída
:------:|:-----:
243     | 15

Explicação:
Produto de dígitos = 2 * 3 * 4 = 24
Soma dos dígitos = 2 + 3 + 4 = 9
Resultado = 24 - 9 = 15

### _10 - Emboscada RPG_
Você e seus amigos estão jogando uma partida de RPG (Role-Playing Game) utilizando um dado de 10 lados. Em um determinado momento, em uma masmorra escura, o seu personagem foi emboscado por um terrível goblin. Como em todo bom RPG, temos alguns parâmetros que definem os status dos personagens:

Vida: Pontos que devem ser maiores que 0, se não o personagem morre.
Ataque: Pontos que definem quanto de dano ele inflingirá nos outros personagens.
Defesa: Pontos que definem quanto dano será mitigado quando ele levar um ataque.

O dado é um modificador desses parâmetros. Quando você joga o dado o valor dele deve ser somado ao seu ataque ou a sua defesa. Quando o valor do dado for maior que 8 e menor que 10, o jogador tira um crítico e essa soma deve ser DOBRADA.

O dano causado ao jogador é calculado dessa forma:
vidaDoJogador - (ataqueInimigo - (defesaDoJogador + dados))

O dano causado ao inimigo é calculado dessa forma:
vidaDoInimigo - (ataqueDoJogador + dados)

Caso o jogador sobreviva a emboscada, ele contra-ataca.

Para deixar a jogatina mais rápida, fazendo o computador realizar as contas matemáticas, você decidiu criar esse programa para verificar se seu personagem vai sobreviver e contra-atacar ou morrer.

_Entrada_
A entrada serão seis parâmetros nessa ordem:
Dados;
Vida do Jogador;
Ataque do Jogador;
Defesa do Jogador
Vida do Inimigo;
Ataque do Inimigo;

_Saída_
A saída deve ser verificado se o jogador sobreviveu ao ataque ou não. Caso ele tenha sobrevivido, verificar se o contra-ataque dele foi eficaz e matou o inimigo ou não. Em seguida, para cada caso, imprima na tela as respectivas ocorrências.

Exemplo:
ENTRADA | SAÍDA
:------:|:-----:
2 - 6 - 6 - 4 - 5 - 14 | "Jogador nao sobreviveu"
8 - 6 - 6 - 4 - 5 - 14 | "Jogador sobreviveu e derrotou o inimigo" 
6 - 12 - 6 - 8 - 14 - 7 | "Jogador sobreviveu e nao derrotou o inimigo"