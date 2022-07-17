package chap2.item1;

public class Exec {
    public static void main(String[] args) {
        Item1 item1 = Item1.getInstanceWithName("hogehoge");
        System.out.println(item1.getName());
    }
}
