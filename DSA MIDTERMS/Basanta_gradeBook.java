public class Basanta_gradeBook {
    public static void main(String[] args) {
        // Print the headers
        System.out.println("Welcome to the grade book for");
        System.out.println("CS101 Introduction to C++ Programming!\n");
        System.out.println("The grades are:\n");
        System.out.printf("%-12s %8s %8s %8s %9s\n", "", "Test 1", "Test 2", "Test 3", "Average");

        // 2D Array containing the grades from the image
        int[][] grades =
        {
            {87, 96, 70},
            {68, 87, 90},
            {94, 100, 90},
            {100, 81, 82},
            {83, 65, 85},
            {78, 87, 65},
            {85, 75, 83},
            {91, 94, 100},
            {76, 72, 84},
            {87, 93, 73}
        };

        // Initialize lowest and highest with the first element
        int lowest = grades[0][0];
        int highest = grades[0][0];

        // Loop through the array to print grades, find averages, and find min/max
        for (int i = 2; i < 5; i++) 
        {
            System.out.printf("Student %2d", (i + 1));
            
            int sum = 0;
            for (int j = 0; j < grades[i].length; j++) 
            {
                int grade = grades[i][j];
                System.out.printf("%9d", grade);
                
                sum += grade; // Add to student's total
                
                // Check for new lowest or highest
                if (grade < lowest) {
                    lowest = grade;
                }
                if (grade > highest) {
                    highest = grade;
                }
            }
            
            // Calculate and print the average for the current student
            double average = (double) sum / grades[i].length;
            System.out.printf("%10.2f\n", average);
        }

        // Print final min and max
        System.out.println("\nLowest grade in the grade book is " + lowest);
        System.out.println("Highest grade in the grade book is " + highest);
    }
}