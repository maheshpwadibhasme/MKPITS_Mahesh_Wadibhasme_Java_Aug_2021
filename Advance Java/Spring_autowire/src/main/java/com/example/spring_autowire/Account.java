package com.example.spring_autowire;

public class Account {
    Employee emp;

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    void Trans(){
        System.out.println(emp.getName()+"Transaction process by "+emp.getId()+ "Successfully");
    }
}
