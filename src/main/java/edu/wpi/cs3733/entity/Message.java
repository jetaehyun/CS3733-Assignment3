package edu.wpi.cs3733.entity;

import java.util.ArrayList;

/**
 * Message class to hold clear text; you must implement the rest of the class
 */
public class Message implements Observable {

	ArrayList<Observer> observerArrayList = new ArrayList<Observer>();

	public void setText(String text){
    System.out.println("hello");
//		notifyObservers();
		for(Observer o : observerArrayList) {
      		System.out.println("hello");
		}
	}

	public String getText(){

		return null;
	}

	@Override
	public void register(Observer o){
		observerArrayList.add(o);
	}

	@Override
	public void notifyObservers(){
		for(Observer o : observerArrayList) {
			o.notify();
		}
	}
}
