/*21.Write a program to convert state of Long instance into byte,
short, int, long, float and double.
*/
class Que21{
    public static void main(String[] args){
        long  i = 65L;
        Long I = new Long(i);
        byte b1 = I.byteValue();
        System.out.println("Byte-"+b1);
        Short b2 =I.shortValue();
        System.out.println("Short-"+b2);
        int b3 =I.intValue();
        System.out.println("Intiger-"+b3);
        long b4 =I.longValue();
        System.out.println("Long-"+b4);
        float b5 =I.floatValue();
        System.out.println("Float-"+b5);
        double b6 =I.doubleValue();
        System.out.println("Double-"+b6);
    }
}
