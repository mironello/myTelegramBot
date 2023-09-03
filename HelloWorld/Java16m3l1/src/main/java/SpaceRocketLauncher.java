class SpaceRocketLauncher {
    private int bigRocketCount;
    private int smallRocketCount;

    public int getBigRocketCount() {
        return bigRocketCount;
    }

    public int getSmallRocketCount() {
        return smallRocketCount;
    }

    public void setSmallRocketCount(int smallRocketCount) {
        if (smallRocketCount < 0 || smallRocketCount > 100) {
            return;
        }
        this.smallRocketCount = smallRocketCount;
    }

    public void setBigRocketCount(int bigRocketCount) {
        if (bigRocketCount < 0 || bigRocketCount > 100) {
            return;
        }
        this.bigRocketCount = bigRocketCount;
    }

    public void launchBigRocket() {
        if (getBigRocketCount() > 0) {
            setBigRocketCount(getBigRocketCount() - 1);
            System.out.println("Launch big rocket");
        }
    }

    public void launchSmallgRocket() {
        if (getSmallRocketCount() > 0) {
            setSmallRocketCount(getSmallRocketCount() - 1);
            System.out.println("Launch big rocket");
        }
    }

    public int getTotalPower() {
        return getBigRocketCount() * 100 + getSmallRocketCount() * 50;
    }

}
