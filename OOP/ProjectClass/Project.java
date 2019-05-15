public class Project{
    private String name;
    private String desc;
    private Double initialcost;

    public Project(){
    }

    public Project(String projName){
        this.name = projName;
    }

    public Project(String projName, String projDesc){
        this.name = projName;
        this.desc = projDesc;
    }

    public Project(String projName, String projDesc, Double projCost){
        this.name = projName;
        this.desc = projDesc;
        this.initialcost = projCost;
    }

    public String getName(){
        return this.name;
    }

    public String setName(String projName){
        this.name = projName;
        return this.name;
    }

    public String getDesc(){
        return this.desc;
    }

    public String setDesc(String projDesc){
        this.desc = projDesc;
        return this.desc;
    }

    public String elevatorPitch(){
        return this.name + "(" + this.initialcost+")" + ": " + this.desc;
    }
}