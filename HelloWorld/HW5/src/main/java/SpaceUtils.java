class SpaceUtils{
    public final int PLANET_COUNT = 8;
    public final String HOME_PLANET_NAME = "Earth";
    public final String HOME_STAR_NAME = "Sun";

    public static String pluralPlanets(int planetCount){

        if(planetCount == 1){
            return "1 planet";
        }
        return planetCount + " planets";

    }

    public static String generateStartMessage(String shipName, String time){
        return "Ship " + shipName + " start at " +  time;
    }
}