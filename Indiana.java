class Indiana implements SalesTaxBehavior {
    @Override
    public double compute(double value) {
        return value * 0.07; //Applies 7 percent tax only for Indiana
    }
}