public class ClassNotes8 {
    public static void main(String[] args){
        int x = 49;
        int y = -149;

        boolean z = ((x > 0) && (y == -149)); //double = means that it is comparing but a single means it is giving a value 
        System.out.println(z);

        boolean u = ((x > 0) || (y == -140));
        System.out.println(u);

        System.out.println( (true && false) || ( (true && true) || false ) ); 
        System.out.println( false && true || true); 

        
    }
}
