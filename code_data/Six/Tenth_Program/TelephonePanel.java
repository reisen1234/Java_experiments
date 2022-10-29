package code_data.Six.Tenth_Program;
//******************************************************
// TelephonePanel.java
//
// Lays out a (functionless) GUI like a telephone keypad with a title.
// Illustrates use of BorderLayout and GridLayout.
//******************************************************
import java.awt.*;
import javax.swing.*;
public class TelephonePanel extends JPanel
{
    public TelephonePanel()
    {
//set BorderLayout for this panel
        BorderLayout TelephonePanel = new BorderLayout();
//create a JLabel with "Your Telephone" title
        JLabel jLabel = new JLabel("Your Telephone");
//add title label to north of this panel
        add(jLabel,BorderLayout.NORTH);
//create panel to hold keypad and give it a 4x3 GridLayout
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(3,5,4,4));
        //add buttons representing keys to key panel
        for(int i = 0; i<= 9;i++){
            panel.add(new Button(i+""));
        }
        panel.add(new Button("*"));
        panel.add(new Button("#"));
//add key panel to center of this panel
        add(panel,BorderLayout.CENTER);
    }
}
