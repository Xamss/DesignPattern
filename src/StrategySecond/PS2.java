package StrategySecond;

public class PS2 extends SerialPort{
    String name = "PS2";
    String deviceName;


    public PS2(String deviceName) {
        this.deviceName = deviceName;
    }
    public void description(){
        System.out.println("I'm used to connect mouse and keyboard");
    }

    public String getPortName() {
        return name;
    }

    public String getDeviceName() {
        return deviceName;
    }
}
