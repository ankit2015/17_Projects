/*      */ package ankit_singh;
/*      */ 
/*      */ import javax.swing.JCheckBox;
/*      */ 
/*      */ public class FiLEC extends javax.swing.JFrame
/*      */ {
/*      */   java.io.PrintWriter outFile;
/*      */   int sno;
/*      */   java.io.File[] files;
/*      */   int retry;
/*      */   java.util.ArrayList<String> unique;
/*      */   String[] ls;
/*      */   String[] fls;
/*      */   java.util.regex.Pattern[] pat2;
/*      */   String[] cs;
/*      */   java.util.regex.Pattern[] pat3;
/*      */   boolean[] flag;
/*      */   java.io.FileFilter ff;
/*      */   private javax.swing.JButton jButton1;
/*      */   private javax.swing.JButton jButton2;
/*      */   private javax.swing.JButton jButton3;
/*      */   private javax.swing.JButton jButton4;
/*      */   private JCheckBox jCheckBox1;
/*      */   private JCheckBox jCheckBox10;
/*      */   private JCheckBox jCheckBox11;
/*      */   private JCheckBox jCheckBox12;
/*      */   private JCheckBox jCheckBox13;
/*      */   private JCheckBox jCheckBox14;
/*      */   private JCheckBox jCheckBox15;
/*      */   private JCheckBox jCheckBox16;
/*      */   private JCheckBox jCheckBox17;
/*      */   private JCheckBox jCheckBox18;
/*      */   private JCheckBox jCheckBox19;
/*      */   private JCheckBox jCheckBox2;
/*      */   
/*      */   public FiLEC()
/*      */   {
/*   38 */     initComponents();
/*      */     
/*   40 */     choo();
/*   41 */     this.ff = new java.io.FileFilter()
/*      */     {
/*   43 */       private final String[] okFileExtensions = { "txt", "htm", "html" };
/*      */       
/*      */       public boolean accept(java.io.File file)
/*      */       {
/*   47 */         for (String extension : this.okFileExtensions)
/*      */         {
/*   49 */           if ((file.getName().toLowerCase().endsWith(extension)) || (file.isDirectory()))
/*      */           {
/*   51 */             return true;
/*      */           }
/*      */         }
/*   54 */         return false;
/*      */       }
/*   56 */     };
/*   57 */     this.ls = new String[40];
/*   58 */     this.cs = new String[40];
/*      */     try
/*      */     {
/*   61 */       java.io.File fi = new java.io.File("list.txt");
/*   62 */       java.io.FileReader fr = new java.io.FileReader(fi);
/*   63 */       java.io.BufferedReader br = new java.io.BufferedReader(fr);
/*      */       
/*   65 */       int i = 0;
/*   66 */       String line; while (((line = br.readLine()) != null) && (i < 40))
/*      */       {
/*   68 */         this.ls[i] = line;
/*   69 */         this.cs[i] = br.readLine();
/*      */         
/*   71 */         i++;
/*      */       }
/*   73 */       br.close();
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   81 */       int j = 0;
/*      */       
/*   83 */       this.jCheckBox1.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*   84 */       j++;
/*   85 */       if (j < i)
/*   86 */         this.jCheckBox2.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*   87 */       j++;
/*   88 */       if (j < i)
/*   89 */         this.jCheckBox3.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*   90 */       j++;
/*   91 */       if (j < i)
/*   92 */         this.jCheckBox4.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*   93 */       j++;
/*   94 */       if (j < i)
/*   95 */         this.jCheckBox5.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*   96 */       j++;
/*   97 */       if (j < i)
/*   98 */         this.jCheckBox6.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*   99 */       j++;
/*  100 */       if (j < i)
/*  101 */         this.jCheckBox7.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  102 */       j++;
/*  103 */       if (j < i)
/*  104 */         this.jCheckBox8.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  105 */       j++;
/*  106 */       if (j < i)
/*  107 */         this.jCheckBox9.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  108 */       j++;
/*  109 */       if (j < i)
/*  110 */         this.jCheckBox10.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  111 */       j++;
/*  112 */       if (j < i)
/*  113 */         this.jCheckBox11.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  114 */       j++;
/*  115 */       if (j < i)
/*  116 */         this.jCheckBox12.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  117 */       j++;
/*  118 */       if (j < i)
/*  119 */         this.jCheckBox13.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  120 */       j++;
/*  121 */       if (j < i)
/*  122 */         this.jCheckBox14.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  123 */       j++;
/*  124 */       if (j < i)
/*  125 */         this.jCheckBox15.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  126 */       j++;
/*  127 */       if (j < i)
/*  128 */         this.jCheckBox16.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  129 */       j++;
/*  130 */       if (j < i)
/*  131 */         this.jCheckBox17.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  132 */       j++;
/*  133 */       if (j < i)
/*  134 */         this.jCheckBox18.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  135 */       j++;
/*  136 */       if (j < i)
/*  137 */         this.jCheckBox19.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  138 */       j++;
/*  139 */       if (j < i)
/*  140 */         this.jCheckBox20.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  141 */       j++;
/*  142 */       if (j < i)
/*  143 */         this.jCheckBox21.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  144 */       j++;
/*  145 */       if (j < i)
/*  146 */         this.jCheckBox22.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  147 */       j++;
/*  148 */       if (j < i)
/*  149 */         this.jCheckBox23.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  150 */       j++;
/*  151 */       if (j < i)
/*  152 */         this.jCheckBox24.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  153 */       j++;
/*  154 */       if (j < i)
/*  155 */         this.jCheckBox25.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  156 */       j++;
/*  157 */       if (j < i)
/*  158 */         this.jCheckBox26.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  159 */       j++;
/*  160 */       if (j < i)
/*  161 */         this.jCheckBox27.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  162 */       j++;
/*  163 */       if (j < i)
/*  164 */         this.jCheckBox28.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  165 */       j++;
/*  166 */       if (j < i)
/*  167 */         this.jCheckBox29.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  168 */       j++;
/*  169 */       if (j < i)
/*  170 */         this.jCheckBox30.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  171 */       j++;
/*  172 */       if (j < i)
/*  173 */         this.jCheckBox31.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  174 */       j++;
/*  175 */       if (j < i)
/*  176 */         this.jCheckBox32.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  177 */       j++;
/*  178 */       if (j < i)
/*  179 */         this.jCheckBox33.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  180 */       j++;
/*  181 */       if (j < i)
/*  182 */         this.jCheckBox34.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  183 */       j++;
/*  184 */       if (j < i)
/*  185 */         this.jCheckBox35.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  186 */       j++;
/*  187 */       if (j < i)
/*  188 */         this.jCheckBox36.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  189 */       j++;
/*  190 */       if (j < i)
/*  191 */         this.jCheckBox37.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  192 */       j++;
/*  193 */       if (j < i)
/*  194 */         this.jCheckBox38.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  195 */       j++;
/*  196 */       if (j < i)
/*  197 */         this.jCheckBox39.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  198 */       j++;
/*  199 */       if (j < i) {
/*  200 */         this.jCheckBox40.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*      */       }
/*      */     }
/*      */     catch (java.io.FileNotFoundException e) {
/*  204 */       javax.swing.JOptionPane.showMessageDialog(null, "'list.txt' file not found\n\nEnsure that the 'list.txt' file exists & is in correct format\n\nFLEC will now exit", "Error", 0);
/*  205 */       System.exit(0);
/*      */     }
/*      */     catch (java.io.IOException e)
/*      */     {
/*  209 */       javax.swing.JOptionPane.showMessageDialog(null, "An IOException occured with the 'list.txt' file\n\nEnsure that the 'list.txt' file is in correct format\n\nFLEC will now exit", "Error", 0);
/*  210 */       System.exit(0);
/*      */     }
/*  212 */     this.flag = new boolean[40];
/*  213 */     for (int i = 0; i < this.flag.length; i++)
/*      */     {
/*  215 */       this.flag[i] = false;
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   void main1()
/*      */   {
/*  226 */     boolean check = true;
/*  227 */     for (int i = 0; i < this.flag.length; i++)
/*      */     {
/*  229 */       if (this.flag[i] != 0)
/*      */       {
/*  231 */         check = false;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  242 */     if (check)
/*      */     {
/*  244 */       javax.swing.JOptionPane.showMessageDialog(this, "Select at least one filehosting site", "Error", 0);
/*      */     }
/*      */     else
/*      */     {
/*  248 */       this.unique = new java.util.ArrayList();
/*      */       
/*  250 */       java.io.File file = new java.io.File("C:\\Documents and Settings\\HP_Owner\\Desktop", "FiLEC.txt");
/*      */       try
/*      */       {
/*  253 */         java.io.FileWriter fw = new java.io.FileWriter(file, true);
/*  254 */         java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);
/*  255 */         this.outFile = new java.io.PrintWriter(bw);
/*      */         
/*      */ 
/*      */ 
/*  259 */         this.fls = new String[this.ls.length];
/*  260 */         this.pat2 = new java.util.regex.Pattern[this.ls.length];
/*  261 */         this.pat3 = new java.util.regex.Pattern[this.cs.length];
/*      */         
/*  263 */         int n = 0;
/*  264 */         for (int i = 0; i < this.flag.length; i++)
/*      */         {
/*  266 */           if (this.flag[i] != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  271 */             this.fls[n] = this.ls[i];
/*      */             
/*      */ 
/*  274 */             this.pat2[n] = java.util.regex.Pattern.compile(this.ls[i]);
/*      */             
/*      */ 
/*  277 */             this.pat3[n] = java.util.regex.Pattern.compile(this.cs[i]);
/*      */             
/*  279 */             n += 1;
/*      */           }
/*      */         }
/*      */         
/*  283 */         this.fls = ((String[])java.util.Arrays.copyOf(this.fls, n));
/*  284 */         this.pat2 = ((java.util.regex.Pattern[])java.util.Arrays.copyOf(this.pat2, n));
/*  285 */         this.pat3 = ((java.util.regex.Pattern[])java.util.Arrays.copyOf(this.pat3, n));
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  294 */         this.sno = 1;
/*  295 */         this.retry = 5;
/*      */         
/*  297 */         if (this.files != null)
/*      */         {
/*  299 */           for (int i = 0; i < this.files.length; i++)
/*      */           {
/*  301 */             if (this.files[i].isFile())
/*      */             {
/*  303 */               main2(this.files[i]);
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  313 */               Imager(this.files[i]);
/*      */             }
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*  319 */         this.outFile.println("List of all non-dead & non-redundant links:");
/*  320 */         for (String a : this.unique)
/*      */         {
/*  322 */           this.outFile.println(a);
/*      */         }
/*  324 */         this.outFile.close();
/*  325 */         System.gc();
/*      */       }
/*      */       catch (java.io.IOException e)
/*      */       {
/*  329 */         javax.swing.JOptionPane.showMessageDialog(this, "An IOException occured with the text file", "Error", 0);
/*      */       }
/*      */       catch (NullPointerException e)
/*      */       {
/*  333 */         javax.swing.JOptionPane.showMessageDialog(this, "Please select only valid option(s)", "Error", 0);
/*      */       }
/*      */       finally
/*      */       {
/*  337 */         this.outFile.close();
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   private void Imager(java.io.File f)
/*      */   {
/*  344 */     java.io.File[] fi = f.listFiles(this.ff);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  351 */     for (int i = 0; i < fi.length; i++)
/*      */     {
/*  353 */       if (fi[i].isDirectory())
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  361 */         Imager(fi[i]);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*  368 */       else if ((fi[i].isFile()) && (fi[i].length() > 0L))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  374 */         main2(fi[i]);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox20;
/*      */   
/*      */   private JCheckBox jCheckBox21;
/*      */   
/*      */   private JCheckBox jCheckBox22;
/*      */   private JCheckBox jCheckBox23;
/*      */   private JCheckBox jCheckBox24;
/*      */   private JCheckBox jCheckBox25;
/*      */   private JCheckBox jCheckBox26;
/*      */   private JCheckBox jCheckBox27;
/*      */   private JCheckBox jCheckBox28;
/*      */   private JCheckBox jCheckBox29;
/*      */   private JCheckBox jCheckBox3;
/*      */   private JCheckBox jCheckBox30;
/*      */   private JCheckBox jCheckBox31;
/*      */   private JCheckBox jCheckBox32;
/*      */   
/*      */   void main2(java.io.File loc)
/*      */   {
/*      */     try
/*      */     {
/*  401 */       java.io.FileReader fr = new java.io.FileReader(loc);
/*  402 */       java.io.BufferedReader br = new java.io.BufferedReader(fr);
/*      */       
/*      */ 
/*      */ 
/*  406 */       StringBuilder s2 = new StringBuilder();
/*  407 */       StringBuilder buf = new StringBuilder("");
/*  408 */       String prefix = "http://";
/*      */       
/*      */ 
/*  411 */       this.outFile.println(loc + "\t# " + this.sno++);
/*      */       
/*  413 */       java.util.regex.Matcher mat = null;
/*      */       String s1;
/*  415 */       while ((s1 = br.readLine()) != null)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  428 */         for (int m = 0; m < this.fls.length; m++)
/*      */         {
/*      */ 
/*  431 */           mat = this.pat2[m].matcher(s1);
/*  432 */           while (mat.find())
/*      */           {
/*      */ 
/*  435 */             for (int i = mat.end(); i < s1.length(); i++)
/*      */             {
/*      */ 
/*  438 */               char c = s1.charAt(i);
/*  439 */               if ((c == ' ') || (c == '<') || (c == '>') || (c == '[') || (c == ']') || (c == '"') || (c == '\''))
/*      */               {
/*      */ 
/*  442 */                 if (s2.toString().equals(buf.toString()))
/*      */                 {
/*  444 */                   s2 = new StringBuilder();
/*  445 */                   break;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*  451 */                 if (!s2.toString().contains("..."))
/*      */                 {
/*      */ 
/*  454 */                   main3(prefix + this.fls[m] + s2, m);
/*      */                 }
/*      */                 
/*  457 */                 buf = s2;
/*      */                 
/*  459 */                 s2 = new StringBuilder();
/*  460 */                 break;
/*      */               }
/*      */               
/*  463 */               if (i == s1.length() - 1)
/*      */               {
/*  465 */                 s2 = s2.append(c);
/*      */                 
/*      */ 
/*  468 */                 if (!s2.toString().contains("..."))
/*      */                 {
/*      */ 
/*  471 */                   main3(prefix + this.fls[m] + s2, m);
/*      */                 }
/*      */                 
/*  474 */                 buf = s2;
/*  475 */                 s2 = new StringBuilder();
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*  480 */                 s2 = s2.append(c);
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*  487 */       br.close();
/*  488 */       this.outFile.println();
/*      */     }
/*      */     catch (java.io.FileNotFoundException e)
/*      */     {
/*  492 */       javax.swing.JOptionPane.showMessageDialog(null, "'" + loc + "' file not found\n\nEnsure that this file exists", "Error", 0);
/*      */     }
/*      */     catch (java.io.IOException e)
/*      */     {
/*  496 */       javax.swing.JOptionPane.showMessageDialog(null, "An IOException occured with the '" + loc + "' file\n\nEnsure that this file can be read", "Error", 0);
/*      */     }
/*      */   }
/*      */   
/*      */   void main3(String loc, int m)
/*      */   {
/*  502 */     if (loc.contains("rapidshare.com/files/"))
/*      */     {
/*      */       try
/*      */       {
/*      */ 
/*  507 */         java.net.URL hp = new java.net.URL(loc);
/*  508 */         java.net.URLConnection hpCon = hp.openConnection();
/*  509 */         int len = hpCon.getContentLength();
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  515 */         java.io.InputStream input = hpCon.getInputStream();
/*  516 */         java.io.InputStreamReader in = new java.io.InputStreamReader(input);
/*  517 */         java.io.BufferedReader br = new java.io.BufferedReader(in);
/*  518 */         String s1 = br.readLine();
/*      */         
/*  520 */         if (s1.contains("<script"))
/*      */         {
/*      */ 
/*  523 */           if (this.unique.contains(loc))
/*      */           {
/*  525 */             this.outFile.println(loc + " ====>REDUNDANT");
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*  530 */             this.outFile.println(loc);
/*  531 */             this.unique.add(loc);
/*      */           }
/*      */           
/*      */         }
/*  535 */         else if (s1.contains(this.pat3[m].toString()))
/*      */         {
/*      */ 
/*  538 */           this.outFile.println(loc + " ---->DEAD");
/*      */         }
/*      */         
/*      */       }
/*      */       catch (java.net.MalformedURLException e)
/*      */       {
/*  544 */         javax.swing.JOptionPane.showMessageDialog(this, "This RS URL is invalid:\n" + loc, "Error", 0);
/*      */       }
/*      */       catch (java.io.IOException e)
/*      */       {
/*  548 */         this.retry -= 1;
/*      */         
/*  550 */         if (this.retry == 0)
/*      */         {
/*  552 */           this.outFile.println(loc + " *****NOT-CHECKED");
/*  553 */           this.retry = 5;
/*      */         }
/*      */         else
/*      */         {
/*  557 */           main3(loc, m);
/*      */         }
/*      */         
/*      */       }
/*      */       
/*      */     }
/*      */     else
/*      */     {
/*      */       try
/*      */       {
/*      */ 
/*  568 */         java.net.URL hp = new java.net.URL(loc);
/*  569 */         java.net.URLConnection hpCon = hp.openConnection();
/*  570 */         int len = hpCon.getContentLength();
/*      */         
/*  572 */         if (len != 0)
/*      */         {
/*      */ 
/*      */ 
/*  576 */           java.io.InputStream input = hpCon.getInputStream();
/*  577 */           java.io.InputStreamReader in = new java.io.InputStreamReader(input);
/*  578 */           java.io.BufferedReader br = new java.io.BufferedReader(in);
/*  579 */           boolean alive = false;
/*      */           
/*  581 */           java.util.regex.Matcher mat = null;
/*      */           String s1;
/*  583 */           while ((s1 = br.readLine()) != null)
/*      */           {
/*      */ 
/*  586 */             mat = this.pat3[m].matcher(s1);
/*  587 */             if (mat.find())
/*      */             {
/*      */ 
/*  590 */               if (this.unique.contains(loc))
/*      */               {
/*  592 */                 this.outFile.println(loc + " ====>REDUNDANT");
/*  593 */                 alive = true;
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*  599 */                 this.outFile.println(loc);
/*  600 */                 this.unique.add(loc);
/*  601 */                 alive = true;
/*      */               }
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*  607 */           if (!alive)
/*      */           {
/*  609 */             this.outFile.println(loc + " ---->DEAD");
/*      */           }
/*      */           
/*  612 */           br.close();
/*      */         }
/*      */         
/*      */       }
/*      */       catch (java.net.MalformedURLException e)
/*      */       {
/*  618 */         javax.swing.JOptionPane.showMessageDialog(this, "This filehost URL is invalid:\n" + loc, "Error", 0);
/*      */       }
/*      */       catch (java.io.IOException e)
/*      */       {
/*  622 */         this.retry -= 1;
/*      */         
/*  624 */         if (this.retry == 0)
/*      */         {
/*  626 */           this.outFile.println(loc + " *****NOT-CHECKED");
/*  627 */           this.retry = 5;
/*      */         }
/*      */         else
/*      */         {
/*  631 */           main3(loc, m);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   private void choo()
/*      */   {
/*  641 */     javax.swing.JFileChooser fc = new javax.swing.JFileChooser();
/*  642 */     fc.setMultiSelectionEnabled(true);
/*  643 */     fc.setFileSelectionMode(2);
/*  644 */     fc.setFileHidingEnabled(false);
/*  645 */     javax.swing.filechooser.FileNameExtensionFilter filter = new javax.swing.filechooser.FileNameExtensionFilter("TEXT & HTML files only", new String[] { "txt", "htm", "html" });
/*  646 */     fc.setFileFilter(filter);
/*  647 */     int r = fc.showDialog(fc, "Select file(s) and/or directorie(s)");
/*  648 */     this.files = fc.getSelectedFiles();
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  653 */     if ((r == 1) || (this.files[0].getName().equals("")))
/*      */     {
/*  655 */       this.files = null;
/*  656 */       System.exit(0);
/*      */     }
/*      */   }
/*      */   
/*      */   private JCheckBox jCheckBox33;
/*      */   private JCheckBox jCheckBox34;
/*      */   private JCheckBox jCheckBox35;
/*      */   private JCheckBox jCheckBox36;
/*      */   private JCheckBox jCheckBox37;
/*      */   private JCheckBox jCheckBox38;
/*      */   private JCheckBox jCheckBox39;
/*      */   
/*      */   private void initComponents() {
/*  669 */     this.jButton1 = new javax.swing.JButton();
/*  670 */     this.jButton2 = new javax.swing.JButton();
/*  671 */     this.jSeparator1 = new javax.swing.JSeparator();
/*  672 */     this.jCheckBox1 = new JCheckBox();
/*  673 */     this.jCheckBox2 = new JCheckBox();
/*  674 */     this.jCheckBox3 = new JCheckBox();
/*  675 */     this.jCheckBox4 = new JCheckBox();
/*  676 */     this.jCheckBox5 = new JCheckBox();
/*  677 */     this.jCheckBox6 = new JCheckBox();
/*  678 */     this.jCheckBox7 = new JCheckBox();
/*  679 */     this.jCheckBox8 = new JCheckBox();
/*  680 */     this.jCheckBox9 = new JCheckBox();
/*  681 */     this.jCheckBox10 = new JCheckBox();
/*  682 */     this.jCheckBox11 = new JCheckBox();
/*  683 */     this.jCheckBox12 = new JCheckBox();
/*  684 */     this.jButton4 = new javax.swing.JButton();
/*  685 */     this.jCheckBox13 = new JCheckBox();
/*  686 */     this.jCheckBox14 = new JCheckBox();
/*  687 */     this.jCheckBox15 = new JCheckBox();
/*  688 */     this.jCheckBox16 = new JCheckBox();
/*  689 */     this.jCheckBox17 = new JCheckBox();
/*  690 */     this.jCheckBox18 = new JCheckBox();
/*  691 */     this.jCheckBox19 = new JCheckBox();
/*  692 */     this.jCheckBox20 = new JCheckBox();
/*  693 */     this.jCheckBox21 = new JCheckBox();
/*  694 */     this.jCheckBox22 = new JCheckBox();
/*  695 */     this.jCheckBox23 = new JCheckBox();
/*  696 */     this.jCheckBox24 = new JCheckBox();
/*  697 */     this.jCheckBox25 = new JCheckBox();
/*  698 */     this.jCheckBox26 = new JCheckBox();
/*  699 */     this.jCheckBox27 = new JCheckBox();
/*  700 */     this.jCheckBox28 = new JCheckBox();
/*  701 */     this.jCheckBox29 = new JCheckBox();
/*  702 */     this.jCheckBox30 = new JCheckBox();
/*  703 */     this.jCheckBox31 = new JCheckBox();
/*  704 */     this.jCheckBox32 = new JCheckBox();
/*  705 */     this.jCheckBox33 = new JCheckBox();
/*  706 */     this.jCheckBox34 = new JCheckBox();
/*  707 */     this.jCheckBox35 = new JCheckBox();
/*  708 */     this.jCheckBox36 = new JCheckBox();
/*  709 */     this.jCheckBox37 = new JCheckBox();
/*  710 */     this.jCheckBox38 = new JCheckBox();
/*  711 */     this.jCheckBox39 = new JCheckBox();
/*  712 */     this.jCheckBox40 = new JCheckBox();
/*  713 */     this.jButton3 = new javax.swing.JButton();
/*      */     
/*  715 */     setDefaultCloseOperation(3);
/*  716 */     setTitle("FiLEC (File Link Extractor & Checker)");
/*      */     
/*  718 */     this.jButton1.setText("Extract");
/*  719 */     this.jButton1.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  721 */         FiLEC.this.jButton1ActionPerformed(evt);
/*      */       }
/*      */       
/*  724 */     });
/*  725 */     this.jButton2.setText("Exit");
/*  726 */     this.jButton2.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  728 */         FiLEC.this.jButton2ActionPerformed(evt);
/*      */       }
/*      */       
/*  731 */     });
/*  732 */     this.jCheckBox1.setText("jCheckBox1");
/*  733 */     this.jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  735 */         FiLEC.this.jCheckBox1ActionPerformed(evt);
/*      */       }
/*      */       
/*  738 */     });
/*  739 */     this.jCheckBox2.setText("jCheckBox2");
/*  740 */     this.jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  742 */         FiLEC.this.jCheckBox2ActionPerformed(evt);
/*      */       }
/*      */       
/*  745 */     });
/*  746 */     this.jCheckBox3.setText("jCheckBox3");
/*  747 */     this.jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  749 */         FiLEC.this.jCheckBox3ActionPerformed(evt);
/*      */       }
/*      */       
/*  752 */     });
/*  753 */     this.jCheckBox4.setText("jCheckBox4");
/*  754 */     this.jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  756 */         FiLEC.this.jCheckBox4ActionPerformed(evt);
/*      */       }
/*      */       
/*  759 */     });
/*  760 */     this.jCheckBox5.setText("jCheckBox5");
/*  761 */     this.jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  763 */         FiLEC.this.jCheckBox5ActionPerformed(evt);
/*      */       }
/*      */       
/*  766 */     });
/*  767 */     this.jCheckBox6.setText("jCheckBox6");
/*  768 */     this.jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  770 */         FiLEC.this.jCheckBox6ActionPerformed(evt);
/*      */       }
/*      */       
/*  773 */     });
/*  774 */     this.jCheckBox7.setText("jCheckBox7");
/*  775 */     this.jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  777 */         FiLEC.this.jCheckBox7ActionPerformed(evt);
/*      */       }
/*      */       
/*  780 */     });
/*  781 */     this.jCheckBox8.setText("jCheckBox8");
/*  782 */     this.jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  784 */         FiLEC.this.jCheckBox8ActionPerformed(evt);
/*      */       }
/*      */       
/*  787 */     });
/*  788 */     this.jCheckBox9.setText("jCheckBox9");
/*  789 */     this.jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  791 */         FiLEC.this.jCheckBox9ActionPerformed(evt);
/*      */       }
/*      */       
/*  794 */     });
/*  795 */     this.jCheckBox10.setText("jCheckBox10");
/*  796 */     this.jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  798 */         FiLEC.this.jCheckBox10ActionPerformed(evt);
/*      */       }
/*      */       
/*  801 */     });
/*  802 */     this.jCheckBox11.setText("jCheckBox11");
/*  803 */     this.jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  805 */         FiLEC.this.jCheckBox11ActionPerformed(evt);
/*      */       }
/*      */       
/*  808 */     });
/*  809 */     this.jCheckBox12.setText("jCheckBox12");
/*  810 */     this.jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  812 */         FiLEC.this.jCheckBox12ActionPerformed(evt);
/*      */       }
/*      */       
/*  815 */     });
/*  816 */     this.jButton4.setText("About");
/*  817 */     this.jButton4.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  819 */         FiLEC.this.jButton4ActionPerformed(evt);
/*      */       }
/*      */       
/*  822 */     });
/*  823 */     this.jCheckBox13.setText("jCheckBox13");
/*  824 */     this.jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  826 */         FiLEC.this.jCheckBox13ActionPerformed(evt);
/*      */       }
/*      */       
/*  829 */     });
/*  830 */     this.jCheckBox14.setText("jCheckBox14");
/*  831 */     this.jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  833 */         FiLEC.this.jCheckBox14ActionPerformed(evt);
/*      */       }
/*      */       
/*  836 */     });
/*  837 */     this.jCheckBox15.setText("jCheckBox15");
/*  838 */     this.jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  840 */         FiLEC.this.jCheckBox15ActionPerformed(evt);
/*      */       }
/*      */       
/*  843 */     });
/*  844 */     this.jCheckBox16.setText("jCheckBox16");
/*  845 */     this.jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  847 */         FiLEC.this.jCheckBox16ActionPerformed(evt);
/*      */       }
/*      */       
/*  850 */     });
/*  851 */     this.jCheckBox17.setText("jCheckBox17");
/*  852 */     this.jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  854 */         FiLEC.this.jCheckBox17ActionPerformed(evt);
/*      */       }
/*      */       
/*  857 */     });
/*  858 */     this.jCheckBox18.setText("jCheckBox18");
/*  859 */     this.jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  861 */         FiLEC.this.jCheckBox18ActionPerformed(evt);
/*      */       }
/*      */       
/*  864 */     });
/*  865 */     this.jCheckBox19.setText("jCheckBox19");
/*  866 */     this.jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  868 */         FiLEC.this.jCheckBox19ActionPerformed(evt);
/*      */       }
/*      */       
/*  871 */     });
/*  872 */     this.jCheckBox20.setText("jCheckBox20");
/*  873 */     this.jCheckBox20.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  875 */         FiLEC.this.jCheckBox20ActionPerformed(evt);
/*      */       }
/*      */       
/*  878 */     });
/*  879 */     this.jCheckBox21.setText("jCheckBox21");
/*  880 */     this.jCheckBox21.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  882 */         FiLEC.this.jCheckBox21ActionPerformed(evt);
/*      */       }
/*      */       
/*  885 */     });
/*  886 */     this.jCheckBox22.setText("jCheckBox22");
/*  887 */     this.jCheckBox22.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  889 */         FiLEC.this.jCheckBox22ActionPerformed(evt);
/*      */       }
/*      */       
/*  892 */     });
/*  893 */     this.jCheckBox23.setText("jCheckBox23");
/*  894 */     this.jCheckBox23.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  896 */         FiLEC.this.jCheckBox23ActionPerformed(evt);
/*      */       }
/*      */       
/*  899 */     });
/*  900 */     this.jCheckBox24.setText("jCheckBox24");
/*  901 */     this.jCheckBox24.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  903 */         FiLEC.this.jCheckBox24ActionPerformed(evt);
/*      */       }
/*      */       
/*  906 */     });
/*  907 */     this.jCheckBox25.setText("jCheckBox25");
/*  908 */     this.jCheckBox25.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  910 */         FiLEC.this.jCheckBox25ActionPerformed(evt);
/*      */       }
/*      */       
/*  913 */     });
/*  914 */     this.jCheckBox26.setText("jCheckBox26");
/*  915 */     this.jCheckBox26.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  917 */         FiLEC.this.jCheckBox26ActionPerformed(evt);
/*      */       }
/*      */       
/*  920 */     });
/*  921 */     this.jCheckBox27.setText("jCheckBox27");
/*  922 */     this.jCheckBox27.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  924 */         FiLEC.this.jCheckBox27ActionPerformed(evt);
/*      */       }
/*      */       
/*  927 */     });
/*  928 */     this.jCheckBox28.setText("jCheckBox28");
/*  929 */     this.jCheckBox28.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  931 */         FiLEC.this.jCheckBox28ActionPerformed(evt);
/*      */       }
/*      */       
/*  934 */     });
/*  935 */     this.jCheckBox29.setText("jCheckBox29");
/*  936 */     this.jCheckBox29.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  938 */         FiLEC.this.jCheckBox29ActionPerformed(evt);
/*      */       }
/*      */       
/*  941 */     });
/*  942 */     this.jCheckBox30.setText("jCheckBox30");
/*  943 */     this.jCheckBox30.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  945 */         FiLEC.this.jCheckBox30ActionPerformed(evt);
/*      */       }
/*      */       
/*  948 */     });
/*  949 */     this.jCheckBox31.setText("jCheckBox31");
/*  950 */     this.jCheckBox31.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  952 */         FiLEC.this.jCheckBox31ActionPerformed(evt);
/*      */       }
/*      */       
/*  955 */     });
/*  956 */     this.jCheckBox32.setText("jCheckBox32");
/*  957 */     this.jCheckBox32.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  959 */         FiLEC.this.jCheckBox32ActionPerformed(evt);
/*      */       }
/*      */       
/*  962 */     });
/*  963 */     this.jCheckBox33.setText("jCheckBox33");
/*  964 */     this.jCheckBox33.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  966 */         FiLEC.this.jCheckBox33ActionPerformed(evt);
/*      */       }
/*      */       
/*  969 */     });
/*  970 */     this.jCheckBox34.setText("jCheckBox34");
/*  971 */     this.jCheckBox34.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  973 */         FiLEC.this.jCheckBox34ActionPerformed(evt);
/*      */       }
/*      */       
/*  976 */     });
/*  977 */     this.jCheckBox35.setText("jCheckBox35");
/*  978 */     this.jCheckBox35.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  980 */         FiLEC.this.jCheckBox35ActionPerformed(evt);
/*      */       }
/*      */       
/*  983 */     });
/*  984 */     this.jCheckBox36.setText("jCheckBox36");
/*  985 */     this.jCheckBox36.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  987 */         FiLEC.this.jCheckBox36ActionPerformed(evt);
/*      */       }
/*      */       
/*  990 */     });
/*  991 */     this.jCheckBox37.setText("jCheckBox37");
/*  992 */     this.jCheckBox37.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  994 */         FiLEC.this.jCheckBox37ActionPerformed(evt);
/*      */       }
/*      */       
/*  997 */     });
/*  998 */     this.jCheckBox38.setText("jCheckBox38");
/*  999 */     this.jCheckBox38.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 1001 */         FiLEC.this.jCheckBox38ActionPerformed(evt);
/*      */       }
/*      */       
/* 1004 */     });
/* 1005 */     this.jCheckBox39.setText("jCheckBox39");
/* 1006 */     this.jCheckBox39.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 1008 */         FiLEC.this.jCheckBox39ActionPerformed(evt);
/*      */       }
/*      */       
/* 1011 */     });
/* 1012 */     this.jCheckBox40.setText("jCheckBox40");
/* 1013 */     this.jCheckBox40.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 1015 */         FiLEC.this.jCheckBox40ActionPerformed(evt);
/*      */       }
/*      */       
/* 1018 */     });
/* 1019 */     this.jButton3.setText("Select");
/* 1020 */     this.jButton3.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 1022 */         FiLEC.this.jButton3ActionPerformed(evt);
/*      */       }
/*      */       
/* 1025 */     });
/* 1026 */     javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
/* 1027 */     getContentPane().setLayout(layout);
/* 1028 */     layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jSeparator1, -1, 719, 32767).addContainerGap()).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox25).addComponent(this.jCheckBox9).addComponent(this.jCheckBox17).addComponent(this.jCheckBox1).addComponent(this.jCheckBox33)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox26).addComponent(this.jCheckBox10).addComponent(this.jCheckBox18).addComponent(this.jCheckBox2).addComponent(this.jCheckBox34)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox19).addComponent(this.jCheckBox27).addComponent(this.jCheckBox11).addComponent(this.jCheckBox3).addComponent(this.jCheckBox35)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox20).addComponent(this.jCheckBox28).addComponent(this.jCheckBox12).addComponent(this.jCheckBox4).addComponent(this.jCheckBox36)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox21).addComponent(this.jCheckBox29).addComponent(this.jCheckBox13).addComponent(this.jCheckBox5).addComponent(this.jCheckBox37)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox22).addComponent(this.jCheckBox14).addComponent(this.jCheckBox6).addComponent(this.jCheckBox30).addComponent(this.jCheckBox38)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox23).addComponent(this.jCheckBox15).addComponent(this.jCheckBox7).addComponent(this.jCheckBox31).addComponent(this.jCheckBox39))).addGroup(layout.createSequentialGroup().addComponent(this.jButton1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton3))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox24).addComponent(this.jCheckBox16).addComponent(this.jCheckBox32).addComponent(this.jCheckBox40).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(this.jButton4).addComponent(this.jCheckBox8)))))));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1103 */     layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jButton1).addComponent(this.jButton2).addComponent(this.jButton4).addComponent(this.jButton3)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jSeparator1, -2, 6, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox1).addComponent(this.jCheckBox2).addComponent(this.jCheckBox3).addComponent(this.jCheckBox4).addComponent(this.jCheckBox5).addComponent(this.jCheckBox6).addComponent(this.jCheckBox7).addComponent(this.jCheckBox8)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox9).addComponent(this.jCheckBox10).addComponent(this.jCheckBox11).addComponent(this.jCheckBox12).addComponent(this.jCheckBox13).addComponent(this.jCheckBox14).addComponent(this.jCheckBox15).addComponent(this.jCheckBox16)).addGap(3, 3, 3).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(this.jCheckBox17).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox18).addComponent(this.jCheckBox19).addComponent(this.jCheckBox20).addComponent(this.jCheckBox21).addComponent(this.jCheckBox22).addComponent(this.jCheckBox23).addComponent(this.jCheckBox24))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox25).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox26).addComponent(this.jCheckBox30).addComponent(this.jCheckBox31).addComponent(this.jCheckBox32).addComponent(this.jCheckBox27).addComponent(this.jCheckBox28).addComponent(this.jCheckBox29))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox33).addComponent(this.jCheckBox35).addComponent(this.jCheckBox36).addComponent(this.jCheckBox38).addComponent(this.jCheckBox37).addComponent(this.jCheckBox39).addComponent(this.jCheckBox40).addComponent(this.jCheckBox34)).addContainerGap()));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1169 */     pack();
/*      */   }
/*      */   
/*      */   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1173 */     main1();
/*      */   }
/*      */   
/*      */   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1177 */     System.exit(0);
/*      */   }
/*      */   
/*      */   private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1181 */     javax.swing.JOptionPane.showMessageDialog(this, "FiLEC v1.0 by Ankit Singh\n\nFiLEC = File Link Extractor & Checker", "About", 1);
/*      */   }
/*      */   
/*      */   private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1185 */     this.flag[0] = (this.flag[0] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1189 */     this.flag[1] = (this.flag[1] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1193 */     this.flag[2] = (this.flag[2] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1197 */     this.flag[3] = (this.flag[3] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1201 */     this.flag[4] = (this.flag[4] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1205 */     this.flag[5] = (this.flag[5] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1209 */     this.flag[6] = (this.flag[6] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1213 */     this.flag[7] = (this.flag[7] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1217 */     this.flag[8] = (this.flag[8] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1221 */     this.flag[9] = (this.flag[9] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1225 */     this.flag[10] = (this.flag[10] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1229 */     this.flag[11] = (this.flag[11] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1233 */     this.flag[12] = (this.flag[12] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1237 */     this.flag[13] = (this.flag[13] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1241 */     this.flag[14] = (this.flag[14] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1245 */     this.flag[15] = (this.flag[15] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1249 */     this.flag[16] = (this.flag[16] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1253 */     this.flag[17] = (this.flag[17] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1257 */     this.flag[18] = (this.flag[18] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1261 */     this.flag[19] = (this.flag[19] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox21ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1265 */     this.flag[20] = (this.flag[20] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox22ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1269 */     this.flag[21] = (this.flag[21] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox23ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1273 */     this.flag[22] = (this.flag[22] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox24ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1277 */     this.flag[23] = (this.flag[23] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox25ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1281 */     this.flag[24] = (this.flag[24] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox26ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1285 */     this.flag[25] = (this.flag[25] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox27ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1289 */     this.flag[26] = (this.flag[26] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox28ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1293 */     this.flag[27] = (this.flag[27] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox29ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1297 */     this.flag[28] = (this.flag[28] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox30ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1301 */     this.flag[29] = (this.flag[29] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox31ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1305 */     this.flag[30] = (this.flag[30] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox32ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1309 */     this.flag[31] = (this.flag[31] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox33ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1313 */     this.flag[32] = (this.flag[32] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox34ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1317 */     this.flag[33] = (this.flag[33] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox35ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1321 */     this.flag[34] = (this.flag[34] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox36ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1325 */     this.flag[35] = (this.flag[35] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox37ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1329 */     this.flag[36] = (this.flag[36] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox38ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1333 */     this.flag[37] = (this.flag[37] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox39ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1337 */     this.flag[38] = (this.flag[38] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox40ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1341 */     this.flag[39] = (this.flag[39] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1345 */     choo();
/*      */   }
/*      */   
/*      */   private JCheckBox jCheckBox4;
/*      */   private JCheckBox jCheckBox40;
/*      */   private JCheckBox jCheckBox5;
/*      */   private JCheckBox jCheckBox6;
/*      */   private JCheckBox jCheckBox7;
/*      */   private JCheckBox jCheckBox8;
/*      */   private JCheckBox jCheckBox9;
/*      */   private javax.swing.JSeparator jSeparator1;
/*      */   public static void main(String[] args) {
/*      */     try {
/* 1358 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 1359 */         if ("Windows".equals(info.getName())) {
/* 1360 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 1361 */           break;
/*      */         }
/*      */       }
/*      */     } catch (Exception ex) {
/* 1365 */       javax.swing.JOptionPane.showMessageDialog(null, "L&F error", "Internal error", 0);
/*      */     }
/*      */     
/*      */ 
/*      */ 
/* 1370 */     java.awt.EventQueue.invokeLater(new Runnable()
/*      */     {
/*      */       public void run()
/*      */       {
/* 1374 */         new FiLEC().setVisible(true);
/*      */       }
/*      */     });
/*      */   }
/*      */ }
