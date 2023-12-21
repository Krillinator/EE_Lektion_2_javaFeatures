package com.kristoffer.demo;

public class StudentExample {

    private final String name;
    private final Integer age;
    private final Boolean isTired;

    public StudentExample(String name, Integer age, Boolean isTired) {
        this.name = name;
        this.age = age;
        this.isTired = isTired;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getTired() {
        return isTired;
    }

    @Override
    public String toString() {
        return "StudentExample{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isTired=" + isTired +
                '}';
    }
}
