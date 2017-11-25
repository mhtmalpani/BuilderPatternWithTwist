package correct;

public class Main {

    public static void main(String[] args) {

        Subway subwayVegetarian = Subway.builder().bread("Wheat")
                .toast(true)
                .veg()
                .olives().tomato().onion()
                .prepare()
                .cheese("Mozzarella")
                .build();

        Subway subwayNonVegChicken = Subway.builder().bread("Parmesan Oregano")
                .toast(false)
                .nonVeg()
                .chicken()
                .olives().tomato()
                .prepare()
                .cheese("Cheddar")
                .build();

        Subway subwayNonVegMutton = Subway.builder().bread("Italian White")
                .toast(true)
                .nonVeg()
                .mutton()
                .tomato().onion()
                .prepare()
                .build();

        System.out.println("Vegetarian correct.Subway: " + subwayVegetarian.toString());
        System.out.println("Chicken correct.Subway: " + subwayNonVegChicken.toString());
        System.out.println("Mutton correct.Subway: " + subwayNonVegMutton.toString());
    }
}
