package org.usfirst.frc.team5800.robot.base.subsystems;

import static org.usfirst.frc.team5800.robot.RobotMap.*;

import org.usfirst.frc.team5800.robot.superclasses.Subsystem5800;

import edu.wpi.first.wpilibj.VictorSP;

public class SubsystemClimber extends Subsystem5800 {
	
	public VictorSP climberMotor1 = new VictorSP(climbMotorLeftID);
	public VictorSP climberMotor2 = new VictorSP(climbMotorRightID);	
	
	public SubsystemClimber() {
		super();
	}
	
	@Override
	public void onInit() {
		//Perform anything that needs to be done before the subsystem is used here. 
		//Do not start sensors. Do that in SubsystemSensors.initSensors().
	}
	
	public void climbStart() {} 
	
}


/*int degreesToTurn;
int pulsesToTurn;
double leftValue;
double rightValue;

*/
/*pulic void teste() {
	while (climbDone = false) {
		if(Math.abs(sensors.gyro.getAngle()) < (Math.abs(this.degreesToTurn)*0.97)) {
			driver.tankDrive(this.leftValue, this.rightValue);
		}else if(Math.abs(sensors.gyro.getAngle()) > (Math.abs(this.degreesToTurn)*1.03)) {
			driver.tankDrive(-this.leftValue, -this.rightValue);
}*/
/*protected void execute() {
	if(Math.abs(sensors.gyro.getAngle()) < (Math.abs(this.degreesToTurn)*0.97)) {
		driver.tankDrive(this.leftValue, this.rightValue);
	}else if(Math.abs(sensors.gyro.getAngle()) > (Math.abs(this.degreesToTurn)*1.03)) {
		driver.tankDrive(-this.leftValue, -this.rightValue);			
	}else {
		try {
		    Thread.sleep(300);
		}catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		if(Math.abs(sensors.gyro.getAngle()) > (Math.abs(this.degreesToTurn)*0.97) & Math.abs(sensors.gyro.getAngle()) < (Math.abs(this.degreesToTurn)*1.03)) {
			this.done = true;
		}
	}
}*/