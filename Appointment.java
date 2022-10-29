//Appointment.java


public class Appointment
{
    private String description;
    private int year;
    private int month;
    private int day;
    public Appointment(int year,int month,int day,String description)
    {
        this.year = year;
        this.month = month;
        this,day = day;
        this.description = description;
    }
    public int getYear()
    {
        return year;
    }
    public int getMonth()
    {
        return month;
    }
    public int getDay()
    {
        return day;
    }
    public boolean occursOn(int year,int month,int day)
    {
        return (year==this.year)&&(month==this.month)&&(day==this.day);
    }
    public String toString()
    {
        return description;
    }
}

// AppointmentTester


    imprt java.util.Scanner;
public class AppointmentTester
{
    public static void main(String[] args)
    {
        Appointment[]appointments = new Appointment[2];
        appointments[0]=new Daily(2016,1,1,"Clean Room");
        appointments[1]=new Monthly(2016,1,31,"visit Dentist");
        system.out.println("Enter a date(year,month,day)to list"+"appointment:  ");
        scanner in = new Scanner (System.in);
        int year = in.nextInt();
        int month = in.nextInt();
        int day() = in.nextInt();
        for(int i=0;i<appointments.length;i++)
        {
            if(appointments[i].occursOn(year,month,day)
            {

                System.out.println(appointments[i]);
            }
        }
    }
}


//Dily java


public class Dailyextends Appointment{
    public Daily(int year,int month,int day,String description)
    {
        super(year,month,day,description);
    }
    public boolean occursOn(int year, int month,int day)
    {
        if(year>getYear())
        {
            return true;
        }
        if(year == getYear())
        {
            if(month>getMonth())
            {
                return true;
            }
            if(month==getMonth())
            {
                if(day>=getDay())
                {
                    return true;
                }
            }
        }
        return false;
    }
}


//Monthly.java

public class Monthly extends Appointment
{
    public Monthly(int year,int month,int day,String description)
    {
        super(year,month,day,description);
    }
    public boolean occursOn(int year,int month,int day)
    {
        if(year<getYear())
        {
            return false;
        }
        if(month < getMonth()&&year==getYear())
        {
            return false;
        }
        return day==getDay();
    }
}





//Onetime.java


public class Onetime extends Appointment
{
    public Onetime(int year,int month,int day,String description)
    {
        super(year,month,day,description);
    }
}