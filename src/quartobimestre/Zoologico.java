package quartobimestre;

import java.util.List;
import java.util.ArrayList;

public class Zoologico {
    // Método que recebe uma lista de polimorfismointerface e faz cada animal emitir som
    public static void fazerAnimaisEmitiremSom(List<polimorfismointerface> animais) {
        for (polimorfismointerface animal : animais) {
            animal.fazerSom(); // Chama o método fazerSom() de cada animal na lista.
        }
    }

    public static void main(String[] args) {
        List<polimorfismointerface> animais = new ArrayList<>(); // Cria uma lista de polimorfismointerface.
        animais.add(new Papagaio2()); // Adiciona um objeto Papagaio2 à lista.
        animais.add(new Cachorro2()); // Adiciona um objeto Cachorro2 à lista.
        animais.add(new Gato2()); // Adiciona um objeto Gato2 à lista.
        fazerAnimaisEmitiremSom(animais); // Chama o método para fazer os animais emitirem som.
    }
}