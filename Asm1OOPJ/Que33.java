/*  Pass integer, float and double value from command line. Parse
it appropriately and perform arithmetic operations (+,-,*,/)
on it. Here you can you switch case. */
class Que33{
    public static void main(String[] args){
        int a=Integer.parseUnsignedInt(args[0]);
        float f =Float.parseFloat(args[1]);
        double d=Double.parseDouble(args[2]);
        double d1=(double) a+f+d;
        System.out.println("Sum is "+d1);
    }
}