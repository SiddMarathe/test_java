package com.amdocs;

public class Increment {
	
	private static int counter = 1;
	int abc;
	
	public Increment() {
		// TODO Auto-generated constructor stub
	}
	  
	public int getCounter() {
	    return counter++;
	}
			
	public int decreasecounter(int input) {
	    if (input == 0){
	        return counter--;
	    }
	    else {
	        if (input == 1) {
	            return counter;
	        }
	        else
	            return counter++;
	   }
        }			
}
