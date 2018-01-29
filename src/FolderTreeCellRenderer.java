import java.awt.Component;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.filechooser.FileSystemView;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shariar Kabir
 */
public class FolderTreeCellRenderer implements TreeCellRenderer{
    ImageIcon Icon=new ImageIcon();
    JLabel fileName=new JLabel("");
    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected,
                                                  boolean expanded, boolean leaf, int row, boolean hasFocus) {
        Component returnValue=null;
        if(value!=null){
            File file= new File(value.toString());
            Icon=(ImageIcon)FileSystemView.getFileSystemView().getSystemIcon(file);
            fileName=new JLabel(Icon,JLabel.LEFT);
            fileName.setText(file.getName());
            returnValue=fileName;
        }
        return returnValue;
    }
    
}
