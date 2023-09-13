
public class Die {


	   private final int MAX = 20;
	   private final int MIN = 2;

	   private int numFaces;   // number of sides on the die
	   private int faceValue;  // current value showing on the die

	   //-----------------------------------------------------------------
	   //  Defaults to a six-sided die. Initial face value is 1.
	   //-----------------------------------------------------------------
	   public Die ()
	   {
	      this(6);
        
	   }

	   //-----------------------------------------------------------------
	   //  Explicitly sets the size of the die. Defaults to a size of
	   //  six if the parameter is invalid.  
	   //-----------------------------------------------------------------
	   public Die (int faces)
	   {
	      if (faces > MAX)
	         numFaces = MAX;
	      else if (faces < MIN)
	      {
	    	  numFaces = MIN;
	      }
	      else
	      {
	         numFaces = faces;
	      }
	      faceValue = roll();
	   }

	   //-----------------------------------------------------------------
	   //  Rolls the die and returns the result.
	   //-----------------------------------------------------------------
	   public int roll ()
	   {
	      faceValue = (int) (Math.random() * numFaces) + 1;
	      return faceValue;
	   }

	   //-----------------------------------------------------------------
	   //  Returns the current die value.
	   //-----------------------------------------------------------------
	   public int getFaceValue ()
	   {
	      return faceValue;
	   }

	
	public int getNumberOfSides()
	{
		return numFaces;
	}
}