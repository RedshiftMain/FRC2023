// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.SwerveModule;

import static frc.robot.Constants.SwerveModuleConstants.*;

public class Drivetrain extends SubsystemBase {
  SwerveModule FL, FR, BL, BR;
  /** Creates a new Drivetrain. */
  public Drivetrain() {
    FL = new SwerveModule(FL_DriveMotorCAN, FL_SteerMotorCAN, FL_SteerEncoderCAN, FL_SteerOffset);
    FR = new SwerveModule(FR_DriveMotorCAN, FR_SteerMotorCAN, FR_SteerEncoderCAN, FR_SteerOffset);
    BL = new SwerveModule(BL_DriveMotorCAN, BL_SteerMotorCAN, BL_SteerEncoderCAN, BL_SteerOffset);
    BR = new SwerveModule(BR_DriveMotorCAN, BR_SteerMotorCAN, BR_SteerEncoderCAN, BR_SteerOffset);
  }

  public void steer(double drive, double strafe, double curve) {
    FL.setModuleState(Math.sqrt((drive*drive) + (strafe*strafe)), Math.atan(drive/strafe));
    FR.setModuleState(Math.sqrt((drive*drive) + (strafe*strafe)), Math.atan(drive/strafe));
    BL.setModuleState(Math.sqrt((drive*drive) + (strafe*strafe)), Math.atan(drive/strafe));
    BR.setModuleState(Math.sqrt((drive*drive) + (strafe*strafe)), Math.atan(drive/strafe));  
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
