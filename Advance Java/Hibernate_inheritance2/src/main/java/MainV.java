import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainV {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();

        System.out.println("Starting Transaction");
        Vehicle2 veh=new Vehicle2();
        veh.setVname("veh");

        TwoWheel tw=new TwoWheel();
        tw.setVname("Honda");
        tw.setSthandle("has a handle");

        FourWheel fw=new FourWheel();
        fw.setVname("TATA");
        fw.setStwheel("has a staring wheel");

        entityManager.getTransaction().begin();
        //entityManager.persist(drv);
        entityManager.persist(tw);
        entityManager.persist(fw);

        System.out.println("Saving table to database");
//        entityManager.persist();
        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}
