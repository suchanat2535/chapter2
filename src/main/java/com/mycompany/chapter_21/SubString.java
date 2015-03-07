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
public class SubString {
    public static void main(String[] args) {
        String input = "1234-5678-901";
        String split[] = input.split("-");
        System.out.println("input.split[0] + ', '+ split[1] + ', ' + split[2], "+input);
    }
    
}

