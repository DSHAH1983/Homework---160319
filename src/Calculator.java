public class Calculator
{ //this method will perform add,subtract,divide and multiply for 2 integer numbers

    static int a = 20;
    static int b = 5;

    //this method will perform addition

    static void add () {// no return type no argument user defined method
        System.out.println("Add=" + (a+b)); }

    //this method will perform subtraction
    static void sub(){
        System.out.println("Sub=" + (a-b)); }

    //this method will perform divide
    static void divide(){
        System.out.println("Divide=" + (a/b)); }

    //this method will perform multiply

    static void multiply(){
        System.out.println("Multiply=" + (a*b));}

    public static void main (String [] args){
        add();
        sub();
        divide();
        multiply(); }



















}
