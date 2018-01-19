package org.usfirst.frc.team5800.robot.superclasses;

import org.usfirst.frc.team5800.robot.base.commands.CommandBase;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Subsystem5800 extends Subsystem
{
	public int systemID;

	public Subsystem5800() {
		super();
		systemID = CommandBase.id;
		CommandBase.subsystemList.add(this);
		CommandBase.id++;		
	}

	public final void initDefaultCommand() {
		onInit();
	}

	public void onInit() {
	}

	public void setDefCommand(Command5800 command) {
		setDefaultCommand(command);
	}
}
