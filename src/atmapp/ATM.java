package atmapp;

import javafx.scene.control.Label;


public interface ATM {
    public boolean validation(String pinScan,Label errorLabel,Label name);
    public void balanceInquiry(int i,Label balanceLabel);
    public void withdrawal(int i,double amount,Label label,int j,Label historyLabel);
    public void Deposit(int i,Label balanceLabel,double amount,Label label,int j,Label historyLabel);
    public void Previous(Label historyLabel);
    public void Next(Label historyLabel);
    }
