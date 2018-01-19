package org.usfirst.frc.team5800.robot.base.commands.drive;

import org.usfirst.frc.team5800.robot.superclasses.Command5800;

public class CommandTimedTurn extends Command5800
{
	double l;
	double r;

	public CommandTimedTurn(double time, double left, double right) {
		super(driver);
		setTimeout(time);
		l = left;
		r = right;
	}

	//Setar as acoes que serao realizadas de forma paralela enquanto o comando e executado
	protected void execute() {
		driver.tankDrive(l, r);
	}

	//Setar as condicoes para terminar a execucao do comando
	protected boolean isDone() {
		return isTimedOut();
	}

	//Setar as acoes que serao realizadas quando a condicao isDone for satisfeita
	protected void onCompletion() {
	}
}
