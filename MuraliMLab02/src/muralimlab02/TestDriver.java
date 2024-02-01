/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muralimlab02;

/**
 *
 * @author S572792
 */
public class TestDriver {
    public static void main(String[] args) {
    // Creating object for Patient class and assigning arguments
    Patient p = new Patient (62735, "Jack", 3, 190.5);
    
    // Calling methods to print data
    System.out.println("Patient Id: " + p.getPatientId());
    System.out.println("Patient Name:" + p.getPatientName());
    System.out.println("Number of days stayed in hospital: " + p.getDaysOfStay());
    System.out.println("The price for one day is " + p.getDayCost());
    
    // Calling totalPrice method from Patient class
    System.out.println("The total price for the stay is " + p.totalPrice());
  
    // Creating object for Doctor class and assigning arguments
    Doctor d = new Doctor(564, "Charlie", 4, 30000);
    
 
    // Printing doctor information
    System.out.println("--------------------------------Doctor Class--------------------------------");
    System.out.println("Doctor Id: " + d.getDoctorId());
    System.out.println("Doctor Name: " + d.getDoctorName());
    System.out.println("Number of patients assigned: " + d.getPatientAssigned());
    System.out.println("The monthly salary  is " + d.getSalaryPerMonth());
    
    // Calling annual salary method from Doctor class using object
    System.out.println("The annual salary is " + d.totalPrice());
    
    // Printing block information
    System.out.println("---------------------------------Block Class--------------------------------");
    // Creating object for Block class and assigning arguments
    Block b = new Block(8320, "Cardiology Block", "John");
    System.out.println("Block Id: " + b.getBlockId());
    System.out.println("Block Name: " + b.getBlockName());
    
    // Method to display dean
    b.displayDean();
    
   
    // Printing visitor information
    System.out.println("--------------------------------Visitor Class--------------------------------");
    // Creating object for Visitor class and assigning arguments
    Visitor v = new Visitor("Mary", 48563, "Tuesday", 5);
    
    System.out.println("Name of the visitor: " + v.getVisitorName());
    System.out.println("Day visited: " + v.getVisitDay());
    System.out.println("Hours visited: " + v.getVisitHours());
    
    // Method to display hours
    v.displayHours();
    }
    
}
