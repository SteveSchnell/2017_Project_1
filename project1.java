//********************************************************************************************
//Program Name: project1.java
//Programmer: Steve Schnell
//Assignment: Project 1
//Purpose:The purpose of this program is add, subtract and, display polynomials.
//Date: October 19, 2017
//********************************************************************************************


class Polynomial
{

private int mainArray[];//This array holds the polynomial of the object.
private int lengthOfArray;//Holds the length of the main array.

//--------------------------------------------------------------------------------------------

   public Polynomial(int newArray[])//Constructor of the class, it requires an array.  O(n)
   {
      if(newArray.length != 0)//check if the array is empty
      {
         mainArray = new int[newArray.length];//initializes the 'mainArray' to the size of the enter array
   
         for(int i=0;i<newArray.length;i++)//copies arrays the values to 'mainArray'
         {
            mainArray[i]=newArray[i];
         }
      
         lengthOfArray = mainArray.length;//gets the length of main Array to save on time.
      }
      else//runs if the check failed
         System.out.println("ERROR object initialize with empty array");//Returns error if enter array is empty.
   }
   
//--------------------------------------------------------------------------------------------
   
   public int[] getArray()//this method returns an int array  O(1)
   {
      return mainArray;//returns the array
   }
   
//--------------------------------------------------------------------------------------------
   
   public void printout(String S)//this function converts the polynomial stored in a string back into a polynomial. It accepts a string that is placed at the front of the output  O(n)
   {
   
   String ans = "", sign = "";//initialize the string variables.
   
   for(int i=0;i<mainArray.length;i++)//Loop through the entire array
      {  
      if(mainArray[i]!=0)//does not print out zeros
         {
           
         if(mainArray[i]>0)
            {
            ans+=sign+mainArray[i]+"x^"+i;//add a positive polynomial to the string
            sign = "+";//sets 'sign' equal to + after the first number is added to the string
            }
         else
            {
            ans+=mainArray[i]+"x^"+i;//add a negative polynomial to the string
            sign = "+";//sets 'sign' equal to + after the first number is added to the string
            }
         }
      }
      
      System.out.println(S + ans);//prints out the complete polynomial
   }
   
//--------------------------------------------------------------------------------------------
   
   public Polynomial add(Polynomial P)//The add method accepts a polynomial, it then adds its values to the main array and, in the end returns a new polynomial  O(n)
      {
      int smallest = 0, largest = 0, lengthOfNewArray = P.mainArray.length;//initializes 3 int variables,'smallest' is used to keep the length of the smallest array.
                                                                           //'largest' used to keep the length of the largest array,
                                                                           //'lengthOfNewArray' used to keep the length of the 'P.maineArra'.
                                                                           
      if(mainArray.length>lengthOfNewArray)//checks if maine Array is larger than the 'P.maineArra'.
         {
            smallest = lengthOfNewArray;
            largest =lengthOfArray;
         }
      else//if the new Array is larger.
         {
            smallest =lengthOfArray;
            largest = lengthOfNewArray;
         }
         
      int resultArray[] = new int[largest];//creates a new temporary array to keep the results using the length of the largest array.
      
      for(int i=0;i<smallest;i++)//adds all values that occur in both  arrays together into the result array.
         {
            resultArray[i]=mainArray[i]+P.mainArray[i];
         }
         
      if(mainArray.length>lengthOfNewArray)//copes the leftover values from 'maineArray' to the result array.
         {
         for(int j=smallest;j<mainArray.length;j++)
            {
            resultArray[j] = mainArray[j];
            }
         }
      else
         {
         for(int j=smallest;j<lengthOfNewArray;j++)//copes the leftover values from 'P.maineArray' to the result array.
            {
            resultArray[j] = P.mainArray[j];
            }
         }
         
         Polynomial ans = new Polynomial(resultArray);//create a new polynomial object to return out of the 'resultArray'.
         
         return ans;//returns the new polynomial
         
      }
   
//--------------------------------------------------------------------------------------------
   /**
   The sub method is exactly the same as the add method except for one line,
   "resultArray[i]=mainArray[i]-P.mainArray[i];"the deferens is that you change the + symbol to a - symbol the rest of the code does not change,
   one cud simplify the program by combining the add and the sub method and adding bool to toggle between adding and subtracting.
   **/
   
   public Polynomial sub(Polynomial P)//The sub method accepts a polynomial, it then subtracts its values from the main array and, in the end returns a new polynomial   O(n)
      {
      int smallest = 0, largest = 0, lengthOfNewArray = P.mainArray.length;//initializes 3 int variables,'smallest' is used to keep the length of the smallest array.
                                                                           //'largest' used to keep the length of the largest array,
                                                                           //'lengthOfNewArray' used to keep the length of the 'P.maineArra'.
                                                                           
      if(mainArray.length>lengthOfNewArray)//checks if maine Array is larger than the 'P.maineArra'.
         {
            smallest = lengthOfNewArray;
            largest =lengthOfArray;
         }
      else//if the new Array is larger.
         {
            smallest =lengthOfArray;
            largest = lengthOfNewArray;
         }
         
      int resultArray[] = new int[largest];//creates a new temporary array to keep the results using the length of the largest array.
      
      for(int i=0;i<smallest;i++)//subtracts all values that occur in both arrays and puts them into the 'resultArray'.
         {
            resultArray[i]=mainArray[i]-P.mainArray[i];//the main difference between the add and sub method
         }
         
      if(mainArray.length>lengthOfNewArray)//copes the leftover values from 'maineArray' to the result array.
         {
         for(int j=smallest;j<mainArray.length;j++)
            {
            resultArray[j] = mainArray[j];
            }
         }
      else
         {
         for(int j=smallest;j<lengthOfNewArray;j++)//copes the leftover values from 'P.maineArray' to the result array.
            {
            resultArray[j] = P.mainArray[j];
            }
         }
         
         Polynomial ans = new Polynomial(resultArray);//create a new polynomial object to return out of the 'resultArray'.
         
         return ans;//returns the new polynomial
         
      }  
   
   }

//--------------------------------------------------------------------------------------------

class PolynomialApp//this class is used to test the polynomial class
   {
   public static void main(String[] args)
      {
      //prints the header
      System.out.println("***********************************************************************************************");
      System.out.println("*   Program Name: project1.java                                                               *");
      System.out.println("*   Programmer: Steve Schnell                                                                 *");
      System.out.println("*   Assignment: Project 1                                                                     *");
      System.out.println("*   Purpose:The purpose of this program is add, subtract and, display polynomials.            *");
      System.out.println("*   Date: October 19, 2017                                                                    *");
      System.out.println("***********************************************************************************************");
      System.out.println();
      
      //the polynomial P1 and P2 are enter in to arrays
      int x[]={0,1,0,0,0,3,0,0,-5}; //P1 = 1x1+3x5-5x8
      int y[]={0,0,0,2,0,-4,0,2};   //P2 = 2x3-4x5+2x7
      
      //the polynomial objects are initialized
      Polynomial P1=new Polynomial(x);
      Polynomial P2=new Polynomial(y);
      
      //P1 and P2 are printed out to verify them
      P1.printout("P1 = ");
      P2.printout("P2 = ");
      
      //P2 is added to P1 and stored in P3
      Polynomial P3 = P1.add(P2);
      P3.printout("P3 = P1+P2 = ");
      
      //P2 is subtracted from P1 and stored in P4
      Polynomial P4 = P1.sub(P2);  
      P4.printout("P4 = P1-P2 = "); 

      
      }
 
   
   
}

