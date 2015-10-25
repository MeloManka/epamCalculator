package com.golovchik.simpleCalculator;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean checkRegExpNumber(String number){
        Pattern p = Pattern.compile("^[0-9]+$");
        Matcher m = p.matcher(number);
        return m.matches();
    }
    public static boolean checkRegExpSign(Character sign){
        Pattern p = Pattern.compile("^[[\\+]|[\\-] |[\\*]|[\\/]]{1}$");
        String str = String.valueOf(sign);
        Matcher m = p.matcher(str);
        return m.matches();
    }

    public static void main(String[] args) {
        Boolean exit = false;
        while(!exit){
            System.out.println("Enter operation, for example: 1 + 1 or enter exit");
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            if(!str.equals("exit")){
                StringTokenizer st = new StringTokenizer(str);
                String[] arr = {"","",""};
                for(int i = 0; st.hasMoreTokens(); ++i){
                    String n = st.nextToken();
                    arr[i] = n;
                }
                if(!arr[0].equals("") && !arr[1].equals("") && !arr[2].equals("")){
                    String a = arr[0];
                    Character sign = arr[1].charAt(0);
                    String b = arr[2];
                    if(checkRegExpNumber(a) && checkRegExpNumber(b) && checkRegExpSign(sign)){
                        Double firstNum = Double.parseDouble(a);
                        Double secondNum = Double.valueOf(b);
                        Calculator c = new Calculator();
                        c.definitionOfOperation(firstNum,sign,secondNum);
                    } else {
                        System.out.print("You enter wrong symbols");
                    }
                } else {
                    System.out.print("You enter wrong symbols");
                }
            } else {
                exit = true;
            }
        }
    }
}
