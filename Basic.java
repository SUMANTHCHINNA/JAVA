// File Handling
import java.io.*;
public class Basic
{
    public static void main(String[]args)
    {
        try
    {   
        File file = new File("bobbycopy.txt");
        if(file.createNewFile())
        {
            System.out.println("The file has created named "+file.getName());
        }
        else
        {
            System.out.println("The file is already exists...");
        }
        
    }
        catch (IOException e)
        {
            System.out.println("Unexpeted error occur...");
            e.printStackTrace();
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


// Java program to merge two
// files into third file

import java.io.*;
public class Basic
{
	public static void main(String[] args) throws IOException
	{
		// PrintWriter object for file3.txt
		PrintWriter pw = new PrintWriter("bobbymergedfile.txt");
		// BufferedReader object for file1.txt
		BufferedReader br = new BufferedReader(new FileReader("bobby.txt"));
		String line = br.readLine();
		// loop to copy each line of
		// file1.txt to file3.txt
		while (line != null)
		{
			pw.println(line);
			line = br.readLine();
		}
		br = new BufferedReader(new FileReader("bobbycopy.txt"));
		line = br.readLine();
		// loop to copy each line of
		// file2.txt to file3.txt
		while(line != null)
		{
			pw.println(line);
			line = br.readLine();
		}
		pw.flush();
		// closing resources
		br.close();
		pw.close();
		System.out.println("Merged bobby.txt and bobbycopy.txt into bobbymergedfile.txt");
	}
}

///////////////////////////////////////////////////////////////////////////////////////////////////////

//file copy in java..
import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileCopy <source file> <destination file>");
            System.exit(1);
        }
        
        String sourceFile = args[0];
        String destFile = args[1];
        
        try (BufferedReader br = new BufferedReader(new FileReader("bobby.txt"));
             PrintWriter pw = new PrintWriter(new FileWriter("bobbycopy.txt"))) {
            
            String line = br.readLine();
            while (line != null) {
                pw.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//counting words and lines of the given file
import java.util.Scanner;
import java.io.*;
public class readFilePrintwords {
    public static void main(String args[]) throws IOException
    {
    char ch;
    int nLines=1, nWords=0;
    Scanner sc = new Scanner(System.in);
    String filename = sc.nextLine();
    FileInputStream f = new FileInputStream(filename);
    int n_bytes = f.available(); //returns no of bytes that can be read
    for(int i=0;i<n_bytes;i++)
    {
        ch = (char)f.read();
        if(ch == '\n')
        nLines += 1;
        if(ch == ' ')
        nWords += 1;

    }
System.out.println("Number of lines in file:"+nLines);

System.out.println("Number of words in file:"+(nWords+nLines));
}
}
//////////////////////////////////////////////////////////////////////////////////

// fibonacci Series...
import java.util.*;
public class Basic
{
    public static void main(String[]args)
    {
        int n1=0;
        int n2=1;
        int n3;
        int count = 10;
        System.out.println(n1+"\n"+n2);
        for(int i=2;i<=count;i++)
        {
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
        
    }
}
////////////////////////////////////////////////////////////////////////////////////
//type conversion
import java.io.*;
public class Basic
{
    public static void main(String[]args)
    {
        int a = 3;
        double b = a;
        System.out.println(+b);
        double c =b;
        int d = (int)b;
        System.out.println(+d);
    }
}

///////////////////////////////////////////////////////////////////////
// java hello world program...
public class Basic{
    public static void main(String[]args)
    {
        System.out.println("hello world");
    }
}

// running character in java...
import java.util.*;
public class Basic
{
    public static void main(String[]args)
    {
        char a = 'A';
        System.out.println(a);
    }
}

// ternary opeartor in java...
import java.util.*;
public class Basic
{
    public static void main(String args[])
    {
        int a =1;
        int b = 10;
        int max = (a>b)?a:b;
        System.out.println(max);
    }
}

// for loop with unconditional expressionin java...
import java.util.*;
public class Basic 
{
    public static void main(String args[])
    {
        int a =10;
        for(int i = 11;i<=10;i++)
        {
            System.out.println(+i);
        }
        System.out.println("The loop as terminated with unconditioned expression...");
    }
}

// Sum of natural numbers in java..
import java.util.*;
public class Basic 
{
    public static void main(String args[])
    {
        int sum = 0;
        int num = 10;
        for(int i = 0;i<=num;i++)
        {
            sum+=i;
        }
        System.out.println(+sum);
    }
}

// for-each condition program in java...
import java.util.*;
public class Basic
{
    public static void main(String args[])
    {
        int num[]={1,2,3,4,5,6,7,8,9,0};
        System.out.println("print those values by using for-each condition...");
//         for (int i : num) {
            System.out.println(+i);
        }
        
    }
}

// Sum of natural numbers using While loop in java....

import java.util.*;
public class Basic
{
    public static void main(String args[])
    {
        int a = 10;
        int sum = 0;
        int i=0;
        while(i<=a)
        {
            sum+=i;
            i+=1;
        }
    }
}

//creating reference variables in java....
import java.util.*;
public class Basic
{
    int a = 10;
    public static void main(String args[])
    {
        Basic b = new Basic();
        System.out.println(b.a);
    }
}


//area of the rectangle....
class Rectangle
{
    int length;
    int breadth;
    void insert(int l,int b)
    {
    length = l;     
    breadth = b;
    }
void area()
{
    System.out.println(length*breadth);
}
}
class Basic
{
    public static void main(String args[])
    {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.insert(2,3);
        r2.insert(5,2);
        r1.area();
    }
}

// Factorial in java...
class Calculation{  
    void fact(int  n){  
     int fact=1;  
     for(int i=1;i<=n;i++){  
      fact=fact*i;  
     }  
    System.out.println("factorial is "+fact);  
   }  
   public static void main(String args[]){  
    //new Calculation().fact(5);//calling method with anonymous object  
    Calculation c = new Calculation();
    c.fact(5);
   }  
   }  

// constructors in java...
class Basic
{
    Basic()
    {
        System.out.println("the basic is created");
    }
    public static void main(String args[])
    {
        Basic b = new Basic();
    
    }
}

class Basic{  
    int count=0;//will get memory each time when the instance is created  
      
    Basic(){  
    count++;//incrementing value  
    System.out.println(count);  
    }  
      
    public static void main(String args[]){  
    //Creating objects  
    Basic c1=new Basic();  
    Basic c2=new Basic();  
    Basic c3=new Basic();  
    }  
    }  

class basic{  
    static int count=0;//will get memory only once and retain its value  
      
    basic(){  
    count++;//incrementing the value of static variable  
    System.out.println(count);  
    }  
      
    public static void main(String args[]){  
    //creating objects  
    basic c1=new basic();  
    basic c2=new basic();  
    basic c3=new basic();  
    }  
    }  

// cube of the given number in java....
class Calculate
{
    static int cube(int x)
    {
        return x*x*x;
    }
    public static void main(String args[])
    {
        int result = Calculate.cube(3);
        System.out.println(result);
    }
}

//4
//Roots of an Quardartic Equation...
import java.util.*;
import java.math.*;
public class Basic
{
    public static void main(String args[])
    {
        double a=15,b=68,c=3,result;
        System.out.println("The roots of the Quardartic Equation...");
        double cal=(b*b)-(4*a*c);
        double sq=Math.sqrt(cal);
        if(cal==0)
        {
            result=(-b+sq)/(2*a);
            System.out.println("The roots are real and equal");
            System.out.println("The roots of the equation: "+result);
        }
        else if(cal>0)
        {
            double x=(-b+sq)/(2*a);
            double e=(-b-sq)/(2*a);
            System.out.println("The roots of the Equation: "+x +" and "+e);
        }
        else if(cal<0)
        {
            System.out.println("The quadratic equation has no real roots.");   
        }
    }
}

//16
// check weather the number is prime or not...
import java.util.*;
public class Basic
{
    public static void main(String args[])
    {
        int count=03;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.println("The above number is a prime number..");
        }
        else
        {
            System.out.println("The above number is not a prime number...");
        }
    }
}


// 1
// Creating a file checking can we read,write,length,file/directory...
import java.util.*;
import java.io.*;
public class Basic
{
    public static void main(String args[])
    {
        try
        {
            File file = new File("Desktop/hello,txt");
            if(file.createNewFile())
            {
                System.out.println("The file has created by name:"+file.getName());
            }
            else
            {
                System.out.println("The file already exists...");
            }
            if(file.exists())
            {
                System.out.println("The file is readable: "+file.canRead());
                System.out.println("The file is writtable: "+file.canWrite());
                System.out.println("The length of the file in bytes:"+file.length());
                System.out.println("The type of the file is: "+file.isFile());
            }
        }
        catch(IOException e)
        {
            System.out.println("Unexpeted error occur...");
            e.printStackTrace();
        }
    }
}


//3
//10-15 lines program consists if else condition and a for loop.
import java.util.*;
public class Basic
{
    public static void main(String args[])
    {
        int num=10;
        for(int i=1;i<=num;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+"--Even");
            }
            else
            {
                System.out.println(i+"--Odd");
            }
        }
    }
}

//2
// overriding
class Vechicle
{
    public void start()
    {
        System.out.println("the vechicle is starting...");
    }
}
class Car extends Vechicle
{
    public void start()
    {
        System.out.println("The car is starting...");
    }
}
public class Basic
{
    public static void main(String args[])
    {
        Vechicle v1 = new Vechicle();
        Vechicle v2 = new Car();
        v1.start();
        v2.start();       
    }
}



// 19
// Arthemetric exception
// A number divide by zero...
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator, denominator, result;
        try {
            System.out.print("Enter numerator: ");
            numerator = sc.nextInt();
            System.out.print("Enter denominator: ");
            denominator = sc.nextInt();
            result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
        sc.close();
    }
}
 
// 17
class Animal {
    String color = "brown";
}

class Dog extends Animal {
    String color = "black";

    void printColor() {
        System.out.println("Dog color: " + color); // prints "black"
        System.out.println("Animal color: " + super.color); // prints "brown"
    }
}

public class Basic {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.printColor();
    }
}

//18
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Emp extends Person {
    int empId;
    String designation;

    public Emp(String name, int age, int empId, String designation) {
        super(name, age);
        this.empId = empId;
        this.designation = designation;
    }

    public void displayEmpDetails() {
        super.displayDetails();
        System.out.println("Emp ID: " + empId);
        System.out.println("Designation: " + designation);
    }
}

public class PersonEmpInheritanceExample {
    public static void main(String[] args) {
        Emp emp = new Emp("John Doe", 30, 1234, "Manager");
        emp.displayEmpDetails();
    }
}

//20
class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " running " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        MyThread t3 = new MyThread("Thread 3");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}


//21
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeFilesExample {
    public static void main(String[] args) {
        String file1 = "file1.txt";
        String file2 = "file2.txt";
        String mergedFile = "merged.txt";

        mergeFiles(file1, file2, mergedFile);

        displayMergedFileContent(mergedFile);
    }

    public static void mergeFiles(String file1, String file2, String mergedFile) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));
            BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFile));

            String line;

            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            reader1.close();
            reader2.close();
            writer.close();

            System.out.println("Files merged successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void displayMergedFileContent(String mergedFile) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(mergedFile));
            String line;

            System.out.println("Merged file content:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//22
// Java program to copy content from
// one file to another

import java.io.*;
import java.util.*;

public class CopyFromFileaToFileb {
	
	public static void copyContent(File a, File b)
		throws Exception
	{
		FileInputStream in = new FileInputStream(a);
		FileOutputStream out = new FileOutputStream(b);

		try {

			int n;

			// read() function to read the
			// byte of data
			while ((n = in.read()) != -1) {
				// write() function to write
				// the byte of data
				out.write(n);
			}
		}
		finally {
			if (in != null) {

				// close() function to close the
				// stream
				in.close();
			}
			// close() function to close
			// the stream
			if (out != null) {
				out.close();
			}
		}
		System.out.println("File Copied");
	}

	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		// get the source file name
		System.out.println(
			"Enter the source filename from where you have to read/copy :");
		String a = sc.nextLine();

		// source file
		File x = new File(a);

		// get the destination file name
		System.out.println(
			"Enter the destination filename where you have to write/paste :");
		String b = sc.nextLine();

		// destination file
		File y = new File(b);

		// method called to copy the
		// contents from x to y
		copyContent(x, y);
	}
}

//29
//applet to display simple message
import java.applet.Applet;
import java.awt.Graphics;

public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, world!", 50, 25);
    }
}

//30
//Amstrong number
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber, remainder, result = 0;
        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == number) {
            return true;
        } else {
            return false;
        }
    }
}

//10
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms you want to generate: ");
        int n = input.nextInt();
        input.close();

        // Generate Fibonacci sequence using non-recursive function
        System.out.println("Generating Fibonacci sequence using non-recursive function:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciNonRecursive(i) + " ");
        }
        System.out.println();

        // Generate Fibonacci sequence using recursive function
        System.out.println("Generating Fibonacci sequence using recursive function:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();
    }

    // Non-recursive function to generate the nth Fibonacci number
    public static int fibonacciNonRecursive(int n) {
        int a = 0, b = 1, c;
        if (n == 0) {
            return a;
        }
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // Recursive function to generate the nth Fibonacci number
    public static int fibonacciRecursive(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}

//11
public class Overloading {
    
    // Constructor overloading
    public Overloading() {
        System.out.println("Default constructor called");
    }
    
    public Overloading(int num) {
        System.out.println("Constructor with int argument called. Value: " + num);
    }
    
    public Overloading(String str) {
        System.out.println("Constructor with string argument called. Value: " + str);
    }
    
    // Method overloading
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        
        // Constructor overloading
        Overloading obj1 = new Overloading();
        Overloading obj2 = new Overloading(5);
        Overloading obj3 = new Overloading("Hello");
        
        // Method overloading
        System.out.println("Adding two integers: " + obj1.add(3, 4));
        System.out.println("Adding two doubles: " + obj1.add(3.5, 4.5));
        System.out.println("Adding three integers: " + obj1.add(2, 4, 6));
    }
}

//12
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStats {
    public static void main(String[] args) {
        try {
            // Open the file for reading
            BufferedReader reader = new BufferedReader(new FileReader("filename.txt"));

            // Initialize counters for characters, lines, and words
            int charCount = 0;
            int lineCount = 0;
            int wordCount = 0;

            // Read each line from the file and update the counters
            String line;
            while ((line = reader.readLine()) != null) {
                charCount += line.length();
                lineCount++;
                wordCount += line.split("\\s+").length;
            }

            // Close the file
            reader.close();

            // Print the results
            System.out.println("Character count: " + charCount);
            System.out.println("Line count: " + lineCount);
            System.out.println("Word count: " + wordCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

//5
import java.util.Random;

public class MultiThreadExample {

    public static void main(String[] args) {
        // Create the shared random number generator
        Random random = new Random();

        // Create the three threads
        Thread thread1 = new Thread(new RandomNumberGenerator(random));
        Thread thread2 = new Thread(new SquarePrinter());
        Thread thread3 = new Thread(new CubePrinter());

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }

    // The first thread generates random integers every second
    static class RandomNumberGenerator implements Runnable {
        private final Random random;

        public RandomNumberGenerator(Random random) {
            this.random = random;
        }

        public void run() {
            while (true) {
                int randomNumber = random.nextInt(100);
                if (randomNumber % 2 == 0) {
                    // Send even numbers to the square printer
                    SquarePrinter.queue(randomNumber);
                } else {
                    // Send odd numbers to the cube printer
                    CubePrinter.queue(randomNumber);
                }

                // Wait for one second before generating the next number
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // The second thread prints the square of even numbers
    static class SquarePrinter implements Runnable {
        private static int number;
        private static boolean ready = false;

        public static synchronized void queue(int number) {
            while (ready) {
                try {
                    SquarePrinter.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            SquarePrinter.number = number;
            SquarePrinter.ready = true;
            CubePrinter.class.notifyAll();
        }

        public void run() {
            while (true) {
                synchronized (SquarePrinter.class) {
                    while (!ready) {
                        try {
                            SquarePrinter.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.println(number * number);

                    ready = false;
                    RandomNumberGenerator.class.notifyAll();
                }
            }
        }
    }

    // The third thread prints the cube of odd numbers
    static class CubePrinter implements Runnable {
        private static int number;
        private static boolean ready = false;

        public static synchronized void queue(int number) {
            while (ready) {
                try {
                    CubePrinter.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            CubePrinter.number = number;
            CubePrinter.ready = true;
            SquarePrinter.class.notifyAll();
        }

        public void run() {
            while (true) {
                synchronized (CubePrinter.class) {
                    while (!ready) {
                        try {
                            CubePrinter.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.println(number * number * number);

                    ready = false;
                    RandomNumberGenerator.class.notifyAll();
                }
            }
        }
    }
}

//6
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortNames {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Emily");

        System.out.println("Original List: " + names);

        // Sort the names in ascending order
        Collections.sort(names);

        System.out.println("Sorted List (Ascending Order): " + names);
    }
}

//7
abstract class Shape {
    int length;
    int breadth;

    public Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public abstract void printArea();
}

class Rectangle extends Shape {
    public Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    public void printArea() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

class Triangle extends Shape {
    public Triangle(int length, int breadth) {
        super(length, breadth);
    }

    public void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * length * breadth));
    }
}

class Circle extends Shape {
    public Circle(int length, int breadth) {
        super(length, breadth);
    }

    public void printArea() {
        System.out.println("Area of Circle: " + (3.14 * length * length));
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(10, 20);
        shape1.printArea();

        Shape shape2 = new Triangle(10, 20);
        shape2.printArea();

        Shape shape3 = new Circle(10, 0);
        shape3.printArea();
    }
}

//8
public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // first matrix
        int[][] matrix2 = {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}}; // second matrix
        
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;
        
        if(cols1 != rows2) { // matrices cannot be multiplied if number of columns in first matrix is not equal to number of rows in second matrix
            System.out.println("Matrices cannot be multiplied!");
            return;
        }
        
        // initialize the result matrix with 0s
        int[][] result = new int[rows1][cols2];
        for(int i = 0; i < rows1; i++) {
            for(int j = 0; j < cols2; j++) {
                result[i][j] = 0;
            }
        }
        
        // multiply the matrices
        for(int i = 0; i < rows1; i++) {
            for(int j = 0; j < cols2; j++) {
                for(int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        
        // print the result matrix
        System.out.println("Resultant matrix:");
        for(int i = 0; i < rows1; i++) {
            for(int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//9
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        boolean isPalindrome = checkPalindrome(inputString);
        
        if (isPalindrome) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }
    }
    
    private static boolean checkPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

//13
import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends Frame {
    private Label label;

    public MouseEvents() {
        label = new Label();
        add(label, BorderLayout.CENTER);
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse clicked");
                label.setLocation(getWidth() / 2 - label.getWidth() / 2, getHeight() / 2 - label.getHeight() / 2);
            }

            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse entered");
                label.setLocation(getWidth() / 2 - label.getWidth() / 2, getHeight() / 2 - label.getHeight() / 2);
            }

            public void mouseExited(MouseEvent e) {
                label.setText("Mouse exited");
                label.setLocation(getWidth() / 2 - label.getWidth() / 2, getHeight() / 2 - label.getHeight() / 2);
            }

            public void mousePressed(MouseEvent e) {
                label.setText("Mouse pressed");
                label.setLocation(getWidth() / 2 - label.getWidth() / 2, getHeight() / 2 - label.getHeight() / 2);
            }

            public void mouseReleased(MouseEvent e) {
                label.setText("Mouse released");
                label.setLocation(getWidth() / 2 - label.getWidth() / 2, getHeight() / 2 - label.getHeight() / 2);
            }
        });
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseEvents();
    }
}

//14
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class FactorialApplet extends Applet implements ActionListener {
    Label inputLabel, outputLabel;
    TextField inputField, outputField;
    Button computeButton;

    public void init() {
        inputLabel = new Label("Enter an integer: ");
        inputField = new TextField(10);
        outputLabel = new Label("Factorial value: ");
        outputField = new TextField(10);
        outputField.setEditable(false);
        computeButton = new Button("Compute");
        computeButton.addActionListener(this);

        add(inputLabel);
        add(inputField);
        add(outputLabel);
        add(outputField);
        add(computeButton);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == computeButton) {
            String inputStr = inputField.getText();
            int input = Integer.parseInt(inputStr);
            int factorial = computeFactorial(input);
            outputField.setText(Integer.toString(factorial));
        }
    }

    private int computeFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * computeFactorial(n - 1);
        }
    }
}

//15
import java.awt.event.*;
import javax.swing.*;

public class KeyEventDemo extends JFrame implements KeyListener {
    JLabel keyLabel;
    JTextArea textArea;

    public KeyEventDemo() {
        super("Key Event Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        keyLabel = new JLabel("Type something");
        textArea = new JTextArea();
        textArea.addKeyListener(this);

        JPanel panel = new JPanel();
        panel.add(keyLabel);
        getContentPane().add(panel, "North");
        getContentPane().add(textArea, "Center");
    }

    public void keyTyped(KeyEvent e) {
        char ch = e.getKeyChar();
        keyLabel.setText("Key Typed: " + ch);
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        keyLabel.setText("Key Pressed: " + KeyEvent.getKeyText(keyCode));
    }

    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        keyLabel.setText("Key Released: " + KeyEvent.getKeyText(keyCode));
    }

    public static void main(String[] args) {
        KeyEventDemo demo = new KeyEventDemo();
        demo.setVisible(true);
    }
}

//30
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int temp = number;
        int sum = 0;
        int length = Integer.toString(number).length();

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            temp /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}

//23
import java.sql.*;

public class JdbcExample {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Connect to the database
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String user = "root";
            String password = "password";
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database");

            // Create a statement object
            Statement stmt = conn.createStatement();

            // Create a table
            String sql = "CREATE TABLE customers (id INT, name VARCHAR(50))";
            stmt.executeUpdate(sql);
            System.out.println("Table created");

            // Insert data into the table
            sql = "INSERT INTO customers (id, name) VALUES (1, 'John Doe')";
            stmt.executeUpdate(sql);
            System.out.println("Record inserted");

            // Close the statement and connection
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//24
import java.sql.*;

public class DatabaseDemo {
    public static void main(String[] args) {
        try {
            // Connect to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "password");
            
            // Create a table
            String createTableQuery = "CREATE TABLE IF NOT EXISTS students (id INT PRIMARY KEY, name VARCHAR(50), age INT)";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(createTableQuery);
            
            // Insert records into the table
            String insertQuery = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertQuery);
            pstmt.setInt(1, 1);
            pstmt.setString(2, "John");
            pstmt.setInt(3, 20);
            pstmt.executeUpdate();
            
            pstmt.setInt(1, 2);
            pstmt.setString(2, "Mary");
            pstmt.setInt(3, 22);
            pstmt.executeUpdate();
            
            pstmt.setInt(1, 3);
            pstmt.setString(2, "Bob");
            pstmt.setInt(3, 19);
            pstmt.executeUpdate();
            
            // Update a record in the table
            String updateQuery = "UPDATE students SET age = ? WHERE name = ?";
            pstmt = conn.prepareStatement(updateQuery);
            pstmt.setInt(1, 23);
            pstmt.setString(2, "Mary");
            pstmt.executeUpdate();
            
            // Delete a record from the table
            String deleteQuery = "DELETE FROM students WHERE name = ?";
            pstmt = conn.prepareStatement(deleteQuery);
            pstmt.setString(1, "Bob");
            pstmt.executeUpdate();
            
            // Close the resources
            pstmt.close();
            stmt.close();
            conn.close();
            
            System.out.println("Records created, updated and deleted successfully.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

//25
import java.applet.*;
import java.awt.*;

public class MyParameterApplet extends Applet {
   private String message;

   public void init() {
      // Retrieve the value of the "message" parameter
      message = getParameter("message");

  // Set the background color of the applet
      setBackground(Color.WHITE);
   }

   public void paint(Graphics g) {
      // Draw the message on the applet
      g.drawString(message, 20, 20);
   }
}

//26
import javax.swing.*;
import java.awt.*;

public class ImageOnButton extends JFrame {
    public ImageOnButton() {
        setTitle("Image on Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button
        JButton button = new JButton();

        // Load the image and set it as the button's icon
        ImageIcon icon = new ImageIcon("path/to/image.png");
        button.setIcon(icon);

        // Add the button to the frame
        add(button, BorderLayout.CENTER);

        // Set the size of the frame and make it visible
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ImageOnButton();
    }
}

//27
import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        // Set the title of the frame
        setTitle("Button Example");

        // Create a button
        JButton button = new JButton("Click me!");

        // Add the button to the frame
        add(button);

        // Set the size of the frame
        setSize(300, 300);

        // Set the frame to be visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create a new instance of the MyFrame class
        MyFrame frame = new MyFrame();
    }
}

//29
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class PowerApplet extends Applet implements ActionListener {
    TextField nField, mField, resultField;
    Button calculateButton;

    public void init() {
        // Set the layout of the applet
        setLayout(new GridLayout(4, 2));

        // Create a label and text field for n
        add(new Label("Enter a number for n: "));
        nField = new TextField();
        add(nField);

        // Create a label and text field for m
        add(new Label("Enter a number for m: "));
        mField = new TextField();
        add(mField);

        // Create a label and text field for the result
        add(new Label("n^m = "));
        resultField = new TextField();
        resultField.setEditable(false);
        add(resultField);

        // Create a button to calculate n^m
        calculateButton = new Button("Calculate");
        calculateButton.addActionListener(this);
        add(calculateButton);
    }

    public void actionPerformed(ActionEvent e) {
        // Read in the values of n and m
        int n = Integer.parseInt(nField.getText());
        int m = Integer.parseInt(mField.getText());

        // Calculate n^m
        int result = (int) Math.pow(n, m);

        // Display the result in the result field
        resultField.setText(Integer.toString(result));
    }
}

//Armstrong Number
import java.util.*;
public class basic
{
    public static void main(String args[])
    {
        int a=371,s=0,dig;
        int temp=a;
        while(0<temp)
        {
            dig=temp%10;
            s=s+dig*dig*dig;
            temp=temp/10;
        }
        if(a==s)
        {
            System.out.println("ARMSTRONG NUMBER");
        }
        else
        {
            System.out.println("NOT A ARMSTRONG NUMBER");
        }
        
    }
}