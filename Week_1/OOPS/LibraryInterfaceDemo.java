public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        // Test cases for KidUser
        KidUser kid1 = new KidUser() {};
        kid1.age = 10;
        kid1.registerAccount();

        KidUser kid2 = new KidUser() {};
        kid2.age = 18;
        kid2.registerAccount();

        KidUser kid3 = new KidUser() {};
        kid3.bookType = "Kids";
        kid3.requestBook();

        KidUser kid4 = new KidUser() {};
        kid4.bookType = "Fiction";
        kid4.requestBook();

        // Test cases for AdultUser
        AdultUser adult1 = new AdultUser() {};
        adult1.age = 5;
        adult1.registerAccount();

        AdultUser adult2 = new AdultUser() {};
        adult2.age = 23;
        adult2.registerAccount();

        AdultUser adult3 = new AdultUser() {};
        adult3.bookType = "Kids";
        adult3.requestBook();

        AdultUser adult4 = new AdultUser() {};
        adult4.bookType = "Fiction";
        adult4.requestBook();
    }
}