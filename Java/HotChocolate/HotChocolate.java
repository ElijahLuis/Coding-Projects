package hotchocolate;

import java.util.concurrent.TimeUnit;

public class HotChocolate {
    // prevent hot chocolate from being too hot or too cold!
    // ideal temp is 160 deg F to 185 deg F, but creates scald burns lol

    public static final double tooHot = 185; // final means will never change
    public static final double tooCold = 160;

    public static void drinkHotChocolate(double cocoaTemp) throws TooHotException,
            TooColdException {
        if (cocoaTemp >= tooHot) {
            throw new TooHotException();
        } else if (cocoaTemp <= tooCold) {
            throw new TooColdException();
        }

    }

    public static void main(String[] args) throws TooHotException,
            TooColdException, InterruptedException {
        double currentCocoaTemp = 150; // cocoa temperature
        boolean isWrongTemp = true;
        while (isWrongTemp) {
            try {
                drinkHotChocolate(currentCocoaTemp);
                System.out.println("That cocoa was good!");
                isWrongTemp = false;
                } catch(TooHotException e1) {
                System.out.println("WAY TOO FUCKIN' HOT!");
                currentCocoaTemp = currentCocoaTemp - 5;
                } catch(TooColdException e2) {
            System.out.println("Brrr, freezing cold bitch!");
            currentCocoaTemp = currentCocoaTemp + 5;
        }
            TimeUnit.SECONDS.sleep(2); // must add InterruptedException from import error
    }
            System.out.println("And it's gone.");
    }
}
