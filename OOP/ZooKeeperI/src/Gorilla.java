
public class Gorilla extends Mammal {

	public Gorilla() {
		super();
	}
	
    public void throwSomething(){
        System.out.println("Throwing Something");
        this.energy -= 5;        
    }

    public void eatBananas(){
        System.out.println("Eating Bananas");
        this.energy += 10;
    }
    
    public void climb(){
        System.out.println("Climbing a tree");
        this.energy -= 10;    
    }
}
