/*
* Operators are used to perform any type of operations. In java there are 8 types of
* operators are available.
* 1. Unary
* 2. Arithmatic
* 3. shift
* 4. Relational
* 5. Assignment
* 6. Bitwise
* 7. Logical
* 8. Ternary
* */

import java.util.Collections;
public class Operator{
    public static void main(String[] args){
        HashMap<T>
    // Unary
        // unary plus operator is indicate positive value without th + sign
        // unary minus used to make a positive value into a negetive one.
//        int x = 10;
//        System.out.println(+x);
//        System.out.println(-x);
//
//        Unary post-increment
//        System.out.println(x++);
//        System.out.println(x);
//
//        unary pre increment
//        System.out.println(++x);
//
//        Unary Post-Decrement
//        System.out.println(x--);
//        System.out.println(x);
//        System.out.println(--x);

//        Arithmatic Operator

//        Java arithmetic operators are used to perform addition, subtraction,
//        multiplication, division, and modulo operation.
//        They act as basic mathematical operations.

//        int a=10;
//        int b=5;
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        System.out.println(a%b);

//        Java Left Shift Operator
//        The Java left shift operator << is used to shift all of the bits
//        in a value to the left side of a specified number of times.

//        System.out.println(10<<2);//10*2^2=10*4=40
//        System.out.println(10<<3);//10*2^3=10*8=80
//        System.out.println(20<<2);//20*2^2=20*4=80
//        System.out.println(15<<4);//15*2^4=15*16=240

//        Java Right Shift Operator
//        The Java right shift operator >> is used to move the value
//        of the left operand to right by the number of bits specified
//        by the right operand.

//        System.out.println(10>>2);//10/2^2=10/4=2
//        System.out.println(20>>2);//20/2^2=20/4=5
//        System.out.println(20>>3);//20/2^3=20/8=2

//        Java Relational Operators

//        Java relational or conditional operators are
//        used to check relationship between two operands
//        such as less than, less than or equal to, greater than,
//        greater than or equal to,
//        equal to and not equal to.
//        It is also known as equality operator.
//        These operators return Boolean values either true or false.

        //<
//        Less Than
//        If the value of the first operand is lesser than the value
//        of the second operand, the Less Than
//        operator returns true, otherwise false.

                // >
//        Greater Than
//        If the value of the first operand is greater than
//        the value of the second operand,
//        the Greater Than operator returns true, otherwise false.

//         <=
//        Less Than or Equal to
//        When the value of the first operand is
//        lesser than or equal to the value of the second operand,
//        the Less Than or Equal to operator returns true, otherwise false.

//        >=
//        Greater Than or Equal to
//        When the value of the first operand is greater than or equal to the value of the second operand, the Greater Than or Equal to operator returns true, otherwise false.

//        ==
//        Equal to
//        Equal to operator checks whether the given operands
//        are equal or not. If they are equal, they return true otherwise false.

//        !=
//        Not Equal to
//        Not Equal to operator works just opposite to Equal to operator.
//        It returns false if the operands are equal in value, otherwise true.

        int a=10;
        int b=20;
        System.out.println("(a < b) : " + (a<b));
        System.out.println("(a > b) : " + (a>b));
        System.out.println("(a <= b) : " + (a<=b));
        System.out.println("(a >= b) : " + (a>=b));
        System.out.println("(a == b) : " + (a==b));
        System.out.println("(a != b) : " + (a!=b));


//        Java Bitwise Operators

//        Java bitwise operators are used to perform the manipulation of
//        individual bits of a number and with any of the integer types.
//        They are used when performing update and query operations of the
//        Binary indexed trees.

//        |
//        Bitwise OR
//        It is a binary operator which gives OR of the input values bit by bit.
//        int a = 10;   // binary representation 1010
//        int b = 5;     // binary representation 0101
//// a | b = 1010 | 0101 = 1111
//// the value of 1111 in decimal representation is 15
//        System.out.println("The value of a | b is: " + (a | b));

//                &
//                Bitwise AND
//        It is a binary operator which gives AND of the input values bit by bit.
//
//        int a = 11;   // binary representation 1011
//        int b = 5;     // binary representation 0101
//// a & b = 1011 & 0101 = 0001
//// the value of 0001 in decimal representation is 1
//        System.out.println("The value of a & b is: " + (a & b));

//        ^
//                Bitwise XOR
//        It is a binary operator which gives XOR of the input values bit by bit.

//        int a = 11;   // binary representation 1011
//        int b = 5;     // binary representation 0101
//// a ^ b = 1011 ^ 0101 = 1110
//// the value of 1110 in decimal representation is 14
//        System.out.println("The value of a ^ b is: " + (a ^ b));

//        ~
//                Bitwise Complement
//        The Bitwise Complement operator is also a unary operator.
//        It makes every bit 0 to 1, and 1 to 0.

//        int a = 5;   // binary representation 0101
//// ~a = 1010 which will be represented as 10 in decimal format
//// The compiler will give 2's complement of this number which is -6
//        System.out.println("The value of ~a is: " + (~a));


//        Java Logical Operators

//        Logical operators are used extensively in various programming languages
//        to perform Logical NOT, OR and AND operations whose functionality is
//        similar to OR gate and AND gate in the world of digital electronics.

//        &&
//        Conditional AND Operator
//        The logical && operator does not check the second condition if the first condition is false. It checks the second condition only if the first one is true.

//        int a = 10;
//        int b = 5;
//        int c = 20;
//// (a < b) evaluates to false. Therefore, (a < c) condition will not executed.
//// Hence, the value of a will remain 10
//        if((a < b) && (++a < c))
//            System.out.println("if block is executed.");
//        else
//            System.out.println("else block is executed.");
//        System.out.println("The value of a is: " + a);


//        ||
//        Conditional OR Operator
//        The logical || operator does not check the second condition
//        if the first condition is true. It checks the second condition
//        only if the first one is false.

//        int a = 10;
//        int b = 5;
//        int c = 20;
//// the first condition (a > b) evaluates to true. Therefore, (a++ < c) will not be executed.
//// Hence, the value of a will remain 10.
//        System.out.println(a > b || a++ < c);
//        System.out.println("The value of a is: " + a);
//// the first condition (a < b) evaluates to false. Therefore, (a++ < c) will be executed.
//// Hence, the value of a will be 11.
//        System.out.println(a < b || a++ < c);
//        System.out.println("The value of a is: " + a);

//        !
//                Bitwise Complement
//        The NOT operator is used to reverse the value of a Boolean expression.

//        int a = 10;
//        int b = 5;
//// the condition (a > b) evaluates to true. After applying NOT operator, the true value
//// changes to false.
//        System.out.println(!(a > b));
//// the condition (a < b) evaluates to false. After applying NOT operator, the false value
//// changes to true.
//        System.out.println(!(a < b));


//        Java Ternary Operator

//        Java Ternary operator is used as one line replacement
//        for if-then-else statement and used a lot in Java programming.
//        It is the only conditional operator which takes three operands.

//        int a=2;
//        int b=5;
//        int min=(a<b)?a:b;
//        System.out.println(min);

//        Java Assignment Operator

//        Java assignment operator is one of the most common operators.
//        It is used to assign the value on its right to the operand on its left.
//        The left operand has to be a variable and right operand contains value.
//        Note that the data type of both the operands has to be of the same type.
//        If not, an error will be raised by the compiler.
//        The associativity of the assignment operators is form right to left,
//        which means values on the right side of the operator is assigned
//        to the left side.

//        Types of Assignment Operator
//        There are two types of assignment operators. They are:
//
//        Simple Assignment operator: The simple assignment operator
//        where only (=) is used.

//        Single Assignment Operator
//                =
//                It is the simplest assignment operator that assigns
//                the value of the right side to the variable of the left side.
//
//        Compound Assignment operator: The compound assignment operator is used
//        where -,+,/,* are used along with (=) operator.
//        +=
//        It is a compound assignment operator which consists of + and =.
//        It first adds the current value of the variable present on the left side
//        to the value on the right side and then assign the result to the
//        variable on the left side.

//        *=
//        It is a compound assignment operator which consists of * and =.
//        It first multiplies the current value of the variable present on the
//        left side to the value on the right side and then assign the result
//        to the variable on the left side.

//        /=
//        It is a compound assignment operator which consists of / and =.
//        It first divides the current value of the variable present on the
//        left side to the value on the right side and then assign the quotient
//        to the variable on the left side.

//        %=
//        It is a compound assignment operator which consists of % and =.
//        It first divides the current value of the variable present on the
//        left side to the value on the right side and then assign the remainder
//        to the variable on the left side.

//        int a=10;
//        a+=3;//10+3
//        System.out.println(a);
//        a-=4;//13-4
//        System.out.println(a);
//        a*=2;//9*2
//        System.out.println(a);
//        a/=2;//18/2
//        System.out.println(a);
//        a %= 3; // 9 % 3 = 0
//        System.out.println(a);

        // typecasting error
//        short a=10;
//        short b=10;
////a+=b;//a=a+b internally so fine. It is because implicit typecasting has occurred.
//        a=a+b; // Compile time error because 10+10=20 now int, and int can't be assigned to a shot without typecast
//        System.out.println(a);

    }
}