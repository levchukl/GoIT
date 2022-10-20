package hw5.calculator;

public class MercuryBeat extends Spaceport{
    @Override
    public int calculateTotalPrice(int passengerCount) {
        return 15*passengerCount;
    }
}
