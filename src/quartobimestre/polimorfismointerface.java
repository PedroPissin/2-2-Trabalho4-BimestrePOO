package quartobimestre;


/*

Trabalho feito por: Pedro Luiz Pissin da Cosya
RA: 20221-3     Engenharia da computação 4°Ano 


!!! Explicação polimorfismo por interface: !!! 

O polimorfismo por interface introduz uma abordagem onde diferentes classes implementam métodos de uma interface comum, permitindo a execução de comportamentos distintos. 
Em contraste com a herança, o polimorfismo por interface não herda implementações, mas define um contrato que as classes devem seguir.
Cada classe que implementa a interface pode fornecer uma implementação única para os métodos definidos na interface. Isso permite que objetos de diferentes classes, desde 
que implementem a mesma interface, sejam tratados de forma uniforme.
No contexto do Zoologico, a interface poderia ser "SonsAnimais", e as classes Cachorro, Gato e Papagaio poderiam implementá-la. Cada classe tem seu próprio método para 
fazer som, conforme definido na interface. A lista de animais, agora do tipo List<SonsAnimais>, pode conter instâncias de Cachorro, Gato e Papagaio.
O método fazerAnimaisEmitiremSom do Zoologico invocaria o método fazerSom() para cada animal na lista, tratando cada um como um objeto da interface SonsAnimais. 
Mesmo que os animais sejam diferentes em termos de suas classes concretas, todos eles atendem ao contrato estabelecido pela interface e respondem ao método fazerSom() de maneira específica, 
permitindo uma manipulação polimórfica dos objetos, independentemente de suas classes reais. Este é o cerne do polimorfismo por interface - a capacidade de tratar objetos de maneira uniforme, 
independentemente de suas implementações concretas, contanto que cumpram o contrato da interface.


*/


public interface polimorfismointerface {
    void fazerSom(); // Declaração do método fazerSom(), sem implementação.
    // Esta interface estabelece um contrato, indicando que qualquer classe que a implemente deve possuir o método fazerSom().
    // No entanto, não define a implementação desse método, permitindo que as classes que a implementam forneçam suas próprias implementações.
}