//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

    Scanner input = new Scanner(System.in);

//System.out.println("Enter your age");
//
//int age = input.nextInt();
//
//    if(age > 20){
//
//        System.out.println("Your age is accepted");

//}
//ignore


//    String name = input.next();
//    System.out.println(name.equals("saleh"));
//    if(na)

//    System.out.println("Enter number of days the student late: ");
//
//    int daysLate = input.nextInt();
//
//
//    if (daysLate >= 3) {
//        System.out.println("the student is apsent");
//    }


//    System.out.println("please Enter a number : ");
//    int number = input.nextInt();
//
//    if(number % 2 == 0 ){
//
//        System.out.println("the number is even");
//    }
//    else{
//        System.out.println("the number is odd");
//
//    }

//    System.out.println("from 1 to 5 what is your level in english? ");
//    int number = input.nextInt();
//
//if (number >= 4){
//    System.out.println("your level is excelent ");
//}
//else if( number == 2  || number == 3 ){
//    System.out.println("your level is Good ");
//}
//
//
//else{
//        System.out.println("your level is biggener ");
//        }

//System.out.println("Enter the amount user bill");
//int userSpend = input.nextInt();
//
//
//if(userSpend >= 1000){
//    System.out.println("you get 100 riyal cashback");
//
//}
//else if(userSpend >= 500 && userSpend <= 1000 ){
//
//    System.out.println("you get 50 riyal cashback");
//
//}
//else{
//    System.out.println("you get 10 riyal cashback");
//
//}
//System.out.println("enter number");
//    int number1 = input.nextInt();
//    if( number1> 0 &&  (number1 * 2) > 100){
//        System.out.println("number is big");
//
//    }
//    else{
//        System.out.println("number is small");
//    }


    //challenge before break

//    System.out.println("enter number");
//    int number11 = input.nextInt();
//    int number22 = input.nextInt();     //sum = number11 + number11;
//
//
//
//    if ((number11 + number22) % 2 == 0  && (number11 + number22) % 4 == 0){
//
//
//        System.out.println("مجموع خاص");
//    }
//else if( (number11 + number22) % 2 ==1 ){   // % 2 ==1
//        System.out.println("مجموع فردي");
//    }
//    else{
//        System.out.println("مجموع عادي");
//    }


//    System.out.println(" chose the number of your city 1:Jeddah 2:Cairo 3:barcelona");
//
//    int city = input.nextInt();
//
//    switch(city){
//
//        case 1:
//            System.out.println("your city in ASIA");
//           break;
//        case 2:
//            System.out.println("your city in Africa");
//            break;
//        case 3:
//            System.out.println("your city in europ");
//            break;
//        default:
//            System.out.println("your city not included");
//    }

//    System.out.println(" Enter number ");
//    int number222 = input.nextInt();
//
//    System.out.println("choose you want from me to do with this number 1: check if the number from 5 m  2:check if the number even or odd 3:exit from the program");
//
//    int number333 = input.nextInt();
//
//    switch(number333){
//
//        case 1:
//            if(number333 % 5 ==0){
//                System.out.println("the number is from 5 m ");
//            }
//            else{
//                System.out.println("the number is not 5 m ");
//            }
//            break;
//        case 2:
//            if(number333 % 2 ==0){
//                System.out.println("the number is odd ");
//            }
//            else{
//                System.out.println("the number is even ");
//            }
//            break;
//        case 3:
//          System.out.println("end program");
//           break;
//        default:
//           System.out.println("you");
//    }

//    System.out.println(" Enter three number ");
//    int number1 = input.nextInt();
//    int number2 = input.nextInt();
//    int number3 = input.nextInt();
//
//
//    if (number1 > number2 && number1 > number3) {
//        System.out.println(" the first number is big ");
//    }
//    else if (number2 > number1 && number2 > number3) {
//
//        System.out.println(" the second number is big ");
//    }
//    else {
//        System.out.println("the third number is big");
//    }




//
//    case 1:
//             System.out.println("the number is from 5 m ");
//
//               System.out.println("from 1 to 3 hours ");
//
//
//
//



//    System.out.println(" chose the number of your city 1:Jeddah 2:Cairo 3:barcelona");
    System.out.println("chose the number from this three 1:from 1 to 3 hours  2:from 6 to 12 hours 3:more than day ");

    int park = input.nextInt();

    switch(park){

        case 1:
            System.out.println("3 riyals for hours");
            break;
        case 2:
            System.out.println("6 riyals for hours");
            break;
        case 3:
            System.out.println("6 riyals for hours");
            break;
        case 4:
            System.out.println("more than days 60 for day");

            break;
        default:
            System.out.println("your city not included");
    }

    System.out.println("pay cash or card? choose 1 for card choose 2 for ");

    int cash = input.nextInt();
    int card = input.nextInt();


}


