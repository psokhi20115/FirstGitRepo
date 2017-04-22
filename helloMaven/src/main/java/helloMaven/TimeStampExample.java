package helloMaven;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class TimeStampExample {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

    public static void main(String[] args) {
    	//2017-04-10 00:00:00.0

        //method 1
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);
        
       // {2017-04-16 00:00:00.0=2017-04-16 23:59:59.0, 2017-04-17 00:00:00.0=2017-04-17 23:59:59.0}

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        try {  
            Date date = formatter.parse("31/03/2015");  
            System.out.println("Date is: "+date);  
        } catch (ParseException e) {e.printStackTrace();}  
 

        //method 2 - via Date
        Date date = new Date();
        System.out.println(new Timestamp(date.getTime()));

        //return number of milliseconds since January 1, 1970, 00:00:00 GMT
        System.out.println(timestamp.getTime());

        //format timestamp
        System.out.println(sdf.format(timestamp));

    }

}
