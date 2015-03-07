/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter_21;

/**
 *
 * @author OnNaJa
 */
public class ForArray {
    public static void main(String[] args) {
        int a[] = {25,15,37,64,18};
        int max = 0;
        for(int  i=1;i<a.length;i++) {
            if(a[i]>a[max]){
                max = i;
                }
            System.out.println("The maximum of 25 15 37 64 18 is "+a[max]);
        }
    }
}
    
    
    
