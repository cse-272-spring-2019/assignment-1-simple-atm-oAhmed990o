package atmapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Gui extends Application {
    Scene pinScene,transScene;
    
    @Override
    public void start(Stage primaryStage) {
        Label title1=new Label("Virtual ATM");
        Label title=new Label("Virtual ATM");
        Label amount=new Label("Amount");
        Label pinLabel=new Label("PIN");
        Label errorLabel= new Label();
        Label label=new Label();
        Label name=new Label();
        Label balanceLabel=new Label();
        Label historyLabel=new Label();
        
        PasswordField pinCode =new PasswordField();
        TextField fieldAmount =new TextField();
        Transactions trans=new Transactions();
        Pane grid= new Pane();
        Pane grid2=new Pane();
        
        Button menu=new Button("Main Menu");
        Button ent = new Button(" ENTER ");
        Button nxt =new Button("NEXT ->");
        Button prev =new Button("<- PREVIOUS");
        Button depose=new Button("Depose");
        Button withdraw=new Button("Withdraw");
        Button balance=new Button("Current Balance");
        Button clear=new Button("Clear");
        Button clear0=new Button("Clear");
        
        Button num0 = new Button(" "+0+" ");
        Button num1 = new Button(" "+1+" ");
        Button num2 = new Button(" "+2+" ");
        Button num3 = new Button(" "+3+" ");
        Button num4 = new Button(" "+4+" ");
        Button num5 = new Button(" "+5+" ");
        Button num6 = new Button(" "+6+" ");
        Button num7 = new Button(" "+7+" ");
        Button num8 = new Button(" "+8+" ");
        Button num9 = new Button(" "+9+" ");
        
        Button num00 = new Button(" "+0+" ");
        Button num01 = new Button(" "+1+" ");
        Button num02 = new Button(" "+2+" ");
        Button num03 = new Button(" "+3+" ");
        Button num04 = new Button(" "+4+" ");
        Button num05 = new Button(" "+5+" ");
        Button num06 = new Button(" "+6+" ");
        Button num07 = new Button(" "+7+" ");
        Button num08 = new Button(" "+8+" ");
        Button num09 = new Button(" "+9+" ");
        
        num0.setOnAction(e->pinCode.setText(pinCode.getText()+"0"));
        num1.setOnAction(e->pinCode.setText(pinCode.getText()+"1"));
        num2.setOnAction(e->pinCode.setText(pinCode.getText()+"2"));
        num3.setOnAction(e->pinCode.setText(pinCode.getText()+"3"));
        num4.setOnAction(e->pinCode.setText(pinCode.getText()+"4"));
        num5.setOnAction(e->pinCode.setText(pinCode.getText()+"5"));
        num6.setOnAction(e->pinCode.setText(pinCode.getText()+"6"));
        num7.setOnAction(e->pinCode.setText(pinCode.getText()+"7"));
        num8.setOnAction(e->pinCode.setText(pinCode.getText()+"8"));
        num9.setOnAction(e->pinCode.setText(pinCode.getText()+"9"));
        
        num00.setOnAction(e->fieldAmount.setText(fieldAmount.getText()+"0"));
        num01.setOnAction(e->fieldAmount.setText(fieldAmount.getText()+"1"));
        num02.setOnAction(e->fieldAmount.setText(fieldAmount.getText()+"2"));
        num03.setOnAction(e->fieldAmount.setText(fieldAmount.getText()+"3"));
        num04.setOnAction(e->fieldAmount.setText(fieldAmount.getText()+"4"));
        num05.setOnAction(e->fieldAmount.setText(fieldAmount.getText()+"5"));
        num06.setOnAction(e->fieldAmount.setText(fieldAmount.getText()+"6"));
        num07.setOnAction(e->fieldAmount.setText(fieldAmount.getText()+"7"));
        num08.setOnAction(e->fieldAmount.setText(fieldAmount.getText()+"8"));
        num09.setOnAction(e->fieldAmount.setText(fieldAmount.getText()+"9"));
        
        clear.setOnAction(e->fieldAmount.setText(""));
        clear0.setOnAction(e->pinCode.setText(""));
        ent.setOnAction(e-> {if(trans.validation(pinCode.getText(),errorLabel,name)){primaryStage.setScene(transScene);}
        trans.validation(pinCode.getText(),errorLabel,name);});
        menu.setOnAction(e->primaryStage.setScene(pinScene));
        
        balance.setOnAction(e->trans.balanceInquiry(trans.i, balanceLabel));
        depose.setOnAction(e->trans.Deposit(trans.i,balanceLabel,Double.parseDouble(fieldAmount.getText()),label,trans.j++,historyLabel));
        withdraw.setOnAction(e->trans.withdrawal(trans.i,Double.parseDouble(fieldAmount.getText()),label,trans.j++,historyLabel));
        nxt.setOnAction(e-> trans.Next(historyLabel));
        prev.setOnAction(e->trans.Previous(historyLabel));
        
        num0.setLayoutY(400); num0.setLayoutX(200);
        num1.setLayoutY(350); num1.setLayoutX(150);
        num2.setLayoutY(350); num2.setLayoutX(200);
        num3.setLayoutY(350); num3.setLayoutX(250);
        num4.setLayoutY(300); num4.setLayoutX(150);
        num5.setLayoutY(300); num5.setLayoutX(200);
        num6.setLayoutY(300); num6.setLayoutX(250);
        num7.setLayoutY(250); num7.setLayoutX(150);
        num8.setLayoutY(250); num8.setLayoutX(200);
        num9.setLayoutY(250); num9.setLayoutX(250);
        
        num00.setLayoutY(400); num00.setLayoutX(200);
        num01.setLayoutY(350); num01.setLayoutX(150);
        num02.setLayoutY(350); num02.setLayoutX(200);
        num03.setLayoutY(350); num03.setLayoutX(250);
        num04.setLayoutY(300); num04.setLayoutX(150);
        num05.setLayoutY(300); num05.setLayoutX(200);
        num06.setLayoutY(300); num06.setLayoutX(250);
        num07.setLayoutY(250); num07.setLayoutX(150);
        num08.setLayoutY(250); num08.setLayoutX(200);
        num09.setLayoutY(250); num09.setLayoutX(250);
        
        title1.setLayoutY(75); title1.setLayoutX(180);
        ent.setLayoutY(450); ent.setLayoutX(250);
        pinCode.setLayoutY(175); pinCode.setLayoutX(125);
        pinLabel.setLayoutY(150); pinLabel.setLayoutX(205);
        errorLabel.setLayoutY(217);errorLabel.setLayoutX(135);
        clear0.setLayoutY(20);clear0.setLayoutX(360);
                
        grid.getChildren().addAll(num0,num1,num2,num3,num4,num5,num6,num7,num8,num9,title1,ent,pinCode,pinLabel,errorLabel,clear0);
        
        fieldAmount.setLayoutY(175);fieldAmount.setLayoutX(125);
        title.setLayoutY(75); title.setLayoutX(180);
        label.setLayoutY(125); label.setLayoutX(150);
        nxt.setLayoutY(540); nxt.setLayoutX(350);
        prev.setLayoutY(540); prev.setLayoutX(15);
        depose.setLayoutY(490); depose.setLayoutX(300);
        withdraw.setLayoutY(490); withdraw.setLayoutX(60);
        balance.setLayoutY(490); balance.setLayoutX(160);
        balanceLabel.setLayoutY(450); balanceLabel.setLayoutX(150);
        menu.setLayoutY(20);menu.setLayoutX(20);
        clear.setLayoutY(20);clear.setLayoutX(360);
        name.setLayoutY(95); name.setLayoutX(170);
        amount.setLayoutY(150);amount.setLayoutX(190);
        label.setLayoutY(125); label.setLayoutX(150);
        historyLabel.setLayoutY(540);historyLabel.setLayoutX(185);
        
        grid2.getChildren().addAll(num00,num01,num02,num03,num04,num05,num06,num07,num08,num09,
                label,title,nxt,prev,depose,withdraw,balance,balanceLabel,fieldAmount,menu,clear,name,amount,historyLabel);
        
        pinScene =new Scene(grid,445,600);
        transScene =new Scene(grid2,445,600);
            primaryStage.setScene(pinScene);
            primaryStage.setTitle("Welcome To Your Atm Application");
            primaryStage.show();
            
    }
    
    
    public static void main(String[] args) {
        launch(args);
       }
}
