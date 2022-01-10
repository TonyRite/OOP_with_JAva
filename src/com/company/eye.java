package com.company;

public class eye extends organs{

    private String colour;
  private boolean isOpen;

    public eye(String name, String medicalCondition, String colour, boolean isOpen) {
        super(name, medicalCondition);
        this.colour = colour;
        this.isOpen = isOpen;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: " + getColour());
    }
    public  void open (){
        this.setOpen(true);
      System.out.println(this.getName() + " opened");
    }
    public  void close (){
        this.setOpen(false);
        System.out.println(this.getName() + " closed");
    }
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
