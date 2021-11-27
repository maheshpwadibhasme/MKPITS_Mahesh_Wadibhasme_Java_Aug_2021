import java.util.*;
import java.util.AbstractCollection;
  
public class GFG {
    public static void main(String[] args)
    {
        // Create an empty collection
        AbstractCollection<Object>
            abs = new ArrayList<Object>();
  
        // Use add() method to add
        // elements in the collection
        abs.add("Welcome");
        abs.add("To");
        abs.add("mkpits");
        abs.add("software");
        abs.add("solutions");
  
        // Displaying the Collection
        System.out.println("AbstractCollection: "
                           + abs);
    }
}
