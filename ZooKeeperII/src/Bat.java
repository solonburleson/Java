import com.zookeeper.Mammal;

public class Bat extends Mammal {

	public Bat() {
		this.energy = 300;
	}

	public void fly(){
        System.out.println("Flap flap flap flap");
        this.energy -= 50;
    }

    public void eatHumans(){
        this.energy += 25;
    }

    public void attackTown(){
        System.out.println("Fires erupt all over town");
        this.energy -= 100;
    }
}
