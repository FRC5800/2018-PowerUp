package org.usfirst.frc.team5800.robot.base.commands.drive;

import org.usfirst.frc.team5800.robot.superclasses.Command5800;

public class CommandTurnToOrientation extends Command5800
{
	double speed;
	double aim;
	
	public CommandTurnToOrientation(double sp, double orientation) {
		super(driver);
		speed = sp;
		aim = orientation % 360;
	}
	
	//Setar as acoes que serao realizadas quando o comando for iniciado
	protected void onStart() {
	}

	//Setar as acoes que serao realizadas de forma paralela enquanto o comando e executado
	protected void execute() {
		if(sensors.gyro.getAngle() % 360 > aim) driver.tankDrive(-speed, speed);
		else driver.tankDrive(speed, -speed);
	}
	
	//Setar as condicoes para terminar a execucao do comando
	protected boolean isDone() {
		return Math.abs(sensors.gyro.getAngle() % 360 - aim) < 1;
	}

	//Setar as acoes que serao realizadas quando a condicao isDone for satisfeita
	protected void onCompletion() {
	}
}
