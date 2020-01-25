/*
Programming Techniques : Lab2-1
Student : Teerapat Phengchuay
ID student : 6234432023
*/
import java.util.Random;
import java.awt.Rectangle;

public class intersectionPrinter{
    public static void main(String[] args){
        Random rand = new Random();

        int x1 = rand.nextInt(50);
        x1++;
        int y1 = rand.nextInt(50);
        y1++;
        int width1 = rand.nextInt(50);
        width1++;
        int height1 = rand.nextInt(50);
        height1++;

        int x2 = rand.nextInt(50);
        x2++;
        int y2 = rand.nextInt(50);
        y2++;
        int width2 = rand.nextInt(50);
        width2++;
        int height2 = rand.nextInt(50);
        height2++;

        Rectangle r1 = new Rectangle(x1,y1,width1,height1);
        Rectangle r2 = new Rectangle(x2,y2,width2,height2);
        Rectangle r3 = r1.intersection(r2);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println("Is the intersection rectangle empty? : " + r3.isEmpty());

    }
}
