interface StreamingService {

    void streamMovie();

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription: Premium");
    }
}

interface GamingService {

    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription: Gold");
    }
}

class SmartTV implements StreamingService, GamingService {

    public void streamMovie() {
        System.out.println("Streaming movie...");
    }

    public void playGame() {
        System.out.println("Playing game...");
    }

    // Resolve default method conflict
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }

    public static void main(String[] args) {

        String movies[] = {
                "Avengers",
                "Bahubali",
                "Interstellar"
        };

        String games[] = {
                "FIFA",
                "PUBG",
                "Minecraft"
        };

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();

        System.out.println("\nMovies:");
        for (String movie : movies)
            System.out.println(movie);

        System.out.println("\nGames:");
        for (String game : games)
            System.out.println(game);

        tv.streamMovie();
        tv.playGame();
    }
}