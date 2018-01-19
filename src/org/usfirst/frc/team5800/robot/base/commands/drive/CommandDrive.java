package org.usfirst.frc.team5800.robot.base.commands.drive;

import org.usfirst.frc.team5800.robot.base.commands.CommandBase;
import org.usfirst.frc.team5800.robot.base.subsystems.SubsystemJoystick;
import org.usfirst.frc.team5800.robot.superclasses.Command5800;

/**
 *
 * @author Sean Zammit
 */
public class CommandDrive extends Command5800 {
	public static boolean chassiInversion = false;
	public static boolean changeController = false;
	double speed;
	double arcadeSpeed;
	double arcadeRotation;
	
	public static final double minR = 0.4D, difR = 0.5D;
	
	public CommandDrive() {
		super(driver);
	}

	//Set up what the robot will do while this command is running.
	protected void execute() {
		this.arcadeSpeed = 0.9 * SubsystemJoystick.axis_d_LY.get();
		this.arcadeRotation = SubsystemJoystick.axis_d_RX.get();
		arcadeDrive(this.arcadeSpeed, this.arcadeRotation);
	}

	//Determine the conditions that will stop this command.
	protected boolean isDone() {
		return false;
	}
	
	public void arcadeDrive(double sp, double rotation) {
		double mod = minR + difR * Math.pow(1 - Math.abs(sp), 2);
		double r = Math.pow(rotation, 3) * mod;
		CommandBase.driver.tankDrive(- sp - r, - sp + r);
	}

	protected void onCompletion() {}
	}
