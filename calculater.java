import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class calculater extends Frame implements ActionListener{
    TextField display;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, plus, minus, multiply, divide, equals, clear;

    calculater(){



        display = new TextField("0");
        display.setBounds(50,50,400,50);

        btn0 =new Button("0");
        btn0.setBounds(50,400,80,80);
        btn0.addActionListener(this);

        btn1 = new Button("1");
        btn1.setBounds(50,300,80,80);
        btn1.addActionListener(this);

        btn2 = new Button("2");
        btn2.setBounds(150,300,80,80);
        btn2.addActionListener(this);

        btn3 = new Button("3");
        btn3.setBounds(250,300,80,80);
        btn3.addActionListener(this);

        btn4 = new Button("4");
        btn4.setBounds(50,200,80,80);
        btn4.addActionListener(this);

        btn5 = new Button("5");
        btn5.setBounds(150,200,80,80);
        btn5.addActionListener(this);

        btn6 = new Button("6");
        btn6.setBounds(250,200,80,80);
        btn6.addActionListener(this);

        btn7 = new Button("7");
        btn7.setBounds(50,100,80,80);
        btn7.addActionListener(this);

        btn8 = new Button("8");
        btn8.setBounds(150,100,80,80);
        btn8.addActionListener(this);

        btn9 = new Button("9");
        btn9.setBounds(250,100,80,80);
        btn9.addActionListener(this);

        plus = new Button("+");
        plus.setBounds(350,300,80,80);
        plus.addActionListener(this);

        minus = new Button("-");
        minus.setBounds(350,200,80,80);
        minus.addActionListener(this);

        multiply = new Button("*");
        multiply.setBounds(350,100,80,80);
        multiply.addActionListener(this);

        divide = new Button("/");
        divide.setBounds(350,400,80,80);
        divide.addActionListener(this);

        equals = new Button("=");
        equals.setBounds(150,400,80,80);
        equals.addActionListener(this);

        clear = new Button("C");
        clear.setBounds(250,400,80,80);
        clear.addActionListener(this);

        add(display);
        add(btn0);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        add(plus);
        add(minus);
        add(multiply);
        add(divide);
        add(equals);
        add(clear);


        setSize(500,600);
        setLayout(null);
        setTitle("Cal");
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn0) {
            String expression = display.getText();
            expression += "0";
            display.setText(expression);
        }

        if (e.getSource() == btn1) {
            String expression = display.getText();
            expression += "1";
            display.setText(expression);
        }

        if (e.getSource() == btn2) {
            String expression = display.getText();
            expression += "2";
            display.setText(expression);
        }

        if (e.getSource() == btn3) {
            String expression = display.getText();
            expression += "3";
            display.setText(expression);
        }

        if (e.getSource() == btn4) {
            String expression = display.getText();
            expression += "4";
            display.setText(expression);
        }

        if (e.getSource() == btn5) {
            String expression = display.getText();
            expression += "5";
            display.setText(expression);
        }

        if (e.getSource() == btn6) {
            String expression = display.getText();
            expression += "6";
            display.setText(expression);
        }

        if (e.getSource() == btn7) {
            String expression = display.getText();
            expression += "7";
            display.setText(expression);
        }

        if (e.getSource() == btn8) {
            String expression = display.getText();
            expression += "8";
            display.setText(expression);
        }

        if (e.getSource() == btn9) {
            String expression = display.getText();
            expression += "9";
            display.setText(expression);
        }

        if (e.getSource() == plus) {
            String expression = display.getText();
            expression += "+";
            display.setText(expression);
        }

        if (e.getSource() == minus) {
            String expression = display.getText();
            expression += "-";
            display.setText(expression);
        }

        if (e.getSource() == multiply) {
            String expression = display.getText();
            expression += "*";
            display.setText(expression);
        }

        if (e.getSource() == divide) {
            String expression = display.getText();
            expression += "/";
            display.setText(expression);
        }

        if (e.getSource() == clear) {
            display.setText("0");
        }

        if (e.getSource() == equals) {
            int a, b, i;
            char operator = '+';

            String expression = display.getText();
            String tempA = "", tempB = "";

            for (i = 0; i < expression.length(); i++) {
                if (Character.isDigit(expression.charAt(i))) {
                    tempA += expression.charAt(i);
                } else {
                    operator = expression.charAt(i);
                    break;
                }
            }


            tempB = expression.substring(i + 1);

            a = Integer.parseInt(tempA);
            b = Integer.parseInt(tempB);

            int result = 0;

            switch (operator){
                case '+':
                    result = a+b;
                    break;

                case '-':
                    result = a-b;
                    break;

                case '*':
                    result = a*b;
                    break;

                case '/':
                    result = a/b;
                    break;
            }

            display.setText(String.valueOf(result));
        }

        // closing buttun code
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }





    public static void main(String[] args) {
        new calculater();
    }
}
