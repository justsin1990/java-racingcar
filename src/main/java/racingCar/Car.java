package racingCar;

import java.util.Random;

import static racingCar.RacingCarConfiguration.MAX_RANDOM_VALUE;
import static racingCar.RacingCarConfiguration.LIMIT_RANDOM_VALUE;

public class Car {
    private String name;
    private StringBuilder position = new StringBuilder();
    private int positionNumber;
    private Random random = new Random();

    public Car (String name) {
        this.name = name;
        this.positionNumber = 0;
    }

    public void step() {
        if(random.nextInt(MAX_RANDOM_VALUE.getValue()) >= LIMIT_RANDOM_VALUE.getValue())
        {
            positionNumber++;
            position.append("-");
        }
    }
    public RacingMember getMyNamePosition()
    {
        return new RacingMember(name, positionNumber);
    }

    public void printPosition() {
        System.out.println(this.name+" : "+position);
    }
    public int myPosition() {
        return position.length();
    }
    public String amIWinner(int maxPosition) {
        if(this.position.length() < maxPosition)
            return null;
        return this.name;
    }
}
