package org.usfirst.frc.team5800.robot;

import static org.usfirst.frc.team5800.robot.base.commands.CommandBase.*;

import org.usfirst.frc.team5800.robot.base.commands.autonomous.Autonomous;
import org.usfirst.frc.team5800.robot.base.subsystems.SubsystemJoystick;
import org.usfirst.frc.team5800.robot.commands.teleoperated.*;

@SuppressWarnings("unused")

public class OI
{
	public OI() {
		Autonomous.initAutonomous();
		
		joystick.whenHeld(SubsystemJoystick.d_LB, new CommandChangeDirection());
		joystick.whenHeld(SubsystemJoystick.j_Eleven, new CommandChangeController());
		joystick.whenPressed(SubsystemJoystick.d_A, new CommandArmUp(3));
		joystick.whenPressed(SubsystemJoystick.d_B, new CommandArmDown(3));
		joystick.whenPressed(SubsystemJoystick.d_X, new CommandActuatorOpen());
		joystick.whenPressed(SubsystemJoystick.d_Y, new CommandActuatorClose());
	}
	
}
