
package com.example.administrator.calculator;




import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Algorithm extends  MainActivity{
    public static ArrayList intent(StringBuffer str){
        for (int i = 1; i < str.length(); i++){
            if (str.charAt(i) == '-' && str.charAt(i - 1) == '('){
                str.insert(i, '0');
            }
        }
        StringBuilder temp = new StringBuilder();
        List<String> list = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++){
            if ((str.charAt(i) >= '0' && str.charAt(i) <= '9') || str.charAt(i) == '.'){
                if (str.charAt(i) == '.' && temp.length() == 0){
                    temp.append(0);
                    temp.append(str.charAt(i));
                } else {
                    temp.append(str.charAt(i));
                }
                if (i == str.length() - 1){
                    list.add(temp.toString());
                }
            } else  {
                if (temp.length() != 0)
                    list.add(temp.toString());
                list.add(String.valueOf(str.charAt(i)));
                temp.delete(0, temp.length());
            }
        }
        for (String aList : list) {
            System.out.print(aList + " ");
        }
        System.out.println();
        Stack<String> stack = new Stack<>();
        Map<Character, Integer> map = new HashMap<>();
        map.put('(', 0);
        map.put(')', 0);
        map.put('*', 1);
        map.put('/', 1);
        map.put('+', 2);
        map.put('-', 2);
        for ( String s : list ) {
            if ( s.equals("*") || s.equals("/") || s.equals("+") || s.equals("-") || s.equals("(") || s.equals(")") ){
                if (stack.size() == 0){
                    stack.push(s);
                } else {
                    if (s.equals(")")) {
                        if (!stack.empty()){
                            while (!stack.peek().equals("(")){
                                result.add(stack.pop());
                                if (stack.empty()){
                                    break;
                                }
                            }
                            if (!stack.empty()){
                                if (stack.peek().equals("("))
                                    stack.pop();
                            }
                        }
                    } else{
                        if (s.equals("(")){
                            stack.push(s);
                        } else {
                            if (stack.peek().charAt(0) != '('){
                                if (  map.get(s.charAt(0)) < map.get(stack.peek().charAt(0)) ){
                                    stack.push(s);
                                } else {
                                    while ((map.get(s.charAt(0)) >= map.get(stack.peek().charAt(0))) && !stack.empty()){
                                        result.add(stack.pop());
                                        if (stack.empty()){
                                            break;
                                        }
                                        if (stack.peek().equals("(")){
                                            break;
                                        }
                                    }
                                    stack.push(s);
                                }
                            } else {
                                stack.push(s);
                            }
                        }
                    }
                }
            } else {
                result.add(s);
            }
        }
        while (!stack.empty()){
            result.add(stack.pop());
        }
        return result;
    }
    public static String Cal(ArrayList arrayList){
        int length = arrayList.size();
        String[] arr = new String[length];

        for (int i = 0; i < arrayList.size(); i++){
            arr[i] = (String)arrayList.get(i);
        }
        List<String> list = new ArrayList<>();
        for (String anArr : arr) {
            int size = list.size();
            switch (anArr) {
                case "+":
                    BigDecimal a = new BigDecimal(list.remove(size - 2)).add(new BigDecimal(list.remove(size - 2)));
                    list.add(a.stripTrailingZeros().toString());
                    break;
                case "-":
                    BigDecimal b = new BigDecimal(list.remove(size - 2)).subtract(new BigDecimal(list.remove(size - 2)));
                    list.add(b.stripTrailingZeros().toString());
                    break;
                case "*":
                    BigDecimal c = new BigDecimal(list.remove(size - 2)).multiply(new BigDecimal(list.remove(size - 2)));
                    list.add(c.stripTrailingZeros().toString());
                    break;
                case "/":
                    BigDecimal d = new BigDecimal(list.remove(size - 2)).divide(new BigDecimal(list.remove(size - 2)), 10, BigDecimal.ROUND_HALF_UP);
                    list.add(d.stripTrailingZeros().toString());
                    break;
                default:
                    list.add(anArr);
                    break;
            }
        }
        if (list.size() == 1){
            if (list.get(0).length() < 30){
                BigDecimal bd = new BigDecimal(list.get(0));
                return bd.toPlainString();
            } else {
                double d = Double.valueOf(list.get(0));
                return String.valueOf(d);
            }
        } else {
            return "错误";
        }
    }
}
