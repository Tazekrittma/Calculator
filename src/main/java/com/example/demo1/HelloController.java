package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Button Btn0;

    @FXML
    private Button BtnDot;

    @FXML
    private Button Btn1;

    @FXML
    private Button Btn2;

    @FXML
    private Button Btn3;

    @FXML
    private Button Btn4;

    @FXML
    private Button Btn5;

    @FXML
    private Button Btn6;

    @FXML
    private Button Btn7;

    @FXML
    private Button Btn8;

    @FXML
    private Button Btn9;

    @FXML
    private Button BtnAdd;

    @FXML
    private Button BtnDiv;

    @FXML
    private Button BtnEql;

    @FXML
    private Button BtnMult;

    @FXML
    private Button BtnSub;

    @FXML
    private TextField txtresult;






        @FXML
        public void handleButtonAction(ActionEvent event) {
            double num1 = 0;
            double num2 = 0;
            String operator = "";
            boolean start = true;
            if (start) {
                txtresult.setText("");
                start = false;
            }

            String value = ((Button)event.getSource()).getText();
            switch (value) {
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                {txtresult.setText(txtresult.getText() + value);System.out.println(value);}
                    break;
                case ".":
                    if (!txtresult.getText().contains(".")) {
                        txtresult.setText(txtresult.getText() + value);
                    }
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    operator = value;
                    num1 = Double.parseDouble(txtresult.getText());
                    txtresult.setText("");
                    break;
                case "=":
                    num2 = Double.parseDouble(txtresult.getText());
                    double result = 0;
                    switch (operator) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            result = num1 / num2;
                            break;
                    }
                    txtresult.setText(String.valueOf(result));

            }
        }}


