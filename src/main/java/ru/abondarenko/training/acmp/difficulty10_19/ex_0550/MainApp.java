package ru.abondarenko.training.acmp.difficulty10_19.ex_0550;

import java.io.PrintWriter;
import java.util.Scanner;

//  https://acmp.ru/index.asp?main=task&id_task=550
//
//  День программиста отмечается в 255-й день года (при этом 1 января считается нулевым днем). Требуется написать программу, которая определит дату (месяц и число григорианского календаря),
//  на которую приходится День программиста в заданном году.
//
//  В григорианском календаре високосным является:
//
//  год, номер которого делится нацело на 400
//  год, номер которого делится на 4, но не делится на 100

//  Входные данные
//  В единственной строке входного файла INPUT.TXT записано целое число от 1 до 9999 включительно, которое обозначает номер года нашей эры.
//
//  Выходные данные
//  В единственную строку выходного файла OUTPUT.TXT нужно вывести дату Дня программиста в формате DD/MM/YYYY, где DD — число, MM — номер месяца (01 — январь, 02 — февраль, ..., 12 — декабрь), YYYY — год в десятичной записи.
//
//  №	INPUT.TXT	OUTPUT.TXT
//  1	2000	    12/09/2000
//  2	2009	    13/09/2009

public class MainApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();

        if(leapYear(a)){
            System.out.printf("13/09/%04d",a);
        } else {
            System.out.printf("12/09/%04d", a);
        }
        out.flush();
    }
    public static boolean leapYear(int year) {
        if (year < 0) {
            throw new IllegalArgumentException("Введен некорректный год!");
        }
        return year % 4 != 0 || (year % 100 == 0 && year % 400 != 0);
    }
}
