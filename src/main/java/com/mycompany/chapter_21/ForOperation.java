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
public class ForOperation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Number: ");
        int num = in.nextInt();
        int sum = 0;
        int i;
        for(i=1; i<=100; i++) {
            if(i%2==0){
                System.out.println("Sum of even number: "+i);
            }
        if(i%3==0) {
            System.out.println(i);
            sum+=i;
        }
    }
        System.out.println("Sum of even number: "+sum);
        }
        
        
    }
        
        
        
        
        
        

