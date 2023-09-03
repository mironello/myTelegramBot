class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count( "MOGI Cuse Gyb Rexyb Jev"));
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}

    class NameCounter {
        public int count(String text) {
            String[] arrText = text.split(" ");
            int count = 0;

            for (String s :
                    arrText) {
                if ((s.length() > 2)
                        && (s.charAt(0) > 64 && s.charAt(0) < 91)
                        && (s.charAt(1) > 96 && s.charAt(1) < 123)) {
                    count++;
                }
            }
            return count;
        }
    }