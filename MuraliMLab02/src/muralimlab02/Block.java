package muralimlab02;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author S572792
 */
public class Block {
     // Attributes
    private int blockId;
    private String blockName;
    private String dean;

    // No-argument constructor
    public Block() {
        blockId = 1;
        blockName = "Unknown";
        dean = "Unknown";
    }

    // Parameterized constructor
    public Block(int blockId, String blockName, String dean) {
        this.blockId = blockId;
        this.blockName = blockName;
        this.dean = dean;
    }
    // Getter methods
    public int getBlockId() 
    {
        return blockId;
    }
    public String getBlockName() 
    {
        return blockName;
    }
    //Setter methods
    public void setBlockId(int blockId) {
        this.blockId = blockId;
    }
    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public String getDean() 
    {
        return dean;
    }

    public void setDean(String dean) 
    {
        this.dean = dean;
    }
 // Method to display the dean's name
    public void displayDean() 
    {
        System.out.println("Dean of " + blockName + " " + dean);
}

}
