import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;

public class DiskPlanner extends javax.swing.JFrame
{
  File f = null;
  static long s = 0L;
  static File[] fi;
  static long[] si;
  static long l1 = 2147483647L;
  static long l2 = 2147483647L;
  
  static long x = l1 + l2 + 412352514L;
  static long diff = 0L;
  private javax.swing.JButton jButton1;
  private JMenu jMenu1;
  
  public DiskPlanner()
  {
    initComponents();
    changeTheLookAndFeel(3);
    this.jButton1.setEnabled(false);
  }

  private JMenu jMenu4;
  private JMenu jMenu5;
  
  private void changeTheLookAndFeel(int value) { javax.swing.UIManager.LookAndFeelInfo[] looks = javax.swing.UIManager.getInstalledLookAndFeels();

    try
    {
      javax.swing.UIManager.setLookAndFeel(looks[value].getClassName());

      javax.swing.SwingUtilities.updateComponentTreeUI(this);
    }
    catch (Exception exception)
    {
      JOptionPane.showMessageDialog(this, "L&F error.", "Internal error", 0);
    }
  }
  
  private JMenu jMenu6;
  private javax.swing.JMenuBar jMenuBar1;
  private JMenuItem jMenuItem2;
  private JMenuItem jMenuItem5;
  private JMenuItem jMenuItem6;
  private JRadioButtonMenuItem jRadioButtonMenuItem1;
  private JRadioButtonMenuItem jRadioButtonMenuItem2;
  private JRadioButtonMenuItem jRadioButtonMenuItem3;
  
  private void initComponents() {
    this.jScrollPane1 = new javax.swing.JScrollPane();
    this.jTextArea1 = new JTextArea();
    this.jButton1 = new javax.swing.JButton();
    this.jSeparator1 = new javax.swing.JSeparator();
    this.jMenuBar1 = new javax.swing.JMenuBar();
    this.jMenu1 = new JMenu();
    this.jMenuItem6 = new JMenuItem();
    this.jMenuItem2 = new JMenuItem();
    this.jMenu4 = new JMenu();
    this.jRadioButtonMenuItem1 = new JRadioButtonMenuItem();
    this.jRadioButtonMenuItem2 = new JRadioButtonMenuItem();
    this.jRadioButtonMenuItem3 = new JRadioButtonMenuItem();
    this.jRadioButtonMenuItem8 = new JRadioButtonMenuItem();
    this.jMenu6 = new JMenu();
    this.jRadioButtonMenuItem4 = new JRadioButtonMenuItem();
    this.jRadioButtonMenuItem5 = new JRadioButtonMenuItem();
    this.jRadioButtonMenuItem6 = new JRadioButtonMenuItem();
    this.jRadioButtonMenuItem7 = new JRadioButtonMenuItem();
    this.jMenu5 = new JMenu();
    this.jMenuItem5 = new JMenuItem();
    
    setDefaultCloseOperation(3);
    setTitle("Disk Planner");
    setLocationByPlatform(true);
    this.jTextArea1.setColumns(20);
    this.jTextArea1.setEditable(false);
    this.jTextArea1.setRows(5);
    this.jTextArea1.setDoubleBuffered(true);
    this.jScrollPane1.setViewportView(this.jTextArea1);
    
    this.jButton1.setText("Plan");
    this.jButton1.setToolTipText("First select a folder & the disk type-CD or DVD");
    this.jButton1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        DiskPlanner.this.jButton1ActionPerformed(evt);
      }
      
    });
    this.jMenu1.setText("File");
    this.jMenuItem6.setText("Select folder...");
    this.jMenuItem6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        DiskPlanner.this.jMenuItem6ActionPerformed(evt);
      }
      
    });
    this.jMenu1.add(this.jMenuItem6);
    
    this.jMenuItem2.setText("Save As...");
    this.jMenuItem2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        DiskPlanner.this.jMenuItem2ActionPerformed(evt);
      }
      
    });
    this.jMenu1.add(this.jMenuItem2);
    
    this.jMenuBar1.add(this.jMenu1);
    
    this.jMenu4.setText("Disk");
    this.jRadioButtonMenuItem1.setText("CD");
    this.jMenu4.add(this.jRadioButtonMenuItem1);
    
    this.jRadioButtonMenuItem2.setText("DVD");
    this.jMenu4.add(this.jRadioButtonMenuItem2);
    
    this.jRadioButtonMenuItem3.setText("Custom...");
    this.jRadioButtonMenuItem3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        DiskPlanner.this.jRadioButtonMenuItem3ActionPerformed(evt);
      }
      
    });
    this.jMenu4.add(this.jRadioButtonMenuItem3);
    
    this.jRadioButtonMenuItem8.setText("BD");
    this.jMenu4.add(this.jRadioButtonMenuItem8);
    
    this.jMenuBar1.add(this.jMenu4);
    
    this.jMenu6.setText("Skin");
    this.jRadioButtonMenuItem4.setText("Windows");
    this.jRadioButtonMenuItem4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        DiskPlanner.this.jRadioButtonMenuItem4ActionPerformed(evt);
      }
      
    });
    this.jMenu6.add(this.jRadioButtonMenuItem4);
    
    this.jRadioButtonMenuItem5.setText("Classic");
    this.jRadioButtonMenuItem5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        DiskPlanner.this.jRadioButtonMenuItem5ActionPerformed(evt);
      }
      
    });
    this.jMenu6.add(this.jRadioButtonMenuItem5);
    
    this.jRadioButtonMenuItem6.setText("Motif");
    this.jRadioButtonMenuItem6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        DiskPlanner.this.jRadioButtonMenuItem6ActionPerformed(evt);
      }
      
    });
    this.jMenu6.add(this.jRadioButtonMenuItem6);
    
    this.jRadioButtonMenuItem7.setText("Metal");
    this.jRadioButtonMenuItem7.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        DiskPlanner.this.jRadioButtonMenuItem7ActionPerformed(evt);
      }
      
    });
    this.jMenu6.add(this.jRadioButtonMenuItem7);
    
    this.jMenuBar1.add(this.jMenu6);
    
    this.jMenu5.setText("Help");
    this.jMenuItem5.setText("About Disk Planner");
    this.jMenuItem5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        DiskPlanner.this.jMenuItem5ActionPerformed(evt);
      }
      
    });
    this.jMenu5.add(this.jMenuItem5);
    
    this.jMenuBar1.add(this.jMenu5);
    
    setJMenuBar(this.jMenuBar1);
    
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(60, 60, 60).addComponent(this.jButton1).addContainerGap(287, 32767)).addComponent(this.jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, -1, 400, 32767).addComponent(this.jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, -1, 400, 32767));
    







    layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jScrollPane1, -1, 223, 32767).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jSeparator1, -2, 10, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1).addContainerGap()));
    








    pack();
  }
  
  private void jRadioButtonMenuItem3ActionPerformed(ActionEvent evt) {
    String s = JOptionPane.showInputDialog(this, "Enter the destination size in bytes: ", "DVD");
    if (s != null)
    {
      if (!s.equalsIgnoreCase("DVD"))
      {
        if ((s != null) && (s != ""))
        {
          try
          {
            x = Long.parseLong(s);
          }
          catch (NumberFormatException ex)
          {
            JOptionPane.showMessageDialog(this, "Invalid input.", "Invalid input", 0);
          } }
      }
    }
  }
  
  private void jButton1ActionPerformed(ActionEvent evt) {
    this.jTextArea1.setText("Please Wait...");
    fi = this.f.listFiles();
    si = new long[fi.length];
    for (int i = 0; i < fi.length; i++)
    {
      if (fi[i].isDirectory())
      {

        si[i] = Size(fi[i]);
        s = 0L;
      }
      else
      {
        si[i] = fi[i].length();
      }
    }
    
    this.jTextArea1.append("..");
    

    for (int i = 0; i < fi.length; i++)
    {
      for (int j = 0; j < fi.length - 1; j++)
      {
        if (si[j] < si[(j + 1)])
        {
          long temp = si[j];
          File temp2 = fi[j];
          
          si[j] = si[(j + 1)];
          fi[j] = fi[(j + 1)];
          
          si[(j + 1)] = temp;
          fi[(j + 1)] = temp2;
        }
      }
    }
    this.jTextArea1.append("..");
    this.jTextArea1.setText("");
    



    byte n = 1;
    for (int i = 0; i < si.length; i++)
    {
      if (si[i] > 0L)
      {
        diff = x - si[i];
        si[i] = (-1L * si[i]);
        if (diff < 0L)
        {
          this.jTextArea1.append("\nFolder:- " + fi[i].getName() + "\t\t" + "-- TOO LARGE - Run 'Disk Planner' on this folder individually.");

        }
        else
        {
          n = (byte)(n + 1);this.jTextArea1.append("\nDisk-" + n + ":- " + fi[i].getName());
          
          algo(i);
        }
      }
    }
    this.jButton1.setEnabled(false);
  }
  
  private void jRadioButtonMenuItem7ActionPerformed(ActionEvent evt) {
    changeTheLookAndFeel(0);
  }
  
  private void jRadioButtonMenuItem6ActionPerformed(ActionEvent evt) {
    changeTheLookAndFeel(1);
  }
  
  private void jRadioButtonMenuItem5ActionPerformed(ActionEvent evt) {
    changeTheLookAndFeel(2);
  }
  
  private void jRadioButtonMenuItem4ActionPerformed(ActionEvent evt) {
    changeTheLookAndFeel(3);
  }
  
  private void jMenuItem5ActionPerformed(ActionEvent evt) {
    JOptionPane.showMessageDialog(null, "Disk Planner by Ankit Singh,\n\nto get the optimal combination of files and folders for:\n• burning on to a CD/DVD/BD\n• copying on to a pen drive\n\nThis software has the capability to run\non any Operating System in the world.\n\n", "About Disk Planner", 1);
  }
  
  private void jMenuItem2ActionPerformed(ActionEvent evt) {
    JFileChooser fc = new JFileChooser();
    fc.setDoubleBuffered(true);
    javax.swing.filechooser.FileNameExtensionFilter ff = new javax.swing.filechooser.FileNameExtensionFilter("Text Documents (*.txt)", new String[] { "txt" });
    fc.setFileFilter(ff);
    int r = fc.showSaveDialog(this);
    File fs = fc.getSelectedFile();
    
    if ((r == 1) || (fs.getName().equals("")))
      fs = null;
    boolean flag = false;
    if ((fs != null) && (r == 0))
    {
      fs = new File(fs + ".txt");
      
      java.io.FileFilter ff2 = new java.io.FileFilter()
      {
        public boolean accept(File pathname) {
          if ((pathname.isFile()) && (pathname.getName().endsWith(".txt"))) {
            return true;
          }
          return false;
        }
      };
      File[] a = fs.getParentFile().listFiles(ff2);
      
      for (short i = 0; i < a.length; i = (short)(i + 1))
      {

        if (a[i].toString().equals(fs.toString()))
        {
          flag = true;
          break;
        }
      }
    }
    if (flag == true)
    {
      int s = JOptionPane.showConfirmDialog(this, fs.getAbsoluteFile() + " already exists.\nDo you want to replace it?", "Save As", 0, 2);
      if (s == 0)
      {
        try
        {
          java.io.PrintWriter pw = new java.io.PrintWriter(fs);
          pw.write(this.jTextArea1.getText());
          pw.close();

        }
        catch (java.io.FileNotFoundException ex)
        {
          JOptionPane.showMessageDialog(this, "File not found.", "File Error", 0);
        }
        catch (java.io.IOException ioException)
        {
          JOptionPane.showMessageDialog(this, "Unable to read the file.", "File Error", 0);
        }
        catch (SecurityException securityException)
        {
          JOptionPane.showMessageDialog(this, "You do not have write access to this file.", "File Error", 0);
        }
      }
    }
    else if (fs != null)
    {

      try
      {
        java.io.PrintWriter pw = new java.io.PrintWriter(fs);
        pw.write(this.jTextArea1.getText());
        pw.close();

      }
      catch (java.io.FileNotFoundException ex)
      {
        JOptionPane.showMessageDialog(this, "File not found.", "File Error", 0);
      }
      catch (java.io.IOException ioException)
      {
        JOptionPane.showMessageDialog(this, "Unable to read the file.", "File Error", 0);
      }
      catch (SecurityException securityException)
      {
        JOptionPane.showMessageDialog(this, "You do not have write access to this file.", "File Error", 0);
      }
    }
  }
  
  private void jMenuItem6ActionPerformed(ActionEvent evt) {
    JFileChooser fc = new JFileChooser();
    fc.setFileSelectionMode(1);
    fc.setCurrentDirectory(new File("/"));
    fc.setDoubleBuffered(true);
    int r = fc.showDialog(this, "Select folder");
    this.f = fc.getSelectedFile();
    

    if ((r == 1) || (this.f.getName().equals(""))) {
      this.f = null;
    } else if (this.f != null) {
      this.jButton1.setEnabled(true);
    }
  }
  
  public static long Size(File f)
  {
    File[] ar = f.listFiles();
    for (int i = 0; i < ar.length; i++)
    {
      if (ar[i].isFile())
      {
        s += ar[i].length();

      }
      else
      {
        Size(ar[i]);
      }
    }
    
    return s;
  }
  
  public void algo(int i)
  {
    for (int j = i + 1; j < si.length; j++)
    {

      if (si[j] > 0L)
      {
        if (si[j] == diff)
        {
          si[j] = (-1L * si[j]);
          
          this.jTextArea1.append(" + " + fi[j].getName());
          break;
        }
        if (si[j] < diff)
        {
          diff -= si[j];
          si[j] = (-1L * si[j]);
          this.jTextArea1.append(" + " + fi[j].getName());
          
          algo(j);
        } } } }
  
  private JRadioButtonMenuItem jRadioButtonMenuItem4;
  private JRadioButtonMenuItem jRadioButtonMenuItem5;
  private JRadioButtonMenuItem jRadioButtonMenuItem6;
  private JRadioButtonMenuItem jRadioButtonMenuItem7;
  private JRadioButtonMenuItem jRadioButtonMenuItem8;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JSeparator jSeparator1;
  private JTextArea jTextArea1;
  public static void main(String[] args) { java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new DiskPlanner().setVisible(true);
      }
    }); }
}
