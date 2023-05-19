package org.example;

public class ClassicalMusic implements Music{
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialization (singleton)");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction (singleton)");
    }

    @Override
    public String getSong() {
        return "Hun Rhapsody";
    }
}
