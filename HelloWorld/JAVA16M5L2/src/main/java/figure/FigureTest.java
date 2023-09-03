package figure;

public class FigureTest {
    public static void main(String[] args) {
        Rectungle r1 = new Rectungle(3,2);
        Rectungle r2 = new Rectungle(4,2);
        Rectungle r3 = new Rectungle(5,6);
        Quad q1 = new Quad(9);
        Quad q2 = new Quad(10);
        Quad q3 = new Quad(8);

        Quad [] qArr = {q1, q2, q3};
        Rectungle [] rArr = {r1, r2, r3};

        Figure [] fArr = {q1, q2, q3, r1, r2, r3};

        for (Figure f: fArr
             ) {
            System.out.println("f.getSquare() = " + f.getSquare());
        }
//        for (Quad q:qArr
//             ) {
//            System.out.println("q.getSquare() = " + q.getSquare());
//        }
//
//        for (Rectungle r: rArr
//             ) {
//            System.out.println("r.getSquare() = " + r.getSquare());
//        }
    }
}
