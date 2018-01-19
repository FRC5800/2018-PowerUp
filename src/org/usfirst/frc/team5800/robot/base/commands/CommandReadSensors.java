package org.usfirst.frc.team5800.robot.base.commands;

import org.usfirst.frc.team5800.robot.superclasses.Command5800;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class CommandReadSensors extends Command5800
{
	public CommandReadSensors() {
		super(sensors);
	}
	
	int tick = 0;

	//Setar as acoes que serao realizadas de forma paralela enquanto o comando e executado
	protected void execute() {		
		//Put any code here needed to handle readings from sensors.
		SmartDashboard.putNumber("Gyro", sensors.gyro.getAngle());
		SmartDashboard.putNumber("Drive Encoder L", sensors.driveEncoderL.get());
		SmartDashboard.putNumber("Drive Encoder R", sensors.driveEncoderR.get());
	}

	//Setar as condicoes para terminar a execucao do comando
	protected boolean isDone() {
		return false;
	}

	//Setar as acoes que serao realizadas quando a condicao isDone for satisfeita
	protected void onCompletion() {
	}
}
