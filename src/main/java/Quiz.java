
//package Quiz;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int rightAnswers = 0;
        
        System.out.println("Here comes a quiz. No cheating!(Write in CAPITAL)");
        
        System.out.println("Question 1: Who was the first person that landed on the moon?");
        System.out.println("\tA) Neil Armstrong");
        System.out.println("\tB) Juri Gagarin");
        System.out.println("\tC) Vladimir Putin");
        System.out.println("\tD) Donald Trump");
        String answer1 = keyboard.nextLine();
        if (answer1.equals("A")) {
            System.out.println("That is correct!"); 
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the correct answer is Neil Armstrong!");
        }
        
        System.out.println("Question 2: What is the third biggest counrty in the world?");
        System.out.println("\tA) China");
        System.out.println("\tB) Russia");
        System.out.println("\tC) Iraq");
        System.out.println("\tD) USA");
        String answer2 = keyboard.nextLine();
        if (answer2.equals("D")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, third biggest country is USA");
        }
        
        System.out.println("Question 3: True or False (type T or F):");
        System.out.println("\tRaphael Nadal won 9 'French Open' titles");
        String answer3 = keyboard.nextLine();
        if (answer3.equals("F")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, this is False he did it 12 times!");
        }
        
        System.out.println("Question 4: True or False (type T or F):");
        System.out.println("\tThe capital city of Morocca is Rabat ");
        String answer4 = keyboard.nextLine();
        if (answer4.equals("T")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, that is True!");
        }
        
        System.out.println("Question 5: What year did World War || started?");
        System.out.println("\tA) 1939");
        System.out.println("\tB) 1839");
        System.out.println("\tC) 1945");
        System.out.println("\tD) 1914");
        String answer5 = keyboard.nextLine();
        if (answer5.equals("A")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, it started in 1939");
        }
        
        System.out.println("Question 6: 5 cubed");
        System.out.println("\tA) 25");
        System.out.println("\tB) 125");
        System.out.println("\tC) 225");
        System.out.println("\tD) 500");
        String answer6 = keyboard.nextLine();
        if (answer6.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, it is 125");
        }
        
        System.out.println("Your score is " + rightAnswers + " out of 6 questions.");
    }
    
}
