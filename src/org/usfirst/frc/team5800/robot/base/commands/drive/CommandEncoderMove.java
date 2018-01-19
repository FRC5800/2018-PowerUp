package org.usfirst.frc.team5800.robot.base.commands.drive;

import org.usfirst.frc.team5800.robot.superclasses.Command5800;

public class CommandEncoderMove extends Command5800
{
	double speed;
	double pulses;
	double error;

	public CommandEncoderMove(int centimeters, double sp) {
		super(driver);
		this.pulses = (centimeters * 5);
		speed = sp;
	}
	
	//Setar as acoes que serao realizadas quando o comando for iniciado
	protected void onStart() {
		sensors.initSensors();
	}

	//Setar as acoes que serao realizadas de forma paralela enquanto o comando e executado
	protected void execute() {
		double parameter = 0.035;
		double error = sensors.gyro.getAngle();
		driver.tankDrive(speed - (error * parameter), speed + (error * parameter));
	}

	//Setar as condicoes para terminar a execucao do comando
	protected boolean isDone() {
		return Math.abs(sensors.driveEncoderL.get()) >= pulses && Math.abs(sensors.driveEncoderR.get()) >= pulses; 
	}

	//Setar as acoes que serao realizadas quando a condicao isDone for satisfeita
	protected void onCompletion() {
		
	}
}