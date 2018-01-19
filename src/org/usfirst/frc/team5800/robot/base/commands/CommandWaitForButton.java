package org.usfirst.frc.team5800.robot.base.commands;

import org.usfirst.frc.team5800.robot.superclasses.Command5800;

import edu.wpi.first.wpilibj.buttons.Button;

public class CommandWaitForButton extends Command5800
{
	Button b;
	
	public CommandWaitForButton(Button button) {
		super(null);
		b = button;
	}

	//Setar as acoes que serao realizadas de forma paralela enquanto o comando e executado
	protected void execute() {
	}

	//Setar as condicoes para terminar a execucao do comando
	protected boolean isDone() {
		return b.get();
	}

	//Setar as acoes que serao realizadas quando a condicao isDone for satisfeita
	protected void onCompletion() {
	}
}
