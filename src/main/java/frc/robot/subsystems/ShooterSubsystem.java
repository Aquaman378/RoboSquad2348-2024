package frc.robot.subsystems;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase{
    private final PWMSparkMax intake = new PWMSparkMax(1);
    private final PWMSparkMax shooterHold = new PWMSparkMax(2);
    private final PWMSparkMax shooterFront = new PWMSparkMax(3);
    private final PWMSparkMax shooterBack = new PWMSparkMax(4);

    public void intake(){
        intake.set(1);
        shooterHold.set(0.5);
    }

    public void outake(){
        intake.set(-1);
        shooterHold.set(-1);
    }

    public void shooterTop(){
        shooterBack.set(1);
    }

    public void shooterLoad(){
        shooterFront.set(1);
    }

    public void zero(){
        intake.set(0);
        shooterBack.set(0);
        shooterHold.set(0);
        shooterFront.set(0);
    }

    public Command shooterTopCommand(){
        //shooterFront.set(1);
        //Command cm = new Command();
        //shooterFront.
        System.out.println("RUNNING");
        return this.runOnce(() -> shooterBack.set(-1));
    }

    public Command intakeCommand(){
        return this.runOnce(() -> intake.set(-1));
    }

    public Command shooterLoadCommand(){
        return this.runOnce(() -> shooterFront.set(1));
    }
}
