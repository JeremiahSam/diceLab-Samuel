package diceLab;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class diceController {

	 @FXML
	 private ImageView diceOne;
	 
	 @FXML
	 private ImageView diceTwo;
	 
	 @FXML
	 private Button rollButton;
	 
	 @FXML
	 private Label diceOneLabel;
	 
	 @FXML
	 private Label diceTwoLabel;
	 
	 Image blankDice = new Image("http://www.unclesgames.com/images/products/N01960_big.jpg");
	 
	 public void initialize(){
		 diceOne.setImage(blankDice);
		 diceTwo.setImage(blankDice);
		}
		
	 public void rollButtonListener(){
		 int diceOne;
	     int diceTwo;
	          

	     diceOne = (int)(Math.random()*6) + 1;
	     diceTwo = (int)(Math.random()*6) + 1;
	     
	     String one = Integer.toString(diceOne);
	     String two = Integer.toString(diceTwo);
	     
	     diceOneLabel.setText(one);
	     diceTwoLabel.setText(two);
	            
	 }
	
}
