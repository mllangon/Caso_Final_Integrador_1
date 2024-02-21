package cronometroCosmico;

public class planeta2 {
    private long seconds;
    private double conversionFactor;

    public planeta2(long seconds, double conversionFactor) {
        this.seconds = seconds;
        this.conversionFactor = conversionFactor;
    }

    public long getSeconds() {
        return seconds;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }

    public long getYears() {
        return (long) (seconds / 365 / 24 / 60 / 60 * conversionFactor);
    }

    public long getDays() {
        return (long) (seconds / 24 / 60 / 60 * conversionFactor);
    }

    public long getHours() {
        return (long) (seconds / 60 / 60 * conversionFactor);
    }

    public long getMinutes() {
        return (long) (seconds / 60 * conversionFactor);
    }
}