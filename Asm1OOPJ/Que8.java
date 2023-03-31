/*8.Write a program to convert:
a. byte value into String
b. byte value into Byte instance.
c. String instance into Byte instance.*/
class Que8{
    public static void main(String[] args){
        byte b = 65;  
        String s = Byte.toString(b); 
        System.out.println("String value: " + s);
        Byte b1 = new Byte(b);
        System.out.println(b1);
        String str1 = new String (s);
        Byte b2 = Byte.valueOf(str1);
        System.out.println(b2);

    }
}