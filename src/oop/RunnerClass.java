package oop;

import oop.Enums.Gender;
import oop.encapsulation.Role;
import oop.encapsulation.User;

public class RunnerClass {

    public static void main(String[] args) {
        //*******OOP-Encapsulation*******//
        User user1 = new User((long) 1, "Tom","Vickery",45, Gender.FEMALE,new Role((long) 1,"Developer"));
        System.out.println(user1.getFirstName());





        //*******OOP-Inheritance*******//






        //*******OOP-Interface-Abstraction*******//






        //*******OOP-Polymorphism*******//
    }

}
