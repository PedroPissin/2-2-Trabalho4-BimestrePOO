package quartobimestre;

import java.util.List;
import java.util.ArrayList;



/*

Trabalho feito por: Pedro Luiz Pissin da Cosya
RA: 20221-3     Engenharia da computação 4°Ano 


!!! Explicação polimorfismo por herança: !!! 

O polimorfismo por herança estabelece uma estrutura de classes onde uma classe principal, denominada superclasse, 
é estendida por outras classes, as subclasses. Cada subclasse herda os comportamentos e características da superclasse, 
permitindo também a implementação de comportamentos específicos próprios.
Esta abordagem permite tratar objetos das subclasses como instâncias da superclasse. No exemplo do Zoologico, onde a lista 
de animais é do tipo List<Animal>, cada item na lista pode ser um Cachorro, Gato ou Papagaio - subclasses de Animal. O método 
fazerAnimaisEmitiremSom é capaz de invocar o método fazerSom() de cada animal na lista. Mesmo estando em uma lista do tipo Animal, 
cada objeto responde ao método de maneira distinta, executando o comportamento específico definido em suas respectivas classes, 
demonstrando a flexibilidade do polimorfismo por herança.


*/


//Superclasse Animal
abstract class Animal {
  abstract void fazerSom(); // Método abstrato para fazer o som do animal. 
  // Por ser abstrato, cada subclasse é obrigada a implementar o próprio som.
}

//Subclasses (Cachorro, Gato, Papagaio)
class Cachorro extends Animal {
  @Override
  public void fazerSom() {
      System.out.println("Au au!"); // Implementação do som do Cachorro.
  }
}

class Gato extends Animal {
  @Override
  public void fazerSom() {
      System.out.println("Miau!"); // Implementação do som do Gato.
  }
}

class Papagaio extends Animal {
  @Override
  public void fazerSom() {
      System.out.println("Loro!!!"); // Implementação do som do Papagaio.
  }
}

public class polimorfismoheranca {
  public static void fazerAnimaisEmitiremSom(List<Animal> animais) {
      for (Animal animal : animais) {
          animal.fazerSom(); // Executa o método fazerSom() para cada animal na lista.
          // Como o polimorfismo está em ação, o comportamento específico de fazerSom() de cada subclasse é invocado.
      }
  }

  public static void main(String[] args) {
      List<Animal> animais = new ArrayList<>(); // Cria uma lista de animais do tipo Animal.
      animais.add(new Papagaio()); // Adiciona um Papagaio à lista.
      animais.add(new Cachorro()); // Adiciona um Cachorro à lista.
      animais.add(new Gato()); // Adiciona um Gato à lista.
      fazerAnimaisEmitiremSom(animais); // Chama o método para fazer os animais emitirem som.
  }
}