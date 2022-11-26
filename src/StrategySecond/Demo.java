package StrategySecond;

/**
     * The system on your computer automatically recognizes interface type(aka strategies) when you plug something to the port
 */


public class Demo {
    public static void main(String[] args){
        Computer lenovaYoga = new Computer();

        lenovaYoga.setConnection(new PS2("mouse_123"));

        lenovaYoga.setConnection(new TRS("headphone_123"));

        lenovaYoga.setConnection(new VGA("monitor_123"));

        lenovaYoga.getDescription(0);

        lenovaYoga.getDescription(1);

        lenovaYoga.getDescription(2);

    }
}
