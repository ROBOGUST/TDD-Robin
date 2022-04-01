
public class Result {

    public static char determineGrade(int numberGrade){
        if (numberGrade < 0){
            throw new IllegalArgumentException("Number grade cannot resolve");
        }
        else if (numberGrade < 60){
            return 'F';
        }
        else if (numberGrade < 70){
            return 'D';
        }
        else if (numberGrade < 70){
            return 'C';
        }
        else if (numberGrade < 90){
            return 'B';
        }
        else return 'A';
    }
}
