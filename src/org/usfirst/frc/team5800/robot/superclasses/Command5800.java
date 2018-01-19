package org.usfirst.frc.team5800.robot.superclasses;

import org.usfirst.frc.team5800.robot.Robot;
import org.usfirst.frc.team5800.robot.base.commands.CommandBase;

import edu.wpi.first.wpilibj.buttons.Button;

public abstract class Command5800 extends CommandBase
{
	//Command to run when this command is started
	protected Command5800 commandParallel;

	//Command to run when this command is finished
	protected Command5800 commandSequential;
	
	public boolean startedInAuto = false;

	private boolean isWhileHeld = false;
	private Button button;

	public Command5800(Subsystem5800 requiredSystem) {
		super();
		if(requiredSystem != null) requires(requiredSystem);
	}

	protected abstract void execute();

	protected abstract boolean isDone();

	protected abstract void onCompletion();

	protected void onStart() {
	}

	protected void interrupted() {
		this.end();
	}

	protected final void initialize() {
		if(commandParallel != null) commandParallel.start();
		this.startedInAuto = Robot.isAuto;
		this.onStart();
	}

	protected final boolean isFinished() {
		return (isWhileHeld && !button.get()) || isDone();
	}

	protected final void end() {
		if(commandSequential != null && !(this.startedInAuto && !Robot.isAuto)) {
			commandSequential.start();
		}
		this.onCompletion();
	}

	public final Command5800 setParallel(Command5800... commands) {
		if(commands.length > 1) {
			Command5800[] newCommands = new Command5800[commands.length - 1];
			for(int a = 1; a < commands.length; a++)
				newCommands[a - 1] = commands[a];
			if(commandParallel != null) commandParallel.setParallel(commands[0].setSequential(newCommands));
			else commandParallel = commands[0].setSequential(newCommands);
		}
		else if(commandParallel != null) commandParallel.setParallel(commands[0]);
		else commandParallel = commands[0];
		return this;
	}

	public final Command5800 setSequential(Command5800... commands) {
		if(commands.length > 1) {
			Command5800[] newCommands = new Command5800[commands.length - 1];
			for(int a = 1; a < commands.length; a++)
				newCommands[a - 1] = commands[a];
			if(commandSequential != null) commandSequential.setParallel(commands[0].setSequential(newCommands));
			else commandSequential = commands[0].setSequential(newCommands);
		}
		else if(commandSequential != null) commandSequential.setParallel(commands[0]);
		else commandSequential = commands[0];
		return this;
	}

	public final Command5800 setCancelWhenReleased(Button button) {
		isWhileHeld = true;
		this.button = button;
		return this;
	}
}
