package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public ArrayList list = new ArrayList();
    public  void setList(){
        list.add("Привет");
        list.add("Обучающимся");
        list.add("На");
        list.add("JavaRush");
    }

    public void go(){
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setList();
        main.go();


    }
}
