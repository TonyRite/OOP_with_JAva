package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	patient Patient = new patient("Brad",28,
            new eye("Left eye","short sighted","blue",true),
            new eye("right eye","normal","Blue",true),
            new heart("Heart","Normal",65),
            new stomach("Stomach","PUB",false),
            new skin("Skin","Burned","white",40));
        System.out.println("Name: "+ Patient.getName());
        System.out.println("Age: "+ Patient.getAge());

        Scanner scanner =new Scanner(System.in);
        boolean shouldFinish = false;
        while (!shouldFinish) {
            System.out.println("Choose an Organ:"+
                    "\n\t1. Left Eye"+
                    "\n\t2. Right Eye"+
                    "\n\t3. Heart"+
                    "\n\t4. Stomach"+
                    "\n\t5. Skin"+
                    "\n\t6. Quit");

            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    Patient.getLefteye().getDetails();
                    if(Patient.getLefteye().isOpen()){
                        System.out.println("\t\t1. close eye");
                        if (scanner.nextInt() == 1){
                            Patient.getLefteye().close();
                        }else{
                            continue;
                        }
                    }else {
                        System.out.println("\t\t1. open the Eye");
                        if(scanner.nextInt() == 1) {
                            Patient.getLefteye().open();
                        }else{
                            continue;
                        }
                    }

                    break;

                case 2:
                    Patient.getRighteye().getDetails();
                    if(Patient.getRighteye().isOpen()){
                        System.out.println("\t\t1. close eye");
                        if (scanner.nextInt() == 1){
                            Patient.getRighteye().close();
                        }else{
                            continue;
                        }
                    }else {
                        System.out.println("\t\t1. open the Eye");
                        if(scanner.nextInt() == 1) {
                            Patient.getRighteye().open();
                        }else{
                            continue;
                        }
                    }
                    break;
                case 3:
                   Patient.getHeart().getDetails();
                      System.out.println("\t\t1. Change the heart rate");
                        if (scanner.nextInt()==1){
                            System.out.println("Enter the new Heart rate: ");
                            int newHeartRate = scanner.nextInt();
                            Patient.getHeart().setRate(newHeartRate);
                            System.out.println("Heart rate changed to : "+ Patient.getHeart().getRate());
                        }else{
                            continue;
                        }
                        break;
                case 4:
                    Patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");
                    if(scanner.nextInt() ==1 ){
                        Patient.getStomach().digest();
                    }else{
                        continue;
                    }
                    break;

                case 5:
                    Patient.getSkin().getDetails();
                    System.out.println("\t\t1. Change the skin softness");
                    if (scanner.nextInt()==1){
                        System.out.println("Enter the new skin softness : ");
                        int newSoft = scanner.nextInt();
                        Patient.getSkin().setSoftness(newSoft);
                        System.out.println("Skin softness changed to  : "+ Patient.getSkin().getSoftness());
                    }else{
                        continue;
                    }
                    break;

                default:
                    shouldFinish = true;
                    break;


            }
        }

    }

}
