package oops.arrayAdvance;

class Market{

    private String ownerName;
    private int marketId;
    private String location;

    int[] stallNumbers = {1, 2, 3, 4, 5};
    static boolean[] isOpenToday = {true, true, false, true, false};

    public static boolean[] getIsOpenToday() {
        return isOpenToday;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getMarketId() {
        return marketId;
    }

    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

