package com.company;

public class bicycle {
   private int gear= 0;

    public void braking(){
        System.out.println("break works");
    }
    void changeGear(int newValue) {
        gear = newValue;
        System.out.println("Gear:" +gear);
    }

}



