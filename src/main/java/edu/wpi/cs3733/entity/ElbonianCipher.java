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
		char[] char_array = text.toCharArray();
		String answerText = "";
		for (char c : char_array){
			c = Character.toLowerCase(c);
			switch (c){
				case 'a':
					answerText += "01";
					break;
				case 'b':
					answerText += "02";
					break;
				case 'c':
					answerText += "03";
					break;
				case 'd':
					answerText += "04";
					break;
				case 'e':
					answerText += "05";
					break;
				case 'f':
					answerText += "06";
					break;
				case 'g':
					answerText += "07";
					break;
				case 'h':
					answerText += "08";
					break;
				case 'i':
					answerText += "09";
					break;
				case 'j':
					answerText += "10";
					break;
				case 'k':
					answerText += "11";
					break;
				case 'l':
					answerText += "12";
					break;
				case 'm':
					answerText += "13";
					break;
				case 'n':
					answerText += "14";
					break;
				case 'o':
					answerText += "15";
					break;
				case 'p':
					answerText += "16";
					break;
				case 'q':
					answerText += "17";
					break;
				case 'r':
					answerText += "18";
					break;
				case 's':
					answerText += "19";
					break;
				case 't':
					answerText += "20";
					break;
				case 'u':
					answerText += "21";
					break;
				case 'v':
					answerText += "22";
					break;
				case 'w':
					answerText += "23";
					break;
				case 'x':
					answerText += "24";
					break;
				case 'y':
					answerText += "25";
					break;
				case 'z':
					answerText += "26";
					break;
				case ' ':
					answerText += "S";
					break;
				default:
					answerText += c;
			}
		}
		userText = answerText;
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
