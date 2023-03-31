/*27.Write a program to perform below operations on Double type to
get:
a. The number of bits used to represent a double value
b. The number of bytes used to represent a double value
c. The minimum value a double
d. The maximum value a double
*/
class Que27{
    public static void main(String[] args){
        double i =66.66;

        System.out.println("size in Double "+Double.SIZE);
        System.out.println("size in Double "+Double.BYTES);
        System.out.println("minimum size "+Double.MIN_VALUE);
        System.out.println("maximum size "+Double.MAX_VALUE);
    }
}