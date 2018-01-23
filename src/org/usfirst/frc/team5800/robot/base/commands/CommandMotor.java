package org.usfirst.frc.team5800.robot.base.commands;

import org.usfirst.frc.team5800.robot.superclasses.Command5800;
import org.usfirst.frc.team5800.robot.superclasses.Subsystem5800;

import edu.wpi.first.wpilibj.VictorSP;

public class CommandMotor extends Command5800
{
	public VictorSP motor;
	public double speed;
	
	public CommandMotor(Subsystem5800 requiredSubsystem, VictorSP motor, double speed) {
		super(requiredSubsystem);
		this.motor = motor;
		this.speed = speed;
	}

	//Setar as acoes que serao realizadas de forma paralela enquanto o comando e executado
	@Override
	protected void execute() {
		motor.set(speed);
	}
	
	//Setar as condicoes para terminar a execucao do comando
	@Override
	protected boolean isDone() {
		return false;
	}

	//Setar as acoes que serao realizadas quando a condicao isDone for satisfeita
	@Override
	protected void onCompletion() {
		motor.set(0);
	}
}
