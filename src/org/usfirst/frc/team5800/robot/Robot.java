/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5800.robot;

import org.usfirst.frc.team5800.robot.base.commands.CommandBase;
import org.usfirst.frc.team5800.robot.base.commands.autonomous.Autonomous;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.CameraServer;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to each mode, as described in the IterativeRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the manifest file in the resource directory.
 */
public class Robot extends IterativeRobot
{
	
	public static boolean isAuto;
	
	/**
	 * This function is run when the robot is first started up and should be used for any initialization code.
	 */
	public void robotInit() {
		//This initializes all subsystems
		CommandBase.init();
		//CommandBase.sensors.gyro.calibrate();
		CameraServer.getInstance().startAutomaticCapture();
	}

	public void autonomousInit() {
		//This sets the command used to begin the autonomous sequence
		int av = (int) SmartDashboard.getNumber("Autonomous Version", 1);//REVERT Auto
		SmartDashboard.putNumber("Autonomous Version", av);
		CameraServer.getInstance().startAutomaticCapture();

		//This starts the autonomous sequence.
		Autonomous.autonomous[av].start();
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		isAuto = isAutonomous();
	}

	public void teleopInit() {
	}

	/**
	 * This function is called periodically during operator control.
	 */
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		isAuto = isAutonomous();
	}

	/**
	 * This function is called periodically during test mode.
	 */
	public void testPeriodic() {
		LiveWindow.run();
	}
}
