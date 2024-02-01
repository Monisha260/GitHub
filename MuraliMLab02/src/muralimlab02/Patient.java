package muralimlab02;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author S572792
 */
public class Patient {
// Attributes
 private int patientId;
 private String patientName;
 private int daysOfStay;
 private double dayCost;  
 
 public Patient () {
// No-argument Constructor
  patientId = 1;
  patientName = "Unknown";
  daysOfStay = 0;
  dayCost = 0.0;
 }
public Patient(int patientId, String patientName, int daysOfStay, double dayCost)
{
// Parameterized Constructor
 this. patientId = patientId;
 this. patientName = patientName;
 this. daysOfStay = daysOfStay;
 this. dayCost = dayCost; 
}
// Getter method
public int getPatientId () {
    return patientId;
}
public String getPatientName () {
    return patientName;
}
public int getDaysOfStay () {
    return daysOfStay;
}
public double getDayCost () {
    return dayCost;
}
// Setter method
public void setPatientId (int patientId) {
    this. patientId = patientId;
}
public void setPatientName (String patientName) {
    this. patientName = patientName;
}
public void setDaysOfStay (int daysOfStay) {
    this. daysOfStay = daysOfStay;
}
public void setDayCost (double dayCost) {
    this. dayCost = dayCost;
}
// Method to Calculate Total Price
public double totalPrice () {
    return daysOfStay * dayCost;   
}
}
