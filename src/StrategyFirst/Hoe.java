package StrategyFirst;

public class Hoe implements IGardenTools {

    @Override
    public void doSomething() {
        System.out.println("- It's time for me to plant seed potatoes!");
    }
}