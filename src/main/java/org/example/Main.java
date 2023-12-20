package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void Star(int number) {
        // jika inputan number adalah bilangan genap maka akan mencetak kalimat berikut
        if (number % 2 == 0) {
            System.out.println("Length must be an odd number");
            return;
        }
        for (int i = 0; i < number; i++) {
            String temp = "";
            for (int j = 0; j < number; j++) {
                double floor = Math.floor(number / 2);
                if (i == floor) {
                    temp += "*";
                } else if (j == 0 || j == (number-1)) {
                    temp += "*";
                } else {
                    temp += "=";
                }
                temp += "  ";
            }
            System.out.println(temp);
        }
    }

    public static void main(String[] args) {
        Star(5);
    }
}