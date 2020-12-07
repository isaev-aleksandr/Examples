package Compare;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static TreeSet<PersonCompar> personThreeSeе;
    public static void set() {
        personThreeSeе = new TreeSet<PersonCompar>();
        personThreeSeе.add(new PersonCompar("Tom"));
        personThreeSeе.add(new PersonCompar("Bill"));
        personThreeSeе.add(new PersonCompar("Jack"));
        personThreeSeе.add(new PersonCompar("Le"));
    }

    public static void main(String[] args) {
        ///////Comparable
        set();
        Iterator<PersonCompar> iterator = personThreeSeе.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getName()+ "+");
        }
        ///////Comparator
        PersonComparator pcomp = new PersonComparator();
        TreeSet<PersonCompar> people = new TreeSet<PersonCompar>(pcomp);
        people.add(new PersonCompar("Tom"));
        people.add(new PersonCompar("Nick"));
        people.add(new PersonCompar("Alice"));
        people.add(new PersonCompar("Bill"));
        for(PersonCompar p : people){
            System.out.println(p.getName());
        }
    }
}