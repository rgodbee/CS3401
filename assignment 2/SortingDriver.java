/***************************/
/* Name:     Richard Godbee*/
/* Class:    CS3401        */
/* Term:     Summer 2013   */
/* Assgn #:  2             */
/***************************/

package cs3401_godbee;

public class SortingDriver
{
   public static void main (String[] args)
   {
      String[] friends = new String[4];

      friends[0] = "Fred Williams";
      friends[1] = "Sarah Barnes";
      friends[2] = "Mark Riley";
      friends[3] = "Laura Getz";
      Sorting.insertionSort(friends);
      
      for (int i = 0; i < friends.length; ++i)
         System.out.println (friends[i]);
   }
}