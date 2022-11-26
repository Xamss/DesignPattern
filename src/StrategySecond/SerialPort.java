package StrategySecond;

abstract class SerialPort implements IConnectionType {
    public void action(){
        System.out.println("The machine has started");
    };
}
