package handle5;

public class AgeValidator {

    public static void validateAge(int age) throws InvalidAgeEx {
        if (age < 18) {
            throw new InvalidAgeEx ("Access denied – Age must be 18 or older.");
        }
    }
}

