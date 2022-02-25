package com.example.spring_dependencyinjection1;

public class Account {
    Employee eob;

    public Employee getEob() {
        return eob;
    }

    public void setEob(Employee eob) {
        this.eob = eob;
    }
    void trans(){
        System.out.println(eob.getName()+"Transaction proccess by"+eob.getId()+"Successfully");
    }
}
