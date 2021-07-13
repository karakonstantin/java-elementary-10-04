package com.company.homework10;

public class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public class Account {
        public String Password;

        public Account(String password) {
            this.Password = password;
        }
        public String AccountDisplayOfPerson(){
            return Person.this.name;
        }
    }
}
