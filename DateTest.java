/*
Name: sumit dhawan
Student#: 230162550
Course: CPSC100
HW5
 */
package pack1;

public class DateTest {
    public static void main(String[] args) {
        // Create a Date object
        Date date1 = new Date(12, 31, 2022);

        // Display the initial date
        System.out.println("Initial Date:");
        System.out.println(date1.displayDate());

        // Update the date using set methods with input validation
        date1.setMonth(15);
        date1.setDay(40);
        date1.setYear(-2023);

        // Display the updated date
        System.out.println("Updated Date:");
        System.out.println(date1.displayDate());
    }
}
/*
Initial Date:
12/31/2022
Invalid month. Setting to default (1).
Invalid day. Setting to default (1).
Invalid year. Setting to default (0).
Updated Date:
01/01/0

Process finished with exit code 0
 */

