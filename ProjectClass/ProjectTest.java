import java.util.ArrayList;

public class ProjectTest{
    public static void main(String args[]){
        Portfolio portfolio = new Portfolio("My Portfolio");
        // Project project1 = new Project();
        // Project project2 = new Project("Title Project");
        // Project project3 = new Project("Title and Desc Project", "This is the description");
        Project project = new Project("All Project", "Test", 25.00);
        // System.out.println(project1.elevatorPitch());
        // System.out.println(project2.elevatorPitch());
        // System.out.println(project3.elevatorPitch());
        // System.out.println(project4.elevatorPitch());
        // System.out.println(project1.setName("hello"));
        // System.out.println(project1.elevatorPitch());
        // System.out.println(project2.setDesc("world1"));
        // System.out.println(project2.elevatorPitch());
        System.out.println(project.elevatorPitch());
        portfolio.getInfo();
        portfolio.allProjects();
    }
}