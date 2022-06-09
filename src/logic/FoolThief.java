package logic;

import gui.MainWindow;
import persistence.FilePersistence;

public class FoolThief {    
    
    public static void main(String[] args) {
        FilePersistence file = new FilePersistence();
        file.loadData();
        MainWindow mainWindow = new MainWindow();
        mainWindow.setLocationRelativeTo(null);
        
        
    }
}
