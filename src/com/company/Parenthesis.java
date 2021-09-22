package com.company;

public class Parenthesis {

//
//
//    Example:
//
//            “it (is) a (new day)” => true
//
//            “it )is( a (new day)” => false
//
//            “((what is u(p)))” => true

//    “it (is) a )new day(” => false


//              "()" => true
//            "))" => false
//            "lorem ipsum ()" => true
//            "(lorem ipsum)" => true

    public static void main(String[] args) {
	// write your code here

        System.out.println(isValid("))"));
        System.out.println(isValid("lorem ipsum ()"));
        System.out.println(isValid("(lorem ipsum)"));

    }

    public static boolean isValid(String s){
        if (s.length() <=1){
            return false;
        }
        int count = 0;
        char[] ch = s.toCharArray();

        for (char c: ch) {
            if (c == '('){
                count ++;
            }else if(c == ')') {
                if(count == 0){
                    return false;
                }
                count --;
            }
        }

        return count == 0;
    }
}
