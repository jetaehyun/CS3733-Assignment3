package edu.wpi.cs3733.entity;

import java.util.ArrayList;

/**
 * Message class to hold clear text; you must implement the rest of the class
 */
public class Message implements Observable {


	ArrayList<Observer> observerArrayList = new ArrayList<Observer>();
	String userText = "";

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
			o.notify(getText());
		}
	}
}
