package com.bridgelabz;

import java.util.*;

public class Employee_Wage_Calculator {
    public int number_Of_Days;
    int full_Day = 8, part_Time = 4, wages_Per_Hour, wages_Per_Month = 0, present_Days = 0, absent_Days = 0;
    int wages_Per_Day[] = new int[20];
    String company_Name;

    public static void main(String[] args) {

        Employee_Wage_Calculator employee1 = new Employee_Wage_Calculator();

        System.out.println("Welcome to Employee wage Computation");
        employee1.accept_Data();
        Random rd = new Random();
        int choice;
        for (int i = 0; i < employee1.number_Of_Days; i++) {
            choice = rd.nextInt(3);

            switch (choice) {
                case 0:
                    employee1.employee_Absent(i);
                    break;
                case 1:
                    employee1.employee_Present(i);
                    break;
                case 2:
                    employee1.employee_Part_Time(i);
                    break;
            }
        }
        employee1.display_Data();

    }

    public void employee_Absent(int i) {
        absent_Days++;
        wages_Per_Day[i] = 0;
        System.out.println("The employee is absent");
    }

    public void employee_Present(int i) {
        present_Days++;
        wages_Per_Day[i] = full_Day * wages_Per_Hour;
        wages_Per_Month = wages_Per_Month + wages_Per_Day[i];
        System.out.println("The employee is present");
    }

    public void employee_Part_Time(int i) {

        wages_Per_Day[i] = (part_Time * wages_Per_Hour);
        wages_Per_Month = wages_Per_Month + wages_Per_Day[i];
        System.out.println("Employee is part time");
    }

    public void display_Data() {
        System.out.println("Company name is      : " + company_Name);
        System.out.println("Present Working days : " + present_Days);
        System.out.println("Absent days          : " + absent_Days);
        System.out.println("Wages for a month    : " + wages_Per_Month);
    }

    public void accept_Data() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Comapany name : ");
        company_Name = scanner.nextLine();
        System.out.println("Enter wages per hours for the company : ");
        wages_Per_Hour = scanner.nextInt();
        System.out.println("Enter number of working days for the company : ");
        number_Of_Days = scanner.nextInt();


    }

}