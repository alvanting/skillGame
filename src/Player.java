public class Player {
    private String name;
    private boolean isAlive;
    private int currentHp;
    private int maxHp;
    private int currentMp;
    private int maxMp;

    public Player(String name){
        this.name=name;
        this.isAlive=true;
        this.currentHp=100;
        this.maxHp=100;
        this.currentMp=100;
        this.maxMp=100;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public boolean getIsAlive(){
        return isAlive;
    }
    public void setIsAlive(boolean isAlive){
        this.isAlive=isAlive;
    }
    public int getCurrentHp(){
        return currentHp;
    }
    public void setCurrentHp(int currentHp){
        if(currentHp>=0){
            this.currentHp=currentHp;
        }
        if(currentHp<=0){
            this.currentHp=0;
            isAlive=false;
        }
    }
    public int getMaxHp(){
        return this.maxHp;
    }
    public void setMaxHp(int maxHp){
        if(maxHp>=currentHp) {
            this.maxHp = maxHp;
        }
    }
    public int getCurrentMp(){
        return currentMp;
    }
    public void setCurrentMp(int currentMp){
        if(currentMp>=0) {
            this.currentMp = currentMp;
        }
    }
    public  int getMaxMp(){
        return maxMp;
    }
    public void setMaxMp(int currentMp){
        if (maxMp>=currentMp){
            this.maxMp=maxMp;
        }
    }
    public void smallAttack(){
        currentMp-=0;
    }
    public void middleAttack(){
        currentMp-=10;
    }
    public void bigAttack(){
        currentMp-=20;
    }
    public void receivedDamage(int damage){
        currentHp-=damage;
        if(currentHp<=0){
            currentHp=0;
            isAlive=false;
        }
    }
}
