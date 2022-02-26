package StaticKeyWord;

public class Main {
    public static void main(String[] args) {
      Friend friend1 = new Friend("Pedro");
      Friend friend2 = new Friend("Juan");

      Friend.printNumberOfFriends();
        System.out.println(Friend.numberOfFriends);
    }
}
