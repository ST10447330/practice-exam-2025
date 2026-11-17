/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question_one_twenty_twentyfive;

/**
 *
 * @author emeris
 */
public interface  IProductSales {
    
    // Method to calculate the total of all the sales
    int TotalSales(int[][] productSales);
 
    // Method to calculate the average of all the sales
    double AverageSales(int[][] productSales);
 
    // Method to find the highest sale
    int MaxSale(int[][] productSales);
 
    // Method to find the lowest sale
    int MinSale(int[][] productSales);
}

    

