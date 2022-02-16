import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main6_1 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        Vehicle6_1 vob1=new Vehicle6_1();
        vob1.setVname("Tata motor");

        Vehicle6_1 vob2=new Vehicle6_1();
        vob2.setVname("Mahindra");

        User6_1 uob1=new User6_1();
        uob1.setUname("mahesh");

        uob1.getVeh().add(vob1);
        uob1.getVeh().add(vob2);

        //vehicle add user
        vob1.setUbo(uob1);
        vob2.setUbo(uob1);

        entityManager.getTransaction().begin();

        entityManager.persist(uob1);
        entityManager.persist(vob1);
        entityManager.persist(vob2);

        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}
