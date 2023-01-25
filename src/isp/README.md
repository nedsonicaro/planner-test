O conceito de isp consiste no Princípio da Segregação da 
Interface — Uma classe não deve ser forçada a implementar 
interfaces e métodos que não irão utilizar, ou seja, é melhor
criar interfaces específicas para cada tipo de classe, do que
criar interfaces genéricas.

No exemplo demonstrado eu criei uma interface Carro que possui
os métodos básicos de qualquer carro existente. Logo em seguida eu criei
mais uma interface chamada de carroConversivel que extende a interface
carro, já que um carro conversível faz tudo aquilo que um carro comum faz,
todavia, um carro conversível possui um método a mais, que é o de 
abrir o teto solar (escotilha). Este método é específico de um carro 
conversível e não de um carro comum. Logo, eu acabo com um grande problema,
se eu colocasse todos esses métodos em uma só interface, eu obrigaria a todas
as classes que implementassem esta única inteface, implementar todos os
métodos, inclusive os métodos que não se aplicam a ela mesma. Como exemplo
a função de abrir o teto solar, visto que, nem todos os carros possuem 
esta função, apenas carros conversíveis.

Na classe app eu então instancio as duas classes (fusca) que implementa
carro, já que é um carro comum. E a classe (Lamborghini) que implementa
carroConversivel, já que é um carro conversível e pussui funções 
específicas para este tipo de carro.
Então eu executo os métodos em cada objeto instanciado exemplificando 
o conceito.

Em suma:
O correto é criar interfaces específicas para cada tipo de classe, e não
uma interface genérica que atenda os requisítos de todas as classes.


