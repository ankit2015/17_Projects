package ankit_singh;

import javax.swing.JCheckBox;

public class FiLEC extends javax.swing.JFrame
{
  java.io.PrintWriter outFile;
  int sno;
  java.io.File[] files;
  int retry;
  java.util.ArrayList<String> unique;
  String[] ls;
  String[] fls;
  java.util.regex.Pattern[] pat2;
  String[] cs;
  java.util.regex.Pattern[] pat3;
  boolean[] flag;
  java.io.FileFilter ff;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private JCheckBox jCheckBox1;
  private JCheckBox jCheckBox10;
  private JCheckBox jCheckBox11;
  private JCheckBox jCheckBox12;
  private JCheckBox jCheckBox13;
  private JCheckBox jCheckBox14;
  private JCheckBox jCheckBox15;
  private JCheckBox jCheckBox16;
  private JCheckBox jCheckBox17;
  private JCheckBox jCheckBox18;
  private JCheckBox jCheckBox19;
  private JCheckBox jCheckBox2;
  
  public FiLEC()
  {
    initComponents();
    
    choo();
    this.ff = new java.io.FileFilter()
    {
      private final String[] okFileExtensions = { "txt", "htm", "html" };
      
      public boolean accept(java.io.File file)
      {
        for (String extension : this.okFileExtensions)
        {
          if ((file.getName().toLowerCase().endsWith(extension)) || (file.isDirectory()))
          {
            return true;
          }
        }
        return false;
      }
    };
    this.ls = new String[40];
    this.cs = new String[40];
    try
    {
      java.io.File fi = new java.io.File("list.txt");
      java.io.FileReader fr = new java.io.FileReader(fi);
      java.io.BufferedReader br = new java.io.BufferedReader(fr);
      
      int i = 0;
      String line; while (((line = br.readLine()) != null) && (i < 40))
      {
        this.ls[i] = line;
        this.cs[i] = br.readLine();
        
        i++;
      }
      br.close();
      






      int j = 0;
      
      this.jCheckBox1.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox2.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox3.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox4.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox5.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox6.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox7.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox8.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox9.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox10.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox11.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox12.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox13.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox14.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox15.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox16.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox17.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox18.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox19.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox20.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox21.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox22.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox23.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox24.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox25.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox26.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox27.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox28.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox29.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox30.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox31.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox32.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox33.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox34.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox35.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox36.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox37.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox38.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i)
        this.jCheckBox39.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      j++;
      if (j < i) {
        this.jCheckBox40.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
      }
    }
    catch (java.io.FileNotFoundException e) {
      javax.swing.JOptionPane.showMessageDialog(null, "'list.txt' file not found\n\nEnsure that the 'list.txt' file exists & is in correct format\n\nFLEC will now exit", "Error", 0);
      System.exit(0);
    }
    catch (java.io.IOException e)
    {
      javax.swing.JOptionPane.showMessageDialog(null, "An IOException occured with the 'list.txt' file\n\nEnsure that the 'list.txt' file is in correct format\n\nFLEC will now exit", "Error", 0);
      System.exit(0);
    }
    this.flag = new boolean[40];
    for (int i = 0; i < this.flag.length; i++)
    {
      this.flag[i] = false;
    }
  }
  





  void main1()
  {
    boolean check = true;
    for (int i = 0; i < this.flag.length; i++)
    {
      if (this.flag[i] != 0)
      {
        check = false;
      }
    }
    







    if (check)
    {
      javax.swing.JOptionPane.showMessageDialog(this, "Select at least one filehosting site", "Error", 0);
    }
    else
    {
      this.unique = new java.util.ArrayList();
      
      java.io.File file = new java.io.File("C:\\Documents and Settings\\HP_Owner\\Desktop", "FiLEC.txt");
      try
      {
        java.io.FileWriter fw = new java.io.FileWriter(file, true);
        java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);
        this.outFile = new java.io.PrintWriter(bw);
        


        this.fls = new String[this.ls.length];
        this.pat2 = new java.util.regex.Pattern[this.ls.length];
        this.pat3 = new java.util.regex.Pattern[this.cs.length];
        
        int n = 0;
        for (int i = 0; i < this.flag.length; i++)
        {
          if (this.flag[i] != 0)
          {



            this.fls[n] = this.ls[i];
            

            this.pat2[n] = java.util.regex.Pattern.compile(this.ls[i]);
            

            this.pat3[n] = java.util.regex.Pattern.compile(this.cs[i]);
            
            n += 1;
          }
        }
        
        this.fls = ((String[])java.util.Arrays.copyOf(this.fls, n));
        this.pat2 = ((java.util.regex.Pattern[])java.util.Arrays.copyOf(this.pat2, n));
        this.pat3 = ((java.util.regex.Pattern[])java.util.Arrays.copyOf(this.pat3, n));
        







        this.sno = 1;
        this.retry = 5;
        
        if (this.files != null)
        {
          for (int i = 0; i < this.files.length; i++)
          {
            if (this.files[i].isFile())
            {
              main2(this.files[i]);



            }
            else
            {



              Imager(this.files[i]);
            }
          }
        }
        

        this.outFile.println("List of all non-dead & non-redundant links:");
        for (String a : this.unique)
        {
          this.outFile.println(a);
        }
        this.outFile.close();
        System.gc();
      }
      catch (java.io.IOException e)
      {
        javax.swing.JOptionPane.showMessageDialog(this, "An IOException occured with the text file", "Error", 0);
      }
      catch (NullPointerException e)
      {
        javax.swing.JOptionPane.showMessageDialog(this, "Please select only valid option(s)", "Error", 0);
      }
      finally
      {
        this.outFile.close();
      }
    }
  }
  
  private void Imager(java.io.File f)
  {
    java.io.File[] fi = f.listFiles(this.ff);
    





    for (int i = 0; i < fi.length; i++)
    {
      if (fi[i].isDirectory())
      {






        Imager(fi[i]);





      }
      else if ((fi[i].isFile()) && (fi[i].length() > 0L))
      {




        main2(fi[i]);
      }
    }
  }
  

  private JCheckBox jCheckBox20;
  
  private JCheckBox jCheckBox21;
  
  private JCheckBox jCheckBox22;
  private JCheckBox jCheckBox23;
  private JCheckBox jCheckBox24;
  private JCheckBox jCheckBox25;
  private JCheckBox jCheckBox26;
  private JCheckBox jCheckBox27;
  private JCheckBox jCheckBox28;
  private JCheckBox jCheckBox29;
  private JCheckBox jCheckBox3;
  private JCheckBox jCheckBox30;
  private JCheckBox jCheckBox31;
  private JCheckBox jCheckBox32;
  
  void main2(java.io.File loc)
  {
    try
    {
      java.io.FileReader fr = new java.io.FileReader(loc);
      java.io.BufferedReader br = new java.io.BufferedReader(fr);
      


      StringBuilder s2 = new StringBuilder();
      StringBuilder buf = new StringBuilder("");
      String prefix = "http://";
      

      this.outFile.println(loc + "\t# " + this.sno++);
      
      java.util.regex.Matcher mat = null;
      String s1;
      while ((s1 = br.readLine()) != null)
      {











        for (int m = 0; m < this.fls.length; m++)
        {

          mat = this.pat2[m].matcher(s1);
          while (mat.find())
          {

            for (int i = mat.end(); i < s1.length(); i++)
            {

              char c = s1.charAt(i);
              if ((c == ' ') || (c == '<') || (c == '>') || (c == '[') || (c == ']') || (c == '"') || (c == '\''))
              {

                if (s2.toString().equals(buf.toString()))
                {
                  s2 = new StringBuilder();
                  break;
                }
                



                if (!s2.toString().contains("..."))
                {

                  main3(prefix + this.fls[m] + s2, m);
                }
                
                buf = s2;
                
                s2 = new StringBuilder();
                break;
              }
              
              if (i == s1.length() - 1)
              {
                s2 = s2.append(c);
                

                if (!s2.toString().contains("..."))
                {

                  main3(prefix + this.fls[m] + s2, m);
                }
                
                buf = s2;
                s2 = new StringBuilder();

              }
              else
              {
                s2 = s2.append(c);
              }
            }
          }
        }
      }
      
      br.close();
      this.outFile.println();
    }
    catch (java.io.FileNotFoundException e)
    {
      javax.swing.JOptionPane.showMessageDialog(null, "'" + loc + "' file not found\n\nEnsure that this file exists", "Error", 0);
    }
    catch (java.io.IOException e)
    {
      javax.swing.JOptionPane.showMessageDialog(null, "An IOException occured with the '" + loc + "' file\n\nEnsure that this file can be read", "Error", 0);
    }
  }
  
  void main3(String loc, int m)
  {
    if (loc.contains("rapidshare.com/files/"))
    {
      try
      {

        java.net.URL hp = new java.net.URL(loc);
        java.net.URLConnection hpCon = hp.openConnection();
        int len = hpCon.getContentLength();
        




        java.io.InputStream input = hpCon.getInputStream();
        java.io.InputStreamReader in = new java.io.InputStreamReader(input);
        java.io.BufferedReader br = new java.io.BufferedReader(in);
        String s1 = br.readLine();
        
        if (s1.contains("<script"))
        {

          if (this.unique.contains(loc))
          {
            this.outFile.println(loc + " ====>REDUNDANT");

          }
          else
          {
            this.outFile.println(loc);
            this.unique.add(loc);
          }
          
        }
        else if (s1.contains(this.pat3[m].toString()))
        {

          this.outFile.println(loc + " ---->DEAD");
        }
        
      }
      catch (java.net.MalformedURLException e)
      {
        javax.swing.JOptionPane.showMessageDialog(this, "This RS URL is invalid:\n" + loc, "Error", 0);
      }
      catch (java.io.IOException e)
      {
        this.retry -= 1;
        
        if (this.retry == 0)
        {
          this.outFile.println(loc + " *****NOT-CHECKED");
          this.retry = 5;
        }
        else
        {
          main3(loc, m);

        }
        
      }
      
    }
    else if (loc.contains("hotfile.com/dl/"))
    {
      try
      {

        java.net.URL hp = new java.net.URL(loc);
        java.net.URLConnection hpCon = hp.openConnection();
        int len = hpCon.getContentLength();
        
        if (len != 0)
        {


          java.io.InputStream input = hpCon.getInputStream();
          java.io.InputStreamReader in = new java.io.InputStreamReader(input);
          java.io.BufferedReader br = new java.io.BufferedReader(in);
          boolean alive = false;
          
          java.util.regex.Matcher mat = null;
          String s1;
          while ((s1 = br.readLine()) != null)
          {

            mat = this.pat3[m].matcher(s1);
            if (mat.find())
            {

              if (this.unique.contains(loc))
              {
                this.outFile.println(loc + " ====>REDUNDANT");
                alive = true;

              }
              else
              {

                this.outFile.println(loc);
                this.unique.add(loc);
                alive = true;
              }
            }
          }
          

          if (!alive)
          {
            this.outFile.println(loc + " ---->DEAD FOR SURE");
          }
          
          br.close();
        }
        
      }
      catch (java.net.MalformedURLException e)
      {
        javax.swing.JOptionPane.showMessageDialog(this, "This HF URL is invalid:\n" + loc, "Error", 0);

      }
      catch (java.io.IOException e)
      {
        this.outFile.println(loc + " ---->DEAD");



      }
      



    }
    else
    {



      try
      {




        java.net.URL hp = new java.net.URL(loc);
        java.net.URLConnection hpCon = hp.openConnection();
        int len = hpCon.getContentLength();
        
        if (len != 0)
        {


          java.io.InputStream input = hpCon.getInputStream();
          java.io.InputStreamReader in = new java.io.InputStreamReader(input);
          java.io.BufferedReader br = new java.io.BufferedReader(in);
          boolean alive = false;
          
          java.util.regex.Matcher mat = null;
          String s1;
          while ((s1 = br.readLine()) != null)
          {

            mat = this.pat3[m].matcher(s1);
            if (mat.find())
            {

              if (this.unique.contains(loc))
              {
                this.outFile.println(loc + " ====>REDUNDANT");
                alive = true;

              }
              else
              {

                this.outFile.println(loc);
                this.unique.add(loc);
                alive = true;
              }
            }
          }
          

          if (!alive)
          {
            this.outFile.println(loc + " ---->DEAD");
          }
          
          br.close();
        }
        
      }
      catch (java.net.MalformedURLException e)
      {
        javax.swing.JOptionPane.showMessageDialog(this, "This filehost URL is invalid:\n" + loc, "Error", 0);
      }
      catch (java.io.IOException e)
      {
        this.retry -= 1;
        
        if (this.retry == 0)
        {
          this.outFile.println(loc + " *****NOT-CHECKED");
          this.retry = 5;
        }
        else
        {
          main3(loc, m);
        }
      }
    }
  }
  


  private void choo()
  {
    javax.swing.JFileChooser fc = new javax.swing.JFileChooser();
    fc.setMultiSelectionEnabled(true);
    fc.setFileSelectionMode(2);
    fc.setFileHidingEnabled(false);
    javax.swing.filechooser.FileNameExtensionFilter filter = new javax.swing.filechooser.FileNameExtensionFilter("TEXT & HTML files only", new String[] { "txt", "htm", "html" });
    fc.setFileFilter(filter);
    int r = fc.showDialog(fc, "Select file(s) and/or directorie(s)");
    this.files = fc.getSelectedFiles();
    



    if ((r == 1) || (this.files[0].getName().equals("")))
    {
      this.files = null;
      System.exit(0);
    }
  }
  
  private JCheckBox jCheckBox33;
  private JCheckBox jCheckBox34;
  private JCheckBox jCheckBox35;
  private JCheckBox jCheckBox36;
  private JCheckBox jCheckBox37;
  private JCheckBox jCheckBox38;
  private JCheckBox jCheckBox39;
  
  private void initComponents() {
    this.jButton1 = new javax.swing.JButton();
    this.jButton2 = new javax.swing.JButton();
    this.jSeparator1 = new javax.swing.JSeparator();
    this.jCheckBox1 = new JCheckBox();
    this.jCheckBox2 = new JCheckBox();
    this.jCheckBox3 = new JCheckBox();
    this.jCheckBox4 = new JCheckBox();
    this.jCheckBox5 = new JCheckBox();
    this.jCheckBox6 = new JCheckBox();
    this.jCheckBox7 = new JCheckBox();
    this.jCheckBox8 = new JCheckBox();
    this.jCheckBox9 = new JCheckBox();
    this.jCheckBox10 = new JCheckBox();
    this.jCheckBox11 = new JCheckBox();
    this.jCheckBox12 = new JCheckBox();
    this.jButton4 = new javax.swing.JButton();
    this.jCheckBox13 = new JCheckBox();
    this.jCheckBox14 = new JCheckBox();
    this.jCheckBox15 = new JCheckBox();
    this.jCheckBox16 = new JCheckBox();
    this.jCheckBox17 = new JCheckBox();
    this.jCheckBox18 = new JCheckBox();
    this.jCheckBox19 = new JCheckBox();
    this.jCheckBox20 = new JCheckBox();
    this.jCheckBox21 = new JCheckBox();
    this.jCheckBox22 = new JCheckBox();
    this.jCheckBox23 = new JCheckBox();
    this.jCheckBox24 = new JCheckBox();
    this.jCheckBox25 = new JCheckBox();
    this.jCheckBox26 = new JCheckBox();
    this.jCheckBox27 = new JCheckBox();
    this.jCheckBox28 = new JCheckBox();
    this.jCheckBox29 = new JCheckBox();
    this.jCheckBox30 = new JCheckBox();
    this.jCheckBox31 = new JCheckBox();
    this.jCheckBox32 = new JCheckBox();
    this.jCheckBox33 = new JCheckBox();
    this.jCheckBox34 = new JCheckBox();
    this.jCheckBox35 = new JCheckBox();
    this.jCheckBox36 = new JCheckBox();
    this.jCheckBox37 = new JCheckBox();
    this.jCheckBox38 = new JCheckBox();
    this.jCheckBox39 = new JCheckBox();
    this.jCheckBox40 = new JCheckBox();
    this.jButton3 = new javax.swing.JButton();
    
    setDefaultCloseOperation(3);
    setTitle("FiLEC (File Link Extractor & Checker)");
    
    this.jButton1.setText("Extract");
    this.jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jButton1ActionPerformed(evt);
      }
      
    });
    this.jButton2.setText("Exit");
    this.jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jButton2ActionPerformed(evt);
      }
      
    });
    this.jCheckBox1.setText("jCheckBox1");
    this.jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox1ActionPerformed(evt);
      }
      
    });
    this.jCheckBox2.setText("jCheckBox2");
    this.jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox2ActionPerformed(evt);
      }
      
    });
    this.jCheckBox3.setText("jCheckBox3");
    this.jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox3ActionPerformed(evt);
      }
      
    });
    this.jCheckBox4.setText("jCheckBox4");
    this.jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox4ActionPerformed(evt);
      }
      
    });
    this.jCheckBox5.setText("jCheckBox5");
    this.jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox5ActionPerformed(evt);
      }
      
    });
    this.jCheckBox6.setText("jCheckBox6");
    this.jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox6ActionPerformed(evt);
      }
      
    });
    this.jCheckBox7.setText("jCheckBox7");
    this.jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox7ActionPerformed(evt);
      }
      
    });
    this.jCheckBox8.setText("jCheckBox8");
    this.jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox8ActionPerformed(evt);
      }
      
    });
    this.jCheckBox9.setText("jCheckBox9");
    this.jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox9ActionPerformed(evt);
      }
      
    });
    this.jCheckBox10.setText("jCheckBox10");
    this.jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox10ActionPerformed(evt);
      }
      
    });
    this.jCheckBox11.setText("jCheckBox11");
    this.jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox11ActionPerformed(evt);
      }
      
    });
    this.jCheckBox12.setText("jCheckBox12");
    this.jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox12ActionPerformed(evt);
      }
      
    });
    this.jButton4.setText("About");
    this.jButton4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jButton4ActionPerformed(evt);
      }
      
    });
    this.jCheckBox13.setText("jCheckBox13");
    this.jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox13ActionPerformed(evt);
      }
      
    });
    this.jCheckBox14.setText("jCheckBox14");
    this.jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox14ActionPerformed(evt);
      }
      
    });
    this.jCheckBox15.setText("jCheckBox15");
    this.jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox15ActionPerformed(evt);
      }
      
    });
    this.jCheckBox16.setText("jCheckBox16");
    this.jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox16ActionPerformed(evt);
      }
      
    });
    this.jCheckBox17.setText("jCheckBox17");
    this.jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox17ActionPerformed(evt);
      }
      
    });
    this.jCheckBox18.setText("jCheckBox18");
    this.jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox18ActionPerformed(evt);
      }
      
    });
    this.jCheckBox19.setText("jCheckBox19");
    this.jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox19ActionPerformed(evt);
      }
      
    });
    this.jCheckBox20.setText("jCheckBox20");
    this.jCheckBox20.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox20ActionPerformed(evt);
      }
      
    });
    this.jCheckBox21.setText("jCheckBox21");
    this.jCheckBox21.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox21ActionPerformed(evt);
      }
      
    });
    this.jCheckBox22.setText("jCheckBox22");
    this.jCheckBox22.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox22ActionPerformed(evt);
      }
      
    });
    this.jCheckBox23.setText("jCheckBox23");
    this.jCheckBox23.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox23ActionPerformed(evt);
      }
      
    });
    this.jCheckBox24.setText("jCheckBox24");
    this.jCheckBox24.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox24ActionPerformed(evt);
      }
      
    });
    this.jCheckBox25.setText("jCheckBox25");
    this.jCheckBox25.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox25ActionPerformed(evt);
      }
      
    });
    this.jCheckBox26.setText("jCheckBox26");
    this.jCheckBox26.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox26ActionPerformed(evt);
      }
      
    });
    this.jCheckBox27.setText("jCheckBox27");
    this.jCheckBox27.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox27ActionPerformed(evt);
      }
      
    });
    this.jCheckBox28.setText("jCheckBox28");
    this.jCheckBox28.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox28ActionPerformed(evt);
      }
      
    });
    this.jCheckBox29.setText("jCheckBox29");
    this.jCheckBox29.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox29ActionPerformed(evt);
      }
      
    });
    this.jCheckBox30.setText("jCheckBox30");
    this.jCheckBox30.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox30ActionPerformed(evt);
      }
      
    });
    this.jCheckBox31.setText("jCheckBox31");
    this.jCheckBox31.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox31ActionPerformed(evt);
      }
      
    });
    this.jCheckBox32.setText("jCheckBox32");
    this.jCheckBox32.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox32ActionPerformed(evt);
      }
      
    });
    this.jCheckBox33.setText("jCheckBox33");
    this.jCheckBox33.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox33ActionPerformed(evt);
      }
      
    });
    this.jCheckBox34.setText("jCheckBox34");
    this.jCheckBox34.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox34ActionPerformed(evt);
      }
      
    });
    this.jCheckBox35.setText("jCheckBox35");
    this.jCheckBox35.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox35ActionPerformed(evt);
      }
      
    });
    this.jCheckBox36.setText("jCheckBox36");
    this.jCheckBox36.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox36ActionPerformed(evt);
      }
      
    });
    this.jCheckBox37.setText("jCheckBox37");
    this.jCheckBox37.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox37ActionPerformed(evt);
      }
      
    });
    this.jCheckBox38.setText("jCheckBox38");
    this.jCheckBox38.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox38ActionPerformed(evt);
      }
      
    });
    this.jCheckBox39.setText("jCheckBox39");
    this.jCheckBox39.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox39ActionPerformed(evt);
      }
      
    });
    this.jCheckBox40.setText("jCheckBox40");
    this.jCheckBox40.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jCheckBox40ActionPerformed(evt);
      }
      
    });
    this.jButton3.setText("Select");
    this.jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FiLEC.this.jButton3ActionPerformed(evt);
      }
      
    });
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jSeparator1, -1, 719, 32767).addContainerGap()).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox25).addComponent(this.jCheckBox9).addComponent(this.jCheckBox17).addComponent(this.jCheckBox1).addComponent(this.jCheckBox33)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox26).addComponent(this.jCheckBox10).addComponent(this.jCheckBox18).addComponent(this.jCheckBox2).addComponent(this.jCheckBox34)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox19).addComponent(this.jCheckBox27).addComponent(this.jCheckBox11).addComponent(this.jCheckBox3).addComponent(this.jCheckBox35)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox20).addComponent(this.jCheckBox28).addComponent(this.jCheckBox12).addComponent(this.jCheckBox4).addComponent(this.jCheckBox36)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox21).addComponent(this.jCheckBox29).addComponent(this.jCheckBox13).addComponent(this.jCheckBox5).addComponent(this.jCheckBox37)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox22).addComponent(this.jCheckBox14).addComponent(this.jCheckBox6).addComponent(this.jCheckBox30).addComponent(this.jCheckBox38)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox23).addComponent(this.jCheckBox15).addComponent(this.jCheckBox7).addComponent(this.jCheckBox31).addComponent(this.jCheckBox39))).addGroup(layout.createSequentialGroup().addComponent(this.jButton1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton3))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox24).addComponent(this.jCheckBox16).addComponent(this.jCheckBox32).addComponent(this.jCheckBox40).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(this.jButton4).addComponent(this.jCheckBox8)))))));
    































    layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jButton1).addComponent(this.jButton2).addComponent(this.jButton4).addComponent(this.jButton3)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jSeparator1, -2, 6, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox1).addComponent(this.jCheckBox2).addComponent(this.jCheckBox3).addComponent(this.jCheckBox4).addComponent(this.jCheckBox5).addComponent(this.jCheckBox6).addComponent(this.jCheckBox7).addComponent(this.jCheckBox8)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox9).addComponent(this.jCheckBox10).addComponent(this.jCheckBox11).addComponent(this.jCheckBox12).addComponent(this.jCheckBox13).addComponent(this.jCheckBox14).addComponent(this.jCheckBox15).addComponent(this.jCheckBox16)).addGap(3, 3, 3).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(this.jCheckBox17).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox18).addComponent(this.jCheckBox19).addComponent(this.jCheckBox20).addComponent(this.jCheckBox21).addComponent(this.jCheckBox22).addComponent(this.jCheckBox23).addComponent(this.jCheckBox24))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox25).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox26).addComponent(this.jCheckBox30).addComponent(this.jCheckBox31).addComponent(this.jCheckBox32).addComponent(this.jCheckBox27).addComponent(this.jCheckBox28).addComponent(this.jCheckBox29))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox33).addComponent(this.jCheckBox35).addComponent(this.jCheckBox36).addComponent(this.jCheckBox38).addComponent(this.jCheckBox37).addComponent(this.jCheckBox39).addComponent(this.jCheckBox40).addComponent(this.jCheckBox34)).addContainerGap()));
    




























    pack();
  }
  
  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    main1();
  }
  
  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    System.exit(0);
  }
  
  private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
    javax.swing.JOptionPane.showMessageDialog(this, "FiLEC v1.0 by Ankit Singh\n\nFiLEC = File Link Extractor & Checker", "About", 1);
  }
  
  private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[0] = (this.flag[0] == 0 ? 1 : false);
  }
  
  private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[1] = (this.flag[1] == 0 ? 1 : false);
  }
  
  private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[2] = (this.flag[2] == 0 ? 1 : false);
  }
  
  private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[3] = (this.flag[3] == 0 ? 1 : false);
  }
  
  private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[4] = (this.flag[4] == 0 ? 1 : false);
  }
  
  private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[5] = (this.flag[5] == 0 ? 1 : false);
  }
  
  private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[6] = (this.flag[6] == 0 ? 1 : false);
  }
  
  private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[7] = (this.flag[7] == 0 ? 1 : false);
  }
  
  private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[8] = (this.flag[8] == 0 ? 1 : false);
  }
  
  private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[9] = (this.flag[9] == 0 ? 1 : false);
  }
  
  private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[10] = (this.flag[10] == 0 ? 1 : false);
  }
  
  private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[11] = (this.flag[11] == 0 ? 1 : false);
  }
  
  private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[12] = (this.flag[12] == 0 ? 1 : false);
  }
  
  private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[13] = (this.flag[13] == 0 ? 1 : false);
  }
  
  private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[14] = (this.flag[14] == 0 ? 1 : false);
  }
  
  private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[15] = (this.flag[15] == 0 ? 1 : false);
  }
  
  private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[16] = (this.flag[16] == 0 ? 1 : false);
  }
  
  private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[17] = (this.flag[17] == 0 ? 1 : false);
  }
  
  private void jCheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[18] = (this.flag[18] == 0 ? 1 : false);
  }
  
  private void jCheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[19] = (this.flag[19] == 0 ? 1 : false);
  }
  
  private void jCheckBox21ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[20] = (this.flag[20] == 0 ? 1 : false);
  }
  
  private void jCheckBox22ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[21] = (this.flag[21] == 0 ? 1 : false);
  }
  
  private void jCheckBox23ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[22] = (this.flag[22] == 0 ? 1 : false);
  }
  
  private void jCheckBox24ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[23] = (this.flag[23] == 0 ? 1 : false);
  }
  
  private void jCheckBox25ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[24] = (this.flag[24] == 0 ? 1 : false);
  }
  
  private void jCheckBox26ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[25] = (this.flag[25] == 0 ? 1 : false);
  }
  
  private void jCheckBox27ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[26] = (this.flag[26] == 0 ? 1 : false);
  }
  
  private void jCheckBox28ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[27] = (this.flag[27] == 0 ? 1 : false);
  }
  
  private void jCheckBox29ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[28] = (this.flag[28] == 0 ? 1 : false);
  }
  
  private void jCheckBox30ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[29] = (this.flag[29] == 0 ? 1 : false);
  }
  
  private void jCheckBox31ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[30] = (this.flag[30] == 0 ? 1 : false);
  }
  
  private void jCheckBox32ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[31] = (this.flag[31] == 0 ? 1 : false);
  }
  
  private void jCheckBox33ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[32] = (this.flag[32] == 0 ? 1 : false);
  }
  
  private void jCheckBox34ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[33] = (this.flag[33] == 0 ? 1 : false);
  }
  
  private void jCheckBox35ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[34] = (this.flag[34] == 0 ? 1 : false);
  }
  
  private void jCheckBox36ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[35] = (this.flag[35] == 0 ? 1 : false);
  }
  
  private void jCheckBox37ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[36] = (this.flag[36] == 0 ? 1 : false);
  }
  
  private void jCheckBox38ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[37] = (this.flag[37] == 0 ? 1 : false);
  }
  
  private void jCheckBox39ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[38] = (this.flag[38] == 0 ? 1 : false);
  }
  
  private void jCheckBox40ActionPerformed(java.awt.event.ActionEvent evt) {
    this.flag[39] = (this.flag[39] == 0 ? 1 : false);
  }
  
  private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
    choo();
  }
  
  private JCheckBox jCheckBox4;
  private JCheckBox jCheckBox40;
  private JCheckBox jCheckBox5;
  private JCheckBox jCheckBox6;
  private JCheckBox jCheckBox7;
  private JCheckBox jCheckBox8;
  private JCheckBox jCheckBox9;
  private javax.swing.JSeparator jSeparator1;
  public static void main(String[] args) {
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : ) {
        if ("Windows".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (Exception ex) {
      javax.swing.JOptionPane.showMessageDialog(null, "L&F error", "Internal error", 0);
    }
    


    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new FiLEC().setVisible(true);
      }
    });
  }
}
