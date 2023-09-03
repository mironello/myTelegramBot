class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}

class WaterCounter {
    public double count(String text) {
        int spacesCount = 0;
        for (char c :
                text.toCharArray()) {
            if (c == 32) {
                spacesCount++;
            }
        }
        return (double) spacesCount / text.length();
    }
}