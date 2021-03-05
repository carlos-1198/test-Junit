package com.javaTest.TddPractice;

public class NumbersToRoman {
    int replay = 3;
    //I=1, V=5, X=10, L=50, C=100, D=500, M=1000
    public  String numberToRoman(int number, String result){
        String answer =  result;
        int cyphers = this.numberOfZeros(number);// Represent if the number is a unit, ten, hundred or thousands.
        int pow = (int)(Math.pow(10,cyphers)); // Represent the number 1 as unit, 10 as ten, 100 as hundred and 1000 as thousands.

        if(number < 0 || number >= 4000) {
            return "Invalid Number";
        }
        // ESPECIAL CASES
        switch(number) {
            case 4:
                answer += "IV";
                return this.numberToRoman(number - 4, answer);
            case 9:
                answer += "IX";
                return this.numberToRoman(number - 9, answer);
        }
        if(number >= 900 && number <= 999) {
            answer += "CM";
            return this.numberToRoman(number - 900, answer);
        }else if(number >= 400 && number <= 499) {
            answer += "CD";
            return this.numberToRoman(number - 400, answer);
        }else if(number >= 90 && number <= 99) {
            answer += "XC";
            return this.numberToRoman(number - 90, answer);
        }else if(number >= 40 && number <= 49) {
            answer += "XL";
            return this.numberToRoman(number - 40, answer);
        }
        // END ESPECIAL CASES

        if ((number >= 1 && number < 4) || (number > 9 && number < 40) || (number >=100 && number < 400) ||
                (number >= 1000)) {
            answer += this.possibleRepeated(number, cyphers, pow);
            return this.numberToRoman(number - ((number / pow) * pow), answer);

        }else if((number >= 500 && number < 900) || (number >= 40 && number < 90) ||
                (number >= 5 && number < 9)){
            answer += this.lettersNotRepeated(number, cyphers);
            return this.numberToRoman(number - (5 * pow), answer);
        }
        System.out.println(answer);
        return answer;
    }

    //I=1, X=10, C=100, M=1000
    private String possibleRepeated(int number, int cyphers, int pow){
        String answer =  "";
        int counter = 0;
        while (number >= (pow) && counter < replay) {
            number -= (pow);
            counter++;
            switch (cyphers) {
                case 0:
                    answer += "I";
                    break;
                case 1:
                    answer += "X";
                    break;
                case 2:
                    answer += "C";
                    break;
                case 3:
                    answer += "M";
                    break;
            }
        }
        return answer;
    }

    private int numberOfZeros(int number){
        int counter = 0;
        while(number >= 10){
            number = number/10;
            counter ++;
        }
        return counter;
    }
    // V=5, L=50, D=500
    private String lettersNotRepeated(int number, int cyphers) {
        String answer = "";
        switch (cyphers) {
            case 0:
                answer += "V";
                break;
            case 1:
                answer += "L";
                break;
            case 2:
                answer += "D";
                break;
        }
        return answer;
    }
}


