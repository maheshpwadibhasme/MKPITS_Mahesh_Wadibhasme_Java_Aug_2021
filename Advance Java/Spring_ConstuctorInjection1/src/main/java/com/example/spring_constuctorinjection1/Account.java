package com.example.spring_constuctorinjection1;

public class Account {
    Employee eob;

    public Account(Employee eob) {
        this.eob = eob;
    }

    public Employee getEob() {
        return eob;
    }

    void trans(){
        System.out.println(eob.getName()+" Transaction process by"+eob.getId()+" Successfully"  );
    }
}
