/*14.Write a program to convert state of Short instance into byte,
short, int, long, float and double.
*/
class Que14{
    public static void main(String[] args){
        Short b = 65;
        Short sh = new Short(b);
        byte b1 = sh.byteValue();
        System.out.println("Short-"+b1);
        Short b2 =sh.shortValue();
        System.out.println("Short-"+b2);
        int b3 =sh.intValue();
        System.out.println("Intiger-"+b3);
        long b4 =sh.longValue();
        System.out.println("Long-"+b4);
        float b5 =sh.floatValue();
        System.out.println("Float-"+b5);
        double b6 =sh.doubleValue();
        System.out.println("Double-"+b6);
    }
}
