import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculator extends JFrame{
    private JButton btn4;
    int num;


    String oper;
    int num1,num2,result;
    int max;


    double answer;
    public Calculator() throws HeadlessException
    {
        add(calFrame);
        setVisible(true);
        setSize(300,350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // setPreferredSize();
        setResizable(false);



        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num=7;
                txtValues.setText(txtValues.getText()+num);
                operator.setText("");

            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 num=8;
                txtValues.setText(String.valueOf(txtValues.getText()+num));
                operator.setText("");
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num=9;
                txtValues.setText(String.valueOf(txtValues.getText()+num));
                operator.setText("");
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num=4;
                txtValues.setText(String.valueOf(txtValues.getText()+num));
                operator.setText("");
            }
        });


        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num=5;
                txtValues.setText(String.valueOf(txtValues.getText()+num));
                operator.setText("");
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num=6;
                txtValues.setText(String.valueOf(txtValues.getText()+num));
                operator.setText("");
            }
        });

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num=1;
                txtValues.setText(String.valueOf(txtValues.getText()+num));
                operator.setText("");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               num=2;
               txtValues.setText(String.valueOf(txtValues.getText()+num));
                operator.setText("");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num=3;
                txtValues.setText(String.valueOf(txtValues.getText()+num));
                operator.setText("");
            }
        });

        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num=0;
                txtValues.setText(String.valueOf(txtValues.getText()+num));
                operator.setText("");
            }
        });


        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1= Integer.parseInt(txtValues.getText());
                txtValues.setText("");
                operator.setText("/");
                oper="/";
            }
        });
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1= Integer.parseInt(txtValues.getText());
                txtValues.setText("");
                operator.setText("+");
                oper="+";
            }
        });

        btnMin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1= Integer.parseInt(txtValues.getText());
                txtValues.setText("");
                operator.setText("-");
                oper="-";
            }
        });


        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1= Integer.parseInt(txtValues.getText());
                txtValues.setText("");
                operator.setText("*");
                oper="*";
            }
        });

        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                num2= Integer.parseInt(txtValues.getText());
                if(oper.equals("+"))
                {
                    result=num1+num2;
                    txtValues.setText(String.valueOf(result));
                }

                if(oper.equals("-"))
                {
                    result=num1-num2;
                    txtValues.setText(String.valueOf(result));
                }
                if(oper.equals("/"))
                {
                    result=num1/num2;
                    txtValues.setText(String.valueOf(result));

                }
                if(oper.equals("*"))
                {
                    result=num1*num2;
                    txtValues.setText(String.valueOf(result));

                }

            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        btnClear.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtValues.setText(" ");
                operator.setText(" ");
            }
        });
    }





    private JButton btn5;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn6;
    private JButton btn1;
    private JButton btnAdd;
    private JButton btn2;
    private JButton btn0;
    private JButton btn3;
    private JButton btnMin;
    private JButton btnClear;
    private JButton btnEqual;
    private JButton button3;
    private JButton btnDivide;
    private JPanel calFrame;
    private JLabel txtValues;
    private JButton btnMultiply;
    private JLabel operator;

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }


    public static void main(String[] args) {
        Calculator c=new Calculator();

    }
}
