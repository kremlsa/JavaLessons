class Item {
    @Deprecated
    public static final int maxItems = 100;
    public static int inStock = 19;

    private String name;
    protected int basePrice;

    public Item(String name, int basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return (int) (basePrice * getMarkUp());
    }

    public boolean haveSuchAmount(@Deprecated int amount) {
        return inStock >= amount;
    }

    @Deprecated
    protected double getMarkUp() {
        double markUp = 0.1;
        // ... connecting to the remote server
        return 1 + markUp;
    }

    @Override
    public String toString() {
        return getName() + " " + getPrice();
    }
}