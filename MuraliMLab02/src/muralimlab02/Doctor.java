/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muralimlab02;

/**
 *
 * @author S572792
 */
public class Doctor {
    // Attributes
 private int doctorId;
 private String doctorName;
 private int patientAssigned;
 private double salaryPerMonth;  
 
 public Doctor () {
// No-argument Constructor
  doctorId = 1;
  doctorName = "Unknown";
  patientAssigned = 0;
  salaryPerMonth = 0.0;
 }
public Doctor(int doctorId, String doctorName, int patientAssigned, double salaryPerMonth)
{
// Parameterized Constructor
 this. doctorId = doctorId;
 this. doctorName = doctorName;
 this. patientAssigned = patientAssigned;
 this. salaryPerMonth = salaryPerMonth; 
}
// Getter method
public int getDoctorId () {
    return doctorId;
}
public String getDoctorName () {
    return doctorName;
}
public int getPatientAssigned () {
    return patientAssigned;
}
public double getSalaryPerMonth () {
    return salaryPerMonth;
}
// Setter method
public void setDoctorId (int doctorId) {
    this. doctorId = doctorId;
}
public void setDoctorName (String doctorName) {
    this. doctorName = doctorName;
}
public void setPatientAssigned (int patientAssigned) {
    this. patientAssigned = patientAssigned;
}
public void setSalaryPerMonth (double salaryPerMonth) {
    this. salaryPerMonth = salaryPerMonth;
}
    
public double totalPrice()
{
    return salaryPerMonth * 12;
}
}
