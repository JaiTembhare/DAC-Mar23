/*9.Write a program to convert state of Byte instance into byte,
short, int. long, float and double.
 */
class Que9{
    public static void main(String[] args){
        Byte b = 65;
        byte b1 = Byte.valueOf(b);
        System.out.println("Byte-"+b1);
        Short b2 =b.shortValue();
        System.out.println("Short-"+b2);
        int b3 =b.intValue();
        System.out.println("Intiger-"+b3);
        long b4 =b.longValue();
        System.out.println("Long-"+b4);
        float b5 =b.floatValue();
        System.out.println("Float-"+b5);
        double b6 =b.doubleValue();
        System.out.println("Double-"+b6);
    }
}
