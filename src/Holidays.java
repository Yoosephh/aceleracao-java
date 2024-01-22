import java.util.ArrayList;
import java.util.List;

public class Holidays {
  private String name;
  private String date;

  Holidays(String date, String name) {
    this.name = name;
    this.date = date;
  }

  public String getName() {
    return this.name;
  }

  public String getDate() {
    return this.date;
  }
  static List<Holidays> holiday = new ArrayList<>();

  public static void createHolidays() {
    holiday.clear();
    holiday.add(new Holidays("01-01-2024", "Confraternização Mundial"));
    holiday.add(new Holidays("12-02-2024", "Carnaval"));
    holiday.add(new Holidays("13-02-2024", "Carnaval"));
    holiday.add(new Holidays("29-03-2024", "Sexta-feira Santa"));
    holiday.add(new Holidays("21-04-2024", "Tiradentes"));
    holiday.add(new Holidays("01-05-2024", "Dia do Trabalho"));
    holiday.add(new Holidays("30-05-2024", "Corpus Christi"));
    holiday.add(new Holidays("07-09-2024", "Independência do Brasil"));
    holiday.add(new Holidays("12-10-2024", "Nossa Senhora Aparecida"));
    holiday.add(new Holidays("02-11-2024", "Finados"));
    holiday.add(new Holidays("15-11-2024", "Proclamação da República"));
    holiday.add(new Holidays("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra"));
    holiday.add(new Holidays("25-12-2024", "Natal"));
  }

}
