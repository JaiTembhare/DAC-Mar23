class Que6{
    public static void main(String args[]){
        boolean b = true;
        String s = Boolean.toString(b);
        System.out.println("Using String");
        System.out.println(s);
        Boolean b1 = new Boolean(b);
        System.out.println("Using instance variable.");
        System.out.println(b1);
        System.out.println("String value into boolean value");
        String s1 ="false";
        boolean b2 = Boolean.valueOf(s1);
        System.out.println(b2);
        System.out.println("String value into Boolean instance.");
        Boolean b3 = Boolean.valueOf(s1);
        System.out.println(b3);
    }
}