package frc.robot.subsystems;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class HookSubsystem extends SubsystemBase{
    private final PWMSparkMax hook = new PWMSparkMax(0);

    public void extend(){
        hook.set(1);
    }

    public void retract(){
        hook.set(-1);
    }

    public void zero(){
        hook.set(0);
    }
}

