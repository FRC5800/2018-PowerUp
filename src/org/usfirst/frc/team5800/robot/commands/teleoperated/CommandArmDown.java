package org.usfirst.frc.team5800.robot.commands.teleoperated;

import org.usfirst.frc.team5800.robot.superclasses.Command5800;

public class CommandArmDown extends Command5800
{	
	public CommandArmDown(double speed) {
		super(arm);
	}
	
	protected void onStart() {
	}

	//Setar as acoes que serao realizadas de forma paralela enquanto o comando e executado
	protected void execute() {
		arm.armDown();
	}
	
	//Setar as condicoes para terminar a execucao do comando
	protected boolean isDone() {
		return arm.isSwitch1Set();
	}

	//Setar as acoes que serao realizadas quando a condicao isDone for satisfeita
	protected void onCompletion() {
		arm.armStop();
	}
}
