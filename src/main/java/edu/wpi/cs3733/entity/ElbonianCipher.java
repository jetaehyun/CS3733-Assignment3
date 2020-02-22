package edu.wpi.cs3733.entity;

/**
 * Elbonian cipher; you must implement the cipher and the observer pattern
 */
public class ElbonianCipher implements Observer {

	String userText = "";
	public void setText(String text){
		userText = text;
	}

	public String getText(){
		return userText;
	}

	@Override
	public void notify(Object object){
		setText(object.toString());
	}
}
