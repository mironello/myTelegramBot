import java.util.Arrays;

class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}
class TargetFinder{
    private int findDistanse(int []a, int[] b){
        double res = 0;
        res = Math.sqrt(Math.pow((b[0]-a[0]), 2) + Math.pow((b[1]-a[1]), 2) );
        return (int)Math.round(res);
    }
    public int[] findTarget(int [] aiCoords, int[][] targets){
        int [] res = new int[2];
        res = targets[0];
        for (int i = 0; i<targets.length-1; i++){
            for (int j = 0; j < 2; j++) {
                double distance1 = Math.round(Math.sqrt(Math.pow((targets[i+1][1]-aiCoords[1]), 2) +
                        Math.pow((targets[i+1][0]-aiCoords[0]), 2) ));

                double distance2 = Math.round(Math.sqrt(Math.pow((targets[i][1]-aiCoords[1]), 2) +
                        Math.pow((targets[i][0]-aiCoords[0]), 2) ));
                if(distance1 <distance2) {
                    res = targets[i+1];
                }
            }

        }
        return res;
    }

}