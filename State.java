class State {
    private String name;
    private SalesTaxBehavior taxBehavior;

    public State(String name, SalesTaxBehavior taxBehavior) {
        this.name = name;
        this.taxBehavior = taxBehavior;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double showTax(double value) {
        return taxBehavior.compute(value);
    }
}