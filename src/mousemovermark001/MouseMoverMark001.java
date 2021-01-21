/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mousemovermark001;

import com.formdev.flatlaf.intellijthemes.FlatMaterialDesignDarkIJTheme;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.Color;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.multi.MultiLookAndFeel;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.plaf.synth.SynthLookAndFeel;

/**
 *
 * @author bouhl
 */
public class MouseMoverMark001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        // TODO code application logic here
        try {
            UIManager.setLookAndFeel(new FlatMaterialDesignDarkIJTheme());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        UIDefaults uiDefaults = UIManager.getDefaults();
      
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        MouseFrame mouseFrame = new MouseFrame();
        mouseFrame.setVisible(true);
        mouseFrame.setTitle("MouseMover version 1.0");

    }

}
