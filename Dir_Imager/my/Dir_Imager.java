package my;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Dir_Imager
{
  public static void main(String[] args)
  {
    int value = 3;
    
    UIManager.LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
    try
    {
      UIManager.setLookAndFeel(looks[value].getClassName());
      javax.swing.SwingUtilities.updateComponentTreeUI(null);
    }
    catch (Exception e) {}
    
    JFileChooser fc = new JFileChooser();
    fc.setFileSelectionMode(1);
    fc.setMultiSelectionEnabled(true);
    int r = fc.showDialog(fc, "Select target folder(s)");
    File[] f = fc.getSelectedFiles();
    if ((r == 1) || (f[0].getName().equals("")))
    {

      System.exit(0);
    }
    else if (f != null)
    {
      String loc = "C:\\Dir_Images\\";
      new File(loc).mkdir();
      for (int i = 0; i < f.length; i++)
      {
        loc = loc + f[i].getName();
        File fo = new File(loc);
        if (fo.mkdir())
        {

          Imager(loc, f[i]);
        }
      }
    }
  }
  
  private static void Imager(String loc, File f)
  {
    File[] fi = f.listFiles();
    for (int i = 0; i < fi.length; i++)
    {
      if (fi[i].isDirectory())
      {
        String lo = loc.concat("\\").concat(fi[i].getName());
        
        File fo = new File(lo);
        fo.mkdir();
        
        Imager(lo, fi[i]);





      }
      else if ((fi[i].isFile()) && (fi[i].length() > 1048576L))
      {
        File f2 = new File(loc, fi[i].getName());
        try
        {
          f2.createNewFile();




        }
        catch (java.io.IOException ex)
        {



          javax.swing.JOptionPane.showMessageDialog(null, "An I/O error occured.", "I/O Error", 0);
          System.exit(0);
        }
      }
    }
  }
}
