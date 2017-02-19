package org.usfirst.frc.team1160.robot.commands.auto;

import org.usfirst.frc.team1160.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveForward extends Command{

	private double distance;
	
	public DriveForward(double distance){
		requires(Robot.dt);
		
		this.distance = distance;
	}
	
	protected void initialize(){
		Robot.dt.setAuto();
		Robot.dt.driveDistance(distance);
		Robot.dt.startTime();
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return (Robot.dt.isDone(distance) || Robot.dt.timeDone(3));
	}
	
	protected void end(){
		Robot.dt.setManual();
		Robot.dt.set(0);
		Robot.dt.printPosition();
		System.out.println("Tried to drive " + distance + "units.");
	}
	protected void interrupted(){
		Robot.dt.setManual();
		Robot.dt.set(0);
		Robot.dt.printPosition();
		System.out.println("Tried to drive " + distance + "units.");
	}

}
