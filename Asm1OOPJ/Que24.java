/*24.Write a program to convert:
a. float value into String
b. float value into Float instance.
c. String instance into Float instance.
d. float value into hexadecimal string.
 */
import java.util.Scanner;
class Que24{
    public static void main(String[] args){
        float l =10.32f;
        Float la = new Float(l);
        String s = la.toString();
        System.out.println("Float to String is "+s);
        Float l1 = Float.valueOf(l);
        System.out.println("Long value into Float instance "+l1);
        String str = new String(s);
        Float l2 = Float.valueOf(str);
        System.out.println("String instance into Float instance "+l2);
        System.out.println("Float value into hexadecimal "+	Float.toHexString(la));



    }
}