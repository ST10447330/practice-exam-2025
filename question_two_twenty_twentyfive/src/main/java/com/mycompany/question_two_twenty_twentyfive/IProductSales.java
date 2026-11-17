/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.question_two_twenty_twentyfive;

/**
 *
 * @author emeris
 */
public interface IProductSales {
        // Method to get the two-dimensional array of product sales
    int[][] GetProductSales();
 
    // Method to get the total sales
    int GetTotalSales();
 
    // Method to get the number of sales over the sales limit
    int GetSalesOverLimit();
    
    // Method to get the number of sales under the sales limit
    int GetSalesUnderLimit();
 
    // Method to get the number of years processed
    int GetProductsProcessed();
 
    // Method to get the average sales
    double GetAverageSales();
   
}
