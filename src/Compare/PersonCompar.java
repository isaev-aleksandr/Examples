package Compare;

class PersonCompar implements Comparable<PersonCompar>{

    private String name;
    PersonCompar(String name){

        this.name = name;
    }
    public String getName(){return name;}

    @Override
    public int compareTo(PersonCompar p){
        if (name.length() == p.name.length()){
            return -1;
        }
        return name.length()-p.name.length();
    }
}

