package week_33_Trees_TicketingSecurity.practices;

public class GenericTest {

    static <T> void genericDisplay(T element){
        System.out.println(element.getClass().getName() + " = " + element);
    }


    public static void main(String[] args) {
        genericDisplay(8);

        genericDisplay("CodeBusters");


        genericDisplay(11.0);
    }

}
