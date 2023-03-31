/*28.Write a program to convert:
a. double value into String
b. double value into Double instance.
c. String instance into Double instance.
d. double value into binary, octal and hexadecimal
string(Note: Here you can use doubleToLongBits() method
along with methods of Long class).
 */
import java.util.Scanner;
class Que28{
    public static void main(String[] args){
        double l =10.32;
        Double la = new Double(l);
        String s = la.toString();
        System.out.println("Double to String is "+s);
        Double l1 = Double.valueOf(l);
        System.out.println("Double value into Double instance "+l1);
        String str = new String(s);
        Double l2 = Double.valueOf(str);
        System.out.println("String instance into Double instance "+l2);
        System.out.println("Double value into hexadecimal "+	Double.toHexString(la));




    }
}