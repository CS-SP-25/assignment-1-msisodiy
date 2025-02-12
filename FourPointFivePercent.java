class FourPointFivePercent implements SalesTaxBehavior {
    @Override
    public double compute(double value) {
        return value * 0.045; //Applies 4.5 percent tax only for Indiana
    }
}
