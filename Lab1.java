import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        /*1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
        two numbers , takes two numbers as input*/
        System.out.println("Enter first number  : ");
        int num_1 = scan.nextInt();
        System.out.println("Enter second number  : ");
        int num_2 = scan.nextInt();
        System.out.println(num_1+" + "+num_2+" = "+(num_1+num_2));
        System.out.println(num_1+" - "+num_2+" = "+(num_1-num_2));
        System.out.println(num_1+" X "+num_2+" = "+(num_1*num_2));
        System.out.println(num_1+" / "+num_2+" = "+(num_1/num_2));
        System.out.println(num_1+" mod "+num_2+" = "+(num_1%num_2));
        System.out.println("***********************************************");

       // 2. Write a Java program that takes a number as input and prints its multiplication table up to 10
        System.out.println("Enter a number  : ");
        int num_3 = scan.nextInt();
        System.out.println("1 X "+num_3+" = "+(1*num_3));
        System.out.println("2 X "+num_3+" = "+(2*num_3));
        System.out.println("3 X "+num_3+" = "+(3*num_3));
        System.out.println("4 X "+num_3+" = "+(4*num_3));
        System.out.println("5 X "+num_3+" = "+(5*num_3));
        System.out.println("6 X "+num_3+" = "+(6*num_3));
        System.out.println("7 X "+num_3+" = "+(7*num_3));
        System.out.println("8 X "+num_3+" = "+(8*num_3));
        System.out.println("9 X "+num_3+" = "+(9*num_3));
        System.out.println("10 X "+num_3+" = "+(10*num_3));
        System.out.println("***********************************************");

        //3. Write a Java program to print the area and perimeter of a circle
        System.out.println("Enter the radius of the circle  : ");
        float radius = scan.nextFloat();
        System.out.println("The perimeter of the circle is =  : "+(3.14*radius*radius));
        System.out.println("The area of the circle is = : "+(2*3.14*radius));
        System.out.println("***********************************************");

        //4. Java program to find out the average of a set of integers
        System.out.println("Enter the count of numbers  : ");
        float count = scan.nextFloat();
        float sum = 0;
        for(int i=0;i<count;i++){
            System.out.println("Enter an integer : ");
            float num_4 = scan.nextFloat();
            sum = sum + num_4;
        }
        System.out.println("The average is = "+(sum/count));
        System.out.println("***********************************************");

        /*5. Write a Java program that accepts three integers as input, adds the first two integers
        together, and then determines whether the sum is equal to the third integer.*/
        System.out.println("Enter first number  : ");
        int num_5 = scan.nextInt();
        System.out.println("Enter second number  : ");
        int num_6 = scan.nextInt();
        System.out.println("Enter third number  : ");
        int num_7 = scan.nextInt();
        if (num_5+num_6 == num_7){
            System.out.println("The result is : true");
        }else {
            System.out.println("The result is : false");
        }
        System.out.println("***********************************************");

        //6. Write a Java program to reverse a word.
        System.out.println("Enter a word to reverse: ");
        String word = scan.next();
        int num_8 = word.length()-1;
        for (int i = 0 ; i< word.length() ; i++) {
            System.out.print(word.charAt(num_8));

            num_8--;
        }
        System.out.println(" ");
        System.out.println("***********************************************");

        //7 - Java program to check whether the given number is even or odd
        System.out.println("Enter a number: ");
        int num_9 = scan.nextInt();
        if (num_9 % 2 == 0){
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
        System.out.println("***********************************************");

        //8 - Java program to convert the temperature in Centigrade to Fahrenheit
        System.out.println("Enter a the temperature in Centigrade : ");
        float temperature = scan.nextFloat();
        System.out.println("The temperature in Fahrenheit is : "+((1.8*temperature)+32));
        System.out.println("***********************************************");

       /* 9.Write a Java program that takes a string and a number from the user,then prints the
        character in the given index*/
        System.out.println("Enter a word : ");
        String word2 = scan.next();
        System.out.println("The the index : ");
        int index = scan.nextInt();
        char result = word2.charAt(index);
        System.out.println("The character is : "+result);
        System.out.println("***********************************************");

        //10. Write a Java program to print the area and perimeter of a rectangle
        System.out.println("Enter a Height of the rectangle : ");
        float height = scan.nextFloat();
        System.out.println("Enter a width of the rectangle : ");
        float width = scan.nextFloat();
        System.out.println("The area of the rectangle is : "+(height*width));
        System.out.println("The perimeter of the rectangle is : "+(2*(height+width)));
        System.out.println("***********************************************");

        //11. Write a Java program to compare two numbers.
        System.out.println("Enter first number : ");
        int num_10 = scan.nextInt();
        System.out.println("Enter second number : ");
        int num_11 = scan.nextInt();
        boolean is_first_bigger = num_10>num_11;
        boolean is_equals = num_10==num_11;
        if (is_equals){
            System.out.println(num_10+" == "+num_11);
        }else {
            System.out.println(num_10+" != "+num_11);
            if(is_first_bigger){
                System.out.println(num_10+" > "+num_11);
                System.out.println(num_10+" >= "+num_11);
            }else {
                System.out.println(num_10+" < "+num_11);
                System.out.println(num_10+" <= "+num_11);
            }
        }
        System.out.println("***********************************************");

        //12. Write a Java program to convert seconds to hours, minutes and seconds.
        System.out.println("Enter the number of seconds : ");
        int seconds = scan.nextInt();
        int hours = 0;
        int minutes = 0;
        if (seconds >= 3600){
            hours = seconds/3600;
            seconds = seconds - (hours*3600);
            if (seconds >= 60 ){
                minutes = seconds/60;
                seconds = seconds - (minutes*60);
                System.out.println(hours+" : "+minutes+" : "+seconds);
            }else{
                System.out.println(hours+" : "+minutes+" : "+seconds);
            }
        }else {
            if (seconds >= 60 ){
                minutes = seconds/60;
                seconds = seconds - (minutes*60);
                System.out.println(hours+" : "+minutes+" : "+seconds);
            }else{
                System.out.println(hours+" : "+minutes+" : "+seconds);
            }
        }
        System.out.println("***********************************************");

        /*13. Write a Java program that accepts four integers from the user and prints equal if all
        four are equal, and not equal otherwise.*/
        System.out.println("Enter first number  : ");
        int num_12 = scan.nextInt();
        System.out.println("Enter second number  : ");
        int num_13 = scan.nextInt();
        System.out.println("Enter third number  : ");
        int num_14 = scan.nextInt();
        System.out.println("Enter fourth number  : ");
        int num_15 = scan.nextInt();
        if (num_12 == num_13 && num_12 == num_14 && num_12 == num_15){
            System.out.println("number are equals");
        }else{
            System.out.println("number are not equals");
        }
        System.out.println("***********************************************");

        /*14. Write a Java program that reads an integer and check whether it is negative, zero, or
        positive*/
        System.out.println("Enter a number: ");
        int num_16 = scan.nextInt();
        if (num_16 > 0){
            System.out.println("Number is positive");
        }else if (num_16 < 0){
            System.out.println("Number is negative");
        }else {
            System.out.println("Number is zero");
        }
        System.out.println("***********************************************");

        int Positive_counter=0;
        int Negative_counter=0;
        int Zero_counter=0;
        int num_17 = 0;
        do{
            System.out.print("Enter a number: ");
            num_17 = scan.nextInt();
            if (num_17 == -1 ){
                break;
            }
            if (num_17 > 0){
                Positive_counter++;
            } else if (num_17<0) {
                Negative_counter++;
            }else {
                Zero_counter++;
            }
        }while(num_17 != -1);
        System.out.println("number of positive numbers: " + Positive_counter);
        System.out.println("number of negative numbers: " + Negative_counter);
        System.out.println("number of zero numbers: " + Zero_counter);
        System.out.println("***********************************************");

        /*16 - Write a program that prompts the user to input an integer and then outputs the
        number with the digits reversed.*/
        System.out.println("Enter a number to revers : ");
        int num_18 = scan.nextInt();
        String rev = String.valueOf(num_18);
        int len = rev.length()-1;
        for (int i = 0 ; i< rev.length() ; i++) {
            System.out.print(rev.charAt(len));

            len--;
        }
        System.out.println(" ");
        System.out.println("***********************************************");

        /*17 - Write a program to enter the numbers till the user wants and at the end the program
        should display the largest and smallest numbers entered.*/
        System.out.println("Enter a number : ");
        int num_19 = scan.nextInt();
        int smallest = num_19;
        int largest = num_19;
        String c = "y";
        do{
            System.out.println("Enter a number : ");
            int num_20 = scan.nextInt();
            if (num_20 > largest){
                largest = num_20;
            }else{
                smallest = num_20;
            }
            System.out.println("do you want to continue (y/n) : ");
            c = scan.next();

        }while(c.equals("y"));
        System.out.println("The largest number is : "+largest);
        System.out.println("The smallest number is : "+smallest);
        System.out.println("***********************************************");

        /*18 - Determine and print the number of times the character ‘a’ appears in the input
        entered by the user*/
        System.out.println("Enter a word : ");
        String word_3 = scan.next();
        word_3 = word_3.toLowerCase();
        int total_of_a = 0;
        for (int i = 0; i < word_3.length(); i++) {
            if (word_3.charAt(i) == 'a'){
                total_of_a++;
            }
        }
        System.out.println("The number of a in the word is : "+total_of_a);






    }
}
