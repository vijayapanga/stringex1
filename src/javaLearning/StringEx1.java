package javaLearning;

public class StringEx1 {
    public static void main(String[] args) {

        String s1 = "";

        for (int i = 1; i <= 20; i++) {

            s1 = s1 +" "+ i;

        }
        System.out.println(s1);
        System.out.println(" ");



        String a1 = "1";
        String a2 = "2";
        String a3 = "3";
        String a4 = "4";
        String a5 = "5";
        String a6 = "6";
        String a7 = "7";
        String a8 = "8";
        String a9 = "9";
        String a10 = "10";

        String a = a1.concat(a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10);
        System.out.println(a);
        System.out.println(" ");

        String t1="The";
        String t2="string";
        String t3="concatenation";
        String t4="works";

        String t5 = t1.concat(" "+t2+" "+t3+" "+t4);
        System.out.println(t5);

        System.out.println(" ");


    }
}