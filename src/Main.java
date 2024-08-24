import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class Main {

    public static void main(String[] args){

        //Creating and configuring a window frame
        JFrame mainWindow = new JFrame(); //Creates a frame
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Makes it so the frame closes when click X
        mainWindow.setResizable(false); //Prevent frame from resize
        mainWindow.setSize(420,420); // Sets the x and y dimension of the frame
        mainWindow.setTitle("Bank App"); // Sets title of the frame
        mainWindow.setVisible(true); //Makes frame visible

        //Customizing how the window frame looks
        ImageIcon icon = new ImageIcon("Images/AppIcon.png"); //Create the icon with an image
        mainWindow.setIconImage(icon.getImage()); //Change icon of the frame
        mainWindow.getContentPane().setBackground(new Color(0x1E1E1E));
        //Next
    }
}
