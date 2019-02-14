package java_core;



import java.util.ArrayList;


public class FanInc {

        static ArrayList<String> motor = new ArrayList<>();

    void makeFan(int kind){
        Robot fan = RobotFactory.createFan(kind);
        assert fan != null;
        generateSerialNumber(fan);
        sendToClient(fan);
    }

    private void generateSerialNumber(Robot fan){
        fan.setSerialNumber((int)(Math.random()*1000));
    }

    private void sendToClient(Robot fan){
        String t = "\n Fan is "+fan.getName()+
                "\n Boxing in "+fan.getBox()+"\n Factory serial number: "
                +fan.getSerialNumber()+"\n";
        motor.add(t);
    }

}