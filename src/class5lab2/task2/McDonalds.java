/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class5lab2.task2;

/**
 *
 * @author cwerning
 */
public class McDonalds extends Restaurant{
    private String[] dollarMenuItems;
    private String[] breakfastMenu;
    private String[] drinks;
    private String[] afterBreakfastMenu;
    
    @Override
    public String getTypeOfBusiness(){
    return "McDonalds Restaurant";
}

    public String[] getDollarMenuItems() {
        return dollarMenuItems;
    }

    public void setDollarMenuItems(String[] dollarMenuItems) {
        if(dollarMenuItems == null) {
            throw new IllegalArgumentException("Dollar menu items are required");
        }
        this.dollarMenuItems = dollarMenuItems;
    }

    public String[] getBreakfastMenu() {
        return breakfastMenu;
    }

    public void setBreakfastMenu(String[] breakfastMenu) {
        if(breakfastMenu == null) {
            throw new IllegalArgumentException("Breakfast menu items are required");
        }
        this.breakfastMenu = breakfastMenu;
    }

    public String[] getDrinks() {
        return drinks;
    }

    public void setDrinks(String[] drinks) {
        if(drinks == null) {
            throw new IllegalArgumentException("Drink items are required");
        }
        this.drinks = drinks;
    }

    public String[] getAfterBreakfastMenu() {
        return afterBreakfastMenu;
    }

    public void setAfterBreakfastMenu(String[] afterBreakfastMenu) {
        if(afterBreakfastMenu == null) {
            throw new IllegalArgumentException("After breakfast menu is required");
        }
        this.afterBreakfastMenu = afterBreakfastMenu;
    }
    
    
   
    
}
