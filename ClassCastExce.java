package Week_4.Assignment;
class Animal
 {
     String name;
   Animal (String name)
   {
       this.name=name;
       System.out.println("The animal name is "+name);
   }

 }
 class Dog extends Animal
  {
    Dog(String name)
    {
        super(name);
    }
      void colour(String color)
      {
          System.out.println("the colour is "+ color);
      }
  }
public class ClassCastExce
 {
    public static void main(String[] args)
    {
        try
        {
            Dog dog= (Dog) new Animal("Tom");//Throws ClassCastException
            dog.colour("Brown");
        }
       catch (Exception e)
       {
           e.printStackTrace();
       }
        finally
        {
            System.out.println("The code is handeled by exception and the last line is running");
        }
    }
 }
