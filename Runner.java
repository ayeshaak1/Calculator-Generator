public class Runner{
    public static void main(String[] args){
        Character mage = new Character();
        CharBuilder builder = new CharBuilder();
        builder.rollAllStats(mage);
        System.out.println(mage.toString());
    }
}