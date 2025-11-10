package io.github.Sailor;

public class ShowDialogue extends Event
{
	
	TextBox textBoxToUpdate;
	String textSpeaker;
	String textOut;
	public ShowDialogue(String speaker, String text, TextBox textBox)
	{		
		textSpeaker = speaker;
		textOut = text;
		textBoxToUpdate = textBox;
	}
		
	
}

