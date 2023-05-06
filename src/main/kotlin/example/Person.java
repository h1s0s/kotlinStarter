package example;

import org.jetbrains.annotations.Nullable;

public class Person {
     private final String name;
     private int age;

     public Person(String name){
         this.name = name;
     }
     public Person(String name, int age){
         this.name = name;
         this.age = age;
     }

     @Nullable
    public String getName(){
         return name;
     }
}
