package com.example.spring_jdbc2.Dao;

import com.example.spring_jdbc2.Stud;

public interface StudDao {
    public void insert(Stud sob);

    public void Update(Stud sob);

    public void delete(Stud sob);

    public  void displaybyid(int id);

    public void displayAll();
}
