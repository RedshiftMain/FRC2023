// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.sensors.CANCoder;

import static frc.robot.Constants.SwerveModuleConstants.*;

/** Add your docs here. */
public class SwerveModule {
  WPI_TalonFX driveMotor;
  WPI_TalonFX steerMotor;
  CANCoder steeringEncoder;
  double direction;

  public SwerveModule(int driveMotorCAN, int steerMotorCAN, int encoderCAN, double degreeOffset) {
    driveMotor = new WPI_TalonFX(driveMotorCAN);
    steerMotor = new WPI_TalonFX(steerMotorCAN);
    steeringEncoder = new CANCoder(encoderCAN);
    
    steeringEncoder.setPosition(steeringEncoder.getPosition() - degreeOffset);
  }
  
  public void setModuleState(double speed, double direction) {
    this.direction = direction;
    driveMotor.set(ControlMode.Velocity, speed*SpeedMultiplier);
    steerMotor.set(ControlMode.Position, direction*TicksPerRadian);
  }
  
  public double getDirection() {
    return direction;
  }

  public void setDrivePID(double Kp, double Ki, double Kd) {

  }

  public void setSteerPID(double Kp, double Ki, double Kd) {

  }
}
