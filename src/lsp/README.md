O conceito de lsp é simples: Uma classe derivada 
deve ser substituível por sua classe base.

Neste caso eu criei 4 classes, onde eu implementei uma classe pai,
em que e uma classe filha que herda de pai, herdando o seu método de
saudação, e finalmente, eu criei uma classe Saudacao, onde nela,
eu criei um método que recebe como parâmetro um objeto da classe pai.

Por fim, na classe app eu instanciei todas as classes
e executei o método de Saudacao passando o objeto pai
e o objeto filha, obtendo assim, as respectivas saídas
escritas em cada classe.

Em suma:
Eu estou passando como parâmetro tanto a classe pai como 
a classe derivada e o código continua funcionando da 
forma esperada, não sendo necessário alterar as propriedades
do programa.