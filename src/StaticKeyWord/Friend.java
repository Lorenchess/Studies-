package StaticKeyWord;

public class Friend {
    private String name;
    public static int numberOfFriends;

    public Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    public static void printNumberOfFriends() {
        System.out.println("You have "+ numberOfFriends + " friends.");
    }
}
