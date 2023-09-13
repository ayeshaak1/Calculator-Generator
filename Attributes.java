import java.util.HashMap;
import java.util.Set;
/* you don't have to edit this class at all */
public class Attributes{
private HashMap<String, Integer> attributes = new HashMap<>();


public void setAttribute(String name, int val){
    attributes.put(name,val);
}

public int getAttribute(String name){
    Integer val = attributes.get(name);
    if(val == null){
        val = 0;
    }
    return val;

}
@Override
public String toString(){
  String returnString = ""; 
  Set<String> keys = attributes.keySet();
  int val;
  for(String stat: keys){
    val = attributes.get(stat);
    returnString += stat + ": " + val + "\n";
    }
  return returnString;
}

    
}