package zookeeper;

public class Bat {
	int energyLevel = 300;
	
	public void fly(){
		energyLevel -= 50;
		System.out.println("The bat takes off and decreases its energy by 50" + energyLevel);
	}
	public void eatHumans(){
		energyLevel += 25;
		System.out.println("so- well, never mind, just increase its energy by 25" + energyLevel);
	}
	public void attackTown(){
		energyLevel -= 100;
		System.out.println("The sound of a town on fire" + energyLevel);
	}
	}