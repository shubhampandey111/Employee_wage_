import java.util.Random;

/**
 *
 * @author Dell
 */
public class Employeewage
{
    static void Employeewage()
     {
         Random r = new Random();
         int randomValue= r.nextInt() % 2;
         int wage_per_hour= 20;
         int full_day_hour= 8;
         int fulldaywage= wage_per_hour * full_day_hour;
         if(randomValue== 1)
        {
            
            System.out.println(" Employee is Present and thus wage is '"+fulldaywage+"'");
        }
        else
        {
            System.out.println("Employee is Absent so No wage");
        }
     }
    
    
    public static void main(String[] args) {
        Employeewage();
    }
}

