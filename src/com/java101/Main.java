package com.java101;

import java.util.Scanner;

public class Main {

    static int PrepareAvailableGrade(int grade) {
        if (grade < 0 || grade > 100) {
            return 0;
        }
        return grade;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mathematics, physics, turkish, chemistry, music;
        int minGrade = 55;

        System.out.print("Please type your mathematics grade :");
        mathematics = input.nextInt();

        System.out.print("Please type your physics grade :");
        physics = input.nextInt();

        System.out.print("Please type your turkish grade :");
        turkish = input.nextInt();

        System.out.print("Please type your chemistry grade :");
        chemistry = input.nextInt();

        System.out.print("Please type your music grade :");
        music = input.nextInt();

        double graduationGrade = 0;
        graduationGrade += PrepareAvailableGrade(mathematics);
        graduationGrade += PrepareAvailableGrade(physics);
        graduationGrade += PrepareAvailableGrade(turkish);
        graduationGrade += PrepareAvailableGrade(chemistry);
        graduationGrade += PrepareAvailableGrade(music);
        graduationGrade = graduationGrade / 5;

        String graduationMessage = "";
        if (graduationGrade >= 55) {
            graduationMessage = "You graduated, your average grade is ";
        } else {
            graduationMessage = "You failed, your average grade is ";
        }
        System.out.print(graduationMessage + graduationGrade);
    }


}
