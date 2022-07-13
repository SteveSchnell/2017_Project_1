Program Name: project1.java
Programmer: Steve Schnell
Assignment: Project 1
Date: October 19, 2017

Problem:
You will implement and test a preliminary version of the polynomial class, using a small array to store the coefficients of the polynomial in order, following the design pattern of object-oriented approach. 

Analysis of Algorithm Complexity:
The contractor of the polynomial class has a Big O of O(n) because it only contains a single for loop that copy the array. The getArray method has a Big O of O(1) because it goes runs only ones regardless of the input. The printout method also has a Big o of O(n) do to having a nested for loop. The add method has a Big O of O(n) it has multiple for loops but none are nested so it stays O(n). The sub method is O(n) because it is exactly the same as the add method.

Analysis of Algorithm Design:
The algorithms are somewhat simple, it mostly consists of a for loop then runs through the array and adds or subtracts integers from it, and then transfers the result into a new array. The main part is, that it uses the array index as a data value as well as the content data.

Program Input/Output:
The constructor of the polymer class takes an int array as in input, the getArray method has a return output of an int array, the add method has an input of a polynomial object and, a return output of an polynomial class object, the sub method has an input of an polynomial object and, a return output of an polynomial class object. The printout method has a string as an input and prints out the store polynomial in the console window

Tested Result:
input_1
int test[]={0,1,1,1,1};  //x+1x2+1x3+1x4
Polynomial TEST=new Polynomial(test);     
TEST.printout("");
output_1
1x1+1x2+1x3+1x4
the program displays the polynomial correctly

input_2
int test_2[]={0,6,12,0,2};  //6x1+12x2+2x4
Polynomial TEST_2=new Polynomial(test_2);     
TEST_2.printout("");
output_2
6x1+12x2+2x4
the program displays the polynomial correctly

input_3
 int testA[]={0,2,4,3,7};
 int testB[]={0,5,9,0,3};
 Polynomial TESTA=new Polynomial(testA);
 Polynomial TESTB=new Polynomial(testB);
 Polynomial TESTC = TESTA.add(TESTB); //ADD
 TESTC.printout(""); 

output_3
7x1+13x2+3x3+10x4
the program displays the polynomial correctly
