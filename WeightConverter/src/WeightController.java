import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class WeightController {

    @FXML
    private TextField weightInput; // Input field for user to enter weight

    @FXML
    private ChoiceBox<String> unitSelection; // Dropdown to select unit (kg or lbs)

    @FXML
    private Label resultLabel; // Label to display the conversion result

    @FXML
    private Button calculateButton; // Button to trigger conversion
    
    @FXML
    public void initialize() {
        // Populate choice box with unit options
        unitSelection.getItems().addAll("Kilograms", "Pounds");
        unitSelection.setValue("Kilograms"); // Set default selection
        resultLabel.setText(""); // Clear result label initially
    }

    @FXML
    private void calculateWeight() {
        String input = weightInput.getText();

        // Check if input is empty
        if (input.isEmpty()) {
            resultLabel.setText("Please enter a value!");
            return;
        }

        try {
            double weight = Double.parseDouble(input);
            String unit = unitSelection.getValue();

            // Ensure a unit is selected
            if (unit == null) {
                resultLabel.setText("Choose a unit!");
                return;
            }

            double result = 0;
            if (unit.equals("Kilograms")) {
                result = weight / 2.20462; // Convert kg to lbs
            } else if (unit.equals("Pounds")) {
                result = weight * 2.20462; // Convert lbs to kg
            }
            
            // Display formatted result
            resultLabel.setText(String.format("%.2f", result));
            
        } catch (NumberFormatException e) {
            // Handle invalid numeric input
            resultLabel.setText("Invalid input!");
        }
    }
}
