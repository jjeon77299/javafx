package cal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {
	private String operator = "";
	//private int x = 0;
	private double x = 0.0;
	private Model model = new Model();
	
	@FXML
	private Text result;
	
	@FXML
	private void operand(ActionEvent event) {	
		if(((Button) event.getSource()).getText().equals("C")) {
			result.setText("");
		}else {
			result.setText(result.getText() +((Button) event.getSource()).getText());
		}
	}
	
	@FXML
	private void operator(ActionEvent event) {
		if(((Button) event.getSource()).getText().equals("=")) {
			result.setText(model.calculate(operator, x, Double.parseDouble(result.getText()))+"");
		}else {
			operator = ((Button) event.getSource()).getText();
			x = Double.parseDouble(result.getText());
			result.setText("");
			//result.setText(result.getText() +((Button) event.getSource()).getText());
		}
	}
}

