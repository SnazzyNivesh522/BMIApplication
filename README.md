# BMIApplication

##
Design and implement a Java application that calculates the Body Mass Index (BMI) of a person. The formula of BMI is dividing a person's weight in kilograms (kg) by the person's height in square meters (m²) (i.e., multiply the height in meters by itself). A BMI below 18.5 is considered underweight, and 25.0 or more is considered overweight.</br>

- The application will accept the height of a person in feet and inches (Imperial system) or in centimeters (Metric system). But it will accept the weight of the person in kg only. The application will determine if the user is underweight, overweight, or has a normal weight based on the person's BMI.</br>
- Design the application using the inheritance hierarchy starting with an abstract class MyBMI, then two derived classes: ImperialUnit and MetricUnit.</br>
- Assign MyBMI with two private attributes: name of the person and the weight of the person in kg.</br>
- Assign ImperialUnit with two attributes for the height (feet and inches). For MetricUnit, assign it with only one attribute (the height in centimeters). Use the formula of "1 inch = 2.54 centimeters" to do the conversion between these units.</br>
- For each attribute, there should be an accessor method and a mutator method. In addition, there should be a method to perform an analysis on the calculated BMI value to determine if the person's BMI falls within the normal range. Use abstract methods in your design to ensure that some methods must be overridden in the derived classes</br>
- Declare a default constructor and a parameterized constructor for each class. All classes except the driver class must also have a toString() method that returns a custom string about the details of an object.</br>
- Create a driver class named BMIApp with a single array reference of the MyBMI class. Since no user input is needed in the driver, you can write some code statements to store in the array with three objects using the Imperial system and an additional three other objects using the Metric system (a total of six objects). For example,</br>
//An object is created using the imperial system with 4 parameters:</br>
//Peter has a weight of 80.0 kg and a height of 5 feet and 5 inches.</br>
bmiList[2] = new ImperialUnit("John", 80.0, 5, 5);</br>
//An object is created using the metric system with 3 parameters:</br>
//David has a weight of 70.33 kg and a height of 167 cm</br>
bmiList[3] = new MetricUnit("David", 70.33, 167);</br>
- Use a loop to traverse the array in the driver to display the details of the six objects. (Note: BMIApp should have only one System.out.println statement that is coded within the loop to display the details of all objects. No other "println" statements should be coded in the driver. The output text messages should be coded in the abstract and derived classes. All numbers must be formatted with 2 decimal points.)</br>
- Illustrate the class design using a UML class diagram (Note: the driver class can be excluded from the diagram). Draw the UML diagram using a software tool (a UML CASE tool or any simple drawing tool that supports the correct UML symbols can be used. </br>
- Use the following test exhibit as a reference to design your demonstration.</br>
![image](https://github.com/SnazzyNivesh522/BMIApplication/assets/115729819/cb4f8ffd-de07-4974-9476-f5a7bdfc849f)
