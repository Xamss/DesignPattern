package StrategySecond;

public class VGA extends VideoPorts{
    String name = "VGA";
    String deviceName;


    public VGA(String deviceName) {
        this.deviceName = deviceName;
    }
    public void description(){
        System.out.println("I can carry analogue video signal up to a resolution 648x480");
    }

    public String getPortName() {
        return name;
    }

    public String getDeviceName() {
        return deviceName;
    }
}
