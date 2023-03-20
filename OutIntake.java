package frc.robot.commands.Intake;



import edu.wpi.first.wpilibj2.command.CommandBase;
// import frc.robot.Constants;
// import frc.robot.subsystems.Elevator;
import frc.robot.subsystems.Intake;

public class OutIntake extends CommandBase {

    private final Intake m_intake;

   
   

  public OutIntake(Intake intake) {
    
   
    m_intake = intake;
    
   
    
  }

  

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
    m_intake.Out();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
    
  }
}
