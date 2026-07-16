interface TextModeration {

    void checkText(String post);

    default void displayModerationPolicy() {
        System.out.println("No offensive language allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        return post.contains("bad") || post.contains("hate");
    }
}

interface SpamDetection {

    void checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Spam content is not allowed.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    public void checkText(String post) {
        if (TextModeration.containsRestrictedWords(post))
            System.out.println("Offensive Post");
    }

    public void checkSpam(String post) {
        if (post.contains("buy now") || post.contains("click"))
            System.out.println("Spam Post");
    }

    // Resolve default method conflict
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }

    public static void main(String[] args) {

        String posts[] = {
                "Hello everyone",
                "buy now and win prize",
                "I hate this",
                "Have a nice day"
        };

        ContentModerator obj = new ContentModerator();

        obj.displayModerationPolicy();

        System.out.println();

        for (String post : posts) {

            System.out.println("Post: " + post);

            if (post.contains("buy now") || post.contains("click")) {
                System.out.println("Spam Post");
            } else if (TextModeration.containsRestrictedWords(post)) {
                System.out.println("Offensive Post");
            } else {
                System.out.println("Valid Post");
            }

            System.out.println();
        }
    }
}