package com.example.triangle_testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class TamGiacTest {

    final double delta = 0.001;

    @Test
    public void isLaTamGiac() {
        Diem v1 = new Diem(0.0, 1.0);
        Diem v2 = new Diem(1.0, -1.0);
        Diem v3 = new Diem(-1.0, -2.0);
        TamGiac trg1 = new TamGiac(v1, v2, v3);
        assertTrue(trg1.isLaTamGiac());

        Diem v4 = new Diem(-1.0, 0.0);
        Diem v5 = new Diem(2.0, 0.0);
        Diem v6 = new Diem(0.5, 0.0);
        TamGiac trg2 = new TamGiac(v4, v5, v6);
        assertFalse(trg2.isLaTamGiac());
    }

    @Test
    public void getV1() {
    }

    @Test
    public void setV1() {
    }

    @Test
    public void getV2() {
    }

    @Test
    public void setV2() {
    }

    @Test
    public void getV3() {
    }

    @Test
    public void setV3() {
    }

    @Test
    public void tinhChuVi() {
        Diem v1 = new Diem(0.0, 1.0);
        Diem v2 = new Diem(1.0, -1.0);
        Diem v3 = new Diem(-1.0, -2.0);
        TamGiac trg1 = new TamGiac(v1, v2, v3);
        assertEquals(7.63441361517, trg1.tinhChuVi(), delta);
    }

    @Test
    public void laTamGiacCan() {
        Diem v1 = new Diem(0.0, 1.0);
        Diem v2 = new Diem(1.0, -1.0);
        Diem v3 = new Diem(-1.0, -2.0);
        TamGiac trg1 = new TamGiac(v1, v2, v3);
        assertTrue(trg1.laTamGiacCan());
    }

    @Test
    public void laTamGiacDeu() {
        Diem v1 = new Diem(0.0, 1.0);
        Diem v2 = new Diem(1.0, -1.0);
        Diem v3 = new Diem(-1.0, -2.0);
        TamGiac trg1 = new TamGiac(v1, v2, v3);
        assertFalse(trg1.laTamGiacDeu());

        Diem v4 = new Diem(0.0, Math.sqrt(3.0));
        Diem v5 = new Diem(-1.0, 0.0);
        Diem v6 = new Diem(1.0, 0.0);
        TamGiac trg2 = new TamGiac(v4, v5, v6);
        assertTrue(trg2.laTamGiacDeu());
    }

    @Test
    public void laTamGiacVuong() {
        Diem v1 = new Diem(0.0, 1.0);
        Diem v2 = new Diem(1.0, -1.0);
        Diem v3 = new Diem(-1.0, -2.0);
        TamGiac trg1 = new TamGiac(v1, v2, v3);
        assertTrue(trg1.laTamGiacVuong());

        Diem v4 = new Diem(0.0, Math.sqrt(3.0));
        Diem v5 = new Diem(-1.0, 0.0);
        Diem v6 = new Diem(1.0, 0.0);
        TamGiac trg2 = new TamGiac(v4, v5, v6);
        assertFalse(trg2.laTamGiacVuong());
    }

    @Test
    public void laTamGiacVuongCan() {
        Diem v1 = new Diem(0.0, 1.0);
        Diem v2 = new Diem(1.0, -1.0);
        Diem v3 = new Diem(-1.0, -2.0);
        TamGiac trg1 = new TamGiac(v1, v2, v3);
        assertTrue(trg1.laTamGiacVuongCan());

        Diem v4 = new Diem(0.0, Math.sqrt(3.0));
        Diem v5 = new Diem(-1.0, 0.0);
        Diem v6 = new Diem(1.0, 0.0);
        TamGiac trg2 = new TamGiac(v4, v5, v6);
        assertFalse(trg2.laTamGiacVuongCan());
    }

    @Test
    public void laTamGiacThuong() {
        Diem v4 = new Diem(0.0, Math.sqrt(3.0));
        Diem v5 = new Diem(-1.0, 0.0);
        Diem v6 = new Diem(1.0, 0.0);
        TamGiac trg2 = new TamGiac(v4, v5, v6);
        assertFalse(trg2.laTamGiacThuong());

        Diem v1 = new Diem(0.0, 1.0);
        Diem v2 = new Diem(1.0, -1.0);
        Diem v3 = new Diem(0.0, -2.0);
        TamGiac trg1 = new TamGiac(v1, v2, v3);
        assertTrue(trg1.laTamGiacThuong());
    }
}