import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "1100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String hexNumber = "";
        if (binaryNumber == null | binaryNumber == "") {
            return hexNumber;
        }
        for (int i = 0; i < (binaryNumber.length()); i++) {
            if ((binaryNumber.charAt(i)) == '0' || (binaryNumber.charAt(i)) == '1') {

            }else return "";
        }
        if ((binaryNumber.length()) % 4 != 0) {
            int nuli = Math.abs((binaryNumber.length())- 4);


            for (int j = 0; j < nuli; j++) {
                binaryNumber = "0" + binaryNumber;
            }
        }
        int dlina = binaryNumber.length();


        for (int k = 0; k < dlina; k += 4) {
            switch (binaryNumber.substring(k, k + 4)) {
                case ("0000"):
                    hexNumber = hexNumber + "0";
                    break;
                case ("0001"):
                    hexNumber = hexNumber + "1";
                    break;
                case ("0010"):
                    hexNumber = hexNumber + "2";
                    break;
                case ("0011"):
                    hexNumber = hexNumber + "3";
                    break;
                case ("0100"):
                    hexNumber = hexNumber + "4";
                    break;
                case ("0101"):
                    hexNumber = hexNumber + "5";
                    break;
                case ("0110"):
                    hexNumber = hexNumber + "6";
                    break;
                case ("0111"):
                    hexNumber = hexNumber + "7";
                    break;
                case ("1000"):
                    hexNumber = hexNumber + "8";
                    break;
                case ("1001"):
                    hexNumber = hexNumber + "9";
                    break;
                case ("1010"):
                    hexNumber = hexNumber + "a";
                    break;
                case ("1011"):
                    hexNumber = hexNumber + "b";
                    break;
                case ("1100"):
                    hexNumber = hexNumber + "c";
                    break;
                case ("1101"):
                    hexNumber = hexNumber + "d";
                    break;
                case ("1110"):
                    hexNumber = hexNumber + "e";
                    break;
                case ("1111"):
                    hexNumber = hexNumber + "f";
                    break;
            }

        }
        return hexNumber;




    }




    public static String toBinary(String hexNumber) {
        String binaryNumber = "";
        if (hexNumber == "" | hexNumber == null) {
            return binaryNumber;
        }

        for (int i = 0; i < (hexNumber.length()); i++) {
            int char_hex = (int) hexNumber.charAt(i);

            if ((char_hex >= 48 && char_hex <= 57) || (char_hex >= 97 && char_hex <= 102)) {


                switch (char_hex) {
                    case (48):
                        binaryNumber = binaryNumber + "0000";
                        break;
                    case (49):
                        binaryNumber = binaryNumber + "0001";
                        break;
                    case (50):
                        binaryNumber = binaryNumber + "0010";
                        break;
                    case (51):
                        binaryNumber = binaryNumber + "0011";
                        break;
                    case (52):
                        binaryNumber = binaryNumber + "0100";
                        break;
                    case (53):
                        binaryNumber = binaryNumber + "0101";
                        break;
                    case (54):
                        binaryNumber = binaryNumber + "0110";
                        break;
                    case (55):
                        binaryNumber = binaryNumber + "0111";
                        break;
                    case (56):
                        binaryNumber = binaryNumber + "1000";
                        break;
                    case (57):
                        binaryNumber = binaryNumber + "1001";
                        break;
                    case (97):
                        binaryNumber = binaryNumber + "1010";
                        break;
                    case (98):
                        binaryNumber = binaryNumber + "1011";
                        break;
                    case (99):
                        binaryNumber = binaryNumber + "1100";
                        break;
                    case (100):
                        binaryNumber = binaryNumber + "1101";
                        break;
                    case (101):
                        binaryNumber = binaryNumber + "1110";
                        break;
                    case (102):
                        binaryNumber = binaryNumber + "1111";
                        break;
                }



            }
            else
                return "";
        }
        return binaryNumber;
    }

}


