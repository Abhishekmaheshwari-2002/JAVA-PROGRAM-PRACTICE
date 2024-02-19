package com.example;
// Java program to convert Hexadecimal to Decimal Number
public class JAVA_21_HexadeciToDeci {
    //mehtod to convert hexadecimal to decimal
    public static int HexdecimalToDecimal(String hexa_num) {
        int hexa_len = hexa_num.length();//storing the length of hexa_num string
        int base = 1;//initializing the value 1 ex:16^0
        int result_deci = 0;//initially value 0 for storing the decimal
        //take last digit of the string using rivers loop
        for (int i = hexa_len - 1; i >= 0; i--) {
            //check char is lies between the '0' to '9'
            // and convert it into integer using ASCII value
            if (hexa_num.charAt(i) >= '0' && hexa_num.charAt(i) <= '9') {
                result_deci += (hexa_num.charAt(i) - 48) * base;
                base = 16 * base;// Incrementing base by power
            }
            //check char is lies between the '0' to '9'
            // and convert it into integer using ASCII value
            else if (hexa_num.charAt(i) >= 'A' && hexa_num.charAt(i) <= 'F') {
                result_deci = (hexa_num.charAt(i) - 55) * base;
                base = base * 16;// Incrementing base by power
            }
        }
        return result_deci;
    }
    public static void main(String[] args) {
        String hexa = "1AB";
        System.out.println("converted hexadecimal to decimal : " + HexdecimalToDecimal(hexa));
    }
}
