/*16. Write a program to convert:
a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
d. int value into binary, octal and hexadecimal string.
*/
class Que16{
    public static void main(String[] args){
        int i =66;
        Integer I = new Integer(i);
        String s1 ="12";
        String str = new String(s1);
        System.out.println("Integer value into String "+I.toString());
        System.out.println("Integer value into Integer Instance "+I.valueOf(i));
        System.out.println("String instance into Integer instance "+Integer.valueOf(str));
        System.out.println("Binary-"+Integer.toBinaryString( i));
        System.out.println("Octal-"+Integer.toOctalString(i));
        System.out.println("Hexadecimal-"+Integer.toHexString(i));
    }
}