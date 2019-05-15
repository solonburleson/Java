package com.objectmaster;

public class Human {
	public Integer stealth;
	public Integer strength;
	public Integer intelligence;
	public Integer health;
	
	public Human() {
		this.stealth = 3;
		this.strength = 3;
		this.intelligence = 3;
		this.health = 100;
	}
	
	public void attackHuman(Human target) {
		target.health -= this.strength;
	}
	
	public void showHealth() {
		System.out.println("Health: " + this.health);
	}
}
