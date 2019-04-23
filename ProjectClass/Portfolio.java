import java.util.ArrayList;

public class Portfolio{
    private String name;
    private ArrayList<Project> contents;

    public Portfolio(String myname){
        this.name = myname;
    }

    public void getInfo(){
        System.out.println(name);
    }

    public void addProject(Project proj){
        this.contents.add(proj);
    } 

    public void allProjects(){
        for(Project project : this.contents){
            System.out.println(project);
        }
    }
}