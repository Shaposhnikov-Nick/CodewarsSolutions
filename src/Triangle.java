/*
check that it is a triangle
 */
public class Triangle {
    public static void main(String[] args) {
        System.out.println(isTriangle(4, 8, 3));
    }


        public static boolean isTriangle(int a, int b, int c){
            if((a+b)>c && (a+c)>b && (c+b)>a)
                return true;
            else return false;
        }
    }

