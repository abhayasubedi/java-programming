package tutorial4;
import java.util.*;
public class array8 {
    public static void main(String[] args) {
        List cars= new ArrayList<>();
        cars.add("Rolls Royce");
        cars.add("Range Rover");
        cars.add("Tesla");
        cars.add("Mustang");
        System.out.println("unsorted List of cars:"+ cars);
        Collections.sort(cars);
        System.out.println("Sorted List of cars:"+ cars);

    }
}
