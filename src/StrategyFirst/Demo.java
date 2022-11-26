package StrategyFirst;

public class Demo {
    public static void main(String[] args){

        GardenRobot rookie = new GardenRobot("Sally", new Hoe());

        rookie.executeStrategy();
    }
}
