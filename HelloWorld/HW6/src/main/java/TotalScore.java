class TotalScore {
    public int sum(int[] scores) {
        int result = 0;
        int index = 0;

     for(int el:scores) {
       result+=el;
     }
     return result;
    }
}

class TotalScoreTest {
    public static void main(String[] args) {
        int[] score = {10, 20, 100};

        //130
        System.out.println(new TotalScore().sum(score));
    }
}