package org.usfirst.frc.team5800.robot.commands.teleoperated;
import org.usfirst.frc.team5800.robot.superclasses.Command5800;

public class CommandArmUp extends Command5800
{	
	public CommandArmUp(double speed) {
		super(arm);
		this.setTimeout(speed);
	}
	
	@Override
	protected void onStart() {
	}

	//Setar as acoes que serao realizadas de forma paralela enquanto o comando e executado
	@Override
	protected void execute() {
		arm.armUp();
	}
	
	//Setar as condicoes para terminar a execucao do comando
	@Override
	protected boolean isDone() {
		return arm.isSwitch2Set() || isTimedOut();
	}

	//Setar as acoes que serao realizadas quando a condicao isDone for satisfeita
	@Override
	protected void onCompletion() {
		arm.armStop();
	}
}
