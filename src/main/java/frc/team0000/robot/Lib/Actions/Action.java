package frc.team0000.robot.Lib.Actions;

public interface Action {
    public abstract boolean isFinished();
    public abstract void update();
    public abstract void start();
    public abstract void done();
}