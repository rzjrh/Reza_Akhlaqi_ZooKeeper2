//Create a package name (".com.codingdojo") as asked and add zookeeper2 to avoid collision 
package com.codingdojo.zookeeper2;


//declare extension from Mammal.java
public class Bat extends Mammal {
	
	public int energyLevel= 300; 	//override the energy level here 
	
	
	public void DisplayInitialBat() {
		System.out.println("Initial energy level for bat: "+ energyLevel);
	}
	
	
	
	public void fly() {
		energyLevel -=50;	
		System.out.println("\n Bat is Flying, energy decrase by (-50) "+"\n The update energy level is: "+energyLevel);
	}
	
	
	public void eatHumans() {
		energyLevel +=25;	
		System.out.println("\n Bat eats human, energy increase by (25) "+"\n The update energy level is: "+energyLevel);
	}

	
	
	public void attackTown () {
		energyLevel -=100;	
			System.out.println("\n Bat attacks to the town, energy decrase by (-100) "+"\n The update energy level is: "+energyLevel);
			}
	
	
	//end
}
