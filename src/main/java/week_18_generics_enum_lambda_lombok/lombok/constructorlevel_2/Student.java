package week_18_generics_enum_lambda_lombok.lombok.constructorlevel_2;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
 class Student {

    @NonNull
    private String name;
    @Setter(AccessLevel.NONE)
    private String surname;
    private String email;
    List<String> courses;

    @Setter(AccessLevel.NONE)
    private int year;
    private long phoneNumber;

    @Builder
    public Student(String name, String surname, String email, long phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }



    public void setYear(int year) {
        this.year = year;
    }
}
