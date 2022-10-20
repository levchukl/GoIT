package hw5.spaceRocket;

public class SpaceRocketLauncher {
    private int bigRocketCount;
    private int smallRocketCount;

    public int getBigRocketCount() {
        return bigRocketCount;
    }

    public void setBigRocketCount(int bigRocketCount) {
        if (bigRocketCount>0 && bigRocketCount<100){
        this.bigRocketCount = bigRocketCount;
    }
    }

    public int getSmallRocketCount() {
        return smallRocketCount;
    }

    public void setSmallRocketCount(int smallRocketCount) {
        if (smallRocketCount > 0 && smallRocketCount < 100) {
            this.smallRocketCount = smallRocketCount;
        }
    }
    public void launchBigRocket() {
        if (bigRocketCount > 0) {
            bigRocketCount--;
            System.out.println("Launch big rocket");
        }
    }

    public void launchSmallRocket(){
        if(smallRocketCount>0){
            smallRocketCount--;
        System.out.println("Launch small rocket");
       }
    }

    public int getTotalPower(){
        int powerBig = bigRocketCount*100;
        int powerSmall = smallRocketCount*50;

        return powerBig+powerSmall;
    }

}
