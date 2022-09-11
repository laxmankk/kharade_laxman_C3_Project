import java.time.LocalTime;

public class RestuarantMain {
    public static void main(String[] args) {
        RestaurantService service  = new RestaurantService();
        Restaurant restaurant;
        LocalTime openingTime = LocalTime.parse("10:30:00");
        LocalTime closingTime = LocalTime.parse("22:00:00");
        restaurant = service.addRestaurant("Amelie's cafe", "Chennai", openingTime, closingTime);
        restaurant.addToMenu("Sweet corn soup", 119);
        restaurant.addToMenu("Vegetable lasagne", 269);

        try {
            Restaurant res1 = service.findRestaurantByName("Amelie's cafe");
            res1.displayDetails();

            Restaurant res2 = service.findRestaurantByName("Coffe Day");
            res2.displayDetails();
        } catch (RestaurantNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}