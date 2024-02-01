package muralimlab02;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author S572792
 */
public class Visitor {
    // Private member variables to store visitor information
    private String visitorName;
    private int patientId;
    private String visitDay;
    private int visitHours;
    // Default constructor initializing member variables with default values
    public Visitor()
    {
        visitorName = "Unknown";
        patientId = 1;
        visitDay = "Unknown";
        visitHours = 1;
    }
    /**
     * Parameterized constructor to initialize Visitor with specific values.
     * 
     * @param visitorName The name of the visitor.
     * @param patientId The ID of the patient being visited.
     * @param visitDay The day of the visit.
     * @param visitHours The duration of the visit in hours.
     */
    public Visitor(String visitorName, int patientId, String visitDay, int visitHours)
    {
        this.patientId = patientId;
        this.visitorName = visitorName;
        this.visitDay = visitDay;
        this.visitHours = visitHours;
    }
 
    // Getter and setter methods for accessing and modifying member variables
    public String getVisitorName() {
        return visitorName;
    }
 
    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }
 
    public int getPatientId() {
        return patientId;
    }
 
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
 
    public String getVisitDay() {
        return visitDay;
    }
 
    public void setVisitDay(String visitDay) {
        this.visitDay = visitDay;
    }
 
    public int getVisitHours() {
        return visitHours;
    }
 
    public void setVisitHours(int visitHours) {
        this.visitHours = visitHours;
    } 
    /**
     * Displays information about the visitor's visit.
     */
    public void displayHours()
    {
        System.out.println(visitorName + " has visited the patient with patient Id " 
                           + patientId + " for " + visitHours + " hours");
    }
}