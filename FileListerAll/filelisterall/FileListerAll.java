package filelisterall;

import java.io.File;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FileListerAll extends javax.swing.JFrame
{
  static File[] f = null;
  private JScrollPane jScrollPane1;
  private JTextArea jTextArea1;
  
  public FileListerAll() {
    initComponents();
    changeTheLookAndFeel(3);
    JFileChooser fc = new JFileChooser();
    fc.setFileSelectionMode(1);
    fc.setMultiSelectionEnabled(true);
    int r = fc.showDialog(this, "Select folder");
    f = fc.getSelectedFiles();
    if ((r == 1) || (!f[0].exists()) || (f.length == 0)) {
      System.exit(0);
    } else if (f != null)
    {
      for (File f1 : f) {
        this.jTextArea1.append(f1.getName().toUpperCase() + "\n\n");
        Size(f1);
        this.jTextArea1.append("\n************************END_OF_LIST************************\n\n");
      }
    }
  }
  


  private void changeTheLookAndFeel(int value)
  {
    javax.swing.UIManager.LookAndFeelInfo[] looks = javax.swing.UIManager.getInstalledLookAndFeels();
    
    try
    {
      javax.swing.UIManager.setLookAndFeel(looks[value].getClassName());
      

      javax.swing.SwingUtilities.updateComponentTreeUI(this);
    }
    catch (Exception exception)
    {
      javax.swing.JOptionPane.showMessageDialog(this, "L&F error.", "Internal error", 0);
    }
  }
  

  void Size(File f)
  {
    int c = 0;
    long l = 0L;
    
    File[] fi = f.listFiles();
    for (int i = 0; i < fi.length; i++)
    {
      if (fi[i].isDirectory())
      {
        this.jTextArea1.append(fi[i].getPath() + "  - FOLDER\n");
        Size(fi[i]);
      }
      else if (fi[i].isFile())
      {
        l = fi[i].length();
        if (l < 1024L) {
          this.jTextArea1.append(++c + ">" + fi[i].getName() + "   " + l + " bytes\n");
        } else if ((l > 1024L) && (l < 1048576L)) {
          this.jTextArea1.append(++c + ">" + fi[i].getName() + "   " + l / 1024L + " KB\n");
        } else if (l > 1048576L) {
          this.jTextArea1.append(++c + ">" + fi[i].getName() + "   " + l / 1048576L + " MB\n");
        }
        l = 0L;
      }
    }
  }
  







  private void initComponents()
  {
    this.jScrollPane1 = new JScrollPane();
    this.jTextArea1 = new JTextArea();
    
    setDefaultCloseOperation(3);
    setLocationByPlatform(true);
    
    this.jTextArea1.setColumns(20);
    this.jTextArea1.setRows(5);
    this.jScrollPane1.setViewportView(this.jTextArea1);
    
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jScrollPane1, -1, 504, 32767));
    
    layout.setVerticalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jScrollPane1, -1, 499, 32767));
    

    pack();
  }
  


  public static void main(String[] args)
  {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new FileListerAll().setVisible(true);
      }
    });
  }
}
