O conceito de Dip consiste no Princípio da Inversão de Dependência 
— Dependa de abstrações e não de implementações.

Por exemplo, eu criei uma interface Cartão que possui um método de efetuar
uma transação comum aos cartões de crédito, então, eu criei mais duas
interfaces Visa, e Mastercard que são dois tipos de cartões de crédito
de marcas diferentes, portanto possuem propriedades um pouco diferentes
e assim, criei duas classes implementando cada um de seus métodos.
O segredo está na classe de MaquinaCartao onde nela eu implemento o método
de efetuar transação passando como parâmetro a interface cartão e assim
desacoplando o meu sistema.

Eu poderia ter feito isso de outra forma, desrespeitando o conceito de Dip,
onde eu implementaria o método de efetuar transação já 'embutida' na classe
de MaquinaCartao, eu criaria um objeto na própria função dentro de MaquinaCartao
chamando a classe Cartao. Isso é muito ruim porque eu estou gerando uma
relação de alto acoplamento, eu teria uma classe responsável por efetuar 
uma ação de outra classe. Para resolver tal problema eu fiz o que foi dito
acima, pois desta forma, também estou respeitando os outros conceitos 
SOLID

Em suma:
É necessário que cada classe seja desacoplada e dependa de uma
abstração, pois, se isto não for seguido, o sistema ficará muito frágil
e de difícil manutenção.
