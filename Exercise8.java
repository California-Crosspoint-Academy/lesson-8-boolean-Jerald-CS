public class Exercise8{
    public static void main(String[] args) {
        int z = 23, x = -109;
        double c = 2345.19, v = 157.03;
        boolean a = false, s = true;

        //question 1
        boolean gus = (x > 0) && (c == v);  //since x is less then 0 it is false and because it is an "and" statement the whole thing is false
        System.out.println(!gus);  //gus prints out true but since there is a ! it means not false so it prints true 

        //question 2
        System.out.println(a || s); // prints true because it is a "or" statement and since s is true the whole thing is true 

        //question 3
        System.out.println( ( (-1 * x) > 0) && !a ); //true because -1 times x results in a number greater than 0 meaning true and !a means not false so it is true so the whole thing is true 

        //question 4
        boolean r = z == x; //z does not equal x that means r is set to false 
        System.out.println( r || false ); //prints false because both are false
        
        //question 5  
        System.out.println( z!=x ); //prints true because the statement is saying that z is not equal to x

        //question 6
        //(!a && b)
        //1. prints false because b is false
        //2. prints true because it does !false meaning true so it is true true = true
        //3. prints false because b and a is false 
        //4. prints false a is false 

        //(a || !b)
        //1. prints true because it is or and b is true meaning it is all true 
        //2. prints false because both are false 
        //3. prints true because both are true 
        //4. prints true because a is true 

        //question 7
        boolean b;
        boolean p = true;   // example value
        boolean q = false;  // example value
        b = p && q;
        System.out.println(b);

        //question 8 
        boolean w;
        int y = 12, zing = 12;
        int xy = -14; 
        w = xy > 0 || y == zing; //xy > 0 checks if a number is positive or negative and since it isnt it is false and since y = zing it is true and because it is a or and there is 1 true it is all true  
        System.out.println(w); //prints true

        //question 9
        //true or false 

        //question 10
        boolean kDog;
        int apple = 13, ban = 13;
        kDog = apple != ban; //checks if apple and ban are the same and since they are kDog is set to true
        System.out.println(kDog); //prints true 

        //question 11
        boolean kCat;
        kCat = !(apple != ban); //checks if apple does not equal ban since they equal it is set to false but the ! outside flips it making it true again
        System.out.println(kCat);

        //question 12
        // &&

        //question 13
        //||

        //question 14
        System.out.println( (true && false) || ( (true && true) || false ) ); //prints true becase the middle term is true and because it is or's as long as one is true all is true

        //question 15
        System.out.println(true && true || false); //prints true does and then does or so at the end it is true or false so true

        //question 16
        System.out.println(true || true && false); //prints true end is true or true which is true

        //question 17
        System.out.println(false || true && false); //prints false end is false or false which is false

        //question 18
        System.out.println(false && true || false); //prints false end is false or false which is false 

    }

}
