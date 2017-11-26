package improvised;

public class MainImprovised {

    public static void main(String[] args) {

        SubwayImprovised subway = SubwayImprovised.builder("Wheat", "Grilled")
                .cheese("Mozzarella")
                .onion()
                .build();
    }
}
