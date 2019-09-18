package com.example.week5_test;

public class test_part2 {
    static String host= "catcowcat";

    public static void run(String string, int total){
        char[] hostchar = host.toCharArray();
        char[] schar = string.toCharArray();
        for (int i = 0; i < hostchar.length - schar.length + 1; i++){
            if (hostchar[i] == schar[0]){
                int count = 0;
                for(int j = 0; j< schar.length; j++){
                    if(hostchar[i+j] == schar[j]){
                        count++;
                    }
                }
                if(count == schar.length){
                    total--;
                }
            }
        }
        if(total <= 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        host.contains("cow");
    }

    public static void main(String[] args) {
        run("cow", 1);
        run("cat", 1);
        run("cow", 2);
    }
}
