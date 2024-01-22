public class App {
    public static void main(String[] args) throws Exception {
        classifyNumber(-12);
        classifyNumber(3);
        classifyNumber(10);
        Holidays.createHolidays();
        checkHoliday("13-11-1997");
        checkHoliday("01-01-2024");
    }

    public static void classifyNumber(int args) {
        if(args % 2 == 0) {
            if(args >= 0) { 
                System.out.println(args + " é par e positivo");
                return;
            }
            System.out.println(args + " é par e negativo");
            return;
        }
        if (args >=0) {
            System.out.println(args + " é impar e positivo");
            return ;
        }
        System.out.println(args + " é impar e negativo");
    }

    public static void checkHoliday(String date) {
        for (Holidays h: Holidays.holiday) {
            if(h.getDate().equals(date)) {
                System.out.println("O dia " + date + " é " + h.getName() + "!");
                return;
            }
            System.out.println("O dia " + date + " não é um feriado... :/");
            return;
        }
    }

}
