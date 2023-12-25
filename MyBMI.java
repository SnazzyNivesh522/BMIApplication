//*************************************************************************************************
//BMI.java
//Heet Patel T00724426
//COMP 1231 Assignment 2
//Java Application that calculates Body Mass Index(BMI) of person
//*************************************************************************************************
abstract class MyBMI{
    String name;
    double weight;

    abstract public String getName(); 
    abstract public void setName(String name);
    abstract public double getWeight();
    abstract public void setWeight(double weight);
    abstract public String analysisBMI();
    //default constructor
    public MyBMI() {
        this.name = "";
        this.weight=0.0;
    }    
    //parameterized constructor
    public MyBMI(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }  
    
    
}
class ImperialUnit extends MyBMI{
    private double heightFeet,heightInch;

    //default constructor
    public ImperialUnit(){
        super();
        this.heightFeet=this.heightInch=0.0;
    }
    //parameterized constructor
    public ImperialUnit(String name, double weight, double heightFeet, double heightInch) {
        super(name, weight);
        this.heightFeet = heightFeet;
        this.heightInch = heightInch;
    }

    //accessors and mutators
    public double getHeightFeet() {
        return heightFeet;
    }

    public void setHeightFeet(double heightFeet) {
        this.heightFeet = heightFeet;
    }

    public double getHeightInch() {
        return heightInch;
    }

    public void setHeightInch(double heightInch) {
        this.heightInch = heightInch;
    }
    @Override
    public String getName() {
        
        return name;
    }

    @Override
    public void setName(String name) {
        
        this.name=name;
    }

    @Override
    public double getWeight() {
            
        return weight;
    }

    @Override
    public void setWeight(double weight) {
       
        this.weight=weight;
    }
    @Override
    public String analysisBMI() {
        
        double height=(this.heightFeet*12+this.heightInch)*2.54/100;
        double bmi=this.weight / Math.pow(height,2);
        System.out.print("\tHeight="+String.format("%.2f",height)+"m"+"\tBMI="+String.format("%.2f",bmi));
        if (bmi<18.0){
        System.out.print("\tResult of analysis=Underweight");
        }
        else if(bmi>25.0){
            System.out.print("\tResult of analysis=Overweight");
        }
        else{
            System.out.print("\tResult of analysis=Normal weight");
        }
        return "";
        
    }
    @Override
    public String toString() {
        System.out.print("Name="+this.name+"\tWeight="+String.format("%.2f",this.weight)+"kg");
        System.out.println(analysisBMI());
        return "";
    }
    


}
class MetricUnit extends MyBMI{
    private double heightCm;
    //default constructor
    public MetricUnit(){
        super();
        heightCm=0.0;
    }
    //parameterized constructor
    public MetricUnit(String name, double weight, double heightCm) {
        super(name, weight);
        this.heightCm = heightCm;
    }
    //accessors and mutators
    public double getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(double heightCm) {
        this.heightCm = heightCm;
    }

    @Override
    public String getName() {
        
        return name;
    }

    @Override
    public void setName(String name) {
        
        this.name=name;
    }

    @Override
    public double getWeight() {
        
        
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        
        this.weight=weight;
    }

    @Override
    public String analysisBMI() {
        
        double height=this.heightCm/100;
        double bmi=this.weight / Math.pow(height,2);
        System.out.print("\tHeight="+String.format("%.2f",height)+"m"+"\tBMI="+String.format("%.2f",bmi));
        if (bmi<18.0){
        System.out.print("\tResult of analysis=Underweight");
        }
        else if(bmi>25.0){
            System.out.print("\tResult of analysis=Overweight");
        }
        else{
            System.out.print("\tResult of analysis=Normal weight");
        }
        return "";
        
        
    }
    @Override
    public String toString() {
        System.out.print("Name="+this.name+"\tWeight="+String.format("%.2f",this.weight)+"kg");
        System.out.println(analysisBMI());
        return "";
    }
    
    

}