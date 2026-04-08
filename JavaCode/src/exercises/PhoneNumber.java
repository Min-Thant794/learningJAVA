package exercises;

public class PhoneNumber {
    private final int countryCode, regionCode, number;

    PhoneNumber (int countryCode, int regionCode, int number) {
        this.countryCode = countryCode;
        this.regionCode = regionCode;
        this.number = number;
    }

    public int getCountryCode () {
        return countryCode;
    }

    public int getRegionCode () {
        return regionCode;
    }

    public int getNumber () {
        return number;
    }

    @Override
    public String toString () {
        return String.format("(%d)%02d-%d", countryCode, regionCode, number);
    }
}
