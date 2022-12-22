/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.petya.arrayfindnumber;

/**
 *
 * @author petya
 */
public class ArrayOperations {
    
    public int getSecondLargestElement(int[] arr) {
        int bigeest = arr[0];
        int secondBigest = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > bigeest) {
                secondBigest = bigeest;
                bigeest = arr[i];
            }else if(arr[i] > secondBigest && arr[i] <= bigeest) {
                secondBigest = arr[i];
            }
        }
        return secondBigest;
    }
    
}
