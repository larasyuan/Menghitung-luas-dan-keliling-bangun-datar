package laras;

import java.util.Scanner;

public class bangun implements bangundatar {
    private float r;
    private double phi = 3.14;
    private int s, p, l,a,t;

    @Override
    public void persegiluas() {
        Scanner a = new Scanner(System.in);
        int hasil;
        System.out.println();
        System.out.println("____________________________________________________");
        System.out.println("                LUAS PERSEGI                        ");
        System.out.println("____________________________________________________");
        System.out.printf("MASUKAN NILAI SISI = ");
        s = a.nextInt();
        hasil = s * s;
        System.out.println();
        System.out.printf("LUAS PERSEGI       = " + hasil);
        System.out.println();

    }

    @Override
    public void persegikeliling() {
        Scanner b = new Scanner(System.in);
        int hasil2;
        System.out.println();
        System.out.println("____________________________________________________");
        System.out.println("               KELILING PERSEGI                     ");
        System.out.println("____________________________________________________");
        System.out.printf("MASUKAN NILAI SISI = ");
        s = b.nextInt();
        hasil2 = 4 * s;
        System.out.println();
        System.out.printf("LUAS PERSEGI       = " + hasil2);
        System.out.println();

    }

    @Override
    public void persegi_panjangkeliling() {
        Scanner c = new Scanner(System.in);
        int hasil3;
        System.out.println();
        System.out.println("____________________________________________________");
        System.out.println("           KELILING PERSEGI PANJANG                 ");
        System.out.println("____________________________________________________");
        System.out.printf("MASUKAN NILAI PANJANG = ");
        p = c.nextInt();
        System.out.printf("MASUKAN NILAI LEBAR   = ");
        l = c.nextInt();
        hasil3 = 2*(p+l);
        System.out.println();
        System.out.printf("LUAS PERSEGI PANJANG  = " + hasil3);
        System.out.println();

    }

    @Override
    public void persegi_panjangluas() {
        Scanner d = new Scanner(System.in);
        int hasil4;
        System.out.println();
        System.out.println("____________________________________________________");
        System.out.println("           KELILING PERSEGI PANJANG                 ");
        System.out.println("____________________________________________________");
        System.out.printf("MASUKAN NILAI PANJANG = ");
        p = d.nextInt();
        System.out.printf("MASUKAN NILAI LEBAR   = ");
        l = d.nextInt();
        hasil4 = p*l;
        System.out.println();
        System.out.printf("LUAS PERSEGI PANJANG  = " + hasil4);
        System.out.println();

    }

    @Override
    public void segitigakeliling() {
        Scanner e = new Scanner(System.in);
        int hasil5;
        System.out.println();
        System.out.println("____________________________________________________");
        System.out.println("                  KELILING SEGITIGA                 ");
        System.out.println("____________________________________________________");
        System.out.printf("MASUKAN NILAI SISI 1 = ");
        s = e.nextInt();
        System.out.printf("MASUKAN NILAI SISI2   = ");
        s = e.nextInt();
        System.out.printf("MASUKAN NILAI SISI3   = ");
        s = e.nextInt();
        hasil5 = s+s+s;
        System.out.println();
        System.out.printf("KELILING SEGITIGA     = " + hasil5);
        System.out.println();

    }

    @Override
    public void segitigaluas() {
        Scanner f = new Scanner(System.in);
        double hasil5;
        System.out.println();
        System.out.println("____________________________________________________");
        System.out.println("                  LUAS SEGITIGA                     ");
        System.out.println("____________________________________________________");
        System.out.printf("MASUKAN NILAI ALAS    = ");
        a = f.nextInt();
        System.out.printf("MASUKAN NILAI TINGGI  = ");
        t = f.nextInt();
        hasil5 = 0.5*a*t;
        System.out.println();
        System.out.printf("LUAS     SEGITIGA     = " + hasil5);
        System.out.println();
    }

    @Override
    public void lingkarankeliling() {
        Scanner g = new Scanner(System.in);
        double hasil6;
        System.out.println();
        System.out.println("____________________________________________________");
        System.out.println("                  LUAS SEGITIGA                     ");
        System.out.println("____________________________________________________");
        System.out.printf("MASUKAN JARI JARI LINGKARAN    = ");
        r = g.nextInt();
        hasil6 = 2*phi*r;
        System.out.println();
        System.out.printf("KELILING LINGKARAN             = " + hasil6);
        System.out.println();
    }

    @Override
    public void lingkaranluas() {
        Scanner g = new Scanner(System.in);
        double hasil5;
        System.out.println();
        System.out.println("____________________________________________________");
        System.out.println("                  LUAS SEGITIGA                     ");
        System.out.println("____________________________________________________");
        System.out.printf("MASUKAN JARI JARI LINGKARAN    = ");
        r = g.nextInt();
        hasil5 = phi*r*r;
        System.out.println();
        System.out.printf("LUAS     LINGKARAN             = " + hasil5);
        System.out.println();
    }
}


