import java.util.Scanner;

public class FootShape {

    private Foot foot;

    public FootShape(Foot foot) {
        this.foot = foot;
    }

    public static String getFootTypeFromUser() {
        String footType = null;
        Scanner inp = new Scanner(System.in);
        System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
        int type = inp.nextInt();
        switch (type) {
            case 1:
                footType = "Ellipse";
                break;
            case 2:
                footType = "Rectangle";
                break;
        }
        return footType;
    }

    public String generateDraw() {
        return foot.draw();
    }

    public static void main(String[] args) {
        String footType = getFootTypeFromUser();
        Foot foot = null;
        switch (footType) {
            case "Ellipse":
                foot = new Ellipse();
                break;
            case "Rectangle":
                foot = new Rectangle();
                break;
        }
        FootShape ff = new FootShape(foot);
        System.out.println(ff.generateDraw());
    }
}
