// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
public class DriveSubsystem extends SubsystemBase {
  /** Creates a new DriveSubsystem. */
  private final WPI_TalonSRX frontleftMotor = new WPI_TalonSRX(3);
  private final WPI_TalonSRX frontrightMotor = new WPI_TalonSRX(1);
  private final WPI_TalonSRX backleftMotor = new WPI_TalonSRX(4);
  private final WPI_TalonSRX backrightMotor = new WPI_TalonSRX(2);
  public DriveSubsystem() {
    frontrightMotor.setInverted(true);
  backrightMotor.setInverted(true);
  }
  public void tankDrive(double x, double y){
   double left = y + x;
   double right = y - x;
    frontleftMotor.set(left);
    frontrightMotor.set(right);
    backleftMotor.set(left);
    backrightMotor.set(right);
  }
  /**
   * Example command factory method.
   *
   * @return a command
   */
  public Command exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }
  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}