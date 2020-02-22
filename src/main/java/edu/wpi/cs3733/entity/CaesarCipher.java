package edu.wpi.cs3733.entity;

/**
 * Caesar cipher; you must implement the cipher and the observer pattern
 */
public class CaesarCipher implements Observer {

	String userText = "";
	public void setText(String text){
		userText = text;
		System.out.println(userText);
	}

	public String getText(){
		return userText;
	}

	@Override
	public void notify(Object object){
		setText(object.toString());
//		System.out.println(userText);

	}
}
