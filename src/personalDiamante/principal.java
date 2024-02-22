package personalDiamante;

import java.util.Scanner;

public class principal {

    // 01 Start
    public static String Diamante01(byte uNum) {
        // Variables
        String vString = "";

        float numChar = 1;

        // Programa
        for (byte i = 0; i < uNum; i++) {
            if (i < uNum / 2) {

                for (float j = numChar; j > 0; j--) {
                    vString += "x";
                }
                numChar += 2;
                vString += "\n";

            } else if (i > uNum / 2) {
                for (float j = numChar; j > 0; j--) {
                    vString += "x";
                }
                numChar -= 2;
                vString += "\n";
            }
        }
        return vString;
    } // 01 End


    // main start
    public static void main(String[] args) {
        // Utils
        Scanner sc = new Scanner(System.in);
        //Variables
        byte uNum1;
        // Programa
        do {
            System.out.println("Introduce n");
            uNum1 = sc.nextByte();

            System.out.println(Diamante01(uNum1));
        } while (uNum1 != 0);


    } // main end
} // class end
