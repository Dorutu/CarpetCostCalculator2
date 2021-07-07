package com.dorutu;

public class Floor {

    private double width;
    private double lenght;

    public Floor(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;

        if (width<0 ) {
            this.width = 0;
        } else
        if (lenght<0) {
            this.lenght=0;
        }
    }

    public double getArea() {
        return(this.lenght * this.width);
    }
}
