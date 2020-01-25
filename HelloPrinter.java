/*
Programming Techniques : Lab2-2
Student : Teerapat Phengchuay
ID student : 6234432023
 */
public class HelloPrinter{
    public static void main(String[] args){
        String text,new_text1,new_text2,new_text3;
        text = "Hello, World!";
        new_text1 = text.replace("e","a");
        new_text2 = new_text1.replace("o","e");
        new_text3 = new_text2.replace("a","o");

        System.out.println(new_text3);
    }
}
