package cronometroCosmico;

public class main {
    public static void main(String[] args) {
        planeta newPlanet = new planeta(1.001);

        long earthTime = 60 * 60 * 24 * 365;
        convertidor.printTimeDifference(earthTime, newPlanet);

        planeta2 newPlanetTime = new planeta2(earthTime, newPlanet.getTimeScaleFactor());
        System.out.println("Time on the new planet in different formats:");
        System.out.println("Years: " + newPlanetTime.getYears());
        System.out.println("Days: " + newPlanetTime.getDays());
        System.out.println("Hours: " + newPlanetTime.getHours());
        System.out.println("Minutes: " + newPlanetTime.getMinutes());

        datos.printDataTypeLimits();
    }
}