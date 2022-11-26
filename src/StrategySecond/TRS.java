package StrategySecond;

public class TRS extends AudioPorts{
    String name = "3.5mm TRS";
    String deviceName;


    public TRS(String deviceName) {
        this.deviceName = deviceName;
    }
    public void description(){
        System.out.println("I'm used to connect stereo headphones or surround sound channels");
    }

    public String getPortName() {
        return name;
    }

    public String getDeviceName() {
        return deviceName;
    }
}
