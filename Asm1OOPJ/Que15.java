/*15. Write a program to perform below operations on int type to
get:
a. The number of bits used to represent a integer value
b. The number of bytes used to represent a integer value
c. The minimum value a integer
d. The maximum value a integer
*/
class Que15{
    public static void main(String[] args){
        int i =66;

        System.out.println("size in intiger "+Integer.SIZE);
        System.out.println("size in intiger"+Integer.BYTES);
        System.out.println("minimum size "+Integer.MIN_VALUE);
        System.out.println("maximum size "+Integer.MAX_VALUE);
    }
}