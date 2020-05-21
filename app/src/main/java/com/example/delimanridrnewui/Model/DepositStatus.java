package com.example.delimanridrnewui.Model;

public class DepositStatus {
private String refnumberTextView;
    private String amountTextView;
    private String statusTextView;
    private String timeShowingTextView;

    public DepositStatus(String refnumberTextView, String amountTextView, String statusTextView, String timeShowingTextView) {
        this.refnumberTextView = refnumberTextView;
        this.amountTextView = amountTextView;
        this.statusTextView = statusTextView;
        this.timeShowingTextView = timeShowingTextView;
    }

    public String getRefnumberTextView() {
        return refnumberTextView;
    }

    public void setRefnumberTextView(String refnumberTextView) {
        this.refnumberTextView = refnumberTextView;
    }

    public String getAmountTextView() {
        return amountTextView;
    }

    public void setAmountTextView(String amountTextView) {
        this.amountTextView = amountTextView;
    }

    public String getStatusTextView() {
        return statusTextView;
    }

    public void setStatusTextView(String statusTextView) {
        this.statusTextView = statusTextView;
    }

    public String getTimeShowingTextView() {
        return timeShowingTextView;
    }

    public void setTimeShowingTextView(String timeShowingTextView) {
        this.timeShowingTextView = timeShowingTextView;
    }
}
