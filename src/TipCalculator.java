public class TipCalculator {
    private int numPeople;
    private double tipPercent;
    private double noTipBill;

    // Constructor
    public TipCalculator(int numPeople, double tipPercent) {
        this.numPeople = numPeople;
        this.tipPercent = tipPercent;
        noTipBill = 0.0;
    }

    // Getter methods
    public double getNoTipBill() {
       return noTipBill;
    }

    public double getTipPercent() {
        return tipPercent;
    }

    // Method to get noTipBill
    public void addMeal(double dishCost) {
            if (dishCost >= 0) {
                noTipBill += dishCost;
            }
        }

    // Calculation methods
    public double totalTip() {
        return .01 * tipPercent * noTipBill;
    }

    public double totalBill() {
        return totalTip() + noTipBill;
    }

    public double perPersonNoTip() {
        return noTipBill / numPeople;
    }

    public double perPersonTip() {
        return totalTip() / numPeople;
    }

    public double perPersonBill() {
        return totalBill() / numPeople;
    }

}
