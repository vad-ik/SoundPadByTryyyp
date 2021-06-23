package com.sound.pad.by.tryyyp;

import com.badlogic.gdx.Audio;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.AudioRecorder;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

import java.io.File;
import java.util.ArrayList;

public class Screen {
    String buttonString;
    static TextField path;
    TextField keyOfNum;
    ArrayList<TextButton> textButtonsArray = new ArrayList<>();
    static ArrayList<String> textNameButtonArray = new ArrayList<>();
    Skin skin;
    static Stage stage;
    Table table;
    Table tablePath;
    Table tableNum;
    static ArrayList<String> nameFile=new ArrayList<>();
    static String pathString;
    String tip;
    int indexNow;
    String nameNow;
TextButton soundOff;
static Music music;
    File dir;
    static Boolean flag = true;
    int newString = 800;
static int timer=0;
    public Screen() {
        music=Gdx.audio.newMusic(Gdx.files.internal("Star_Wars_-_Imperial_March.ogg.mp3"));

        this.stage = new Stage(new ScreenViewport());
        this.skin = new Skin(Gdx.files.internal("default/skin/uiskin.json"));
        this.path = new TextField("", skin);
        this.soundOff=new TextButton("sound Off",skin);
        this.keyOfNum = new TextField("", skin);
        this.path.setMessageText("path");
        this.keyOfNum.setMessageText("number of Num ");

        path.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                pathString = path.getText();
                addFile();
            }
        });


        this.table = new Table();
        this.table.setFillParent(true);
        this.table.setPosition(0, 0);
        this.tableNum = new Table();
        this.tableNum.setFillParent(true);
        this.tableNum.setPosition(0, 0);
        this.tablePath = new Table();
        this.tablePath.setFillParent(true);
        this.tablePath.setPosition(0, 255);
        tablePath.add(soundOff).row();
        tablePath.add(this.path).fill(5f, 1);
        tableNum.add(this.keyOfNum);
        stage.addActor(tablePath);
        stage.addActor(table);
        Gdx.input.setInputProcessor(stage);
        this.soundOff.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                music.stop();
            }
        });
        this.keyOfNum.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                buttonString = nameNow + " : NUMPAD_" + keyOfNum.getText();
                textButtonsArray.get(indexNow).setText(buttonString);
                textNameButtonArray.set(indexNow, keyOfNum.getText());
                stage.clear();
                stage.addActor(tablePath);
                stage.addActor(table);
flag=true;
               timer=100;
            }
        });


    }

    public static void render() {
        //иди своей дорогой сталкер
        stage.act();
        stage.draw();
        musicPlayer();
        if(timer>-10){ timer--;}

    }

    static void musicPlayer() {
        if((timer<0)&&(flag)){
        for (int i = 0; i < textNameButtonArray.size(); i++) {
            switch (textNameButtonArray.get(i)) {
                case ( "1" ):
                    if (Gdx.input.isKeyPressed(Input.Keys.NUMPAD_1)) {
                        music.stop();
                        music = Gdx.audio.newMusic(Gdx.files.absolute(pathString + nameFile.get(i)));
                        music.play();

                    }
                    ;
                    break;
                case ( "2" ):
                    if (Gdx.input.isKeyPressed(Input.Keys.NUMPAD_2)) {
                        music.stop();
                        music = Gdx.audio.newMusic(Gdx.files.absolute(pathString + nameFile.get(i)));
                        music.play();
                    }
                    ;
                    break;
                case ( "3" ):
                    if (Gdx.input.isKeyPressed(Input.Keys.NUMPAD_3)) {
                        music.stop();
                        music = Gdx.audio.newMusic(Gdx.files.absolute(pathString + nameFile.get(i)));
                        music.play();
                    }
                    ;
                    break;
                case ( "4" ):
                    if (Gdx.input.isKeyPressed(Input.Keys.NUMPAD_4)) {
                        music.stop();
                        music = Gdx.audio.newMusic(Gdx.files.absolute(pathString + nameFile.get(i)));
                        music.play();
                    }
                    ;
                    break;
                case ( "5" ):
                    if (Gdx.input.isKeyPressed(Input.Keys.NUMPAD_5)) {
                        music.stop();
                        music = Gdx.audio.newMusic(Gdx.files.absolute(pathString + nameFile.get(i)));
                        music.play();
                    }
                    ;
                    break;
                case ( "6" ):
                    if (Gdx.input.isKeyPressed(Input.Keys.NUMPAD_6)) {
                        music.stop();
                        music = Gdx.audio.newMusic(Gdx.files.absolute(pathString + nameFile.get(i)));
                        music.play();
                    }
                    ;
                    break;
                case ( "7" ):
                    if (Gdx.input.isKeyPressed(Input.Keys.NUMPAD_7)) {
                        music.stop();
                        music = Gdx.audio.newMusic(Gdx.files.absolute(pathString + nameFile.get(i)));
                        music.play();
                    }
                    ;
                    break;
                case ( "8" ):
                    if (Gdx.input.isKeyPressed(Input.Keys.NUMPAD_8)) {
                        music.stop();
                        music = Gdx.audio.newMusic(Gdx.files.absolute(pathString + nameFile.get(i)));
                        music.play();
                    }
                    ;
                    break;
                case ( "9" ):
                    if (Gdx.input.isKeyPressed(Input.Keys.NUMPAD_9)) {
                        music.stop();
                        music = Gdx.audio.newMusic(Gdx.files.absolute(pathString + nameFile.get(i)));
                        music.play();
                    }
                    ;
                    break;
                case ( "0" ):
                    if (Gdx.input.isKeyPressed(Input.Keys.NUMPAD_0)) {
                        music.stop();
                        music = Gdx.audio.newMusic(Gdx.files.absolute(pathString + nameFile.get(i)));
                        music.play();
                    }
                    ;
                    break;


            }
        }

        }
    }

    public void addButton(final String name, final String button) {
        buttonString = name + " :" + button;
        textButtonsArray.add(new TextButton(buttonString, skin));
        textNameButtonArray.add(button);
nameFile.add(name);
        for (int i = 0; i < textButtonsArray.size(); i++) {


            final int finalI = i;
            textButtonsArray.get(i)
                    .addListener(new ChangeListener() {
                        @Override
                        public void changed(ChangeEvent event, Actor actor) {
                            stage.clear();
                            keyOfNum.setText("");
                            stage.addActor(tableNum);
flag=false;

                            nameNow = name;
                            indexNow = finalI;

                        }
                    });

        }
        newString -= textButtonsArray.get(textButtonsArray.size() - 1).getWidth();
        if (newString < 0) {
            table.add().row();
            newString = 800;
            table.add(textButtonsArray.get(textButtonsArray.size() - 1)).pad(8);

        } else {
            table.add(textButtonsArray.get(textButtonsArray.size() - 1)).pad(8);

        }

        stage.clear();
        stage.addActor(table);
        stage.addActor(tablePath);
    }

    public void addFile() {
        dir = new File(pathString);
        if (dir.isDirectory()) {
            for (File item : dir.listFiles())
                if (!item.isDirectory()) {
                    tip = String.valueOf(item.getName().charAt(item.getName().length() - 3));
                    tip += String.valueOf(item.getName().charAt(item.getName().length() - 2));
                    tip += String.valueOf(item.getName().charAt(item.getName().length() - 1));
//                    if (tip.equals("ogg")) {
//                        addButton(item.getName(), "g");
//                    }
                    if (tip.equals("mp3")) {
                        addButton(item.getName(), " press");
                    }
                }
        }
    }


}
