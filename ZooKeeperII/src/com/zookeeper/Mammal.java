package com.zookeeper;


public class Mammal {
	public Integer energy;
	
	public Mammal() {
		this.energy = 100;
	}
	
    public void showEnergy(){
        System.out.println("Energy level: " + this.energy);       
    }
}
