import java.util.Random;

public class Skill {
    private String name;
    private int damage;
    private int mpUsage;
    private double missRate;
    private Player player;
    public Skill(String name,int damage,int mpUsage,double missRate){
        this.name=name;
        this.damage=damage;
        this.mpUsage=mpUsage;
        this.missRate=missRate;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getDamage(){
        return damage;
    }
    public void setDamage(int damage){
        if(damage>=0){
            this.damage=damage;
        }
    }
    public int getMpUsage(){
        return mpUsage;
    }
    public void setMpUsage(int mpUsage){
        if(mpUsage>=0){
            this.mpUsage=mpUsage;
        }
    }
    public double getMissRate(){
        return missRate;
    }
    public void setMissRate(double missRate){
        this.missRate=missRate;
    }
    public boolean judgement(double missRate){
        Random random=new Random();
        if(missRate>random.nextDouble(0.01,1)){
            return true;
        }
        return false;
    }
}
