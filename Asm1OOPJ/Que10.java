/*10.Write a program to perform below operations on char type to
get:
a. The number of bits used to represent a char value
b. The number of bytes used to represent a char value
c. The minimum value a char
d. The maximum value a char
*/
class Que10{
    public static void main(String[] args){
       // char ch=A;
        System.out.println(Character.SIZE);
        System.out.println(Character.BYTES);
        System.out.println((int)Character.MAX_VALUE);
        System.out.println((int)Character.MIN_VALUE);


    }
}