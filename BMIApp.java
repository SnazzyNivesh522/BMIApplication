//*************************************************************************************************
//BMIApp.java
//Heet Patel T00724426
//COMP 1231 Assignment 2
//Java Application that calculates Body Mass Index(BMI) of person
//*************************************************************************************************
public class BMIApp {
    public static void main(String[] args) {
        // Create a new instance of the BMI class.
        MyBMI bmiList[]=new MyBMI[6];
        //Imperial Units object
        bmiList[0]=new ImperialUnit("Peter",50.60,7.0,1.82);
        bmiList[1]=new ImperialUnit("Mary",55.55,5,8.11);
        bmiList[2]=new ImperialUnit("John",80,5,4.96);
        //mETRIC sYSTEM oBJECTS
        bmiList[3]=new MetricUnit("David",70.33,167);
        bmiList[4]=new MetricUnit("Betty",62,198);
        bmiList[5]=new MetricUnit("Jenny",49.12,150);

        System.out.println(bmiList[0]);
        System.out.println(bmiList[1]);
        System.out.println(bmiList[2]);
        System.out.println(bmiList[3]);
        System.out.println(bmiList[4]);
        System.out.println(bmiList[5]);
        System.out.println();
        

    }
    
}
