package org.usfirst.frc.team5800.robot.base.commands.drive;

import org.usfirst.frc.team5800.robot.superclasses.Command5800;

public class CommandTimedMove extends Command5800
{
	double speed;

	public CommandTimedMove(double time, double sp) {
		super(driver);
		setTimeout(time);
		speed = sp;
	}
	
	//Setar as acoes que serao realizadas quando o comando for iniciado
	protected void onStart() {
		sensors.gyro.reset();
	}

	//Setar as acoes que serao realizadas de forma paralela enquanto o comando e executado
	protected void execute() {
		double rotation = 0;
		driver.arcadeDrive(speed, rotation + (sensors.gyro.getAngle() / 90));
	}

	//Setar as condicoes para terminar a execucao do comando
	protected boolean isDone() {
		return isTimedOut();
	}

	//Setar as acoes que serao realizadas quando a condicao isDone for satisfeita
	protected void onCompletion() {
	}
}
