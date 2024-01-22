public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static String classifyNumber(int args) {
        if(args % 2 == 0) {
            if(args >= 0) { 
                return args + "é par e positivo";
            }
            return args + "é par e negativo";
        }
        if (args >=0) {
            return args + "é impar e positivo";
        }
        return args + "é impar e negativo";
    }

    public static int (int args) {
        if(args == 0) {
            return 0;
        }
        if (args == 1) {
            return 0;
        }
    }
}
