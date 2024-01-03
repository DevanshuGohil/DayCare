/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

/**
 *
 * 
 */
public class Teacher extends Person {
    
    private int credits;
    private int salary;
    private String annualReview;
    private String ageGroupAssigned;
    private Date reviewDate;

    public String getAgeGroupAssigned() {
        return ageGroupAssigned;
    }

    public void setAgeGroupAssigned(String ageGroupAssigned) {
        this.ageGroupAssigned = ageGroupAssigned;
    }

    public String getAnnualReview() {
        return annualReview;
    }

    public void setAnnualReview(String annualReview) {
        this.annualReview = annualReview;
    }
    
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    } 
    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public Teacher(int id, Date dob, int age, String name, int credits, int salary){
        super(id, dob, age, name);
        this.credits = credits;
        this.salary = salary;
    }
    
    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }
    
    public Date getReviewDate() {
        return this.reviewDate;
    }
    
   
    @Override
    public String toString() {
        return getName();
    }
  
}
