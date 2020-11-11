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
         if(randomValue==1)
        {
            System.out.println(" Employee is Present ");
        }
        else
        {
            System.out.println("Employee is Absent");
        }
     }
     
     
     
     
     
     
    

    public static void main(String[] args) 
    {
        Employeewage();
        
    }



}

