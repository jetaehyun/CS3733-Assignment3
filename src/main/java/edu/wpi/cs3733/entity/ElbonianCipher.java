package edu.wpi.cs3733.entity;

/**
 * Elbonian cipher; you must implement the cipher and the observer pattern
 */
public class ElbonianCipher implements Observer {

	String h;
	public void setText(String text){

	}

	public String getText(){

		return "hello";
	}

	@Override
	public void notify(Object object){
		h = object.toString();
	}
}
