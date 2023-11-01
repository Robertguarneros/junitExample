package edu.upc.dsa;

public class Grader {
    /**
     * Function to pass from numerical grade to alphabetical grade
     * @param numberGrade Grade in numerical form
     * @return Returns corresponding letter
     */
    public char determineLetterGrade (int numberGrade){
        if (numberGrade < 0){
            throw new IllegalArgumentException("Number grade cannot be given");
        }
        else if (numberGrade < 60){
            return 'F';
        }
        else if (numberGrade < 70 ){
            return 'D';
        }
        else if (numberGrade < 80 ){
            return 'C';
        }
        else if (numberGrade < 90 ){
            return 'B';
        }
        else {
            return 'A';
        }
    }
}
