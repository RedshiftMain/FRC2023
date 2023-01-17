// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
        public final class SwerveModuleConstants{
                public static final int FL_DriveMotorCAN = 0;
                public static final int FL_SteerMotorCAN = 0;
                public static final int FL_SteerEncoderCAN = 0;
                public static final double FL_SteerOffset = 0;//Degrees

                public static final int FR_DriveMotorCAN = 0;
                public static final int FR_SteerMotorCAN = 0;
                public static final int FR_SteerEncoderCAN = 0;
                public static final double FR_SteerOffset = 0;//Degrees

                public static final int BL_DriveMotorCAN = 0;
                public static final int BL_SteerMotorCAN = 0;
                public static final int BL_SteerEncoderCAN = 0;
                public static final double BL_SteerOffset = 0;//Degrees

                public static final int BR_DriveMotorCAN = 0;
                public static final int BR_SteerMotorCAN = 0;
                public static final int BR_SteerEncoderCAN = 0;
                public static final double BR_SteerOffset = 0;//Degrees

                public static final double DrivetrainWidth = .508; //Meters

                public static final double TicksPerRadian = 0; 

                public static final double SpeedMultiplier = 0;
                
        }
}
