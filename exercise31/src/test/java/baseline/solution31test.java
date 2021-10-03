package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class solution31test {
    @Test
    void TargetHeartRate() {
        int intensity = 55;
        int age = 22;
        int restingHR = 65;
        double expected = ((((220 - age) - 65) * intensity/100) + restingHR);
        double actual = (138);

        assertEquals(expected,actual);


    }
}
