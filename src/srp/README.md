O conceito de SRP é simples: uma classe deve ter um, e somente um, motivo 
para mudar. Isso significa que uma classe deve ter apenas uma responsabilidade.

Neste caso, eu fiz duas classes. A primeira classe chamada de "Calculadora",
possui uma única função, apresentar os métodos simples de qualquer calculadora
'somar, subtrair, dividir e multiplicar'.

A segunda classe chamada de App, é responsável por calcular os meus resultados
a serem colocados, chamando assim, as determinadas funções da classe Calculadora.

Em suma...

1. Classe Calculadora = Lógica da calculadora (operações)
2. Classe App         = Calcular os resultados