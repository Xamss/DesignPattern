package StrategySecond;

abstract class VideoPorts implements IConnectionType {
    public void action(){
        System.out.println("Device started to display something on monitor");
    };
}
