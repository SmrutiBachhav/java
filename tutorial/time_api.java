import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.*;
class time_api{
    public static void main(String[]args){
        //CLOCK CLASS
        //to get time zone
        Clock c=Clock.systemDefaultZone();
        System.out.println(c);
        System.out.println(c.getZone());
        //to return current instant of clock 
        System.out.println(c.instant());

        //DURATION CLASS
        //TO CHECK IF DURATION IS NEGATIVE
        Duration d1=Duration.between(LocalTime.MIN,LocalTime.NOON);
        System.out.println(d1.isNegative());
        Duration d2= Duration.between(LocalTime.MAX,LocalTime.NOON);
        System.out.println(d2.isNegative());
        //to check if the duration is zero
        Duration d3 = Duration.between(LocalTime.MIN,LocalTime.MIDNIGHT);  //LocalTime.MIN = '00:00' , LocalTime.NOON = '00:00'
        System.out.println(d3.isZero());
        Duration d4 = Duration.between(LocalTime.MAX,LocalTime.MIN);  //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'
        System.out.println(d4.isZero());

        //LOCAL DATE CLASS
        LocalDate d=LocalDate.now();
        System.out.println(d);
        //checking equality of two dates
        LocalDate dt1=LocalDate.parse("2021-05-27");
        LocalDate dt2=LocalDate.parse("2024-01-27");
        LocalDate dt3=LocalDate.parse("2024-01-27");
        System.out.println(dt1.equals(dt2));
        System.out.println(dt2.equals(dt3));
        //to alter years 
        LocalDate ld=LocalDate.parse("2024-01-27");
        System.out.println(ld.withYear(2006));

        //LOCL TIM CLASS
        LocalTime t=LocalTime.now();
        System.out.println(t);
        //to add hours
        LocalTime t1= LocalTime.of(13,18,29);
        System.out.println("TIme before adding: "+t1);
        LocalTime t2=t1.plusHours(29);
        System.out.println("Time after adding hrs: "+t2);
        //to subtract minutes
        LocalTime t3 = LocalTime.of(15,28,19);
        System.out.println("Time before : "  + 3);
        LocalTime t4= t3.minusMinutes(8);
        System.out.println("Time after subtracting 8 minutes : " + t4);

        
        //DATE TIME FORMATTER 
        LocalDateTime dt =LocalDateTime.now();
        System.out.println("the current date: "+dt);
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String mydate=dt.format(df);
        System.out.println("the current date: "+mydate);
        //ISO format
        DateTimeFormatter df2=DateTimeFormatter.ISO_LOCAL_DATE;
        String mydate2=dt.format(df2);
        System.out.println("the ISO FORMAT date: "+mydate2);
        //to return no of weeks and year
        DateTimeFormatter df3 = DateTimeFormatter.ISO_WEEK_DATE;
        String myDate3 = dt.format(df3); 
        System.out.println("Date in ISO_WEEK_DATE Format  : "+ myDate3);
        //to return year and day of the year
        DateTimeFormatter df4 = DateTimeFormatter.ISO_ORDINAL_DATE;
        String myDate4 = dt.format(df4);
        System.out.println("Date in ISO_WEEK_DATE Format  : "+ myDate4);
        //patterns for formatting and parsing
        //example: E day of week, H hour of day , m minutes of hour, a am pm of day
        DateTimeFormatter df5 = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a"); // This is the format
        DateTimeFormatter df6 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate5 = dt.format(df5); // Creating date string using date and format
        System.out.println(myDate5);

        //for more refer java 14 docs --api documents--time.api.LocalTime....








    }
}