import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class main01 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();

        Addres01 add=new Addres01();
        add.setPincode2(444);
        add.setCity2("ngp");
        add.setState2("MH");

        emp01 emp2=new emp01();
        emp2.setName2("mahesh");
        emp2.setEmail2("m@gmail.com");
        emp2.setAob(add);

        System.out.println("Saving Employee to Database");

        entityManager.persist(emp2);
        entityManager.persist(add);

        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();




    }
}