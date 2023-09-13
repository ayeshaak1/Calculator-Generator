public class Character{
    private String charClass;
    private Attributes stats = new Attributes();


    public void setCharClass(String classType){
        charClass = classType;
    }
    public String getCharClass(){
        return charClass;
    }

    public void setInt(int val){
        stats.setAttribute("intelligence",val);
    }
    public int getInt(int val){
        return stats.getAttribute("intelligence");
    }
    public void setWis(int val){
        stats.setAttribute("wisdom",val);
    }
    public int getWis(int val){
        return stats.getAttribute("wisdom");
    }
    public void setChar(int val){
        stats.setAttribute("charisma",val);
    }
    public int getChar(int val){
        return stats.getAttribute("charisma");
    }
    public void setStr(int val){
        stats.setAttribute("strength",val);
    }
    public int getStr(int val){
        return stats.getAttribute("strenth");
    }
    public void setDex(int val){
        stats.setAttribute("dexterity",val);
    }
    public int getDex(int val){
        return stats.getAttribute("dexterity");
    }
    public void setCon(int val){
        stats.setAttribute("constitution",val);
    }
    public int getCon(int val){
        return stats.getAttribute("constitution");
        
    }
      // if you have time, see if you can add the character class
    // into the toString return value
  @Override
  public String toString(){
    return stats.toString();
  }
}