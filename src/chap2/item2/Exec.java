package chap2.item2;

public class Exec {
    public static void main(String[] args) {
        Item2 item2 = new Item2.Builder("item2", 500).setDiscount(0.2).build();
        item2.describe();
    }
}
