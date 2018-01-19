package org.usfirst.frc.team5800.robot.base.commands;

import org.usfirst.frc.team5800.robot.superclasses.Command5800;
import org.usfirst.frc.team5800.robot.superclasses.Subsystem5800;

import edu.wpi.first.wpilibj.Solenoid;

public class CommandSingleSolenoid extends Command5800
{
	public Solenoid solenoid;
	public boolean status;
	
	public CommandSingleSolenoid(Subsystem5800 requiredSubsystem, Solenoid sol, boolean status) {
		super(requiredSubsystem);
		solenoid = sol;
		this.status = status;
	}

	//Set up what the robot will do while this command is running.
	protected void execute() {
	}
	
	//Determine the conditions that will stop this command.
	protected boolean isDone() {
		return true;
	}

	//Turn off your motors or solenoids used in this command.
	protected void onCompletion() {
		solenoid.set(this.status);
	}
}
