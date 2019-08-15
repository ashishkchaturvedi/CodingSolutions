package com.practice;

public class ClockAngle {
	public static double clockAngle(int hours, int minutes){
		final double DEGREE_IN_MINUTES = 360 / 60;
		final double MINUTES_IN_HOURS  = 60;
		final double DEGREES_IN_HOURS = 360 / 12;
		
		double minute_angle = minutes * DEGREE_IN_MINUTES;
		double hour_angle = hours * DEGREES_IN_HOURS + (minutes / MINUTES_IN_HOURS) * DEGREES_IN_HOURS;
		
		double angle = Math.abs(minute_angle - hour_angle);
		
		if(angle > 180){
			return 360 - angle;
		} else {
			return angle;
		}
	}
	public static void main(String args[]){
		System.out.println(clockAngle(11, 10));
	}

}
