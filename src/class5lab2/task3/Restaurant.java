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
    
    @Override
    public double getDayRevenue() {
       
        return dayRevenue;
    }

    @Override
    public void setDayRevenue(double dayRevenue) {
        if(dayRevenue < 0 ) {
            throw new IllegalArgumentException("You canno't be negative in revenue");
        }
        this.dayRevenue = dayRevenue;
    }

    @Override
    public double getWeekRevenue() {
        return weekRevenue;
    }

    @Override
    public void setWeekRevenue(double weekRevenue) {
          if(weekRevenue < 0 ) {
            throw new IllegalArgumentException("You canno't be negative in revenue");
        }
        this.weekRevenue = weekRevenue;
    }

    @Override
    public double getMonthRevenue() {
        return monthRevenue;
    }

    @Override
    public void setMonthRevenue(double monthRevenue) {
          if(monthRevenue < 0 ) {
            throw new IllegalArgumentException("You canno't be negative in revenue");
        }
        this.monthRevenue = monthRevenue;
    }
    
    @Override
    public String getBusinessName() {
        return businessName;
    }

    @Override
    public void setBusinessName(String businessName) {
          if(businessName == null || businessName.isEmpty()) {
            throw new IllegalArgumentException("Business name is required");
        }
        this.businessName = businessName;
    }

    @Override
    public String[] getOwnerNames() {
        return ownerNames;
    }

    @Override
    public void setOwnerNames(String[] ownerNames) {
          if(ownerNames == null) {
            throw new IllegalArgumentException("Owner name is required");
        }
        this.ownerNames = ownerNames;
    }

    @Override
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public void setNumberOfEmployees(int numberOfEmployees) {
           if(numberOfEmployees < 0) {
            throw new IllegalArgumentException("Number of Employees cannot be negative.");
        }
        this.numberOfEmployees = numberOfEmployees;
    }
    
    
}