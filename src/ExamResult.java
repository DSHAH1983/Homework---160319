public class ExamResult
{ //this method I using for 1st student name= Niki
    static void addition(int maths,int science, int physics) {

        System.out.println("Niki");
        System.out.println("Total=" + (maths + science + physics));
        //this shows the calculation of percentage of total marks of maths,science and physics
        System.out.println("Percentage=" + (maths + science + physics) * 100 / 300);

        //this method I am using for 2nd student name = Rima
    } static void addition1(int maths,int science, int physics){

    System.out.println("Rima");
    System.out.println("Total=" + (maths + science + physics));
    //this shows the calculation of percentage of total marks of maths,science and physics
    System.out.println("Percentage=" + (maths + science + physics) * 100 / 300);

}
    public static void main(String[] args) {
        //m = maths, s = science and p = physics
        //this gives addition of Niki's marks
        addition(85, 80, 90);
        //this gives addition of Rima's marks
        addition1(95, 90, 85);
    }
}
