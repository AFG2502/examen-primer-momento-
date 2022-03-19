package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double desc,propina=0,platosIguales=0,total;
        int n,compra=0,count1=0,count2=0,count3=0,count4=0;
        int hamburguesa = 10000;
        int perros = 8000;
        int salchipapas = 6000;
        int chorizo = 7000;
        System.out.printf("Cuantas personas son?: ");
        n = teclado.nextInt();
        for (int i=1;i <= n;i++) {
            System.out.printf("Que plato desea");
            String a = "";
            a = teclado.nextLine();
            if (a == "hamburguesa"){
                count1++;
            }
            if (a == "perros"){
                count2++;
            }
            if (a == "salchipapas"){
                count3++;
            }
            if (a == "chorizo"){
                count4++;
            }
        }
        compra = hamburguesa * count1 + perros * count2 + salchipapas * count3 + chorizo * count4;

        if (compra >= 20000){
            desc = compra * 0.15;
            System.out.printf("su descuento por compras superiores a 20000 es de:"+ desc);
        }
        if (propina == 1){
            System.out.printf("desea ingresar propina? 1.si/2.no");
            String p = "";
            p = teclado.nextLine();
            propina = compra + compra * 0.15;
            System.out.printf("la propina es de: "+propina);
            if (propina == 2){
                System.out.printf("muchas gracias");
            }
        }
        if (platosIguales <= 3){
            platosIguales = compra * 0.5;
        }
        total = compra + propina + platosIguales;
    }
}
