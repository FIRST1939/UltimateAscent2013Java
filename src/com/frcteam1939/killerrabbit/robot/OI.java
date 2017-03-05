package com.frcteam1939.killerrabbit.robot;

import com.frcteam1939.killerrabbit.robot.commands.ears.EarsDown;
import com.frcteam1939.killerrabbit.robot.commands.ears.EarsUp;
import com.frcteam1939.killerrabbit.robot.commands.shooter.PushFrisbee;
import com.frcteam1939.killerrabbit.robot.commands.shooter.RetractFrisbee;
import com.frcteam1939.killerrabbit.robot.commands.shooter.StartWheels;
import com.frcteam1939.killerrabbit.robot.commands.shooter.StopWheels;
import com.frcteam1939.killerrabbit.robot.ringlight.commands.TurnOff;
import com.frcteam1939.killerrabbit.robot.ringlight.commands.TurnOn;
import com.frcteam1939.steamworks2017.robot.commands.vision.AimBot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {

	public final Joystick left = new Joystick(0);
	public final Joystick right = new Joystick(1);
	
	{
		
		JoystickButton up = new JoystickButton(left, 11);
		up.whenPressed(new EarsUp());
		JoystickButton down = new JoystickButton(left, 10);
		down.whenPressed(new EarsDown());
		JoystickButton aim = new JoystickButton(left, 1);
		aim.whenPressed(new AimBot());
		JoystickButton push = new JoystickButton(left, 3);
		push.whenPressed(new PushFrisbee());
		JoystickButton retract = new JoystickButton(left, 2);
		retract.whenPressed(new RetractFrisbee());
		JoystickButton startWheels = new JoystickButton(left, 4);
		startWheels.whenPressed(new StartWheels());
		JoystickButton stopWheels = new JoystickButton(left, 5);
		stopWheels.whenPressed(new StopWheels());
		
		JoystickButton turnOn = new JoystickButton(left, 6);
		turnOn.whenPressed(new TurnOn());
		JoystickButton turnOff = new JoystickButton(left, 7);
		turnOff.whenPressed(new TurnOff());
	}
	
}
