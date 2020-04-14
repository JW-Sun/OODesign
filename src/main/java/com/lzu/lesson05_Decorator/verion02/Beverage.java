package com.lzu.lesson05_Decorator.verion02;

/*终极超类-饮料*/
public abstract class Beverage {

    String description = "Base coffee";

    //杯子大小
    public static final int TAIL = 1;
    public static final int GRNAD = 2;
    public static final int VENTI = 3;
    int size = 0;

    abstract public double cost();

    public String getDescription() {
        return description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
