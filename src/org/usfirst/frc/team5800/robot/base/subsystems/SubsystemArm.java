package org.usfirst.frc.team5800.robot.base.subsystems;

import static org.usfirst.frc.team5800.robot.RobotMap.*;

import org.usfirst.frc.team5800.robot.superclasses.Subsystem5800;

import edu.wpi.first.wpilibj.*;

public class SubsystemArm extends Subsystem5800
{
	public VictorSP armMotor = new VictorSP(armMotorID);
	DigitalInput limitSwitch1 = new DigitalInput(armSwitch1ID);
	DigitalInput limitSwitch2 = new DigitalInput(armSwitch2ID);
	
	Solenoid armActuator = new Solenoid(armActuatorID);
    
    public void armUp() {
        armMotor.set(0.3);
    }

    public void armDown() {
        armMotor.set(-0.3);
    }

    public void armStop() {
        armMotor.set(0.0);
    }

    public boolean isSwitch1Set() {
        return limitSwitch1.get();
    }
    
    public boolean isSwitch2Set() {
        return limitSwitch2.get();
    }
    
    public void actuatorOpen() {
    	armActuator.set(true);
    }
    
    public void actuatorClose() {
    	armActuator.set(false);
    }
			
	public SubsystemArm() {
		super();
	}

	public void onInit() {
		//Perform anything that needs to be done before the subsystem is used here.
	}
}
