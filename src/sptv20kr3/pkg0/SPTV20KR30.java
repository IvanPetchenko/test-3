/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20kr3.pkg0;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class SPTV20KR30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.printf("введите имя ");
        String Name = scanner.nextLine();
        System.out.printf("введите фамилию ");
        String Sname = scanner.nextLine();
        System.out.printf("введите год рождения ");
        int Year = scanner.nextInt();
        System.out.printf("введите месяц рождения ");
        int Month = scanner.nextInt();
        System.out.printf("введите день рождения ");
        int Day = scanner.nextInt();
        System.out.println("");
        System.out.printf(Name+" "+Sname+" родился "+Day+ "."+Month+"."+Year);
    }
    
}
