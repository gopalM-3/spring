package com.apollo.beans;

public class Owner {

    private Dog dog;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String toString() {
        return "Owner{" +
                "dog=" + dog +
                '}';
    }

}
