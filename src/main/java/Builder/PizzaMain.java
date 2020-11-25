package Builder;

public class PizzaMain {
    public static void main(String[] args) {
        Pizza margarita = new Pizza.PizzaBuilder("Margarita",30)
                .addCheese(true).addSauce(true).isTakeaway(false).build();

        System.out.println(margarita.toString());

        Pizza hawai = new Pizza.PizzaBuilder("Hawai",20)
                .addCheese(true).addSauce(false).isTakeaway(true).build();

        System.out.println(hawai);
    }
}
