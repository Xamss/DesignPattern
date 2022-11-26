package StrategySecond;

public class DE9 extends SerialPort{
    String name = "DE9";
    String deviceName;


    public DE9(String deviceName) {
        this.deviceName = deviceName;
    }
    public void description(){
        System.out.println("I allow full duplex serial communication between the computer and it's peripheral");
    }

    public String getPortName() {
        return name;
    }

    public String getDeviceName() {
        return deviceName;
    }
}
