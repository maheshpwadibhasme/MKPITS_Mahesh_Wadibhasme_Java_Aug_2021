import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main6 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        Vehicle6 vob1=new Vehicle6();
        vob1.setVname("Tata motor");

        User6 uob1=new User6();
        uob1.setUname("mahesh");
        uob1.setVeh(vob1);

        entityManager.getTransaction().begin();

        entityManager.persist(uob1);
        entityManager.persist(vob1);

        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}
