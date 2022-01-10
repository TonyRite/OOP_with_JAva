package com.company;

public class stomach extends organs {
    private boolean isEmpty;

    public stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }

    public void digest(){
        System.out.println("digesting....");
    }
    @Override
    public void getDetails() {
        super.getDetails();

        if(isEmpty){
            System.out.println("needs to be fed");
        }else{
            System.out.println("Is full");
        }
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
