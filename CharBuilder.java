public class CharBuilder{
    
    public int rollStat(Die die){
        //need the logic for 3d6 rerolling 1s
        int currValue = 1;
        int total = 0;
        
        for (int i =00; i < 3; i++){
            currValue = 1;
            
            while (currValue == 1){
                currValue = die.roll();
            }
            total += currValue;
        }
        
        return total;

    }

    public void rollAllStats(Character whoAmI){
        Die sixSide = new Die(6);
        // Intelligence
        int intelligence = rollStat(sixSide);
        whoAmI.setInt(intelligence);

        // Wisdom
        int wisdom = rollStat(sixSide);
        whoAmI.setWis(wisdom);
        
        // Charisma
        int charisma = rollStat(sixSide);
        whoAmI.setChar(charisma);
        
        // Strength
        int strentgh = rollStat(sixSide);
        whoAmI.setStr(strentgh);
        
        // Dexterity
        int dex = rollStat(sixSide);
        whoAmI.setDex(dex);
        
        // Constitution
        int cons = rollStat(sixSide);
        whoAmI.setCon(cons);

    }

}