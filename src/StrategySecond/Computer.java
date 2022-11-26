package StrategySecond;

import java.util.ArrayList;

public class Computer {
    ArrayList<IConnectionType> port = new ArrayList<>();

    void setConnection(IConnectionType port){
        this.port.add(port);
        System.out.println(port.getPortName() + " port has been activated by device named: " + port.getDeviceName());
        port.action();
    }

    void getDescription(int portPosition){
        port.get(portPosition).description();
    }
}
