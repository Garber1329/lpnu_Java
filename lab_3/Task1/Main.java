package com.company.Task1;


public class Main {

    public static void main(String[] args) {

        User obj = new User("Ivan", "Ivanov", 15, "0000000000", new Address("Ivanova 19"));
        System.out.println(obj.toString());

        try {
            obj.validate();
        } catch (FieldsAreIncorrect e) {
            System.out.println(e.getMessage());
        }

        System.out.println(obj.toString());
    }
}
