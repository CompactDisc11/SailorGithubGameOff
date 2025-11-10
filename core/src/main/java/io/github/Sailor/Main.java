package io.github.Sailor;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;


/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {

    private SpriteBatch batch;
    private Texture image;
	private TextBox tb;
    @Override
    public void create() {
        batch = new SpriteBatch();
        image = new Texture("libgdx.png");
        tb = new TextBox(true, 0, 0);
        tb.UpdateText("FUCK FUUCK\nFUCK FUUCK");
        
        
      
    }

    @Override
    public void render() {
		
		
		double dt = 1.0/60;
		tb.Update(dt);
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        batch.begin();
        tb.draw(batch);
       // batch.draw(image, 140, 210);
        
        
      
        
        batch.end();
        
    }

    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
    }
}
