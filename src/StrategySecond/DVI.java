package StrategySecond;

public class DVI extends VideoPorts{
    String name = "DVI";
    String deviceName;


    public DVI(String deviceName) {
        this.deviceName = deviceName;
    }

    public void description(){
        System.out.println("I'm used to transmit lossless digital video signals");
    }

    public String getPortName() {
        return name;
    }

    public String getDeviceName() {
        return deviceName;
    }

}
