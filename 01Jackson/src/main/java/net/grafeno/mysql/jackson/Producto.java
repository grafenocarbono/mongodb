/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.grafeno.mysql.jackson;

/**
 *
 * @author grafeno30
 */
public class Producto {
    
    private String fruit;
    private String size;
    private String color;

    public Producto() {
    }

    public Producto(String fruit, String size, String color) {
        this.fruit = fruit;
        this.size = size;
        this.color = color;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
    
    
}
