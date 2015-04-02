package com.grasp.customview.model;

public class Pointer {

	private double x ;
	
	private double y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public static double getPointerDistance(Pointer pointer1, Pointer pointer2){
		return Math.sqrt(Math.pow(pointer1.x - pointer2.x, 2)+Math.pow(pointer1.y - pointer2.y, 2)) ;
	}
}
