package com.shfbn.game;

import com.badlogic.gdx.graphics.Texture;

public class VisibleObject {
	public int x = 0, y = 0, height = 10, width = 10;
	Texture skin;

	public VisibleObject(int startX, int startY, int h, int w, Texture s) {
		x = startX;
		y = startY;
		height = h;
		width = w;
		skin = s;
	}

	public int getX(){ return x; }
	public int getY(){ return y; }
	public int getH(){ return height; }
	public int getW(){ return height; }

	public void render(){
		
	}

}