package atmapp;
 
import javafx.scene.control.Label;

public class Transactions implements ATM {
    
    public double amount;
        public int i = 0;
        public static int j=0;
        public int count=0;
        public int h=0;
        public static int a=0;
	public String [] historyQueue = new String[5];
	public Client[] users = new Client[10];
	Client c = new Client();
	
    @Override
        public boolean validation(String pinScan,Label errorLabel,Label name) {
		for (i = 0; i < 10; i++) {
			if (pinScan.equals(c.pin[i])) {
                            name.setText("Welcome "+c.name[i]);
                             return true;
			}
                    }
                if(i==10){errorLabel.setText("Please Insert Correct Pin...");}
                      return false;
	}
        
    @Override
	public void balanceInquiry(int i,Label balanceLabel) {
                balanceLabel.setText("Current Balance : "+c.balance[i]);
                for (a=0;a < 5;a++){System.out.println(historyQueue[a]);}
	}
        
    @Override
	public void withdrawal(int i,double amount,Label label,int j,Label historyLabel) {
		if (amount <= c.balance[i]) {
                    c.balance[i] = c.balance[i] - amount;
                    label.setText("Sucessful Operation");
                    if(j>4){for(h=4;h>0;h--){historyQueue[h]=historyQueue[h-1];}historyQueue[0]= "Withdrawal : "+amount;j=0;}
                    if(j<=4){historyQueue[j]= "Withdrawal : "+amount;}
                    historyLabel.setText(historyQueue[j]);
                    } else {
		    label.setText("Amount exceeds initial balance");
		}
            }
        
    @Override
	public void Deposit(int i,Label balanceLabel,double amount,Label label,int j,Label historyLabel) {
		label.setText("Successful Operation");
		c.balance[i] = c.balance[i] + amount;
                if(j>4){for(h=4;h>0;h--){historyQueue[h]=historyQueue[h-1];}historyQueue[0]= "Deposit : "+amount;j=0;}
                 if(j<=4){historyQueue[j]= "Deposit : "+amount;}
                 historyLabel.setText(historyQueue[j]);
        }
               
    @Override
        public void Previous(Label historyLabel) {
            count--;
            if(count<0){count=4;}
            if(historyQueue[count]==null){}
            historyLabel.setText(historyQueue[count]);         
	}
        
    @Override
        public void Next(Label historyLabel){
            historyLabel.setText(historyQueue[count]);
            count++;
            if(count>4){count=0;}
            if(historyQueue[count]==null){}
            }
}
