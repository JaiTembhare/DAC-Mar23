/*23.Write a program to perform below operations on float type to
get:
a. The number of bits used to represent a float value
b. The number of bytes used to represent a float value
c. The minimum value a float
d. The maximum value a float
*/
class Que23{
    public static void main(String[] args){
        float i =66;

        System.out.println("size in Float "+Float.SIZE);
        System.out.println("size in Float "+Float.BYTES);
        System.out.println("minimum size "+Float.MIN_VALUE);
        System.out.println("maximum size "+Float.MAX_VALUE);
    }
}