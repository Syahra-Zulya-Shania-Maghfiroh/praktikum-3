/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

/**
 *
 * @author MOKLET-01
 */
public class Praktikum3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //deklarasi variabel
        int a = 5;
        //perulangan agar membentuk pola sesuai praktikum 1
        for (int b = 0; b <= a; b++)
        {
            for (int c = 0; c <= a; c++)
            {
                if(b == 0||b == a - 1||c == a - 1 - b) 
                {
                //output yang diinginkan
                System.out.print("@ ");
                }
                else 
                {
                    System.out.print("  ");
                }
            }
        System.out.println();
                }
    }
    }
    

