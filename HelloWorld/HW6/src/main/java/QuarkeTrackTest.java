import java.util.Arrays;
import java.util.Objects;

    class QuarkeTrackTest {
        public static void main(String[] args) {
            int[] track1Data = {1, 3, 5};
            int[] track2Data = {3, 5, 4};
            int[] track3Data = {1, 5, 3};

            QuarkeTrack track1 = new QuarkeTrack(track1Data);
            QuarkeTrack track2 = new QuarkeTrack(track2Data);
            QuarkeTrack track3 = new QuarkeTrack(track3Data);

            //false
            System.out.println(track1.equals(track2));

            //true
            System.out.println(track1.equals(track3));

            //Can be true or false
            System.out.println(track1.hashCode() == track2.hashCode());

            //true
            System.out.println(track1.hashCode() == track3.hashCode());
        }
    }
    class QuarkeTrack {
        private int[] lines;
        public QuarkeTrack(int[] lines){
            this.lines=lines;
        }

        public int[] getLines() {
            return lines;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof QuarkeTrack)) return false;
            int sum1 = 0;
            int sum2 = 0;
            for(int i:this.lines){
                sum1=+i;
            }
            QuarkeTrack that = (QuarkeTrack)o;
            for (int el:that.lines
            ) {
                sum2+=el;
            }
            return sum1==sum2?true:false;

        }


        @Override
        public int hashCode() {
            int result = 0;
            for(int i:this.lines){
                result = 31 * result + i;
            }
            return getLines() == null ? 0 : result;
        }
    }