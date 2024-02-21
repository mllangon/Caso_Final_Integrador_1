package cronometroCosmico;

public class convertidor {
    public static long earthTimeToPlanetTime(long earthTime, planeta planet) {
        return Math.round(earthTime * planet.getTimeScaleFactor());
    }

    public static long planetTimeToEarthTime(long planetTime, planeta planet) {
        return Math.round(planetTime / planet.getTimeScaleFactor());
    }

    public static void printTimeDifference(long earthTime, planeta planet) {
        long planetTime = earthTimeToPlanetTime(earthTime, planet);
        long earthTimeFromPlanet = planetTimeToEarthTime(planetTime, planet);

        System.out.println("Time difference: " + earthTime + " seconds on Earth is equivalent to " + planetTime + " seconds on the new planet.");
        System.out.println("And, " + planetTime + " seconds on the new planet is equivalent to " + earthTimeFromPlanet + " seconds on Earth.");
    }
}