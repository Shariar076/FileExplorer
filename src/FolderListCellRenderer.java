/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Component;
import java.awt.GridLayout;
import java.io.File;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Shariar Kabir
 */
public class FolderListCellRenderer implements ListCellRenderer{
  //  ImageIcon Icon=new ImageIcon();
    
    JLabel fileIcon=new JLabel("");
    JLabel fileName=new JLabel("");
    JPanel render=new JPanel();
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, 
                                                                                       boolean cellHasFocus) {
        Component returnValue=null;
        if(value!=null){
            File file=new File(value.toString());
            ImageIcon icon =(ImageIcon)FileSystemView.getFileSystemView().getSystemIcon(file);
           // ImageIcon icon = new ImageIcon("im.jpg");
            fileIcon.setIcon(icon);
            if(file.getName().length()<10)fileName.setText(file.getName());
            else fileName.setText(file.getName().substring(0, 10) + "... ");
            //render.setLayout(new GridLayout(2, 1));
            render.setLayout(new BoxLayout(render, BoxLayout.Y_AXIS));
            fileIcon.setAlignmentX(Component.CENTER_ALIGNMENT);
            fileName.setAlignmentX(Component.CENTER_ALIGNMENT);
            render.add(fileIcon);
            render.add(fileName);
            returnValue=render;
        }
        return returnValue;
    }

    private Object FileSystemView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
