package com.example.triangle_testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiemTest {

    final double delta = 0.001;

    @Test
    public void getX() {
        Diem diem = new Diem(0.8, -2.4);
        assertEquals(0.8, diem.getX(), delta);
    }

    @Test
    public void setX() {
        Diem diem = new Diem(0.8, -2.4);
        diem.setX(1.6);
        assertEquals(1.6, diem.getX(), delta);
    }

    @Test
    public void getY() {
        Diem diem = new Diem(0.8, -2.4);
        assertEquals(-2.4, diem.getY(), delta);
    }

    @Test
    public void setY() {
        Diem diem = new Diem(0.8, -2.4);
        diem.setY(-1.2);
        assertEquals(-1.2, diem.getY(), delta);
    }

    @Test
    public void tinhKhoangCach() {
        Diem diem1 = new Diem(0.8, -2.4);
        Diem diem2 = new Diem(-1.0, 3.0);
        double kc1 = diem1.tinhKhoangCach(diem2);
        double kc2 = diem2.tinhKhoangCach(diem1);
        assertEquals(kc2, kc1, delta);
        assertEquals(5.6920997883030827975980083799789, kc1, delta);
    }
}