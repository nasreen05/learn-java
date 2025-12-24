package basic.array.arrayAdvance;

class Cinema{
    private String manager;
    private int cinemaId;
    private String city;


    char[] seatRows = {'A', 'B', 'C', 'D'};
    static float[] ticketPrices = {120.5f, 150.0f, 180.75f, 200.0f};

    public static float[] getTicketPrices() {
        return ticketPrices;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public int getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(int cinemaId) {
        this.cinemaId = cinemaId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

