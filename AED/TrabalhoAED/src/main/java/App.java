package main.java;
import java.awt.*;

public class App {

    private static MainScreen mainScreen;

    public static void main(String[] args){
        EventQueue.invokeLater(() ->{
            try{
                mainScreen = new MainScreen();
            } catch(Exception e){
                e.printStackTrace();
            }
        });
    }
}
