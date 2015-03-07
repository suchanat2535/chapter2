/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter_21;

import java.util.Scanner;

/**
 *
 * @author OnNaJa
 */
public class SwitchCase {
    public static void main(String[] args) {
        int score = new java.util.Scanner(System.in).nextInt();
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Score: ");
        System.out.println("Calculating Grade");
        
        switch (score/10) {
            case 10:
            case 9:
            case 8:
                System.out.println("Your grade is A");
                break;
            case 7:
                System.out.println("Your grade is B");
                break;
            case 6:
                System.out.println("Your grade is C");
                break;
            case 5:
                System.out.println("Your grade is D");
                break;
            default:
                System.out.println("Your grade is F");
                break;
                
        }
        
        
    }
}

    
        
        
    
    

