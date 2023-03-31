/*19.Write a program to perform below operations on long type to
get:
a. The number of bits used to represent a long value
b. The number of bytes used to represent a long value
c. The minimum value a long
d. The maximum value a long
*/
class Que19{
    public static void main(String[] args){
        long i =66;

        System.out.println("size in Long "+Long.SIZE);
        System.out.println("size in Long "+Long.BYTES);
        System.out.println("minimum size "+Long.MIN_VALUE);
        System.out.println("maximum size "+Long.MAX_VALUE);
    }
}