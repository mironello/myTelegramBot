class CircleIntersectorTest {
    public static void main(String[] args) {
        //intersects
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(-1, 2, 4, -8, 2, 1));
    }
}
class CircleIntersector{
    private int x1, x2, y1, y2, r1, r2;
    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1=y1;
        this.y2=y2;
        this.r1=r1;
        this.r2=r2;
    }
//      sideLength<=(r1+r2)||
    @Override
    public String toString(){
        double sideLength = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("r1+r2=" + (r1+r2) + " mezhdy centrami " + sideLength);
        if(((x1==x2)&&(y1==y2))){
            return "intersects";
        } else if((r1+r2)<=sideLength){
            return "intersects";
        } else
        return "not intersects";
    }
}