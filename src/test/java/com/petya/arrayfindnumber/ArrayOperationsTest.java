/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.petya.arrayfindnumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author petya
 */
public class ArrayOperationsTest {
    
    private final ArrayOperations arrayOperations;
    
    public ArrayOperationsTest() {
        arrayOperations = new ArrayOperations();
    }
    
    
    @Test
    public void testGetSecondLargestElementOne() {
        int expectedResult = 9;
        int[] arr = new int[] {10, 9, 8, 6, 5};
        int result = arrayOperations.getSecondLargestElement(arr);
        assertEquals(result,expectedResult);
    }
    
    @Test
    public void testGetSecondLargestElementTwo() {
        int expectedResult = 10;
        int[] arr = new int[] {5, 7, 9, 10, 11};
        int result = arrayOperations.getSecondLargestElement(arr);
        assertEquals(result,expectedResult);
    }
    
    @Test
    public void testGetSecondLargestElementThree() {
        int expectedResult = 88;
        int[] arr = new int[] {11, 34, 66, 99, 88, 10};
        int result = arrayOperations.getSecondLargestElement(arr);
        assertEquals(result,expectedResult);
    }
    
    @Test
    public void testGetSecondLargestElementFour() {
        int expectedResult = 10;
        int[] arr = new int[] {10, 10, 10, 10};
        int result = arrayOperations.getSecondLargestElement(arr);
        assertEquals(result,expectedResult);
    }
    
    @Test
    public void testGetSecondLargestElementFive() {
        int expectedResult = -4;
        int[] arr = new int[] {-5, -7, -4, -12, -3};
        int result = arrayOperations.getSecondLargestElement(arr);
        assertEquals(result,expectedResult);
    }
}
