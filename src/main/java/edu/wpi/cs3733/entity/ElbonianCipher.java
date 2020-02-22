package edu.wpi.cs3733.entity;

import javafx.scene.control.TextArea;

/**
 * Elbonian cipher; you must implement the cipher and the observer pattern
 */
public class ElbonianCipher implements Observer {

	String userText = "";
//	private TextArea textArea;
	private Message message;

//	public void setMessage(Message message, TextArea textArea) {
//		this.message = message;
//		this.message.register(this);
//		this.textArea = textArea;
//	}

	public void setMessage(Message message) {
		this.message = message;
		this.message.register(this);
	}

	public void setText(String text){
		userText = text;
	}

	public String getText(){
		return userText;
	}

	@Override
	public void notify(Object object){
		setText(object.toString());
//		textArea.setText(object.toString());

	}
}
