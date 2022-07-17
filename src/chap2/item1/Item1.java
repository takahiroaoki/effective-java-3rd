package chap2.item1;

public class Item1 {
    private String name;

    private Item1() {
    }

    public static Item1 getInstanceWithName(String name) {
        return new Item1().setName(name);
    }

    public String getName() {
        return this.name;
    }

    public Item1 setName(String name) {
        this.name = name;
        return this;
    }
}
