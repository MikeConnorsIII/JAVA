package zookeeper;

public class Gorilla extends Mammal {
	
	public void throwSomething(){
		energyLevel -= 5;
		System.out.println("The gorilla throws something and used 5 energy" + energyLevel);
	}
	public void eatBananas(){
		energyLevel += 10;
		System.out.println("The gorilla ate a banana and gained 10 energy" + energyLevel);
	}
	public void climb(){
		energyLevel -= 10;
		System.out.println("The gorilla climed a tree and used 10 energy" + energyLevel);
	}
	}

