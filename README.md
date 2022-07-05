# ProjectDrone
PROGRAMMING REPORT

Student’s Information:

Name:  Enes

Surname:  SİVAS

Student number:  1707098

Student mail: enessivas42@gmail.com 

Student GitHub: https://github.com/EnesSivas/LASTPROJECT_ENESSIVAS_1707098.git
 
Purpose: Development of software in Java that serves as a catalog for the description of a machine, its models and components, and mode of operation in engineering.

Start Date: 22.05.2022

Date of Delivery: 04.07.2022



CONTENTS 
1. INTRODUCTION.................................................................................................................................2 
2. METHODS ............................................................................................................................................3      
2.1. What is NetBeans.......................................................................................................................3  
2.2. What is GitHub............................................................................................................................4 
3. MAIN BODY (BEGINNING OF PROJECT)....................................................................................5   
3.1. Private, Protected, Public.........................................................................................................5    
3.2. Static, Non-Static........................................................................................................................5    
3.3. Get and Set Methods................................................................................................................6 
4. RESULTS..................................................................................................................................................9



Abstract  
This lab report will first show us how to develop a catalog using the JAVA software language. Together we will understand the definition of a machine, its models and components, and its mode of operation in engineering. While this catalog is being made, it will both generate code and make it suitable for the end user by designing.



1. INTRODUCTION   
We know that codes are constantly running in the background of all electronic devices we have used so far. In order to give the result of all these encodings to the last-user, we need to transform it into a design. At this moment, we come across many programming languages that will meet our needs. Among these, we choose the language of the programs that will benefit us the most and continue on our way. In the meantime, we choose the JAVA programming language, which is the most suitable programming language to do our own task. There are many compilers created to use this programming language and we chose NetBeans among them. Because we aim to transform this program that we wrote into a design and ensure that it can be used by the last-user. At the same time, we will talk about GitHub. This is another platform that we will use to ensure that all these works are used by other people. First of all, we can move on to the main part to better understand these platforms and then to see how we finalized the task requested from us using these platforms.

2. METHODS   
First of all, let's talk briefly about the platforms that we will use while doing this project before we move on to the project requested from us.  

2.1 What is NETBEANS?   
NetBeans IDE is a free and open source integrated development environment for application development on Windows, Mac, Linux, and Solaris operating systems. The IDE simplifies the development of web, enterprise, desktop, and mobile applications that use the Java and HTML5 platforms. NetBeans is coded in Java and runs on most operating systems with a Java Virtual Machine. Object-oriented programming is done by using Java Object and Class structure. In fact, objects are made up of classes. We can define a class in Java using the class keyword.
	Class; It is a template that defines the properties and functions of objects.
	Object; We can define everything that we see around us with properties and functions as objects. It can be a living or inanimate entity.
The JFrame class is a type of container which inherits the Frame class. JFrame works like the main window where components like labels, buttons, textfields are added to create a GUI. When preparing a visual interface, a frame (JFrame) is placed at the bottom. A panel is usually placed in this frame. Visual tools such as buttons, text fields, lists, and menus are placed on the panel. Below we can see the subclasses of JComponent.

 
Figure 1 (Subclasses of Jcomponent)


2.2 What is GITHUB?   
Github is a web-based platform with millions of users, where developers and programmers from different parts of the world can come together to share software, frameworks and codes and create collaborative projects, or where their own projects can be saved in the GitHub cloud system and accessed easily with various tools. Projects can be created publicly or privately on Github. A project saved in GitHub's cloud system can be developed remotely by many people. It can be clearly seen who accessed the project at what time and where it made changes. We will create a Repository here to store this project that we will do. In this way, our codes will now be shared with everyone. A URL will be defined for this created workspace. We can retrieve or modify files from the directory by accessing this URL via the Git terminal. 

 
Figure 2 (Relationship Between GitHub Branch and Master)

We learned all these concepts that we will use. Now we can start the task requested from us. The task requested from us is as follows;
Development of software in Java that serves as a catalog for the description of a machine, its models and components, and mode of operation in engineering.
1.	Build a class of that machine: with the respective constructor(s), attributes and methods. The class must have at least:
•	2 builders
•	6 attributes (2 private, 2 protected (1 not static,1 static), 2 public (1 not static,1 static)
•	6 methods (at least (1 private, 1 protected)

2.	 Build at least 4 different models of this machine, that is, 4 subclasses
3.	 Find images of machine components and machine models (save in google folder)
4.	 Create an image that joins them all in one
5.	Create the catalog user interface
Items must be attributes (system components) and methods (actions) of machines. The components, attributes or set of attributes, must be accompanied by images and text description in the TextArea (OK button). The actions must be shown in the working action (toggle button, WORK) in the TextArea area which, if necessary, must be another software object, a class of another type.

3.MAIN BODY (BEGINNING OF PROJECT)    
We learned what to do. Now we can move on to the construction phase of the project. At this stage, there are some structures that we are asked to use. These; private, protected, public, static and non-static.    

3.1. PRIVATE, PROTECTED, PUBLIC      
Access Modifiers are words that determine who can access a method or a variable of a class. Java provides four levels of access protection. Fourth, if you don't assign access protection to a class element, for example, it will have default access protection. So there are a total of 4 protection qualifiers, namely default, public, protected and private. Any desired data can be accessed in the classroom without any access limit. When we create a new class in the same package, that class can access all other data except Private in the other class. The class we created in a different package can only access the public data of the class in the other package. We can understand this better in the diagram below.
 
Figure 3 (Accessibility Table)

3.2. STATIC, NON-STATIC   
A static method is also called a class method and is common among objects of the class and can also be accessed using the class name. In a non-static method there is no access this way. We cannot access a non-static class element from within static methods. 

First, we chose which type of machine we would work on. I worked on Drone here. First of all, let's define Private, protected and public data types for this DRONE as requested. We will also determine that it is of type string, boolean, int. However, we will designate some of them as static and non-sitatic. We will assign values to these data. In order to see all this more easily, we will prepare it in an excel file and then transfer it to Netbeans platforms. We can see this excel file we created below.

 
Figure 4 (definition to excel file)

Now, we will transfer these writings to NetBeans. Here is how the string, boolean and int data types are used. If we want to write a word instead of a single character, the char data type will not be sufficient. Like most modern languages, Java has created a data type to contain text. This type is called String. Integer(Int) data types are used for numeric expressions. It does not accept decimal or fractional numbers and you only need to enter an integer value. Boolean is a data type that takes two values, "True" and "False". True (true) and false (false) values are assigned in the application. It is frequently used in control operations. In this application, we will use it to check that the device is turned on and the engines are running. Below we can see the cadlor transferred to NetBeans.
 
Figure 5 (cadlor transferred)


3.3. GET AND SET METHODS   
To dynamically send values to global variables and get those loaded values back. Get and set methods are prepared. These are methods prepared within a certain standard. SET is the method used to load values to global variables. It takes a value from the outside (from the user, database, etc.) and loads this value into the global variable. GET is the method used to get the values loaded into global variables. It takes the type of the value it will return as "return" from the type of the global variable. that is, whatever type the global variable is ( String, int, long, object … etc.), a value of this type is returned in the get method.
We will now use the set and get functions to dynamically load and retrieve values from our variables. In the picture below, we can see some codes that I prepared with this method.
  
Figure 6 (codes in Netbeans)

After doing all this, we can now move on to the design part. For this, we first need to open a Jframe Form in the same package. After opening this, we will prepare the design part as requested. The tools we need to use in this design section are as follows;
	jMenuBar (to create a menu), 
	jcomboBox (to manage options), 
	2 jToggleButtons (to select options(OK,WORK)), 
	jTextArea (to see the value of variables), 
	3 jLabels (to see user information and to display the thumbnails requested from us here)

We can see the design that I have prepared below more clearly.

 
Figure 7 (design section of project)

Now we can move on to the jFrame code line section to use the data we have written in the design section.
 
 
 
    Figure 8 (codes in Netbeans)

The Java String valueOf() method used here returns the string representation of the argument passed. In the first 4 cases that we have seen above, we aimed to: After these options are selected, it will show us the image in the folder we specified in Jlabel3. At the same time, it will show the value we assigned in the textArea section. Below we can see the some example of final version of the application we have made. As we can see, when the options we have specified here are selected, the pictures we have assigned will appear on the side. At the same time, we can see the values in the textarea. We used a picture scaler program to bring these pictures to the desired format. Lets see some examples in the below.
  
  
This is how we saw how the program works.

4. RESULTS   
As a result, we wrote a program as requested by using all these platforms and made a design accordingly. We carried out all these processes simultaneously and when each stage was completed, we checked its accuracy and created a more stable structure. We have assigned appropriate values to them by using all the functions requested from us. Thanks to the picture option, we can see the picture of the product we will choose beforehand, and we can access the features of this product thanks to the feature option. We have completed a good project and thanks to this project, we had the chance to learn a lot of new information and improve ourselves.























REFERENCES
https://alkanfatih.com/c-property-ozellik-kullanimi-get-ve-set-nedir-nasil-kullanilir/
https://hasancelik.org/java/Java-static-method/
https://www.dijitalders.com/icerik/44/2138/public_private_protected.html
https://veriakademi.com/java-ne-ise-yarar
https://www.webtekno.com/github-nedir-ne-ise-yarar-h117655.html
https://tr.wikipedia.org/wiki/NetBeans
