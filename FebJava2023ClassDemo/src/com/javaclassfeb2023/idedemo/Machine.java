package com.javaclassfeb2023.idedemo;

public interface Machine {
	//Abstract Methods
	public void start();
	public void stop();
	//can be altered
	
	//Default Methods
	default void showDefaultMessage() {
		System.out.println("This is default message");
		
		//cannot be altered
	}
	//Static Methods
	static int squarePowerSpeed(int speed) {
		return speed * speed;
	}
}
