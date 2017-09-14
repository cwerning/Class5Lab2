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
public abstract class Business {
    
    private String businessName;
    private String[] ownerNames;
    private int numberOfEmployees;
    private double dayRevenue;
    private double weekRevenue;
    private double monthRevenue;
    
    public abstract String getTypeOfBusiness();

    public double getDayRevenue() {
        return dayRevenue;
    }

    public void setDayRevenue(double dayRevenue) {
        this.dayRevenue = dayRevenue;
    }

    public double getWeekRevenue() {
        return weekRevenue;
    }

    public void setWeekRevenue(double weekRevenue) {
        this.weekRevenue = weekRevenue;
    }

    public double getMonthRevenue() {
        return monthRevenue;
    }

    public void setMonthRevenue(double monthRevenue) {
        this.monthRevenue = monthRevenue;
    }
    
    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String[] getOwnerNames() {
        return ownerNames;
    }

    public void setOwnerNames(String[] ownerNames) {
        this.ownerNames = ownerNames;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    
    
    
    
    
}
