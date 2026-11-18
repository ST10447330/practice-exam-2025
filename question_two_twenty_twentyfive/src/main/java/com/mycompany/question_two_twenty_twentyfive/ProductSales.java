/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question_two_twenty_twentyfive;

/**
 *
 * @author emeris
 */
public class ProductSales implements IProductSales {
 
    // The sales limit the retailer uses to decide if a product was a success
    private final int SALES_LIMIT = 500;
 
    // Rows are the years, columns are Microphone, Speakers and Mixing Desk
    private int[][] productSales = {
        {300, 150, 700},   // Sales for year 1
        {250, 200, 600}    // Sales for year 2
    };
 
    // Return the whole array
    @Override
    public int[][] GetProductSales() {
        return productSales;
    }
 
    // Add up every sale
    @Override
    public int GetTotalSales() {
 
        int total = 0;
 
        // Go through the rows
        for (int row = 0; row < productSales.length; row++) {
 
            // Go through the columns
            for (int col = 0; col < productSales[row].length; col++) {
                total = total + productSales[row][col];
            }
        }
 
        return total;
    }
 
    // Count the sales that are higher than the limit
    @Override
    public int GetSalesOverLimit() {
 
        int count = 0;
 
        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
 
                // Only count it if it is over the limit
                if (productSales[row][col] > SALES_LIMIT) {
                    count++;
                }
            }
        }
 
        return count;
    }
 
    // Count the sales that are lower than the limit
    @Override
    public int GetSalesUnderLimit() {
 
        int count = 0;
 
        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
 
                // Only count it if it is under the limit
                if (productSales[row][col] < SALES_LIMIT) {
                    count++;
                }
            }
        }
 
        return count;
    }
 
    // Number of years processed = number of rows in the array
    @Override
    public int GetProductsProcessed() {
        return productSales.length;
    }
 
    // Average of all the sales
    @Override
    public double GetAverageSales() {
 
        // Total divided by the number of sales (rows x columns)
        int numberOfSales = productSales.length * productSales[0].length;
 
        return (double) GetTotalSales() / numberOfSales;
    }
}

    

