


public class FindGrade{

    public static void main(String[] args){
        if(args.length == 1) {
            int grade = Integer.parseInt(args[0]);
            if (grade >= 90 && grade < 100) {
                System.out.println("A");

            } else if (grade >= 80 && grade < 89) {
                System.out.println("B");

            } else if (grade >= 70 && grade < 79) {
                System.out.println("C");
            } else if (grade >= 60 && grade < 69) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }else {
            System.out.println("Grade is not given");
        }
    }
}