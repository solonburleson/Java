public class Mammal {
    Integer energy;

    public Mammal(){
        this.energy = 100;
    }
    
    public Integer showEnergy(){
        System.out.println("Energy level: " + this.energy);
        return this.energy;        
    }
}