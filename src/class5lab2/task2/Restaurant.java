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
public class Restaurant extends Business {

    private String foodType;
    private String[] entrees;
    private String[] appetizers;
    private String[] deserts;

    @Override
    public String getTypeOfBusiness() {
        return foodType + " Restaurant";
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        if(foodType == null || foodType.isEmpty()) {
            throw new IllegalArgumentException("Food Type is required");
        }
        this.foodType = foodType;
    }

    public String[] getEntrees() {
        return entrees;
    }

    public void setEntrees(String[] entrees) {
        if(entrees == null) {
            throw new IllegalArgumentException("Entrees is required");
        }
        this.entrees = entrees;
    }

    public String[] getAppetizers() {
        return appetizers;
    }

    public void setAppetizers(String[] appetizers) {
        if(appetizers == null) {
            throw new IllegalArgumentException("Appetizers is required");
        }
        this.appetizers = appetizers;
    }

    public String[] getDeserts() {
        return deserts;
    }

    public void setDeserts(String[] deserts) {
        if(deserts == null) {
            throw new IllegalArgumentException("Deserts is required");
        }
        this.deserts = deserts;
    }
}
