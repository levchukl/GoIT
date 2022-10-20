package hw5.calculator;

public class JupiterStar extends Spaceport {

    @Override
    public int calculateTotalPrice(int passengerCount) {

        return 500+2*passengerCount;
    }
}
