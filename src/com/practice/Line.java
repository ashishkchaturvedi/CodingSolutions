package com.practice;

public class Line {
	double epsilon = .0001;
	double slope;
	double yIntercept;
	
	public Line(double slope, double yIntercept){
		this.slope = slope;
		this.yIntercept = yIntercept; 
	}

	public boolean intersect(Line line){
		if(this.equals(line)) return true;
		if(Math.abs(slope - line.slope) > epsilon) return true;
		return false;
	}
	
	@Override
	public boolean equals(Object o){
		if(!(o instanceof Line)) return false;
		Line line = (Line) o;
		return Math.abs(slope - line.slope) < epsilon &&
				Math.abs(yIntercept - line.yIntercept) < epsilon;
	}
	
	public static void main(String args[]){
		Line a = new Line(0, 1);
		Line b = new Line(1, 1);
		System.out.println(a.intersect(b) ? "Lines intersect" : "Lines don't intersect");
	}

}
