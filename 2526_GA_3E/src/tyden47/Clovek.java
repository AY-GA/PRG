package tyden47;

import lombok.Data;

@Data
public class Clovek {
    final String name;
    final String surname;
    final int year;
//    final LocalDate birthday;

    public Clovek(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
//        this.birthday = birthday;
    }
}
