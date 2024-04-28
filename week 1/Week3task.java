//To find the maximum between three numbers, you can use the following code:
/*public class Week3task  {
    public static void main(String[] args) {
        int num1 = 10; 
        int num2 = 20; 
        int num3 = 30; 
        int max = (num1 > num2)? (num1 > num3? num1 : num3) : (num2 > num3? num2 : num3);
        System.out.println("Maximum is: " + max);
    }
}*/
//To check whether a number is negative, positive, or zero, you can use the following code:
/*public class Week3task  {
    public static void main(String[] args) {
        int num = 0; 
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}*/
//To check whether a number is divisible by 5 and 11 or not, you can use the following code:
/*public class Week3task  {
    public static void main(String[] args) {
        int num = 55; 
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println(num + " is divisible by 5 and 11");
        } else {
            System.out.println(num + " is not divisible by 5 and 11");
        }
    }
}*/
//To check whether a number is even or odd, you can use the following code:
/*public class Week3task  {
    public static void main(String[] args) {
        int num = 10; // replace with user input
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}*/
//To check whether a year is a leap year or not, you can use the following code:

/*public class Week3task  {
    public static void main(String[] args) {
        int year = 2000; 
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            } else {
                System.out.println(year + " is a leap year");
            }
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}*/
//To input any alphabet and check whether it is vowel or consonant, you can use the following code:
/*public class Week3task  {
    public static void main(String[] args) {
        char ch = 'a'; 
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is a consonant");
        }
    }
}*/
//Some Switch case Statements Questions:

//To convert a student's grade to the corresponding GPA value, you can use the following code:
/*public class Week3task  {
    public static void main(String[] args) {
        char grade = 'A'; 
        int gpa = 0;
        switch (grade) {
            case 'A':
                gpa = 4;
                break;
            case 'B':
                gpa = 3;
                break;
            case 'C':
                gpa = 2;
                break;
            case 'D':
                gpa = 1;
                break;
            case 'F':
                gpa = 0;
                break;
            default:
                System.out.println("Invalid Grade");
                return;
        }
        System.out.println("GPA: " + gpa);
    }
}*/
//To perform arithmetic operations based on user input, you can use the following code:
/*public class Week3task  {
    public static void main(String[] args) {
        int num1 = 10; 
        int num2 = 20; 
        char operator = '+'; 
        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println("Result: " + result);
    }
}*/
//To print the corresponding season based on the user's input, you can use the following code:

/*public class Week3task  {
    public static void main(String[] args) {
        int month = 1; 
        String season = "";
        switch (month) {
            case 1:
            case 2:
            case 12:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Fall";
                break;
            default:
                System.out.println("Invalid month");
                return;
        }
        System.out.println("Season: " + season);
    }
}*/
//To calculate the area of different shapes based on user input, you can use the following code:

/*public class Week3task {
    public static void main(String[] args) {
        int choice = 1; 
        double radius = 0;
        double length = 0;
        double width = 0;
        double height = 0;
        double area = 0;
        switch (choice) {
            case 1:
                radius = 5; 
                area = Math.PI * radius * radius;
                break;
            case 2:
                length = 5; 
                width = 10; 
                area = length * width;
                break;
            case 3:
                length = 5; 
                width = 10; 
                height = 15; 
                area = length * width * height;
                break;
            case 4:
                base = 5; 
                height = 10; 
                area = 0.5 * base * height;
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        System.out.println("Area: " + area);
    }
}*/