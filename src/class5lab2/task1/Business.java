/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class5lab2.task1;

/**
 *
 * @author cwerning
 */
public class Business {
    
    private String businessName;
    private String[] ownerNames;
    private int numberOfEmployees;
    private double dayRevenue;
    private double weekRevenue;
    private double monthRevenue;
    
    public String getTypeOfBusiness(){
        return "";
    }

    public double getDayRevenue() {
        return dayRevenue;
    }

    public void setDayRevenue(double dayRevenue) {
        if(dayRevenue < 0 ) {
            throw new IllegalArgumentException("You canno't be negative in revenue");
        }
        this.dayRevenue = dayRevenue;
    }

    public double getWeekRevenue() {
        return weekRevenue;
    }

    public void setWeekRevenue(double weekRevenue) {
          if(weekRevenue < 0 ) {
            throw new IllegalArgumentException("You canno't be negative in revenue");
        }
        this.weekRevenue = weekRevenue;
    }

    public double getMonthRevenue() {
        return monthRevenue;
    }

    public void setMonthRevenue(double monthRevenue) {
          if(monthRevenue < 0 ) {
            throw new IllegalArgumentException("You canno't be negative in revenue");
        }
        this.monthRevenue = monthRevenue;
    }
    
    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
          if(businessName == null || businessName.isEmpty()) {
            throw new IllegalArgumentException("Business name is required");
        }
        this.businessName = businessName;
    }

    public String[] getOwnerNames() {
        return ownerNames;
    }

    public void setOwnerNames(String[] ownerNames) {
          if(ownerNames == null) {
            throw new IllegalArgumentException("Owner name is required");
        }
        this.ownerNames = ownerNames;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
           if(numberOfEmployees < 0) {
            throw new IllegalArgumentException("Number of Employees cannot be negative.");
        }
        this.numberOfEmployees = numberOfEmployees;
    }
    
    
    
    
    
}
