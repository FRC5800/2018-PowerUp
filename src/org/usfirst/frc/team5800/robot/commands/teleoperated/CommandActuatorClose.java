package org.usfirst.frc.team5800.robot.commands.teleoperated;

import org.usfirst.frc.team5800.robot.superclasses.Command5800;

public class CommandActuatorClose extends Command5800
{	
	public CommandActuatorClose() {
		super(arm);
	}
	
	protected void onStart() {}

	//Setar as acoes que serao realizadas de forma paralela enquanto o comando e executado
	protected void execute() {
		arm.actuatorClose();
	}
	
	//Setar as condicoes para terminar a execucao do comando
	protected boolean isDone() {
		return true;
	}

	//Setar as acoes que serao realizadas quando a condicao isDone for satisfeita
	protected void onCompletion() {}
}
