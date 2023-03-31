/*13.Write a program to convert:
a. short value into String
b. short value into Short instance.
c. String instance into Short instance.
*/
class Que13{
    public static void main(String[] args){
        short sh =66;
        Short s = new Short(sh);
        String s1 ="12";
        String str = new String(s1);
        System.out.println("Short value into String "+s.toString());
        System.out.println("Short value into string Instance "+Short.valueOf(sh));
        System.out.println("String instance into Short instance "+Short.valueOf(str));
    }
}