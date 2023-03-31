/*11.Accept character from command line and perform below
operations. Here you can use charAt() method to extract
character:
a. Check whether entered character is letter or digit. If it
is digit then print its values as well as code point.
b. If it is character then check whether it is in lowercase?
If it is in lowercase then convert it into upper case and
print it well as its code point. If it is in uppercase 
then convert it into lower case and print it well as its
code point.
*/
class Que11{
    public static void main(String[] args){
        char ch= args[0].charAt(0);
        if(Character.isDigit(ch)){
            System.out.println(" Digit is "+ch);
            System.out.println("Code point of Digit is "+ (int)ch);
        }else if(Character.isLowerCase(ch)){
            char c2 =Character.toUpperCase(ch);
            System.out.println(c2);
            System.out.println("Code point is "+ (int)c2);
           
        }else if(Character.isUpperCase(ch)){
            char c3 =Character.toLowerCase(ch);
            System.out.println(c3);
            
            System.out.println("Code point is "+ (int)c3 );

            
        }else{
            System.out.println("Invalid Inhput.");
        }
     
    }
}