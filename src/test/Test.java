package test;

import animal.DongVat;
import animal.Ga;
import animal.Ho;
import edible.Edible;
import fruit.TraiCay;
import fruit.Tao;
import fruit.Cam;

public class Test {
    public static void main(String[] args) {
        // khởi tạo mảng
        DongVat[] dongVat = new DongVat[2];
        // khai báo mảng
        dongVat[0] = new Ga();
        dongVat[1] = new Ho();
        // duyệt toàn mảng
        for (DongVat animal : dongVat){
            System.out.println(animal.amThanh());
            if (animal instanceof Ga){
                Edible edibler = (Ga) animal;
                System.out.println(edibler.howToEat());
            }
            else {
                Edible edibler = (Ho) animal;
                System.out.println(edibler.howToEat());
            }
        }
        TraiCay[] traiCay = new TraiCay[2];
        traiCay[0] = new Cam();
        traiCay[1] = new Tao();
        for (TraiCay anQua : traiCay){
            System.out.println(anQua.howToEat());
        }

    }
}
