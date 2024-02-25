import java.time.LocalDateTime;


public class CurrentTime {
    public static void main(String[] args)
    {
        LocalDateTime currentdatetime = LocalDateTime.now();
        System.out.println("Current date and Time : "+currentdatetime);
    }
}
