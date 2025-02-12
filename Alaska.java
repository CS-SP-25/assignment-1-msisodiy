class Alaska implements SalesTaxBehavior {
    @Override
    public double compute(double value) {
        return 0.0; // Returns 0.0 because no tax for Alaska only
    }
}