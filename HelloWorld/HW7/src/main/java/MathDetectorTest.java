class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}

class MathDetector {
    public boolean isMath(String text) {
        if (text.contains("=")) {
            if (text.matches(".*[\\+\\-\\*/].*")) {
                int digitCount = 0;
                for (char c : text.toCharArray()) {
                    if (Character.isDigit(c)) {
                        digitCount++;
                        if (digitCount >= 2) {
                            System.out.println("digits " + digitCount);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}