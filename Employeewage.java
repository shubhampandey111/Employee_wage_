import java.util.Random;

/**
 *
 * @author Dell
 */
public class Employeewage 
{
    public void Employeewage() 
    {
        Random r= new Random();
        int randomValue= r.nextInt() % 2;
        int wage_per_hour= 20;
        int full_day_hour= 8;
        int fulldaywage= wage_per_hour * full_day_hour;
        int dailywage=0;
        int monthlywage=0;
        int isFullTime= 1;
        int isPartTime= 0;
        int totalworkingdays=0;
        int totalworkinghours=0;
        int empHr=0;
//        if (randomValue== 1) 
         
            while(totalworkingdays<20 && totalworkinghours<100)
            {
//                System.out.println("For Day '"+i+"'");
            
            int presentemp= r.nextInt() % 3;
            switch(presentemp)
            {
                
            case 0: int halfdaywage= fulldaywage/2;
            System.out.println("Employee is Present and thus wage is '"+halfdaywage+"'");
            empHr=4;
            totalworkingdays=totalworkingdays + 1;
            totalworkinghours=totalworkinghours+empHr;
                
                break;
            case 1: System.out.println("Employee is Present for fullday, thus wage is '"+fulldaywage+"'");
                empHr=8;
            totalworkingdays=totalworkingdays + 1;
            totalworkinghours=totalworkinghours+empHr;
                
            break;
            default: System.out.println("Employee is Absent so No wage");
            empHr=0;
                totalworkingdays=totalworkingdays + 1;
            totalworkinghours=totalworkinghours+empHr;
            break;
            }
            
            dailywage= empHr * wage_per_hour;
        System.out.println("Daily Employee wage = '"+dailywage+"'");
        monthlywage= monthlywage + dailywage;

        
            }
       System.out.println(" MOnthly wage is '"+monthlywage+"'");     
       System.out.println(" Total Working Days '"+totalworkingdays+"'");
       System.out.println(" Total Working hours '"+totalworkinghours+"'"); 
    }

    public static void main(String[] args) {
     Employeewage ew= new Employeewage();
        ew.Employeewage();
    }
}
