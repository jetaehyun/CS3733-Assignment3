package edu.wpi.cs3733.entity;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

/**
 * Caesar cipher; you must implement the cipher and the observer pattern
 */
public class CaesarCipher implements Observer {

	private Message message;
	String userText = "";

	public void setMessage(Message message) {
		this.message = message;
		this.message.register(this);
	}

//	public void setField(TextArea area) {
//		this.area = area;
//	}

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

	}
}
