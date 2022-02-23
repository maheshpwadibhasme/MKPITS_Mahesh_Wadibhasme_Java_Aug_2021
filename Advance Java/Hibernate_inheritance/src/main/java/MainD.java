import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainD {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();

        System.out.println("Starting Transaction");
        Driver drv=new Driver();
        drv.setDr_name("Driver");

        Bike b=new Bike();
        b.setDr_name("honda bike");
        b.setStrhandle("has a handle");

        Car c=new Car();
        c.setDr_name("Tata car");
        c.setStrwheel("has a staring wheel ");

        entityManager.getTransaction().begin();
        //entityManager.persist(drv);
        entityManager.persist(b);
        entityManager.persist(c);

        System.out.println("Saving table to database");
//        entityManager.persist();
        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}
