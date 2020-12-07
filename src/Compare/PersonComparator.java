package Compare;

import java.util.Comparator;

class PersonComparator implements Comparator<PersonCompar> {

    public int compare(PersonCompar a, PersonCompar b){

        return a.getName().compareTo(b.getName());
    }
}