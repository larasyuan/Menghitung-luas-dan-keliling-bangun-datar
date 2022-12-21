package laras;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        bangun a = new bangun();
        Scanner input = new Scanner(System.in);
        int menu;
        System.out.println("____________________________________________________");
        System.out.println("|                                                  |");
        System.out.println("|                                                  |");
        System.out.println("|    PROGRAM PENGHITUNGAN LUAS DAN KELILING        |");
        System.out.println("|           UNIVERSITAS AHMAD DAHLAN               |");
        System.out.println("|                                                  |");
        System.out.println("|                                                  |");
        System.out.println("____________________________________________________");
        do {
            System.out.println("1. KELILING PERSEGI ");
            System.out.println("2. LUAS PERSEGI ");
            System.out.println("3. KELILING PERSEGI PANJANG ");
            System.out.println("4. LUAS PERSEGI PANJANG");
            System.out.println("5. KELILING LINGKARAN ");
            System.out.println("6. LUAS LINGKARAN ");
            System.out.println("7. KELILING SEGITIGA ");
            System.out.println("8. LUAS SEGITIGA ");
            System.out.println("9. KELUAR ");

            System.out.printf("MASUKAN PILIHAN ANDA = ");
            System.out.println();
            menu = input.nextInt();
            if (menu==1){
                a.persegikeliling();
            } else if (menu==2) {
                a.persegiluas();
            }else if (menu==3){
                a.persegi_panjangkeliling();
            }else if(menu==4){
                a.persegi_panjangluas();
            } else if (menu==5) {
                a.lingkarankeliling();
            } else if (menu==6) {
                a.lingkaranluas();
            } else if (menu==7) {
                a.segitigakeliling();
            } else if (menu==8) {
                a.segitigaluas();
            }else if (menu==9){
                System.out.println("TERIMAKASIH !!!!!!");
            }else {
                System.out.println("MASUKAN DATA YANG BENAR !!!!");
            }
        }while (menu!=9);
    }
}
