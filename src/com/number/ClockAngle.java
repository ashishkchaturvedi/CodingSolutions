package com.number;

public class ClockAngle {
	public static double clockAngle(int hours, int minutes){
		final double MINUTES_PER_HOUR = 60;
		final double DEGREE_PER_MINUTE = 360 / MINUTES_PER_HOUR;
		final double DEGREE_PER_HOUR = 360 / 12;
		
		double minuteAngle = minutes * DEGREE_PER_MINUTE;
		double hourAngle = hours * DEGREE_PER_HOUR + (minutes / MINUTES_PER_HOUR) * DEGREE_PER_HOUR;
		
		double angle = Math.abs(minuteAngle - hourAngle);
		
		if(angle > 180) {
			return 360 - angle; 
		} else {
			return angle;
		}
	}
	
	public static void main(String args[]){
		System.out.println(clockAngle(11, 10));
	}

}
