package com.objectmaster2;
import com.objectmaster.*;

public class Ninja extends Human {
	public Ninja() {
		super();
		this.stealth = 10;
	}

	public void steal(Human target) {
		target.health -= this.stealth;
		this.health += this.stealth;
	}
	
	public void runAway() {
		this.health -= 10;
	}
}
