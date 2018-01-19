package org.usfirst.frc.team5800.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    //PWMs (0 - 9)
    public static final int
    	driveMotorR1ID = 0,
    	driveMotorR2ID = 1,
    	driveMotorL1ID = 2,
    	driveMotorL2ID = 3,
    	armMotorID = 4;
    
    //Solenoids (0 - 7)
    public static final int
    	armActuatorID = 0,
    	suspensionActuator1ID = 1,
    	suspensionActuator2ID = 2;
    
    //Digital I/Os (0 - 9)
    public static final int
    	driveEncoderR1ID = 0,
    	driveEncoderR2ID = 1,
    	driveEncoderL1ID = 2,
    	driveEncoderL2ID = 3,
    	armSwitch1ID = 4,
    	armSwitch2ID= 5;
}