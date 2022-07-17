package chap2.item2;

public class Item2 {
    private final String name;
    private final int price;
    private final double discount;

    public static class Builder {
        // required
        private final String name;
        private final int price;
        // optional
        private double discount = -1.0;

        public Builder(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public Builder setDiscount(double discount) {
            if (0 < discount && discount < 1) {
                this.discount = discount;
                return this;
            } else {
                throw new Error("The argument 'discount' must be in (0, 1.0)");
            }
        }

        public Item2 build() {
            return new Item2(this);
        }
    }

    private Item2(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.discount = builder.discount;
    }

    public void describe() {
        System.out.println("name: " + this.name + ", price: " + this.price + ", discount: " + this.discount);
    }
}
