package org.usfirst.frc.team5800.robot.commands.teleoperated;

import org.usfirst.frc.team5800.robot.superclasses.Command5800;

public class CommandActuatorOpen extends Command5800
{	
	public CommandActuatorOpen() {
		super(arm);
	}
	
	@Override
	protected void onStart() {}

	//Setar as acoes que serao realizadas de forma paralela enquanto o comando e executado
	@Override
	protected void execute() {
		arm.actuatorOpen();
	}
	
	//Setar as condicoes para terminar a execucao do comando
	@Override
	protected boolean isDone() {
		return true;
	}

	//Setar as acoes que serao realizadas quando a condicao isDone for satisfeita
	@Override
	protected void onCompletion() {}
}
