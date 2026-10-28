package swing_projects;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {
    private JTextField inputField;
    private JButton[] numberButtons;
    private JButton addButton, subtractButton, multiplyButton, divideButton, equalsButton, clearButton;
    private double firstNumber, secondNumber;
    private char operator;

    public Calculator() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Input field
        inputField = new JTextField();
        inputField.setEditable(false);
        add(inputField, BorderLayout.NORTH);

        // Number buttons
        JPanel numberPanel = new JPanel(new GridLayout(4, 3));
        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(new NumberButtonActionListener());
            numberPanel.add(numberButtons[i]);
        }
        add(numberPanel, BorderLayout.CENTER);

        // Operator buttons
        JPanel operatorPanel = new JPanel(new GridLayout(5, 1));
        addButton = new JButton("+");
        addButton.addActionListener(new OperatorButtonActionListener());
        operatorPanel.add(addButton);

        subtractButton = new JButton("-");
        subtractButton.addActionListener(new OperatorButtonActionListener());
        operatorPanel.add(subtractButton);

        multiplyButton = new JButton("*");
        multiplyButton.addActionListener(new OperatorButtonActionListener());
        operatorPanel.add(multiplyButton);

        divideButton = new JButton("/");
        divideButton.addActionListener(new OperatorButtonActionListener());
        operatorPanel.add(divideButton);

        equalsButton = new JButton("=");
        equalsButton.addActionListener(new EqualsButtonActionListener());
        operatorPanel.add(equalsButton);

        add(operatorPanel, BorderLayout.EAST);

        // Clear button
        clearButton = new JButton("C");
        clearButton.addActionListener(new ClearButtonActionListener());
        add(clearButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    private class NumberButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            inputField.setText(inputField.getText() + button.getText());
        }
    }

    private class OperatorButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            firstNumber = Double.parseDouble(inputField.getText());
            operator = button.getText().charAt(0);
            inputField.setText("");
        }
    }

    private class EqualsButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            secondNumber = Double.parseDouble(inputField.getText());
            double result = calculateResult();
            inputField.setText(String.valueOf(result));
        }
    }

    private class ClearButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputField.setText("");
        }
    }

    private double calculateResult() {
        double result = 0.0;

        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Calculator();
        });
    }
}
