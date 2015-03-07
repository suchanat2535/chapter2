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
public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Input 1");
        num1 = scan.nextInt();
        System.out.println("Inuput 2");
        num2 = scan.nextInt();
        System.out.println("Input 3");
        num3 = scan.nextInt();
        
        int max = num1;
        if(num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("Max : "+max);
        }
        
        
    }
    
    
    

