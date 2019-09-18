package com.example.week5_test;

public class test_part1 {
    static String string1 = "({})[]";
    static String string2 = "[]{]}[";


    static public Boolean test(String string) {
        int count = 0;
        char[] chars = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if (chars[i] == '(') {
                for (int j = i+1; j<string.length(); j++) {
                    if(chars[j] == ')'){
                        count++;
                        break;
                    }
                }
            }
            if (chars[i] == '[') {
                for (int j = i+1; j<string.length(); j++) {
                    if(chars[j] == ']'){
                        count++;
                        break;
                    }
                }
            }
            if (chars[i] == '{') {
                for (int j = i+1; j<string.length(); j++) {
                    if(chars[j] == '}'){
                        count++;
                        break;
                    }
                }
            }
        }
        if(count == string.length()/2){
            System.out.println(true);
            return true;
        }else{
            System.out.println(false);
            return false;
        }
    }

    public static void main(String[] args) {
        test(string1);
        test(string2);
    }
}
