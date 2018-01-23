package org.usfirst.frc.team5800.robot.commands.teleoperated;

import org.usfirst.frc.team5800.robot.superclasses.Command5800;

	

public class CommandClimb extends Command5800
{	
	public CommandClimb() {
		super(climber);
	}
	
	protected void onStart() {}

	//Setar as acoes que serao realizadas de forma paralela enquanto o comando e executado
	protected void execute() {
		int climbHight;
		public CommandMotor(Subsystem5800 requiredSubsystem, VictorSP motor, double speed) {
			super(requiredSubsystem);
			this.motor = motor;
		t	his.speed = speed;
		}
		while (climbDone < 1234) {
			if(Math.abs(sensors.gyro.getAngle()) < (Math.abs(this.degreesToTurn)*0.97)) {
				driver.tankDrive(this.leftValue, this.rightValue);
			}else if(Math.abs(sensors.gyro.getAngle()) > (Math.abs(this.degreesToTurn)*1.03)) {
				driver.tankDrive(-this.leftValue, -this.rightValue);
	}
	}
	
	//Setar as condicoes para terminar a execucao do comando
	protected boolean isDone() {
		return true;
	}

	//Setar as acoes que serao realizadas quando a condicao isDone for satisfeita
	protected void onCompletion() {}
}
