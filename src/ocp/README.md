O conceito de OCP é simples: classes devem ser abertas para extensão, 
mas fechadas para modificação. Isso significa que, quando você quiser 
adicionar uma nova funcionalidade, você deve estender a classe, em vez 
de modificá-la ou seja, não sendo necessário refatorar o código já existente.

Neste caso, eu fiz 4 classes e uma interface, onde basicamente tudo trata-se
de uma relação entre empresa e empregado. A classe APP deve calcular quanto
o empregado deve receber, a partir da relação de contrato que ele possui,
se ele é um funcionário CLT ou um estagiário, por exemplo.

O intuito é que, caso haja algum novo tipo de contrato, por exemplo, um contrato
PJ na empresa, eu não preciso modificar nenhuma classe, basta que eu adicione
uma nova classe PJ que implemente a interface contrato, sem modificar nada.

