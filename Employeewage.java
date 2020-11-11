import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Employeewage
{
    static void Employeewage() 
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
        int empHr=0;
//        if (randomValue== 1) 
         
            for(int i=0; i<=20; i++)
            {
                System.out.println("For Day '"+i+"'");
            
            int presentemp= r.nextInt() % 3;
            switch(presentemp)
            {
                
            case 0: int halfdaywage= fulldaywage/2;
            System.out.println("Employee is Present and thus wage is '"+halfdaywage+"'");
                empHr=4;
                break;
            case 1: System.out.println("Employee is Present for full day and thus wage is '"+fulldaywage+"'");
                empHr=8;
                break;
            case 2: System.out.println("Employee is Absent so No wage");
                 empHr=0;
                break;            
            default: System.out.println("Employee is Absent so No wage");
            empHr=0;
                break;
            }
            
            dailywage= empHr * wage_per_hour;
        System.out.println("Daily Employee wage = '"+dailywage+"'");
        monthlywage= monthlywage + dailywage;

        
            }
       System.out.println(" Total Monthly wage is '"+monthlywage+"'");     

        
    }

    public static void main(String[] args) {
        Employeewage();
    }
}

