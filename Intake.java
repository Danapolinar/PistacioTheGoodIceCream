// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.ControlMode;
// import com.ctre.phoenix.motorcontrol.DemandType;
// import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
// import com.ctre.phoenix.motorcontrol.TalonFXControlMode;

// import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
// import frc.robot.Constants;

public class Intake extends SubsystemBase {
  public static TalonFX ebotmotor = new TalonFX(44);
  /** Creates a new EveryBotIntakeSubsystem. */
  public Intake() {
    //don't let motor stall after intake

    super();


    ebotmotor.configFactoryDefault();
    ebotmotor.setNeutralMode(NeutralMode.Brake);
    ebotmotor.setInverted(false);
    // ebotmotor.setSmartCurrentLimit(Constants.Intake.ebotAmpLimit);
  }

  public void In() {
    ebotmotor.set(ControlMode.PercentOutput,0.5);
    if (ebotmotor.getSupplyCurrent() > 60) {
      Stop();
    } else {
        ebotmotor.set(ControlMode.PercentOutput,0.5);
    }
  }

  public void Out() {
    ebotmotor.set(ControlMode.PercentOutput,0.5);
  }

  public void Stop() {
    // double m_stoppe÷
    ebotmotor.set(ControlMode.PercentOutput,0.0);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
