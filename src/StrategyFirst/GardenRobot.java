package StrategyFirst;

public class GardenRobot {

    private IGardenTools tool;
    private String name;

    public GardenRobot(String name, IGardenTools strategy){
        this.name = name;
        this.tool = strategy;
    }

    public void executeStrategy(){
        System.out.println(this.name+":");
        this.tool.doSomething();
    }

    public void setTool(IGardenTools strategy){
        this.tool = strategy;
        executeStrategy();
    }
}