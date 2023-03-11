/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tom
 */
public class Product {
    
    private double price = 0;
    private int quantity = 0;
    private String name = "";
    
    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }
    
    public void printProduct() {
        System.out.printf("%s, price %.2f, %d pcs", this.name, this.price, this.quantity);
    }
}