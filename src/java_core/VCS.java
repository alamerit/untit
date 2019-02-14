package java_core;

public class VCS implements Robot {
    String box="Round Box";
    Integer sn;

    @Override
    public String getName() {
        return "VCS";
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