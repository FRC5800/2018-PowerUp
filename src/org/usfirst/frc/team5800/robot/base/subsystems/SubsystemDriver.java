package org.usfirst.frc.team5800.robot.base.subsystems;

import static org.usfirst.frc.team5800.robot.RobotMap.*;

import org.usfirst.frc.team5800.robot.superclasses.Subsystem5800;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;

public class SubsystemDriver extends Subsystem5800
{
	//Set up motors and solenoids here. Make sure to use the RobotMap.
	private VictorSP motorLeft1 = new VictorSP(driveMotorL2ID);
	private VictorSP motorLeft2 = new VictorSP(driveMotorL1ID);
	
	private VictorSP motorRight1 = new VictorSP(driveMotorR2ID);
	private VictorSP motorRight2 = new VictorSP(driveMotorR1ID);

	private RobotDrive driveFront = new RobotDrive(motorLeft2, motorRight2);
	private RobotDrive driveRear = new RobotDrive(motorLeft1, motorRight1);
	
	public SubsystemDriver() {
		super();
	}

	@Override
	public void onInit() {
		//Perform anything that needs to be done before the subsystem is used here. 
		//Do not start sensors. Do that in SubsystemSensors.initSensors().
	}
	
	public void tankDrive(double left, double right) {
		driveFront.tankDrive(left, right);
		driveRear.tankDrive(left, right);
	}

	public void arcadeDrive(double speed, double d) {
		driveFront.arcadeDrive(speed, d);
		driveRear.arcadeDrive(speed, d);
	}
}
