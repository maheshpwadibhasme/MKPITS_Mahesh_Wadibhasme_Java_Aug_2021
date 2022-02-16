import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceProperty;

public class main2 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();

        Address2 add=new Address2();
        add.setPin2(444);
        add.setCity2("ngp");
        add.setState2("MH");

        Address2 add2=new Address2();
        add.setPin2(420);
        add.setCity2("gps");
        add.setState2("up");

        Emp2 emp2=new Emp2();
        emp2.setName2("mahesh");
        emp2.setEmail2("m@gmail.com");
        emp2.setOffice_adr2(add);
        emp2.setHome_adr2(add2);

        System.out.println("Saving Employee to Database");

        entityManager.persist(emp2);

        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();




    }
}
