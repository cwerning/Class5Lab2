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
    private String[] Drinks;
    private String[] afterBreakfastMenu;
    
    @Override
    public String getTypeOfBusiness(){
    return "McDonalds Restaurant";
}

    public String[] getDollarMenuItems() {
        return dollarMenuItems;
    }

    public void setDollarMenuItems(String[] dollarMenuItems) {
        this.dollarMenuItems = dollarMenuItems;
    }

    public String[] getBreakfastMenu() {
        return breakfastMenu;
    }

    public void setBreakfastMenu(String[] breakfastMenu) {
        this.breakfastMenu = breakfastMenu;
    }

    public String[] getDrinks() {
        return Drinks;
    }

    public void setDrinks(String[] Drinks) {
        this.Drinks = Drinks;
    }

    public String[] getAfterBreakfastMenu() {
        return afterBreakfastMenu;
    }

    public void setAfterBreakfastMenu(String[] afterBreakfastMenu) {
        this.afterBreakfastMenu = afterBreakfastMenu;
    }
    
    
   
    
}
