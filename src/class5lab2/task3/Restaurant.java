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

    
public class Restaurant implements Business {
    private double dayRevenue;
    private double weekRevenue;
    private double monthRevenue;
    private String businessName;
    private String[] ownerNames;
    private int numberOfEmployees;
    
    
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
        this.foodType = foodType;
    }

    public String[] getEntrees() {
        return entrees;
    }

    public void setEntrees(String[] entrees) {
        this.entrees = entrees;
    }

    public String[] getAppetizers() {
        return appetizers;
    }

    public void setAppetizers(String[] appetizers) {
        this.appetizers = appetizers;
    }

    public String[] getDeserts() {
        return deserts;
    }

    public void setDeserts(String[] deserts) {
        this.deserts = deserts;
    }

    @Override
    public double getDayRevenue() {
        return dayRevenue;
    }

    @Override
    public void setDayRevenue(double dayRevenue) {
        this.dayRevenue = dayRevenue;
    }

    @Override
    public double getWeekRevenue() {
        return weekRevenue;
    }

    @Override
    public void setWeekRevenue(double weekRevenue) {
        this.weekRevenue = weekRevenue;
    }

    @Override
    public double getMonthRevenue() {
        return monthRevenue;
    }

    /**
     *
     * @param monthRevenue
     */
    @Override
    public void setMonthRevenue(double monthRevenue) {
        this.monthRevenue = monthRevenue;
    }

    /**
     *
     * @return
     */
    @Override
    public String getBusinessName() {
        return businessName;
    }

    @Override
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    @Override
    public String[] getOwnerNames() {
        return ownerNames;
    }

    @Override
    public void setOwnerNames(String[] ownerNames) {
        this.ownerNames = ownerNames;
    }

    @Override
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    
    
}