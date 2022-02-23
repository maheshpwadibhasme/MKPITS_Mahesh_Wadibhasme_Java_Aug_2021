import org.hibernate.Query;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class MainV3 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");
        Vehicle3 veh=new Vehicle3();
        veh.setVname("Vehicle");

        Twowheel3 t=new Twowheel3();
        t.setVname("hero honda");
        t.setSthandle("has a handle");

        Fourwheel3 f=new Fourwheel3();
        f.setVname("TATA");
        f.setStwheel("has wheel staring");

        entityManager.getTransaction().begin();

        Query query = (Query) entityManager.createQuery("from Vehicle3 where vid=:Id");
        query.setInteger("Id",2);
        List<Vehicle3> list = query.list();
//        for (Vehicle3 ob:list) {
//            System.out.println(ob.getVname());
//        }

        System.out.println(list.size());

//        entityManager.persist(veh);
//        entityManager.persist(t);
//        entityManager.persist(f);

        System.out.println("Saving table to database");

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
