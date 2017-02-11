package org.usfirst.frc.team1160.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public interface RobotMap
{


	
	/*
	 * CAN Values
	 */
		public static final int DT_FRONTLEFT = 0;
		public static final int DT_FRONTRIGHT = 1;
		public static final int DT_BACKLEFT = 2;
		public static final int DT_BACKRIGHT = 3;
		public static final int INTAKE_FRONT_ROLLER = 4;
		public static final int SHOOTER_TURNTABLE = 5;
		public static final int SHOOTER_FLYWHEEL = 6;
		public static final int CLIMBER = 7;
		
	/*
	 * PWM Values
	 */
		public static final int INTAKE_BACK_ROLLER = 0;
		public static final int SERVO = 1;
		
	
	/*
	 * Driving Constants
	 */	
		//Scales down DT speed
		public static final double DT_SCALE = 0.6;
		//Radius of Wheel
		public static final double DT_WHEEL_RAD_IN = 2; 
		public static final double DT_WHEEL_RAD_FT = DT_WHEEL_RAD_IN/12;
		//Diameter of Wheel
		public static final double DT_WHEEL_DIA_IN = 2*DT_WHEEL_RAD_IN; 
		public static final double DT_WHEEL_DIA_FT = 2*DT_WHEEL_RAD_FT;
		//Circumference of Wheel
		public static final double DT_WHEEL_CIRC_IN = DT_WHEEL_DIA_IN*Math.PI;
		public static final double DT_WHEEL_CIRC_FT = DT_WHEEL_DIA_FT*Math.PI;
		
	/*
	 * Shooter Constants
	 */
		//Scales down Turntable speed
		public static final double TURNTABLE_SCALE = 0.1;

}