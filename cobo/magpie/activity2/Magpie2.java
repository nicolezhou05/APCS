/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */

/*
1) When more than one keyword appears in a string, you get the response of the first keyword that appears in the code.
2) When a keyword is included in another word, the response of that keyword will still be returned.
*/

public class Magpie2
{
  /**
   * Get a default greeting
   * @return a greeting
   */
  public String getGreeting()
  {
    return "Hello, let's talk.";
  }

  /**
   * Gives a response to a user statement
   *
   * @param statement
   *            the user statement
   * @return a response based on the rules given
   */
  public String getResponse(String statement)
  {
    String response = "";
    if (statement.length() == 0)
    {
      response = "Say something, please.";
    }
    else if (statement.indexOf("no") >= 0)
    {
      response = "Why so negative?";
    }
    else if (statement.indexOf("mother") >= 0
	|| statement.indexOf("father") >= 0
	|| statement.indexOf("sister") >= 0
	|| statement.indexOf("brother") >= 0)
    {
      response = "Tell me more about your family.";
    }
    else if (statement.indexOf("dog") >= 0
        || statement.indexOf("cat") >= 0)
    {
      response = "Tell me more about your pets.";
    }
    else if (statement.indexOf("Mr.Mykolyk") >= 0)
    {
      response = "Mr.Mykolyk is an amazing teacher!";
    }
    else if (statement.indexOf("What are you?") >= 0)
    {
      response = "I am the smartest being ever. You are not even 0.00000001% close to me.";
    }
    else if (statement.indexOf("Knock Knock") >= 0)
    {
      response = "Who's there?";
    }
    else if (statement.indexOf("Why?") >= 0)
    {
      response = "What do you mean why?";
    }
    else
    {
      response = getRandomResponse();
    }
    return response;
  }

  /**
   * Pick a default response to use if nothing else fits.
   * @return a non-committal string
   */
  private String getRandomResponse()
  {
    final int NUMBER_OF_RESPONSES = 6;
    double r = Math.random();
    int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
    String response = "";

    if (whichResponse == 0)
    {
      response = "Interesting, tell me more.";
    }
    else if (whichResponse == 1)
    {
      response = "Hmmm.";
    }
    else if (whichResponse == 2)
    {
      response = "Do you really think so?";
    }
    else if (whichResponse == 3)
    {
      response = "You don't say.";
    }
    else if (whichResponse == 4)
    {
      response = "Okay...";
    }
    else if (whichResponse == 5)
    {
      response = "And?";
    }

    return response;
  }
}
