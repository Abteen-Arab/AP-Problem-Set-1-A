/*
 * Programmer: Abteen Arab
 * Project: Various Formulas With Basic Operations
 * Date: Sept 20, 2021
 */
public class Formulas {

    public static void main (String [] args) {
        /*
         * Quadratic Formula
         */
        
        int a = 1; //a is the coeffieceint of the leading term.
        int b = 5; //b is the coeffiecent of the second term.
        int c = 6; //c is the constant and the y-intercept.
    
        double rootAdd;      //Value of x-intercept when you   add    the Square Root of 4ac; Larger x-intercept value
        double rootSubtract; //Value of x-intercept when you subtract the Square Root of 4ac; Smaller x-intercept Value
        
        //Please note, the reason I used inside is to be able to back track logic errors.
        double inside = Math.pow(b, 2.0) - 4 * a * c; 
        
        //Quadratic Formula: Simplified
        rootSubtract = (- 1 * b - Math.sqrt(inside)) / (2 * a);
        rootAdd = (-1 * b + Math.sqrt(inside)) / (2 * a);
        
        /*
         * Output For Root, Please Note:
         * The first if and else statements modify the output when there is only 1 root. 
         * The second set of if and else statements modify output when b and/or c are 0.
         */
        if (rootAdd == rootSubtract){ 
            if (b != 0 && c != 0){    
            System.out.println("QUADRATIC FORMULA");
            System.out.println("The solution for " + a + "x^2 + " + b + "x + " + c + " is " + rootAdd + ".");
            System.out.println();
            } else if (c != 0) {
                
            System.out.println("QUADRATIC FORMULA");
            System.out.println("The solution for " + a + "x^2 + " + c + " is " + rootAdd + ".");
            System.out.println();
                
            } else if (b != 0){
                
            System.out.println("QUADRATIC FORMULA");
            System.out.println("The solution for " + a + "x^2 + " + b + "x is " + rootAdd + ".");
            System.out.println();
                
            } else {
            System.out.println("QUADRATIC FORMULA");
            System.out.println("The solution for " + a + "x^2 is " + rootAdd + ".");
            System.out.println();
                
            }
        } else { 
            if (b != 0 && c != 0){ 
            System.out.println("QUADRATIC FORMULA");
            System.out.println("The solutions for " + a + "x^2 + " + b + "x + " + c + " are " +  rootSubtract + " and " + rootAdd + ".");
            System.out.println();
            } else if (c != 0) {
                
            System.out.println("QUADRATIC FORMULA");
            System.out.println("The solutions for " + a + "x^2 + " + c + " are " + rootSubtract + " and " + rootAdd + ".");
            System.out.println();
                
            } else if (b != 0) {
                
            System.out.println("QUADRATIC FORMULA");
            System.out.println("The solutions for " + a + "x^2 + " + b + "x are " + rootSubtract + " and " + rootAdd + ".");
            System.out.println();
                
            } else {
            System.out.println("QUADRATIC FORMULA");
            System.out.println("The solutions for " + a + "x^2 are " + rootSubtract + " and " + rootAdd + ".");
            System.out.println();
                
            }
        }
    
        
        
        /*
         * Slope Formula
         */
        
        //Variables: These variables will be used again for midpoint
        int y1 = 0; //y1 = the y value corresponding with x1
        int y2 = 3; //y2 = the y value corresponding with x2
        int x1 = 0; //x1 = the x value corresponding with y2
        int x2 = 2; //x2 = the x value corresponding with y2
        
        //Linear Formula 
        double m= (double)(y2 - y1) / (x2 - x1); //Difference qoutient for the difference of two points in space.
        
        //Output For Slope
        System.out.println("SLOPE FORMULA");
        System.out.println("A line connecting the points (" + x1 + ", " + y1 + ") and " + "(" + x2 + ", " + y2 + ") has a slope of " + m);
        System.out.println();
        
        
        /*
         * Midpoint Formula
         */
        
        //Variables
        int y3 = y1; //An arbitrary y value corresponding x3: This is the intended same as y1 as the output is the same.
        int y4 = y2; //An arbitrary y value corresponding x4: This is the intended same as y2 as the output is the same.
        int x3 = x1; //An arbitrary x value corresponding y3: This is the intended same as x1 as the output is the same.
        int x4 = x2; //An arbitrary x value corresponding y4: This is the intended same as x2 as the output is the same.
        
        double yMid = (double)(y3 + y4) / 2; //Average of the two y values
        double xMid = (double)(x3 + x4) / 2; //Average of the two x values
        
        //Output For Midpoint
        System.out.println("MIDPOINT FORMULA");
        System.out.println("The midpoint between (" + x3 + ", " + y3 + ") and (" + x4 + ", " + y4 + ") is " + "(" + xMid + ", " + yMid + ")");
        System.out.println();
        
        
        
        /*
         * Arthmetic Series Formula
         */
        
        //Variables
        double firstValue = 1;       //First Value of
        double commonDifference = 1; //The slope of the values relative to number of terms
        int num = 5;                 //number of terms
        
        //Arthmetic Sum Formula w/ common ratio, initial value, and number of terms
        double arthSeriesValue = ((double)num/2) * (2 * firstValue + commonDifference * ( num - 1));
        
        //Output For arithmetic series: 
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.println("The sum of the first " + num + " terms of an arithmetic series that starts with "+ firstValue);  
        System.out.println("and increases by " + commonDifference +" is " + arthSeriesValue);
        System.out.println();
        
        
        /*
         * Geometric Series Formula
         */
        
        //Variables
        double intialValue = 3; //Starting Value of the series 
        double commonRatio = 2; //Common constant ratio of the series that is raised to a power n.
        int n = 3;              //Number Of Terms
        
        //Geometric Sum Formula w/ common ratio, initial value, and number of terms
        double geoSeriesValue = intialValue * (Math.pow(commonRatio,n)-1)/(commonRatio-1);
        
        //Output for geometric series
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES");
        System.out.println("The sum of the first " + n + " terms of a finite geometric series that starts with " + intialValue);
        System.out.print("and increases by a rate of " + commonRatio + " is " + geoSeriesValue);
    
    }

}