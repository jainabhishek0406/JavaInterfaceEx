# Java Interface introduction with sample code.
# Java interface code implementation.

Java Interface
Using Java abstract class we can achieve partial abstraction, to achieve complete abstraction, java introduce new concept, which is called interface. 

Abstraction is a process where you show only “relevant” data and “hide” unnecessary details of an object from the user.

Interface looks like a class but it is not a class. An interface can have methods and variables just like the class but the methods declared in interface are by default abstract (only method signature, no body), Also, the variables declared in an interface are public, static & final by default.

What is the use of interface in Java?

As mentioned above they are used for full abstraction. Since methods in interfaces do not have body, they have to be implemented by the class before you can access them. The class that implements interface must implement all the methods of that interface. Also, java programming language does not allow you to extend more than one class, however you can implement more than one interfaces in your class.

Syntax:
Interfaces are declared by specifying a keyword “interface”. 

Advantages of interface in java:

Advantages of using interfaces are as follows:

1.	Without bothering about the implementation part, we can achieve the security of implementation

2.	In java, multiple inheritance is not allowed, however you can use interface to make use of it as you can implement more than one interface.

Check my github repo, for more information
	https://github.com/jainabhishek0406/JavaInterfaceEx
