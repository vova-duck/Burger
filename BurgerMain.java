package HomeWork11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BurgerMain<burgers> {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        ArrayList<Burger> burgers = new ArrayList<>();

        String input;
        while (!(input = reader.readLine()).equals("exit")) {
            Burger burger;
            switch (input) {
                case "Low calories burger", "burger without souse", "low calories burger" -> {
                    System.out.println();
                    burger = new LowCaloriesBurger();
                    System.out.println(burger);
                    burgers.add(burger);
                }
                case "Basic burger", "burger", "basic burger" -> {
                    System.out.println();
                    burger = new BasicBurger();
                    System.out.println(burger);
                    burgers.add(burger);
                }
                case "Double burger", "double burger" -> {
                    System.out.println();
                    burger = new DoubleBurger();
                    System.out.println(burger);
                    burgers.add(burger);
                }
                default -> System.out.println("We don`t cook this type of burger, but we will work on our menu ");
            }

        }

        System.out.println(burgers.get(0));
        System.out.println(burgers.get(1));
        System.out.println(burgers.get(2));
    }
}

       
