package com.javaclassfeb2023.idedemo;

public class Car implements Machine{
	private String color;
	private int productionDate;
	
	public Car(String color, int date) {
		this.color = color;
		this.productionDate = date;
	}
	public Car(String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
		}
	
	public void repaintCar() {
		this.color = "Black";
		System.out.println("This car is " + this.color);
	}
	
	@Override
	public void start() {
		System.out.println("Car started");
		
	}
	@Override
	public void stop() {
		System.out.println("Car stopped");
		System.out.println("This car's speed is: " + Machine.squarePowerSpeed(10));
		
	}
}
