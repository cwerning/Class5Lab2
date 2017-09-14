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
public interface Business {
    

    
    public abstract String getTypeOfBusiness();

    public abstract double getDayRevenue();

    public abstract void setDayRevenue(double dayRevenue);

    public abstract double getWeekRevenue();

    public abstract void setWeekRevenue(double weekRevenue);

    public abstract double getMonthRevenue();

    public abstract void setMonthRevenue(double monthRevenue);
    
    public abstract String getBusinessName();

    public abstract void setBusinessName(String businessName);

    public abstract String[] getOwnerNames();

    public abstract void setOwnerNames(String[] ownerNames);

    public abstract int getNumberOfEmployees();

    public abstract void setNumberOfEmployees(int numberOfEmployees);
    
    
    
    
    
}
