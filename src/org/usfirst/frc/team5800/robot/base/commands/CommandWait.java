package org.usfirst.frc.team5800.robot.base.commands;

import org.usfirst.frc.team5800.robot.superclasses.Command5800;

public class CommandWait extends Command5800
{
	public CommandWait(double timeout) {
		super(null);
		setTimeout(timeout);
	}

	//Setar as acoes que serao realizadas de forma paralela enquanto o comando e executado
	@Override
	protected void execute() {
	}

	//Setar as condicoes para terminar a execucao do comando
	@Override
	protected boolean isDone() {
		return isTimedOut();
	}

	//Setar as acoes que serao realizadas quando a condicao isDone for satisfeita
	@Override
	protected void onCompletion() {
	}
}
