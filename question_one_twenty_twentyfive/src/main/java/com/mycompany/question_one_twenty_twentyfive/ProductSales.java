/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question_one_twenty_twentyfive;

/**
 *
 * @author emeris
 */
public class ProductSales implements IProductSales {
    
    
 
    // Calculate the total of all the sales
    @Override
    public int TotalSales(int[][] productSales) {
 
        // Variable to keep the running total
        int total = 0;
 
        // Outer loop goes through the rows (years)
        for (int row = 0; row < productSales.length; row++) {
 
            // Inner loop goes through the columns (quarters)
            
            for (int col = 0; col < productSales[row].length; col++) {
 
                // Add the current sale to the total
                total = total + productSales[row][col];
            }
        }
 
        // Send the total back
        return total;
    }
 
    // Calculate the average of all the sales
    @Override
    public double AverageSales(int[][] productSales) {
 
        // Get the total by calling the method above
        int total = TotalSales(productSales);
 
        // Work out how many sales there are (rows x columns)
        int numberOfSales = productSales.length * productSales[0].length;
 
        // Divide as a double so the decimals are not lost
        double average = (double) total / numberOfSales;
 
        // Send the average back
        return average;
    }
 
    // Find the highest sale
    @Override
    public int MaxSale(int[][] productSales) {
 
        // Start by assuming the first sale is the highest
        int max = productSales[0][0];
 
        // Go through every row
        for (int row = 0; row < productSales.length; row++) {
 
            // Go through every column
            for (int col = 0; col < productSales[row].length; col++) {
 
                // If this sale is higher than max, it becomes the new max
                if (productSales[row][col] > max) {
                    max = productSales[row][col];
                }
            }
        }
 
        return max;
    }
 
    // Find the lowest sale
    @Override
    public int MinSale(int[][] productSales) {
 
        // Start by assuming the first sale is the lowest
        int min = productSales[0][0];
 
        // Go through every row
        for (int row = 0; row < productSales.length; row++) {
 
            // Go through every column
            for (int col = 0; col < productSales[row].length; col++) {
 
                // If this sale is lower than min, it becomes the new min
                if (productSales[row][col] < min) {
                    min = productSales[row][col];
                }
            }
        }
 
        return min;
    }
}


    

