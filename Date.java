/*
Name: sumit dhawan
Student#: 230162550
Course: CPSC100
HW5
 */
package pack1;

public class Date {
    private int month;
    private int day;
    private int year;

        // Constructor
    public Date(int month, int day, int year) {
            this.month = month;
            this.day = day;
            this.year = year;
        }

        // Set methods with input validation
    public void setMonth(int month) {
            if (month >= 1 && month <= 12) {
                this.month = month;
            } else {
                System.out.println("Invalid month. Setting to default (1).");
                this.month = 1;
            }
        }
    public void setDay(int day) {
       if (day >= 1 && day <= 31) {
           this.day = day;
       } else {
           System.out.println("Invalid day. Setting to default (1).");
           this.day = 1;
       }
    }

    public void setYear(int year) {
        if (year >= 0) {
            this.year = year;
        }
        else {
            System.out.println("Invalid year. Setting to default (0).");
            this.year = 0;
        }
        }

        // Get methods
    public int getMonth() {
            return month;
        }

    public int getDay() {
            return day;
        }
    public int getYear() {
            return year;
        }

        // Method to display the date
    public String displayDate() {
            return String.format("%02d/%02d/%d", month, day, year);
    }
}

