package com.sound.pad.by.tryyyp.desktop;


import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.sound.pad.by.tryyyp.SoundPad;


public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title="soundPadByTryyyp";
		config.height=600;
		config.width=1000;
		new LwjglApplication(new SoundPad(), config);
	}
}
