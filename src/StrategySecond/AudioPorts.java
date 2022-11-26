package StrategySecond;

abstract class AudioPorts implements IConnectionType {
    public void action(){
        System.out.println("Device started to play some music");
    };
}
