package org.usfirst.frc.team5800.robot.commands.teleoperated;

import org.usfirst.frc.team5800.robot.base.commands.drive.CommandDrive;
import org.usfirst.frc.team5800.robot.superclasses.Command5800;

public class CommandChangeController extends Command5800
{
	
	boolean retorno;
	
	public CommandChangeController() {
		super(null);

	}

	//Setar as acoes que serao realizadas de forma paralela enquanto o comando e executado
	@Override
	protected void execute() {
		if(CommandDrive.changeController == true){
			CommandDrive.changeController = false;
		}else if (CommandDrive.changeController == false) {
			CommandDrive.changeController = true;
		}
		this.retorno = true;
	}
	
	//Setar as condicoes para terminar a execucao do comando
	@Override
	protected boolean isDone() {
		return this.retorno;
	}

	//Setar as acoes que serao realizadas quando a condicao isDone for satisfeita
	@Override
	protected void onCompletion() {

	}
}
