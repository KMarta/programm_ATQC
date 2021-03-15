package Basic;

import java.util.ArrayList;

// SUBTASK 5.1 : Use  get, add, remove elements for list structures
public class Task5 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add( "Paris");  //  use the add() method to add elements to the ArrayList
        cities.add( "London");
        cities.add( "Kyiv");
        cities.add( "Lviv" );
        cities.set(1, "Praga");  // To modify an element, use the set() method and refer to the index number
        cities.remove(2);  //  remove an element, use the remove() method and refer to the index number
        System.out.println(cities);
        System.out.println(cities.get(2)); // use the get() method and refer to the index number, to access an element in the ArrayList

    }

}
