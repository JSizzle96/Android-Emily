package com.example.killcircle;

import android.graphics.Canvas;
import android.graphics.Paint;

public class BaseGameOB {

	int x;
	int y;
	int w;
	int h;
	Paint P;
	
	
	public BaseGameOB(int x, int y, int w, int h, Paint p) {
		super();
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		P = p;
	}
	public void Draw(Canvas C)
	{
	
	}
	public void Update(long mi) {
		
	}
}
