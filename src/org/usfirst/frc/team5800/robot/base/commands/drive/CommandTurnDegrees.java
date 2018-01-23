package org.usfirst.frc.team5800.robot.base.commands.drive;

import org.usfirst.frc.team5800.robot.superclasses.Command5800;

public class CommandTurnDegrees extends Command5800
{
	int degreesToTurn;
	int pulsesToTurn;
	double leftValue;
	double rightValue;
	boolean done = false;
	
	double originalDegrees;
	
	public CommandTurnDegrees(int degrees, double l, double r) {
		super(driver);
		this.degreesToTurn = degrees - 6;
		this.leftValue = l;
		this.rightValue = r;
		this.setTimeout(0.1D);
	}
	
	//Setar as acoes que serao realizadas quando o comando for iniciado
	@Override
	protected void onStart() {
		sensors.driveEncoderL.reset();
		sensors.driveEncoderR.reset();
		sensors.gyro.reset();
	}

	//Setar as acoes que serao realizadas de forma paralela enquanto o comando e executado
	@Override
	protected void execute() {
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
	}
	
	//Setar as condicoes para terminar a execucao do comando
	@Override
	protected boolean isDone() {
		return this.done;
	}

	//Setar as acoes que serao realizadas quando a condicao isDone for satisfeita
	@Override
	protected void onCompletion() {}
}
