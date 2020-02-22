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
			char[] char_array = text.toCharArray();
			boolean capital;
			String answerText = "";
			for (char c : char_array){
				capital = false;
				if(Character.toUpperCase(c) == c){
					capital = true;
				}
				char x = Character.toLowerCase(c);
				switch (x){
					case 'a':
						if (capital)
							answerText += "V";
						else
							answerText += "v";
						break;
					case 'b':
						if (capital)
							answerText += "W";
						else
							answerText += "w";
						break;
					case 'c':
						if (capital)
							answerText += "X";
						else
							answerText += "x";
						break;
					case 'd':
						if (capital)
							answerText += "Y";
						else
							answerText += "y";
						break;
					case 'e':
						if (capital)
							answerText += "Z";
						else
							answerText += "z";
						break;
					case 'f':
						if (capital)
							answerText += "A";
						else
							answerText += "a";
						break;
					case 'g':
						if (capital)
							answerText += "B";
						else
							answerText += "b";
						break;
					case 'h':
						if (capital)
							answerText += "C";
						else
							answerText += "c";
						break;
					case 'i':
						if (capital)
							answerText += "D";
						else
							answerText += "d";
						break;
					case 'j':
						if (capital)
							answerText += "E";
						else
							answerText += "e";
						break;
					case 'k':
						if (capital)
							answerText += "F";
						else
							answerText += "f";
						break;
					case 'l':
						if (capital)
							answerText += "G";
						else
							answerText += "g";
						break;
					case 'm':
						if (capital)
							answerText += "H";
						else
							answerText += "h";
						break;
					case 'n':
						if (capital)
							answerText += "I";
						else
							answerText += "i";
						break;
					case 'o':
						if (capital)
							answerText += "J";
						else
							answerText += "j";
						break;
					case 'p':
						if (capital)
							answerText += "K";
						else
							answerText += "k";
						break;
					case 'q':
						if (capital)
							answerText += "L";
						else
							answerText += "l";
						break;
					case 'r':
						if (capital)
							answerText += "M";
						else
							answerText += "m";
						break;
					case 's':
						if (capital)
							answerText += "N";
						else
							answerText += "n";
						break;
					case 't':
						if (capital)
							answerText += "O";
						else
							answerText += "o";
						break;
					case 'u':
						if (capital)
							answerText += "P";
						else
							answerText += "p";
						break;
					case 'v':
						if (capital)
							answerText += "Q";
						else
							answerText += "q";
						break;
					case 'w':
						if (capital)
							answerText += "R";
						else
							answerText += "r";
						break;
					case 'x':
						if (capital)
							answerText += "S";
						else
							answerText += "s";
						break;
					case 'y':
						if (capital)
							answerText += "T";
						else
							answerText += "t";
						break;
					case 'z':
						if (capital)
							answerText += "U";
						else
							answerText += "u";
						break;
					case ' ':
							answerText += " ";
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

	}
}
