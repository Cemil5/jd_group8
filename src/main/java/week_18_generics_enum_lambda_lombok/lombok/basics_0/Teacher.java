package week_18_generics_enum_lambda_lombok.lombok.basics_0;



import lombok.AccessLevel;
import lombok.Builder;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Builder
@Setter
@ToString
public class Teacher {

    private String name;
    private String surname;
    private String email;
    List<String> courses;
    @Setter(AccessLevel.NONE)
    private int year;

    public void setYear(int year) {
        if (year < 1900){
            throw new IllegalArgumentException("Year can not be less than 1900");
        }
        this.year = year;
    }
}
