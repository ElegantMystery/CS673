// https://github.com/ElegantMystery/CS673
import java.util.Arrays;
import java.util.ArrayList;
class HelloWorld {
    public static void main(String[] args) {
        hello();
        multi_table();
        System.out.printf("abccba is %b \n", is_palindrom("abccba"));
        System.out.printf("a is %b \n", is_palindrom("a"));
        System.out.printf("abc is %b \n", is_palindrom("abc"));
        ArrayList<Character> a = new ArrayList<>(
            Arrays.asList('a','b','c'));
        ArrayList<Character> b = new ArrayList<>(
            Arrays.asList('1','2','3'));
        System.out.println(combine(a,b));
        print_fib();
        System.out.printf("2024 is %b",is_leap_year(2024));
    }

    public static void hello() {
        System.out.println("Hello, World!"); 
    }

    public static void multi_table() {
        int[][] table = new int[13][13];
        for (int i = 1; i < 13; ++i) {
            table[i][0] = i;
            table[0][i] = i; 
        }

        for (int i = 1; i < 13; ++i) {
            for (int j = 1; j < 13; ++j) {
                table[i][j] = i * j;
            }
        }

        System.out.println(Arrays.deepToString(table).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
    }

    public static Boolean is_palindrom(String s) {
        int front = 0;
        int end = s.length() - 1;
        while(front < end) {
            if(s.charAt(front) != s.charAt(end)){
                return false;
            }
            front += 1;
            end -= 1;
        }
        return true;
    }

    public static ArrayList<Character> combine(ArrayList<Character> a, ArrayList<Character> b) {
        ArrayList<Character> res = new ArrayList<Character>();
        for(int i = 0; i < a.size(); ++i) {
            res.add(a.get(i));
            res.add(b.get(i));
        }
        return res;
    }

    public static void print_fib() {
        ArrayList<Double> res = new ArrayList<>();
        res.add(1.0);
        res.add(1.0);
        while(res.size() < 100) {
            double first = res.get(res.size()-2);
            double second = res.get(res.size()-1);
            res.add(first+second);
        }
        System.out.println(res);
    }

    public static Boolean is_leap_year(int year) {
        if(year % 4 == 0) {
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                }else {
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }
}