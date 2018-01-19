package org.usfirst.frc.team5800.robot.base.commands;

import org.usfirst.frc.team5800.robot.superclasses.Command5800;
import org.usfirst.frc.team5800.robot.superclasses.Subsystem5800;

public class CommandDoNothing extends Command5800
{
	public CommandDoNothing(Subsystem5800 requiredSystem) {
		super(requiredSystem);
	}

	//Setar as acoes que serao realizadas de forma paralela enquanto o comando e executado
	protected void execute() {
	}
	
	//Setar as condicoes para terminar a execucao do comando
	protected boolean isDone() {
		return false;
	}

	//Setar as acoes que serao realizadas quando a condicao isDone for satisfeita
	protected void onCompletion() {
	}
}
