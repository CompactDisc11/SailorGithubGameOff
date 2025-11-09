
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

import com.badlogic.gdx.graphics.g2d.NinePatch;


public class TextBox
{
	
	

	private TextRenderer textRenderer;
	
	
	private int x;
	private int y;
	public boolean shouldDraw;
	NinePatch backgroundTexture;
	public TextBox(boolean shouldDraw, int positionX, int positionY)
	{	
		
	
		
		textRenderer  = new TextRenderer("sik_fonts/Funstella.ttf", positionX, positionY);
		
		
		this.shouldDraw = shouldDraw;
		
		Texture temp = new Texture(Gdx.files.internal("JapanBundle/Hitobashira_TextBox_01_B_transparent_3.png"));
		temp.setWrap(Texture.TextureWrap.Repeat, Texture.TextureWrap.Repeat);
		backgroundTexture = new NinePatch(temp, 512, 512, 0, 0);
		UpdatePosition(positionX, positionY);

		
	}
	
	
	public void draw(SpriteBatch batch)
	{	
		
		if (shouldDraw)
		{
			backgroundTexture.draw(batch, x, y, 1920-30, 310);
			textRenderer.draw(batch);
		}
	}
	
	public void Update(double dt)
	{
		
		textRenderer.update(dt);
	}
	
	public void UpdateText(String text)
	{
		
		textRenderer.updateDisplayText(text);
		
	}
	
	
	public void UpdatePosition(int newX, int newY)
	
	{
		textRenderer.updateTextPosition(newX+384, newY+(310-72-32)); // top of the texture - line start - text height
		x = newX;
		y = newY;
	}
	
	
}
