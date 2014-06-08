package com.example.killcircle;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Square extends BaseGameOB{
	//xywh
	public Square(int x, int y, int w, int h, Paint p) {
		super(x, y, w, h, p);
		
	}
	public void Draw(Canvas C)
	{
		C.drawRect(x,y,x+w,y+h, P);
	}

}
