package org.example.spring;

public class ClassicalMusic implements Music {

    public void myInitMethod () {
        System.out.println("doing initialization");
    }

    public void myDeleteMethod () {
        System.out.println("doing destroy");
    }

    private ClassicalMusic () {} // запрещаем создание экземпляра класа извне

    public static ClassicalMusic getClassicalMusic () {
        return new ClassicalMusic();
    }


    @Override
    public String getSong() {
        return "Polka";
    }



}
