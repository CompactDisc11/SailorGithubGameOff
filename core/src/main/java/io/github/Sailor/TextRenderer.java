package io.github.Sailor;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreetypeFontLoader;

import com.badlogic.gdx.graphics.g2d.freetype.FreetypeFontLoader.FreeTypeFontLoaderParameter;

import com.badlogic.gdx.graphics.g2d.BitmapFont;

public class TextRenderer
{	
	


	private BitmapFont font;
	private String displayText;
	private String finalText;
	
	
	
	private double progress = 1.0;
	private double prevTime = 0.0;
	private int lextLength;
	private int currentCharacter = 0;
	private int x;
	private int y;
	
	private double timeScale = 1.0;
	public TextRenderer(String fontPath, int newX, int newY)
	{	
		
		
		FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal(fontPath));
		FreeTypeFontLoaderParameter parameter = new FreeTypeFontLoaderParameter();
		parameter.fontParameters.size = 32;
		font = generator.generateFont(parameter.fontParameters);
	//	font = new BitmapFont(Gdx.files.internal(fontPath), false);
		generator.dispose();
		
		this.x = newX;
		this.y = newY;   
		
			
	}
	public void updateDisplayText(String newText)
	{
		finalText = newText;
		displayText = "";
		
	}	
	public void updateTextPosition(int newX, int newY)
	{
		this.x = newX;
		this.y = newY;
	}
	
	public void update(double dt)
	{	
		currentCharacter = (int)(progress/timeScale);
		if (progress-prevTime >= timeScale && currentCharacter<=finalText.length())
		{
			displayText += finalText.charAt(currentCharacter-1);
			prevTime = progress;
			System.out.println("Progress: "+currentCharacter);
		}

		progress += dt;

	}
	public void draw(SpriteBatch batch)
	{
		
	
		font.draw(batch, displayText, this.x, this.y);
		
	 
		
	}
	
	
}
