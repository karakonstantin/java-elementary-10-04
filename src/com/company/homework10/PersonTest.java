package com.company.homework10;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("Rodion");
        Person.Account personAccount = person.new Account("Hello World");

        System.out.println(personAccount.Password);

        System.out.println(personAccount.AccountDisplayOfPerson() + "'s " + " name");
    }
}
