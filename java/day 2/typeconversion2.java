public class typeconversion2 {
    
    public static void main(String[] args) {
        System.out.println("Type Conversion in Java");
        int a = 88;
        byte b = (byte)a;

        int c = 170;
        byte d = (byte) c;

        byte e = 120;
        int f = e;
    
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}



/*
88
88
170
-86
120
120
 */