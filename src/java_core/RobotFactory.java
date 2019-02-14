package java_core;


public class RobotFactory {
    public static Robot createFan(int kind){
        switch (kind){
            case 0: return new VKP();
            case 1: return new VCS();
            default: return null;
        }
    }
}