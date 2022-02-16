import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();

        Address add=new Address();
        add.setPincode2(444);
        add.setCity2("ngp");
        add.setState2("MH");

        Emp emp2=new Emp();
        emp2.setName("mahesh");
        emp2.setEmail("m@gmail.com");
        emp2.setAdr(add);

        Address add2=new Address();
        add2.setPincode2(4442);
        add2.setCity2("ngp2");
        add2.setState2("MH2");

        Emp emp3=new Emp();
        emp3.setName("mahesh2");
        emp3.setEmail("m2@gmail.com");
        emp3.setAdr(add2);

        System.out.println("Saving Employee to Database");

        entityManager.persist(emp2);
        entityManager.persist(emp3);

        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();




    }
}
