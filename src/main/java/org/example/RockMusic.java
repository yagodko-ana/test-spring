package org.example;

public class RockMusic implements Music{
    public void doMyInit(){
        System.out.println("Doing my initialization (prototype)");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction (prototype)");
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
