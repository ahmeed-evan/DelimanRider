package com.example.delimanridrnewui.Model;

public class PaymentMethod {
    private int paymentMethodIconImage;
    private String paymentMethodtTitleTextView;

    public int getPaymentMethodIconImage() {
        return paymentMethodIconImage;
    }

    public void setPaymentMethodIconImage(int paymentMethodIconImage) {
        this.paymentMethodIconImage = paymentMethodIconImage;
    }

    public String getPaymentMethodtTitleTextView() {
        return paymentMethodtTitleTextView;
    }

    public void setPaymentMethodtTitleTextView(String paymentMethodtTitleTextView) {
        this.paymentMethodtTitleTextView = paymentMethodtTitleTextView;
    }

    public PaymentMethod(int paymentMethodIconImage, String paymentMethodtTitleTextView) {
        this.paymentMethodIconImage = paymentMethodIconImage;
        this.paymentMethodtTitleTextView = paymentMethodtTitleTextView;
    }
}
