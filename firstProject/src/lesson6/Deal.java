package lesson6;

import java.util.Date;

public class Deal {
    private long id;
    private int price;
    private Date dateCreated;
    private boolean isConfirmed;
    private Date dateConfirmed;
    private String city;
    private String country;
    private String type;

    public static void main(String[] args) {
        Deal deal = new Deal();
        deal.confirmDeal();
        System.out.println(deal);

    }

    @Override
    public String toString() {
        return "Deal{" +
                "id=" + id +
                ", price=" + price +
                ", dateCreated=" + dateCreated +
                ", isConfirmed=" + isConfirmed +
                ", dateConfirmed=" + dateConfirmed +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public Deal(int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
        this.price = price;
        this.dateCreated = dateCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;
    }

    public Deal() {
    }

    public void confirmDeal() {
        isConfirmed = true;
    }

    public boolean checkPrice() {
        return price > 1000;
    }

    public static boolean isValidType(String type) {
        return type == "Buy" || type == "Sale";
    }
}

