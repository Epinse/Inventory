/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 *
 * @author ASUS
 */
public class Barang {
    
Scanner in = new Scanner(System.in);
    int alls;
    
    String[] name = new String[50];
    int[] number = new int[225];
    int[] price = new int[225];
    int[] stock = new int[225];
    int[] value = new int[225];

    public Barang() {

    }
    
     public void data() {
        do {
            System.out.print(" product number : ");
            alls = in.nextInt();

            if (alls <= 0) {
                System.out.println("Input lebih dari 0");
            } else {
                inputData();
            }
        } while (alls <= 0);
    }


    private void inputData() {
        try {
            for (int i = 0; i < alls; i++) {
                System.out.println("Product number -" + (i + 1));
                System.out.print("product name, press 0 to cancel : ");

                in.nextLine();
                number[i] = i + 1;
                name[i] = in.nextLine();

                if (name[i].equals("0")) {
                    break;
                }

                System.out.print("product price : ");
                price[i] = in.nextInt();
                System.out.print("product stock : ");
                stock[i] = in.nextInt();
                value[i] = stock[i] * price[i];
            }
        } catch (InputMismatchException e) {
            System.out.println("Input anda harus angka");
            in.nextLine();
            data();
        }
    }

   
    public void getDataValue() {
        for (int i = 0; i < alls; i++) {
            System.out.println("item number : " + number[i]);
            System.out.println("name product : " + name[i]);
            System.out.println("price product : " + price[i]);
            System.out.println("stock product  : " + stock[i]);
            System.out.println("value product: " + value[i]);
        }
    }
}
