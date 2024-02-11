/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author qudratullah
 */
public class JavaApplication2 {

    public static void main(String[] args) {
         Context context = new Context(new ConcreteStrategyA());
        context.executeStrategy();

        // Change the strategy
        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy();
   
        
    }
}

interface Strategy {
    void execute();
}
    
class ConcreteStrategyA implements Strategy {
    @Override
    public void execute() {
        // Implement the algorithm A
        System.out.println("this is algorithm A");
    }
}
    
class ConcreteStrategyB implements Strategy {
    @Override
    public void execute() {
        // Implement the algorithm B
        System.out.println("this is algorithe B");
    }
} 
    

class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.execute();
    }
}



