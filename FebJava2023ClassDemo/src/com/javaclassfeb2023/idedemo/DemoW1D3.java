package com.javaclassfeb2023.idedemo;

public class DemoW1D3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike ourBike = new Bike("Black");
		AbstractSubClass newAbstractClass = AbstractSubClass();
		ourBike.start();
		ourBike.stop();
		ourBike.showDefaultMessage();
		newAbstractClass.nonAbstractMethod();
		newAbstractClass.abstractMethod();
		
		System.out.println(Machine.squarePowerSpeed(10));
	}

}
