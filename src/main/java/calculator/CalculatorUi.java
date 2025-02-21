import javax.swing.*;
import java.awt.*;

public class CalculatorUi {

    public static void main (String...args) {
        JFrame calculator = new JFrame("Calculator");

        JTextField result = new JTextField();
        result.setBounds(0,0,200,50);
        result.setEditable(false);  // dar editable mishavad on meghdar dakhel textfield ra select kard barkhalaf enabled
        result.setBackground(Color.CYAN);


        JButton cancel = new JButton("<-");
        cancel.setBounds(150 , 0,50,50);
        cancel.setBackground(Color.ORANGE);
        cancel.addActionListener(event -> result.setText(""));


        JButton one = new JButton("1");
        one.setBounds(0 , 50,50,50);
        one.setBackground(Color.ORANGE);
        one.addActionListener(event -> result.setText(result.getText() + one.getText()));

        JButton two = new JButton("2");
        two.setBounds(50,50,50,50);
        two.setBackground(Color.ORANGE);
        two.addActionListener(event -> result.setText(result.getText() + two.getText()));


        JButton three = new JButton("3");
        three.setBounds(100,50,50,50);
        three.setBackground(Color.ORANGE);
        three.addActionListener(event -> result.setText(result.getText() + three.getText()));

        JButton plus = new JButton("+");
        plus.setBounds(150,50,50,50);
        plus.setBackground(Color.ORANGE);

        JButton four = new JButton("4");
        four.setBounds(0,100,50,50);
        four.setBackground(Color.ORANGE);
        four.addActionListener(event -> result.setText(result.getText() + four.getText()));

        JButton five = new JButton("5");
        five.setBounds(50,100,50,50);
        five.setBackground(Color.ORANGE);
        five.addActionListener(event -> result.setText(result.getText() + five.getText()));

        JButton six = new JButton("6");
        six.setBounds(100,100,50,50);
        six.setBackground(Color.ORANGE);
        six.addActionListener(event -> result.setText(result.getText() + six.getText()));

        JButton minus = new JButton("-");
        minus.setBounds(150,100,50,50);
        minus.setBackground(Color.ORANGE);

        JButton seven = new JButton("7");
        seven.setBounds(0,150,50,50);
        seven.setBackground(Color.ORANGE);
        seven.addActionListener(event -> result.setText(result.getText() + seven.getText()));

        JButton eight = new JButton("8");
        eight.setBounds(50,150,50,50);
        eight.setBackground(Color.ORANGE);
        eight.addActionListener(event -> result.setText(result.getText() + eight.getText()));

        JButton nine = new JButton("9");
        nine.setBounds(100,150,50,50);
        nine.setBackground(Color.ORANGE);
        nine.addActionListener(event -> result.setText(result.getText() + nine.getText()));

        JButton multiply = new JButton("x");
        multiply.setBounds(150,150,50,50);
        multiply.setBackground(Color.ORANGE);

        JButton point = new JButton(".");
        point.setBounds(0,200,50,50);
        point.setBackground(Color.ORANGE);
        point.addActionListener(event -> result.setText(result.getText() + point.getText()));

        JButton zero = new JButton("0");
        zero.setBounds(50,200,50,50);
        zero.setBackground(Color.ORANGE);
        zero.addActionListener(event -> result.setText(result.getText() + zero.getText()));

        JButton equal = new JButton("=");
        equal.setBounds(100,200,50,50);
        equal.setBackground(Color.ORANGE);

        JButton division = new JButton("/");
        division.setBounds(150,200,50,50);
        division.setBackground(Color.ORANGE);


        calculator.add(cancel);
        calculator.add(result);
        calculator.add(one);
        calculator.add(two);
        calculator.add(three);
        calculator.add(plus);
        calculator.add(four);
        calculator.add(five);
        calculator.add(six);
        calculator.add(minus);
        calculator.add(seven);
        calculator.add(eight);
        calculator.add(nine);
        calculator.add(multiply);
        calculator.add(point);
        calculator.add(zero);
        calculator.add(equal);
        calculator.add(division);

        calculator.setSize(600,600);   //Size JFrame
        calculator.setLayout(null);
        calculator.setVisible(true);


    }
}
