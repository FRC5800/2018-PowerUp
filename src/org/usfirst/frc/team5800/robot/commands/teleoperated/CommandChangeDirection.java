package org.usfirst.frc.team5800.robot.commands.teleoperated;

import org.usfirst.frc.team5800.robot.base.commands.drive.CommandDrive;
import org.usfirst.frc.team5800.robot.superclasses.Command5800;

public class CommandChangeDirection extends Command5800
{
	
	boolean retorno;
	
	public CommandChangeDirection() {
		super(null);

	}

	//Setar as acoes que serao realizadas de forma paralela enquanto o comando e executado
	protected void execute() {
		if(CommandDrive.chassiInversion == true){
			CommandDrive.chassiInversion = false;
		}else if (CommandDrive.chassiInversion == false) {
			CommandDrive.chassiInversion = true;
		}
		this.retorno = true;
	}
	
	//Setar as condicoes para terminar a execucao do comando
	protected boolean isDone() {
		return this.retorno;
	}

	//Setar as acoes que serao realizadas quando a condicao isDone for satisfeita
	protected void onCompletion() {

	}
}
