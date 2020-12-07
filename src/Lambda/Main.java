package Lambda;
public class Main {
    
    public static void main( String[] args ) {

        // объявление ссылки на MyInterface
        MyInterface ref;

        // лямбда-выражение
        ref = () -> 3.1415;

        System.out.println("Value of Pi = " + ref.getPiValue());
        }
}
