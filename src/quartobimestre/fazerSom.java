package quartobimestre;

class Cachorro2 implements polimorfismointerface {
    @Override
    public void fazerSom() {
        System.out.println("Au au!"); 
        // Implementação do som específico para Cachorro2 quando o método fazerSom() é chamado.
    }
}

class Gato2 implements polimorfismointerface {
    @Override
    public void fazerSom() {
        System.out.println("Miau!"); 
        // Implementação do som específico para Gato2 quando o método fazerSom() é chamado.
    }
}

class Papagaio2 implements polimorfismointerface {
    @Override
    public void fazerSom() {
        System.out.println("Loro!!!"); 
        // Implementação do som específico para Papagaio2 quando o método fazerSom() é chamado.
    }
}