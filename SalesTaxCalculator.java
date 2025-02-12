public class SalesTaxCalculator {

    public static void main(String[] args) {
        // Check if two command-line arguments are provided
        if (args.length != 2) {
            System.out.println("Error: Please provide exactly two arguments: the state name and the sale amount.");
            return;
        }

        // Extract the command-line arguments
        String stateName = args[0];
        String saleAmountStr = args[1];

        try {
            // Read the sale amount to a floating point value
            double value = Double.parseDouble(saleAmountStr);

            // State and Tax
            State state;
            if (stateName.equalsIgnoreCase("Indiana")) {
                state = new State("Indiana", new SevenPercent());
            } else if (stateName.equalsIgnoreCase("Alaska")) {
                state = new State("Alaska", new NoTax());
            } else if (stateName.equalsIgnoreCase("Hawaii")){
                state = new State("Hawaii", new FourPointFivePercent());
            } else {
                System.out.println("Please enter Indiana, Alaska, or Hawaii only");
                return;
            }

            // Calculate the sales tax
            double salesTax = state.showTax(value);

            // Formatting for output
            System.out.printf("The sales tax on $%.2f in %s is $%.2f.%n", value, state.getName(), salesTax);

        } catch (NumberFormatException e) {
            // incorrect inputs
            System.out.println("Error: Sale amount must be a valid number.");
        }
    }
}
