package com.kristoffer.demo.sealedExamples;

// Final        = will not be able to extend nor implement in the future
// non-sealed   = we CAN implement and extend in the future
// sealed       = we CAN implement and extend, but only the permitted
public final class Cat implements Animal {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void talk() {

    }
}
