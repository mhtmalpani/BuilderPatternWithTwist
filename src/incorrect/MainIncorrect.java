package incorrect;

public class MainIncorrect {

    public static void main(String[] args) {

        SubwayIncorrect subway = SubwayIncorrect.builder()
                .bread("Wheat")
                .toast("Grilled")
                .cheese("Mozzarella")
                .onion()
                .build();
    }
}
