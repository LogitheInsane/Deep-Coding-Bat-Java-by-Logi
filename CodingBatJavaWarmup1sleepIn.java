/**
 * Coding Bat Java Warmup - 1 / sleepIn
 * This practice question is from 'codingbat.com' and the question is copyrighted by Nick Parlante.
 * You can reach Nick Parlante at 'nick.parlante@cs.stanford.edu'.
 * This solution includes the ways and approaches to solve the problem via comments.
 * You should only check this solution to learn and understand, please do not violate the honor code. (https://honor.fas.harvard.edu/honor-code)
 * I hope my code and explanation helps you to learn coding and improve yourself as a coder, which is also my goal. 
 * @author Canberk Kızılkaya, Logi the Insane, canberkkizilkaya@gmail.com
 * Feel free to contact me if you have any questions, requests or help.
 */

/**
 * Practice Question:
 * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
   We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
   sleepIn(false, false) → true
   sleepIn(true, false) → false
   sleepIn(false, true) → true
 */

public class CodingBatJavaWarmup1sleepIn 
{
   public static boolean sleepIn(boolean weekday, boolean vacation) 
   {
    // For us to sleep in, it should not be a weekday, or it should be vacation.
    // The first part of the if (!weekday) states that it should not be a weekday for us to sleep in.
    // The second part of the if (vacation) states that we can sleep if we are on vacation, so it
    // does not matter if it is a workday or not on vacation situation.
    // This 'if-else statement' covers four statements, "weekday-notVacation", "weekday-Vacation",
    // "weekend-Vacation", "weekend-notVacation".
    // The question tells us that we only can't sleep in in the situation of "weekday-notVacation".
    // Thus, this 'if-else statement's 'if' covers three statements that we can sleep in, and
    // else part covers the only situation that we can not sleep in.
       
    if (!weekday || vacation)
    {
       return true;
    }
    else
        return false;
   }
   
   /* You actually do not need an 'if-else statement' for this function, as there are 4 possible states and
      3 of the states are the same, a simple 'OR' statement will cover everything in the function.
   
        Clean Code:
   
        public static boolean sleepIn(boolean weekday, boolean vacation)
        {
         return (!weekday || vacation)
        } 
   */
   
    public static void main(String[] args) 
    {
        // Day Examples to test the function, true means we are allowed to sleep on Sunday,
        // but we are not allowed to sleep on Thursday, so it is false.
        boolean thursday = true; // Thursday is a weekday.
        boolean sunday = false; // Sunday is not a weekday.
        
        // Daily Situations to test the function, false means we are at work so we are not allowed to sleep,
        // but we are allowed to sleep at vacation, so it is true.
        boolean atVacation = true;
        boolean atWork = false;
        
        // These print should enough to test every possibilities of the function, so we will test our results
        // to see if our function works correctly.
        System.out.println(sleepIn(thursday,atWork));
        System.out.println(sleepIn(sunday,atWork));
        System.out.println(sleepIn(thursday,atVacation));
        System.out.println(sleepIn(sunday,atVacation));
    }
}

/**
 * Output:
    false
    true
    true
    true
    * The output is as it is expected, as we should get a negative result (means we can sleep in)
    * only if it is a work day and we are not on a vacation, so in our test code it 
    * is resembled by 'It is Thursday and we are at work.'
 */
