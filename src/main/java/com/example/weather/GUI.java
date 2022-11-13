package java.testparse;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GUI {

    private JButton button1;
    private JTextField City_TextField;
    private JPanel panelMain;
    private JLabel out;

    public String get(String city) throws IOException {
        String weather = Weather.GetWeather(city);
        return weather;
    }

    public GUI() throws IOException {
        button1.setText("Search");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    String Mass = get(City_TextField.getText());
                    if (!Mass.equals("Вы неправильно ввели название города или нет прогноза на этот город.")){
                        String[] words = Mass.split(" ");
                        String Out = words[0];

                        Out ="В городе "+words[0]+" сейчас "+words[1]+"градусов, влажность: "+words[2]+" Давление: "+words[3]+words[4]+" Ртутного столба, Ветер:"+words[5]+"М/с";

                        out.setText(Out);
                    }
                    else {out.setText(Mass);}





                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

    }

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("APP");
        frame.setContentPane(new GUI().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,200);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}

