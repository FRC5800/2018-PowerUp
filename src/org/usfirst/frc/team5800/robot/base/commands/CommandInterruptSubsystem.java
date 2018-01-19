package org.usfirst.frc.team5800.robot.base.commands;

import org.usfirst.frc.team5800.robot.superclasses.Command5800;

import edu.wpi.first.wpilibj.command.Subsystem;

public class CommandInterruptSubsystem extends Command5800
{
	Subsystem subsystem;
	
	public CommandInterruptSubsystem(Subsystem sub) {
		super(null);
		subsystem = sub;
	}

	//Setar as acoes que serao realizadas de forma paralela enquanto o comando e executado
	protected void execute() {
	}

	//Setar as condicoes para terminar a execucao do comando
	protected boolean isDone() {
		return true;
	}

	//Setar as acoes que serao realizadas quando a condicao isDone for satisfeita
	protected void onCompletion() {
		subsystem.getCurrentCommand().cancel();
	}
}
