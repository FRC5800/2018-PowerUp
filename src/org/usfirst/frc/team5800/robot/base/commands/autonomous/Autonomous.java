package org.usfirst.frc.team5800.robot.base.commands.autonomous;

import org.usfirst.frc.team5800.robot.base.commands.drive.CommandEncoderMove;
import org.usfirst.frc.team5800.robot.base.commands.drive.CommandTurnDegrees;
import org.usfirst.frc.team5800.robot.superclasses.Command5800;

public class Autonomous extends Command5800
{
	public Autonomous() {super(null);}
	protected void execute() {}
	protected boolean isDone() {return true;}
	protected void onCompletion() {}
	
	public static Autonomous[] autonomous = new Autonomous[5];
	
	public static void initAutonomous() {
		//Setar o sequencial que cada versao de autonomo ira rodar
		
		//Fazer nada
		autonomous[0] = new Autonomous();
		
		//Autonomo para engrenagem do centro
		autonomous[1] = (Autonomous) new Autonomous().setSequential(
				new CommandEncoderMove(205,0.5)
				);
		
		//Autonomo para engrenagem da esquerda
		autonomous[2] = (Autonomous) new Autonomous().setSequential(
				new CommandEncoderMove(186,0.5),
				new CommandTurnDegrees(-60,0.4,-0.4),
				new CommandEncoderMove(170,0.5)
		);
		
		//Autonomo para engrenagem da direita
		autonomous[3] = (Autonomous) new Autonomous().setSequential(
				new CommandEncoderMove(115,0.5),
				new CommandTurnDegrees(51,-0.5,0.5),
				new CommandEncoderMove(210,0.5)
		);
	}
}
