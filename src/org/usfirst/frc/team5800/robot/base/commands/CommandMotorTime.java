package org.usfirst.frc.team5800.robot.base.commands;

import org.usfirst.frc.team5800.robot.superclasses.Command5800;
import org.usfirst.frc.team5800.robot.superclasses.Subsystem5800;

import edu.wpi.first.wpilibj.VictorSP;

public class CommandMotorTime extends Command5800
{
	public VictorSP motor;
	public double speed;
	
	public CommandMotorTime(Subsystem5800 requiredSubsystem, VictorSP motor, double speed, double timeout) {
		super(requiredSubsystem);
		this.setTimeout(speed);
		this.motor = motor;
		this.speed = speed;
	}

	//Setar as acoes que serao realizadas de forma paralela enquanto o comando e executado
	protected void execute() {
		motor.set(speed);
	}
	
	//Setar as condicoes para terminar a execucao do comando
	protected boolean isDone() {
		return isTimedOut();
	}

	//Setar as acoes que serao realizadas quando a condicao isDone for satisfeita
	protected void onCompletion() {
		motor.set(0);
	}
}
