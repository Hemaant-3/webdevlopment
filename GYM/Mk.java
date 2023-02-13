class mk{
    public static void main(String[] args) {
      
            int numOne = 100;
            int numTwo = 20;
            int numThree = 30;
            System.out.println(numOne > numTwo && numOne > numThree); //Output will be true
           
                int numOne1 = 10;
                int numTwo2 = 5;
                int min = (numOne1 < numTwo2) ? numOne1 : numTwo2;
                System.out.println(min); //Output will be 5
            
                int numOne3 = 10; //The value 10 is assigned to numOne
                System.out.println(numOne3); //Output will be 10
                numOne3 += 5;
                System.out.println(numOne3); //Output will be 15
                numOne3 -= 5;
                System.out.println(numOne3); //Output will be 10
                numOne3 *= 5;
                System.out.println(numOne3); //Output will be 50
                numOne3 /= 5;
                System.out.println(numOne3); //Output will be 10
        
    }
}