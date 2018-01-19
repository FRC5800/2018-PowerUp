package org.usfirst.frc.team5800.robot.base.commands.drive;

import org.usfirst.frc.team5800.robot.superclasses.Command5800;

public class CommandTurnPulses extends Command5800
{
	int pulsesToTurn;
	double speed;
	
	public CommandTurnPulses(int pulses, double sp) {
		super(driver);
		pulsesToTurn = pulses;
		speed = sp;
		this.setTimeout(0.1D);
	}
	
	//Setar as acoes que serao realizadas quando o comando for iniciado
	protected void onStart() {
		sensors.driveEncoderL.reset();
		sensors.driveEncoderR.reset();
	}

	//Setar as acoes que serao realizadas de forma paralela enquanto o comando e executado
	protected void execute() {
		driver.tankDrive(speed, -speed);
	}
	
	//Setar as condicoes para terminar a execucao do comando
	protected boolean isDone() {
		return Math.abs(sensors.driveEncoderL.get()) > pulsesToTurn && Math.abs(sensors.driveEncoderR.get()) > pulsesToTurn;
	}

	//Setar as acoes que serao realizadas quando a condicao isDone for satisfeita
	protected void onCompletion() {
	}
}
