public class FindGrade {

    public static void main(String[] args){
        int score = Integer.parseInt(args[0]);
        
        if (score > 100 || score < 0){
            System.out.println("score is invalid");
        }else {
            if (score >= 90) {
                System.out.println("A");
            }else if(score >=80) {
                System.out.println("B");
            }else if (score >=70) {
                System.out.println("c");
            }else if (score >=60) {   
                System.out.println("D");
            }else {
                System.out.println("F");
            }
        }
    }
}



