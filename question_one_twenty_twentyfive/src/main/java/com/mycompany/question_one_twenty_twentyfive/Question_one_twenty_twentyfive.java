/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question_one_twenty_twentyfive;

/**
 *
 * @author emeris
 */
public class Question_one_twenty_twentyfive {

    public static void main(String[] args) {
       
 
        // Two-dimensional array: rows are the years, columns are the quarters
        int[][] sales = {
            {300, 150, 700},   // Year 1
            {250, 200, 600}    // Year 2
        };
 
        // One-dimensional array for the names shown in the report
        String[] labels = {"Total sales:", "Average sales:", "Maximum sale:", "Minimum sale:"};
 
        // One-dimensional array to store the four answers
        int[] results = new int[4];
 
        // Create an object so we can use the methods in ProductSales
        ProductSales productSales = new ProductSales();
 
        // Call each method and store the answer in the array
        results[0] = productSales.TotalSales(sales);
 
        // Math.round gives 367 instead of 366.666..., the (int) changes it to a whole number
        results[1] = (int) Math.round(productSales.AverageSales(sales));
 
        results[2] = productSales.MaxSale(sales);
        results[3] = productSales.MinSale(sales);
 
        // Display the report heading
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("-".repeat(30));
 
        // Loop through the labels and show each answer next to its label
        for (int i = 0; i < labels.length; i++) {
            System.out.println(labels[i] + "\t\t" + results[i]);
        }
 
        // Finish with a line
        System.out.println("-".repeat(30));
    }
}

        
    

