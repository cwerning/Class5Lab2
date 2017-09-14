/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class5lab2.task3;

/**
 *
 * @author cwerning
 */
public class StartUp {

    public static void main(String[] args) {

    
        
        Restaurant restaurant = new Restaurant();
        restaurant.setFoodType("Mexican");
        System.out.println(restaurant.getTypeOfBusiness());
        
        McDonalds mcdonalds = new McDonalds();
        mcdonalds.setFoodType("American");
        System.out.println(mcdonalds.getTypeOfBusiness());

    }
}