package hw5.planet;

public class PlanetTester {
    String test (SpaceObject spaceObject) {
        String result;

        if (spaceObject instanceof Planet) {
           result = "hw5/planet";
        } else {
           result= "not planet";
        }
        return result;
    }
}
