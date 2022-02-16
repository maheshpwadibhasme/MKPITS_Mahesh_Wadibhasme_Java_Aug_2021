import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceProperty;

public class main4 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();

        Address4 add=new Address4();
        add.setPin2(444);
        add.setCity2("ngp");
        add.setState2("MH");

        Address4 add2=new Address4();
        add2.setPin2(888);
        add2.setCity2("ngp2");
        add2.setState2("UP");

        emp4 emp=new emp4();
        emp.setName2("mahesh");
        emp.setEmail2("m@gmail.com");

        emp.getAdr2().add(add);
        emp.getAdr2().add(add2);

        System.out.println("Saving Employee to Database");

        entityManager.persist(emp);

        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();




    }
}
