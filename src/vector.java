import java.util.Vector;

public class vector {
    public static void main(String[] args){

        Vector<String> mammals = new Vector<>();
        mammals.add("Dog");
        mammals.add("Horse");
        mammals.add(2, "Cat");

        System.out.println("Vector mammals: " + mammals);

        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");

        System.out.println("Vector animals: " + animals);

        // Add all mammals to animals
        animals.addAll(mammals);

        System.out.println("After addAll(): " + animals);
    }
}