package com.learnDependencyInjection.dependencyInjection;

public class Person {
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString(){
        return (
                " name : "+this.name+
                " age : "+this.age
                );
    }
}
