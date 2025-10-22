package oops.arrayAdvance;

class MarketArrayRunner{
	  public static void main(String[] args) {
        Market[] markets = new Market[5];

        Market market = new Market();
        market.setOwnerName("Kabhi");
        market.setLocation("Delhi");
        markets[0] = market;

       Market market1 = new Market();
        market1.setOwnerName("Tarun");
        market1.setLocation("Delhi");
        markets[1] = market1;

        Market market2 = new Market();
        market2.setOwnerName("Barsha");
        market2.setLocation("Delhi");
        markets[2] = market2;

        Market market3 = new Market();
        market3.setOwnerName("kabir");
        market3.setLocation("Delhi");
        markets[3] = market3;

        Market market4 = new Market();
        market4.setOwnerName("Arif");
        market4.setLocation("Delhi");
        markets[4] = market4;

        for (int i = 0; i < markets.length; i++) {
            System.out.println("Market " + (i + 1) + ":");
            Market localMarket = markets[i];
            System.out.println("Name: " + localMarket.getOwnerName());
            System.out.println("Location: " + localMarket.getLocation());
            System.out.println();
        }
    }
}

