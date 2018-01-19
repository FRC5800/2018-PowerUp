package org.usfirst.frc.team5800.robot.base.commands;

import java.util.ArrayList;

import org.usfirst.frc.team5800.robot.OI;
import org.usfirst.frc.team5800.robot.base.commands.drive.CommandDrive;
import org.usfirst.frc.team5800.robot.base.subsystems.*;
import org.usfirst.frc.team5800.robot.superclasses.Subsystem5800;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * DO NOT EXTEND THIS CLASS. Use CommandRC instead.
 *
 * CommandBase creates and stores each subsystem. To access a subsystem elsewhere in your code use either: CommandBase.SUBSYSTEM or CommandBase.subsystemList[SUBSYSTEM.systemID]
 */
public abstract class CommandBase extends Command
{
	public static OI oi;

	public static ArrayList<Subsystem5800> subsystemList = new ArrayList<Subsystem5800>();

	//Do not remove. Is used to set up each subsystem.
	public static int id = 0;

	//Create an instance of each subsystem here.
	public static SubsystemJoystick joystick = new SubsystemJoystick();
	public static SubsystemSensors sensors = new SubsystemSensors();
	public static SubsystemDriver driver = new SubsystemDriver();
	public static SubsystemArm arm = new SubsystemArm();
	
	public static void init() {
		sensors.setDefCommand(new CommandReadSensors());
		driver.setDefCommand(new CommandDrive());
		
		//Don't move or change this. EVER.
		oi = new OI();

		//Calls the method in SubsystemSensors that starts all sensors. Do not remove.
		sensors.initSensors();

		//Adds information from all subsystems to the dashboard.
		for(int a = 0; a < subsystemList.size(); a++) SmartDashboard.putData(subsystemList.get(a));
		SmartDashboard.putNumber("Number of subsystems", id);
	}

	public CommandBase(String name) {
		super(name);
	}

	public CommandBase() {
		super();
	}
}
