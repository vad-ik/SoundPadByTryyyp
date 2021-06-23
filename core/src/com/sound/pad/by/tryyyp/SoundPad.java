package com.sound.pad.by.tryyyp;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;

public class SoundPad extends ApplicationAdapter {
	SpriteBatch batch;
	Screen screen;
	@Override
	public void create () {
		batch = new SpriteBatch();
		screen =new Screen();
			}

	@Override
	public void render () {
		ScreenUtils.clear(1, 1, 1, 1);
		batch.begin();
Screen.render();


		batch.end();
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
		//Screen.stage.setViewport(width,height,true);

	}

	@Override
	public void dispose () {
		batch.dispose();
		Screen.music.dispose();
		Screen.stage.dispose();



			}


}
