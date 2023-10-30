package javastatements;

public class IfCondition {
        public static void main(String[] args) {
            isEligibleForVote();
    }
    public static void isEligibleForVote(){
            int age = 18;
            //int age =19;

            if(age>=18){
                System.out.println("Eligible for vote");
            }
        if(age==18 && age>20){
            System.out.println("Eligible for vote");
        }
        System.out.println("Hello");
    }
}
