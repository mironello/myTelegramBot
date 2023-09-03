class Level {


    static class Point {
        private static int x, y;

        public  int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private Point[] points;
    private LevelInfo levelInfo;

    public Level() {
    }

    public Point[] getPoints() {
        return points;
    }

    public Level(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }
    public int calculateLevelHash(){
        int res = 0;
        for(Point point:points){
           res+= point.getY()* point.getX();
        }
        return res;
    }


    @Override
    public String toString() {

        return "Quarke level, name is " + levelInfo.getName() + ", difficulty is " + levelInfo.getDifficulty() +
                ", point count is " + points.length;
    }

    static class LevelInfo {
        private String difficulty;
        private String name;

        public LevelInfo() {

        }

        public String getName() {
            return name;
        }

        public String getDifficulty() {
            return difficulty;
        }

        public LevelInfo(String name, String difficulty) {
            this.name = name;
            this.difficulty = difficulty;
        }
    }
}
