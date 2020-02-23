package edu.wpi.cs3733.entity;

import java.util.ArrayList;
import java.util.List;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * Message class to hold clear text; you must implement the rest of the class
 */
public class Message implements Observable {

//	@FXML private TextArea area;

	private List<Observer> observerArrayList = new ArrayList<>();;
	String userText;

//	public void setField(TextArea area) {
//		this.area = area;
//	}

	public void setText(String text){
		userText = text;
		notifyObservers();
	}

	public String getText(){
		return userText;
	}

	@Override
	public void register(Observer o){
		observerArrayList.add(o);
	}


	@Override
	public void notifyObservers(){
		for(Observer o : observerArrayList) {
			o.notify(userText);
		}
	}

}
