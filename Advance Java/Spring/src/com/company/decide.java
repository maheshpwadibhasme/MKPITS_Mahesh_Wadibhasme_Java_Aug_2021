package com.company;

public class decide {
    void checkob(Account ob){
        if(ob instanceof Current){
            Current ob1=(Current) ob;
            ob1.withdraw();
            ob1.odFacility();
        }
        if(ob instanceof Saving){
            Saving sob= (Saving) ob;
            sob.withdraw();
        }
    }
}
