package org.drools.DroolsDemo;

public class PaymentOffer {
   private String Channel;
   private int discount;

    public PaymentOffer(String Channel, int discount) {
        this.Channel = Channel;
        this.discount = discount;
    }
    public PaymentOffer(String Channel) {
        this.Channel = Channel;
    }

    public String getChannel() {
        return Channel;
    }

    public void setChannel(String channel) {
        this.Channel = channel;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
