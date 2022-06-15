package task2;

public class RunClass {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add(93799929, "Bredin");
        phoneBook.add(97841265, "Bredin");
        phoneBook.add(88755535, "Makaryn");
        phoneBook.add(73731457, "Makarov");
        phoneBook.add(78451367, "Makarov");
        phoneBook.add(78451141, "Makarov");
        phoneBook.add(75451398, "Pomogaybo");

        phoneBook.get("Bredin");
        phoneBook.get("Makaryn");
        phoneBook.get("Makarov");
        phoneBook.get("Pomogaybo");
        phoneBook.get("789456");
        phoneBook.get("Nepeivoda");
    }
}
