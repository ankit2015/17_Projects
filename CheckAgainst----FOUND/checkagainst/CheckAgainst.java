package checkagainst;

import java.io.BufferedReader;
import java.io.PrintWriter;
import javax.swing.JFileChooser;

public class CheckAgainst
{
  public static void main(String[] args)
  {
    int value = 3;

    javax.swing.UIManager.LookAndFeelInfo[] looks = javax.swing.UIManager.getInstalledLookAndFeels();
    try
    {
      javax.swing.UIManager.setLookAndFeel(looks[value].getClassName());
      javax.swing.SwingUtilities.updateComponentTreeUI(null);
    }
    catch (Exception e) {}

    JFileChooser fc = new JFileChooser();
    fc.setMultiSelectionEnabled(true);
    fc.setFileSelectionMode(0);
    fc.setFileHidingEnabled(false);
    javax.swing.filechooser.FileNameExtensionFilter filter = new javax.swing.filechooser.FileNameExtensionFilter("TEXT & HTML files only", new String[] { "txt", "htm", "html" });
    fc.setFileFilter(filter);
    int r = fc.showDialog(fc, "Select atleast two files");
    java.io.File[] files = fc.getSelectedFiles();
    for (int i = 0; i < files.length; i++) {}



    if (r == 1)
    {
      System.exit(0);
    }
    if (files.length < 2)
    {
      files = null;
      javax.swing.JOptionPane.showMessageDialog(null, "You need to select atleast two files\n\nPlease try again!\n\nCheckAgainst will now exit", "Error", 0);
      System.exit(0);
    }
    else
    {
      java.util.ArrayList<String> unique = new java.util.ArrayList();
      try
      {
        java.io.File fi = files[0];
        java.io.FileReader fr = new java.io.FileReader(fi);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null)
        {

          if (!"".equals(line))
          {
            unique.add(line);
          }
        }
        br.close();fr.close();
        for (java.util.Iterator i$ = unique.iterator(); i$.hasNext(); a = (String)i$.next()) {}
      }
      catch (java.io.FileNotFoundException e)
      {
        String a;
        

        javax.swing.JOptionPane.showMessageDialog(null, "The first file was not found\n\nEnsure that the first file exists\n\nCheckAgainst will now exit", "Error", 0);

      }
      catch (java.io.IOException e)
      {
        javax.swing.JOptionPane.showMessageDialog(null, "An IOException occured with the first file\n\nCheckAgainst will now exit", "Error", 0);
      }
      
      try
      {
        java.io.File fil = new java.io.File(files[0].getParent(), "checked.txt");
        java.io.FileWriter fw = new java.io.FileWriter(fil, true);
        java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);
        PrintWriter outFile = new PrintWriter(bw);
        outFile.println("Contents of each file not found in the first file - " + files[0].getName() + " are:");
        
        for (int i = 1; i < files.length; i++)
        {

          outFile.println("");
          outFile.println(files[i]);
          try
          {
            java.io.File fi = files[i];
            java.io.FileReader fr = new java.io.FileReader(fi);
            BufferedReader br = new BufferedReader(fr);
            
            String line;
            while ((line = br.readLine()) != null)
            {

              if (!"".equals(line))
              {
                if (!unique.contains(line))
                {
                  outFile.println(line);

                }
                else
                {
                  outFile.println(line + " -----> FOUND");
                }
              }
            }
            br.close();fr.close();

          }
          catch (java.io.FileNotFoundException e)
          {

            javax.swing.JOptionPane.showMessageDialog(null, "The other file was not found\n\nEnsure that the other files exist\n\nCheckAgainst will now exit", "Error", 0);


          }
          catch (java.io.IOException e)
          {

            javax.swing.JOptionPane.showMessageDialog(null, "An IOException occured with the other file\n\nCheckAgainst will now exit", "Error", 0);
          }
        }
        
        outFile.close();bw.close();fw.close();
      }
      catch (java.io.FileNotFoundException e)
      {
        javax.swing.JOptionPane.showMessageDialog(null, "A FileNotFoundException occured with the file 'checked.txt'", "Error", 0);

      }
      catch (java.io.IOException e)
      {
        javax.swing.JOptionPane.showMessageDialog(null, "An IOException occured with the file 'checked.txt'", "Error", 0);
      }
    }
  }
}
