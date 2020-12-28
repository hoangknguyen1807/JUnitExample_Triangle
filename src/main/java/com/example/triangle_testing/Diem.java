package com.example.triangle_testing;

public class Diem {
    double x;
    double y;

    Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double tinhKhoangCach(Diem dich) {
        return Math.sqrt((this.x - dich.x)*(this.x - dich.x)
                        + (this.y - dich.y)*(this.y - dich.y));
    }

}
