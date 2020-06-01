package com.example.delimanridrnewui.Model;

public class RedeemHistory {
    private String redeemAmountTextView,timeShowingTextView;
    private int redeemMethodIconImageView;

    public String getRedeemAmountTextView() {
        return redeemAmountTextView;
    }

    public void setRedeemAmountTextView(String redeemAmountTextView) {
        this.redeemAmountTextView = redeemAmountTextView;
    }

    public String getTimeShowingTextView() {
        return timeShowingTextView;
    }

    public void setTimeShowingTextView(String timeShowingTextView) {
        this.timeShowingTextView = timeShowingTextView;
    }

    public int getRedeemMethodIconImageView() {
        return redeemMethodIconImageView;
    }

    public void setRedeemMethodIconImageView(int redeemMethodIconImageView) {
        this.redeemMethodIconImageView = redeemMethodIconImageView;
    }

    public RedeemHistory(String redeemAmountTextView, String timeShowingTextView, int redeemMethodIconImageView) {
        this.redeemAmountTextView = redeemAmountTextView;
        this.timeShowingTextView = timeShowingTextView;
        this.redeemMethodIconImageView = redeemMethodIconImageView;
    }
}
