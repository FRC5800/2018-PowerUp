package org.usfirst.frc.team5800.robot;

import static org.usfirst.frc.team5800.robot.RobotMap.*;
import static org.usfirst.frc.team5800.robot.base.commands.CommandBase.*;

import java.io.File;

import org.usfirst.frc.team5800.robot.base.buttons.*;
import org.usfirst.frc.team5800.robot.base.commands.*;
import org.usfirst.frc.team5800.robot.base.commands.autonomous.Autonomous;
import org.usfirst.frc.team5800.robot.base.subsystems.SubsystemJoystick;
import org.usfirst.frc.team5800.robot.commands.teleoperated.*;
import org.usfirst.frc.team5800.robot.superclasses.Command5800;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.buttons.*;
import edu.wpi.first.wpilibj.communication.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

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
