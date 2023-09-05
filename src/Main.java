import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        primitives();
        System.out.println();
        maxMinWrapper();
        System.out.println();
        maxMinInArray();

    }
    public static void primitives() {
        byte a = 127;
        short b = 128;
        int c = 2_000;
        long d = 52_345_184L;
        char e = 'a';
        float f = 3.14f;
        double g = 8.012;
        boolean h = true;
        System.out.println("byte is " + a);
        System.out.println("short is " + b);
        System.out.println("int is " + c);
        System.out.println("long is " + d);
        System.out.println("char is " + e);
        System.out.println("float is " + f);
        System.out.println("double is " + g);
        System.out.println("boolean is " + h);
    }
    public static void maxMinWrapper(){
        byte a1 = Byte.MAX_VALUE;
        byte a2 = Byte.MIN_VALUE;
        short b1 = Short.MAX_VALUE;
        short b2 = Short.MIN_VALUE;
        int c1 = Integer.MAX_VALUE;
        int c2 = Integer.MIN_VALUE;
        long d1 = Long.MAX_VALUE;
        long d2 = Long.MIN_VALUE;
        char e1 = Character.MAX_VALUE;
        char e2 = Character.MIN_VALUE;
        float f1 = Float.MAX_VALUE;
        float f2 = Float.MIN_VALUE;
        double g1 = Double.MAX_VALUE;
        double g2 = Double.MIN_VALUE;
        boolean h1 = Boolean.TRUE;
        boolean h2 = Boolean.FALSE;
        System.out.println("max byte is " + a1);
        System.out.println("min byte is " + a2);
        System.out.println("max short is " + b1);
        System.out.println("min short is " + b2);
        System.out.println("max int is " + c1);
        System.out.println("min int is " + c2);
        System.out.println("max long is " + d1);
        System.out.println("min long is " + d2);
        System.out.println("max char is " + e1);
        System.out.println("min char is " + e2);
        System.out.println("max float is " + f1);
        System.out.println("min float is " + f2);
        System.out.println("max double is " + g1);
        System.out.println("min double is " + g2);
        System.out.println("max boolean is " + h1);
        System.out.println("min boolean is " + h2);
    }
    public static void maxMinInArray(){
        int[] mas = new int[] {-5, 0, 24, 3, -12, 22, 32, -8, 18, -1};
        Arrays.sort(mas);
        System.out.println("min value in mas is " + mas[0]);
        System.out.println("max value in mas is " + mas[9]);
    }
}