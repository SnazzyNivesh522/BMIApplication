# BMIApplication
College Assignment
Design and implement a Java application that calculates the Body Mass Index (BMI) of a person. The formula of BMI is dividing a person's weight in kilograms (kg) by the person's height in square meters (m²) (i.e., multiply the height in meters by itself). A BMI below 18.5 is considered underweight, and 25.0 or more is considered overweight.
The application will accept the height of a person in feet and inches (Imperial system) or in centimeters (Metric system). But it will accept the weight of the person in kg only. The application will determine if the user is underweight, overweight, or has a normal weight based on the person's BMI.
Design the application using the inheritance hierarchy starting with an abstract class MyBMI, then two derived classes: ImperialUnit and MetricUnit.</br>
• Assign MyBMI with two private attributes: name of the person and the weight of the person in kg.
• Assign ImperialUnit with two attributes for the height (feet and inches). For MetricUnit, assign it with only one attribute (the height in centimeters). Use the formula of "1 inch = 2.54 centimeters" to do the conversion between these units.
• For each attribute, there should be an accessor method and a mutator method. In addition, there should be a method to perform an analysis on the calculated BMI value to determine if the person's BMI falls within the normal range. Use abstract methods in your design to ensure that some methods must be overridden in the derived classes
Design and implement a Java application that calculates the Body Mass Index (BMI) of a person. The formula of BMI is dividing a person's weight in kilograms (kg) by the person's height in square meters (m²) (i.e., multiply the height in meters by itself). A BMI below 18.5 is considered underweight, and 25.0 or more is considered overweight.
The application will accept the height of a person in feet and inches (Imperial system) or in centimeters (Metric system). But it will accept the weight of the person in kg only. The application will determine if the user is underweight, overweight, or has a normal weight based on the person's BMI.
Design the application using the inheritance hierarchy starting with an abstract class MyBMI, then two derived classes: ImperialUnit and MetricUnit.
• Assign MyBMI with two private attributes: name of the person and the weight of the person in kg.
• Assign ImperialUnit with two attributes for the height (feet and inches). For MetricUnit, assign it with only one attribute (the height in centimeters). Use the formula of "1 inch = 2.54 centimeters" to do the conversion between these units.
• For each attribute, there should be an accessor method and a mutator method. In addition, there should be a method to perform an analysis on the calculated BMI value to determine if the person's BMI falls within the normal range. Use abstract methods in your design to ensure that some methods must be overridden in the derived classes.
• Use the following test exhibit as a reference to design your demonstration.
![image](https://github.com/SnazzyNivesh522/BMIApplication/assets/115729819/cb4f8ffd-de07-4974-9476-f5a7bdfc849f)
