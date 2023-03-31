/*12.Write a program to perform below operations on short type to
get:
a. The number of bits used to represent a short value
b. The number of bytes used to represent a short value
c. The minimum value a short
d. The maximum value a short
*/
class Que12{
    public static void main(String[] args){
        short sh =66;
        Short s = new Short(sh);
        System.out.println("size in bits "+Short.SIZE);
        System.out.println("size in bytes "+s.byteValue());
        System.out.println("minimum size "+Short.MIN_VALUE);
        System.out.println("maximum size "+Short.MAX_VALUE);
    }
}