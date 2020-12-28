package com.example.triangle_testing;

public class TamGiac {
    Diem v1;
    Diem v2;
    Diem v3;
    final boolean laTamGiac;

    public TamGiac(Diem v1, Diem v2, Diem v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        laTamGiac = (v1.tinhKhoangCach(v2) + v2.tinhKhoangCach(v3) > v3.tinhKhoangCach(v1))
                && (v2.tinhKhoangCach(v3) + v3.tinhKhoangCach(v1) > v1.tinhKhoangCach(v2))
                && (v3.tinhKhoangCach(v1) + v1.tinhKhoangCach(v2) > v2.tinhKhoangCach(v1));
    }

    public boolean isLaTamGiac() {
        return laTamGiac;
    }

    public Diem getV1() {
        return v1;
    }

    public void setV1(Diem v1) {
        this.v1 = v1;
    }

    public Diem getV2() {
        return v2;
    }

    public void setV2(Diem v2) {
        this.v2 = v2;
    }

    public Diem getV3() {
        return v3;
    }

    public void setV3(Diem v3) {
        this.v3 = v3;
    }

    public double tinhChuVi() {
        return v1.tinhKhoangCach(v2) + v2.tinhKhoangCach(v3) + v3.tinhKhoangCach(v1);
    }

    public boolean laTamGiacCan() {
        return laTamGiac && (v1.tinhKhoangCach(v2) == v2.tinhKhoangCach(v3))
                || (v2.tinhKhoangCach(v3) == v3.tinhKhoangCach(v1))
                || (v3.tinhKhoangCach(v1) == v1.tinhKhoangCach(v2));
    }

    public boolean laTamGiacDeu() {
        return laTamGiac && (v1.tinhKhoangCach(v2) == v2.tinhKhoangCach(v3))
                && (v2.tinhKhoangCach(v3) == v3.tinhKhoangCach(v1));
    }

    private boolean kiemTraTamGiacVuong(Diem v1, Diem v2, Diem v3) {
        double e1 = v1.tinhKhoangCach(v2);
        double e2 = v2.tinhKhoangCach(v3);
        double e3 = v3.tinhKhoangCach(v1);

        return e1*e1 + e2*e2 == e3*e3;
    }

    public boolean laTamGiacVuong() {
        return laTamGiac && (
                kiemTraTamGiacVuong(v1, v2, v3) ||
                kiemTraTamGiacVuong(v2, v3, v1) ||
                kiemTraTamGiacVuong(v3, v1, v2));
    }

    public boolean laTamGiacVuongCan() {
        return laTamGiac && laTamGiacVuong() && laTamGiacCan();
    }

    public boolean laTamGiacThuong() {
        return laTamGiac && !this.laTamGiacCan() && !this.laTamGiacVuong();
    }
}
