					Oops Practise Exercise-1


Exercise – 1

Create a class named Product with the following instance variables

productCode of type String

productName of type String

productPrice of type double

Create another class TestProduct with a main method to test above class

create an object of Product and display the values of instance variables

create another object, assign values to member variables and display the values of member variables

Output Format:

The object data should be displayed in the following format

 Product Code : P101

Product Name : Laptop

 Product Price : 45000.00


Exercise – 2


Create a class named Product with the following private instance variables

productCode of type String

productName of type String

productPrice of type double

Include Getters and Setters for all the variables

Create another class TestProduct with a main method to test above class

create another object of Product class and assign values to member variables using setters

Display the values of member variables using getter methods

Output Format:

The object data should be displayed in the following format Product Code : P101

Product Name : Laptop 

Product Price : 45000.00


Exercise - 3


Create a class named Product with the following private instance variables

productCode of type String

productName of type String

productPrice of type double

Include a parameterized constructor with 3 parameters to initialize the member variables.

Include a method displayProductDetails to display object state in the following format. This Method does not accept any parameters and does not return anything.

Product Code : P101

Product Name : Laptop 

Product Price : 45000.00


Create class TestProduct with a main method to test above class

Create an object using the parameterized constructor

Invoke displayProductDetails method and display the product details


Exercise - 4


Create a class named MyUtil.

Create a static method throwDice which should return a random number between 1 and 6 inclusive. (hint: use random method of Math class)

Create a static method findAverage which takes an array of integers as parameter. The method should return the average of the integers present in the array.

Create a class TestMyUtil with a main method.

Test the throwDice method

Create two integer arrays and find the average of both the array elements using findAverage method

Find the max and min of two doubles by using static methods of Math class

Find the ceiling, floor and round of a number by using static methods of Math class.


Exercise - 5


Create a class named Product with the following private instance variables

productCode of type String

productName of type String

productPrice of type double

categoryCode of type char (E- electronics, A - apparels, T – toys)

Include a private static variable prodCounter of type int initialized to 100. Create getters and setters for all variables

Create a private method generateProductCode which will return the product code as String. Product code is derived by concatenating categoryCode and incremented product counter.

Include a parameterized constructor with 3 parameters ( productName, productPrice, categoryCode). prodCode should be assigned in constructor by using generateProductCode method. Initialize all the member variables.

Include an overloaded parameterized constructor with 2 parameter( productName, productPrice). prodCode should be assigned in constructor by using generateProductCode method. Category code should be assigned to ‘E’. Initialize all the member variables.

Include a method getProductDetails to format the product details. This method should return a String containing the product details in the below format

Product : Code – 101, Name – Laptop, price - 45000.00, Category – E

Create class TestProduct with a main method to test above class

Create an object using the parameterized constructor with 3 parameters

Get the product details by invoking getProductDetails and display the details

Create another object using the parameterized constructor with 2 parameters

Get the product details by invoking getProductDetails and display the details


Exercise - 6
	Create a class named Average

Include a static method named avg, which takes two integers as parameters and returns a double as average.

Include an overloaded static method avg, which takes three integers as parameters and returns a double as average

Include an overloaded static method named avg, which takes two doubles as parameters and returns a double as average

Create a class TestAverage with a main method.

Test all the avg overloaded methods



Exercise - 7

	Write a program to create a class named shape. In this class we have three subclasses circle, triangle and square each class has two member functions named draw () and erase (). Create these using polymorphism concepts.

Exercise - 8

	Write a program and create a class ‘SimpleObject‘. Using a constructor, display the message.

Exercise - 9

	Write a program to Add two distances in inch-feet by creating a class named 'AddDistance'.
