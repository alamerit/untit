package java_core;

public class VKP implements Robot {
    Integer sn;
    String box = "Square box";

    @Override
    public String getName() {
        return "VKP";
    }

    @Override
    public void setBox(String box) {
        this.box = box;
    }

    @Override
    public String getBox() {
        return box;
    }

    @Override
    public void setSerialNumber(Integer sn) {
        this.sn = sn;
    }

    @Override
    public Integer getSerialNumber() {
        return sn;
    }
}