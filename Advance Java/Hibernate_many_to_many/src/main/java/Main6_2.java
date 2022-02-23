import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main6_2 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();

        System.out.println("Starting Transaction");

        Vehicle6_2 vob1=new Vehicle6_2();
        vob1.setVname("Tata");
        Vehicle6_2 vob2=new Vehicle6_2();
        vob2.setVname("Mahindra");

        User6_2 uob1=new User6_2();
        uob1.setUname("Mahesh");
        User6_2 uob2=new User6_2();
        uob2.setUname("Saurabh");

        //user add vehicle
        uob1.getVob().add(vob1);
        uob1.getVob().add(vob2);

        uob2.getVob().add(vob1);
        uob2.getVob().add(vob2);

        //vehicle add user
        vob1.getUob().add(uob1);
        vob1.getUob().add(uob2);

        vob2.getUob().add(uob1);
        vob2.getUob().add(uob2);

        entityManager.getTransaction().begin();
        //save user data
        entityManager.persist(uob1);
        entityManager.persist(uob2);

        //save vehicle data
        entityManager.persist(vob1);
        entityManager.persist(vob2);

        System.out.println("Saving to database");
        //entityManager.persist();
        entityManager.getTransaction().commit();

        //close the entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}
