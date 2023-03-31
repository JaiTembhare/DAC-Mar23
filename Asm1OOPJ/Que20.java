/*20.Write a program to convert:
a. long value into String
b. long value into Long instance.
c. String instance into Long instance.
d. long value into binary, octal and hexadecimal string.
 */
import java.util.Scanner;
class Que20{
    public static void main(String[] args){
        long l =10L;
        Long la = new Long(l);
        String s = la.toString();
        System.out.println("Long to String is "+s);
        Long l1 = Long.valueOf(l);
        System.out.println("Long value into long instance "+l1);
        String str = new String(s);
        long l2 = Long.valueOf(str);
        System.out.println("String instance into Long instance "+l2);
        System.out.println("String instance into binary "+	Long.toBinaryString(la));
        System.out.println("String instance into hexadecimal "+	Long.toHexString(la));
        System.out.println("String instance into octal "+	Long.toOctalString(la));



    }
}