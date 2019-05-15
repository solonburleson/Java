package com.objectmaster2;
import com.objectmaster.*;

public class Samurai extends Human {

	public Samurai() {
		super();
		this.health = 200;
	}

	public void deathBlow(Human target) {
		target.health = 0;
		this.health /= 2;
	}
	
	public void meditate() {
		this.health += this.health/2;
	}
}
