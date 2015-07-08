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
/*      */ 
/*      */         }
/*      */         
/*      */       }
/*      */       
/*      */     }
/*  564 */     else if (loc.contains("hotfile.com/dl/"))
/*      */     {
/*      */       try
/*      */       {
/*      */ 
/*  569 */         java.net.URL hp = new java.net.URL(loc);
/*  570 */         java.net.URLConnection hpCon = hp.openConnection();
/*  571 */         int len = hpCon.getContentLength();
/*      */         
/*  573 */         if (len != 0)
/*      */         {
/*      */ 
/*      */ 
/*  577 */           java.io.InputStream input = hpCon.getInputStream();
/*  578 */           java.io.InputStreamReader in = new java.io.InputStreamReader(input);
/*  579 */           java.io.BufferedReader br = new java.io.BufferedReader(in);
/*  580 */           boolean alive = false;
/*      */           
/*  582 */           java.util.regex.Matcher mat = null;
/*      */           String s1;
/*  584 */           while ((s1 = br.readLine()) != null)
/*      */           {
/*      */ 
/*  587 */             mat = this.pat3[m].matcher(s1);
/*  588 */             if (mat.find())
/*      */             {
/*      */ 
/*  591 */               if (this.unique.contains(loc))
/*      */               {
/*  593 */                 this.outFile.println(loc + " ====>REDUNDANT");
/*  594 */                 alive = true;
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*  600 */                 this.outFile.println(loc);
/*  601 */                 this.unique.add(loc);
/*  602 */                 alive = true;
/*      */               }
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*  608 */           if (!alive)
/*      */           {
/*  610 */             this.outFile.println(loc + " ---->DEAD FOR SURE");
/*      */           }
/*      */           
/*  613 */           br.close();
/*      */         }
/*      */         
/*      */       }
/*      */       catch (java.net.MalformedURLException e)
/*      */       {
/*  619 */         javax.swing.JOptionPane.showMessageDialog(this, "This HF URL is invalid:\n" + loc, "Error", 0);
/*      */ 
/*      */       }
/*      */       catch (java.io.IOException e)
/*      */       {
/*  624 */         this.outFile.println(loc + " ---->DEAD");
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */     }
/*      */     else
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*      */       try
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  645 */         java.net.URL hp = new java.net.URL(loc);
/*  646 */         java.net.URLConnection hpCon = hp.openConnection();
/*  647 */         int len = hpCon.getContentLength();
/*      */         
/*  649 */         if (len != 0)
/*      */         {
/*      */ 
/*      */ 
/*  653 */           java.io.InputStream input = hpCon.getInputStream();
/*  654 */           java.io.InputStreamReader in = new java.io.InputStreamReader(input);
/*  655 */           java.io.BufferedReader br = new java.io.BufferedReader(in);
/*  656 */           boolean alive = false;
/*      */           
/*  658 */           java.util.regex.Matcher mat = null;
/*      */           String s1;
/*  660 */           while ((s1 = br.readLine()) != null)
/*      */           {
/*      */ 
/*  663 */             mat = this.pat3[m].matcher(s1);
/*  664 */             if (mat.find())
/*      */             {
/*      */ 
/*  667 */               if (this.unique.contains(loc))
/*      */               {
/*  669 */                 this.outFile.println(loc + " ====>REDUNDANT");
/*  670 */                 alive = true;
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*  676 */                 this.outFile.println(loc);
/*  677 */                 this.unique.add(loc);
/*  678 */                 alive = true;
/*      */               }
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*  684 */           if (!alive)
/*      */           {
/*  686 */             this.outFile.println(loc + " ---->DEAD");
/*      */           }
/*      */           
/*  689 */           br.close();
/*      */         }
/*      */         
/*      */       }
/*      */       catch (java.net.MalformedURLException e)
/*      */       {
/*  695 */         javax.swing.JOptionPane.showMessageDialog(this, "This filehost URL is invalid:\n" + loc, "Error", 0);
/*      */       }
/*      */       catch (java.io.IOException e)
/*      */       {
/*  699 */         this.retry -= 1;
/*      */         
/*  701 */         if (this.retry == 0)
/*      */         {
/*  703 */           this.outFile.println(loc + " *****NOT-CHECKED");
/*  704 */           this.retry = 5;
/*      */         }
/*      */         else
/*      */         {
/*  708 */           main3(loc, m);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   private void choo()
/*      */   {
/*  718 */     javax.swing.JFileChooser fc = new javax.swing.JFileChooser();
/*  719 */     fc.setMultiSelectionEnabled(true);
/*  720 */     fc.setFileSelectionMode(2);
/*  721 */     fc.setFileHidingEnabled(false);
/*  722 */     javax.swing.filechooser.FileNameExtensionFilter filter = new javax.swing.filechooser.FileNameExtensionFilter("TEXT & HTML files only", new String[] { "txt", "htm", "html" });
/*  723 */     fc.setFileFilter(filter);
/*  724 */     int r = fc.showDialog(fc, "Select file(s) and/or directorie(s)");
/*  725 */     this.files = fc.getSelectedFiles();
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*  730 */     if ((r == 1) || (this.files[0].getName().equals("")))
/*      */     {
/*  732 */       this.files = null;
/*  733 */       System.exit(0);
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
/*  746 */     this.jButton1 = new javax.swing.JButton();
/*  747 */     this.jButton2 = new javax.swing.JButton();
/*  748 */     this.jSeparator1 = new javax.swing.JSeparator();
/*  749 */     this.jCheckBox1 = new JCheckBox();
/*  750 */     this.jCheckBox2 = new JCheckBox();
/*  751 */     this.jCheckBox3 = new JCheckBox();
/*  752 */     this.jCheckBox4 = new JCheckBox();
/*  753 */     this.jCheckBox5 = new JCheckBox();
/*  754 */     this.jCheckBox6 = new JCheckBox();
/*  755 */     this.jCheckBox7 = new JCheckBox();
/*  756 */     this.jCheckBox8 = new JCheckBox();
/*  757 */     this.jCheckBox9 = new JCheckBox();
/*  758 */     this.jCheckBox10 = new JCheckBox();
/*  759 */     this.jCheckBox11 = new JCheckBox();
/*  760 */     this.jCheckBox12 = new JCheckBox();
/*  761 */     this.jButton4 = new javax.swing.JButton();
/*  762 */     this.jCheckBox13 = new JCheckBox();
/*  763 */     this.jCheckBox14 = new JCheckBox();
/*  764 */     this.jCheckBox15 = new JCheckBox();
/*  765 */     this.jCheckBox16 = new JCheckBox();
/*  766 */     this.jCheckBox17 = new JCheckBox();
/*  767 */     this.jCheckBox18 = new JCheckBox();
/*  768 */     this.jCheckBox19 = new JCheckBox();
/*  769 */     this.jCheckBox20 = new JCheckBox();
/*  770 */     this.jCheckBox21 = new JCheckBox();
/*  771 */     this.jCheckBox22 = new JCheckBox();
/*  772 */     this.jCheckBox23 = new JCheckBox();
/*  773 */     this.jCheckBox24 = new JCheckBox();
/*  774 */     this.jCheckBox25 = new JCheckBox();
/*  775 */     this.jCheckBox26 = new JCheckBox();
/*  776 */     this.jCheckBox27 = new JCheckBox();
/*  777 */     this.jCheckBox28 = new JCheckBox();
/*  778 */     this.jCheckBox29 = new JCheckBox();
/*  779 */     this.jCheckBox30 = new JCheckBox();
/*  780 */     this.jCheckBox31 = new JCheckBox();
/*  781 */     this.jCheckBox32 = new JCheckBox();
/*  782 */     this.jCheckBox33 = new JCheckBox();
/*  783 */     this.jCheckBox34 = new JCheckBox();
/*  784 */     this.jCheckBox35 = new JCheckBox();
/*  785 */     this.jCheckBox36 = new JCheckBox();
/*  786 */     this.jCheckBox37 = new JCheckBox();
/*  787 */     this.jCheckBox38 = new JCheckBox();
/*  788 */     this.jCheckBox39 = new JCheckBox();
/*  789 */     this.jCheckBox40 = new JCheckBox();
/*  790 */     this.jButton3 = new javax.swing.JButton();
/*      */     
/*  792 */     setDefaultCloseOperation(3);
/*  793 */     setTitle("FiLEC (File Link Extractor & Checker)");
/*      */     
/*  795 */     this.jButton1.setText("Extract");
/*  796 */     this.jButton1.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  798 */         FiLEC.this.jButton1ActionPerformed(evt);
/*      */       }
/*      */       
/*  801 */     });
/*  802 */     this.jButton2.setText("Exit");
/*  803 */     this.jButton2.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  805 */         FiLEC.this.jButton2ActionPerformed(evt);
/*      */       }
/*      */       
/*  808 */     });
/*  809 */     this.jCheckBox1.setText("jCheckBox1");
/*  810 */     this.jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  812 */         FiLEC.this.jCheckBox1ActionPerformed(evt);
/*      */       }
/*      */       
/*  815 */     });
/*  816 */     this.jCheckBox2.setText("jCheckBox2");
/*  817 */     this.jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  819 */         FiLEC.this.jCheckBox2ActionPerformed(evt);
/*      */       }
/*      */       
/*  822 */     });
/*  823 */     this.jCheckBox3.setText("jCheckBox3");
/*  824 */     this.jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  826 */         FiLEC.this.jCheckBox3ActionPerformed(evt);
/*      */       }
/*      */       
/*  829 */     });
/*  830 */     this.jCheckBox4.setText("jCheckBox4");
/*  831 */     this.jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  833 */         FiLEC.this.jCheckBox4ActionPerformed(evt);
/*      */       }
/*      */       
/*  836 */     });
/*  837 */     this.jCheckBox5.setText("jCheckBox5");
/*  838 */     this.jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  840 */         FiLEC.this.jCheckBox5ActionPerformed(evt);
/*      */       }
/*      */       
/*  843 */     });
/*  844 */     this.jCheckBox6.setText("jCheckBox6");
/*  845 */     this.jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  847 */         FiLEC.this.jCheckBox6ActionPerformed(evt);
/*      */       }
/*      */       
/*  850 */     });
/*  851 */     this.jCheckBox7.setText("jCheckBox7");
/*  852 */     this.jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  854 */         FiLEC.this.jCheckBox7ActionPerformed(evt);
/*      */       }
/*      */       
/*  857 */     });
/*  858 */     this.jCheckBox8.setText("jCheckBox8");
/*  859 */     this.jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  861 */         FiLEC.this.jCheckBox8ActionPerformed(evt);
/*      */       }
/*      */       
/*  864 */     });
/*  865 */     this.jCheckBox9.setText("jCheckBox9");
/*  866 */     this.jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  868 */         FiLEC.this.jCheckBox9ActionPerformed(evt);
/*      */       }
/*      */       
/*  871 */     });
/*  872 */     this.jCheckBox10.setText("jCheckBox10");
/*  873 */     this.jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  875 */         FiLEC.this.jCheckBox10ActionPerformed(evt);
/*      */       }
/*      */       
/*  878 */     });
/*  879 */     this.jCheckBox11.setText("jCheckBox11");
/*  880 */     this.jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  882 */         FiLEC.this.jCheckBox11ActionPerformed(evt);
/*      */       }
/*      */       
/*  885 */     });
/*  886 */     this.jCheckBox12.setText("jCheckBox12");
/*  887 */     this.jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  889 */         FiLEC.this.jCheckBox12ActionPerformed(evt);
/*      */       }
/*      */       
/*  892 */     });
/*  893 */     this.jButton4.setText("About");
/*  894 */     this.jButton4.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  896 */         FiLEC.this.jButton4ActionPerformed(evt);
/*      */       }
/*      */       
/*  899 */     });
/*  900 */     this.jCheckBox13.setText("jCheckBox13");
/*  901 */     this.jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  903 */         FiLEC.this.jCheckBox13ActionPerformed(evt);
/*      */       }
/*      */       
/*  906 */     });
/*  907 */     this.jCheckBox14.setText("jCheckBox14");
/*  908 */     this.jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  910 */         FiLEC.this.jCheckBox14ActionPerformed(evt);
/*      */       }
/*      */       
/*  913 */     });
/*  914 */     this.jCheckBox15.setText("jCheckBox15");
/*  915 */     this.jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  917 */         FiLEC.this.jCheckBox15ActionPerformed(evt);
/*      */       }
/*      */       
/*  920 */     });
/*  921 */     this.jCheckBox16.setText("jCheckBox16");
/*  922 */     this.jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  924 */         FiLEC.this.jCheckBox16ActionPerformed(evt);
/*      */       }
/*      */       
/*  927 */     });
/*  928 */     this.jCheckBox17.setText("jCheckBox17");
/*  929 */     this.jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  931 */         FiLEC.this.jCheckBox17ActionPerformed(evt);
/*      */       }
/*      */       
/*  934 */     });
/*  935 */     this.jCheckBox18.setText("jCheckBox18");
/*  936 */     this.jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  938 */         FiLEC.this.jCheckBox18ActionPerformed(evt);
/*      */       }
/*      */       
/*  941 */     });
/*  942 */     this.jCheckBox19.setText("jCheckBox19");
/*  943 */     this.jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  945 */         FiLEC.this.jCheckBox19ActionPerformed(evt);
/*      */       }
/*      */       
/*  948 */     });
/*  949 */     this.jCheckBox20.setText("jCheckBox20");
/*  950 */     this.jCheckBox20.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  952 */         FiLEC.this.jCheckBox20ActionPerformed(evt);
/*      */       }
/*      */       
/*  955 */     });
/*  956 */     this.jCheckBox21.setText("jCheckBox21");
/*  957 */     this.jCheckBox21.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  959 */         FiLEC.this.jCheckBox21ActionPerformed(evt);
/*      */       }
/*      */       
/*  962 */     });
/*  963 */     this.jCheckBox22.setText("jCheckBox22");
/*  964 */     this.jCheckBox22.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  966 */         FiLEC.this.jCheckBox22ActionPerformed(evt);
/*      */       }
/*      */       
/*  969 */     });
/*  970 */     this.jCheckBox23.setText("jCheckBox23");
/*  971 */     this.jCheckBox23.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  973 */         FiLEC.this.jCheckBox23ActionPerformed(evt);
/*      */       }
/*      */       
/*  976 */     });
/*  977 */     this.jCheckBox24.setText("jCheckBox24");
/*  978 */     this.jCheckBox24.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  980 */         FiLEC.this.jCheckBox24ActionPerformed(evt);
/*      */       }
/*      */       
/*  983 */     });
/*  984 */     this.jCheckBox25.setText("jCheckBox25");
/*  985 */     this.jCheckBox25.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  987 */         FiLEC.this.jCheckBox25ActionPerformed(evt);
/*      */       }
/*      */       
/*  990 */     });
/*  991 */     this.jCheckBox26.setText("jCheckBox26");
/*  992 */     this.jCheckBox26.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  994 */         FiLEC.this.jCheckBox26ActionPerformed(evt);
/*      */       }
/*      */       
/*  997 */     });
/*  998 */     this.jCheckBox27.setText("jCheckBox27");
/*  999 */     this.jCheckBox27.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 1001 */         FiLEC.this.jCheckBox27ActionPerformed(evt);
/*      */       }
/*      */       
/* 1004 */     });
/* 1005 */     this.jCheckBox28.setText("jCheckBox28");
/* 1006 */     this.jCheckBox28.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 1008 */         FiLEC.this.jCheckBox28ActionPerformed(evt);
/*      */       }
/*      */       
/* 1011 */     });
/* 1012 */     this.jCheckBox29.setText("jCheckBox29");
/* 1013 */     this.jCheckBox29.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 1015 */         FiLEC.this.jCheckBox29ActionPerformed(evt);
/*      */       }
/*      */       
/* 1018 */     });
/* 1019 */     this.jCheckBox30.setText("jCheckBox30");
/* 1020 */     this.jCheckBox30.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 1022 */         FiLEC.this.jCheckBox30ActionPerformed(evt);
/*      */       }
/*      */       
/* 1025 */     });
/* 1026 */     this.jCheckBox31.setText("jCheckBox31");
/* 1027 */     this.jCheckBox31.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 1029 */         FiLEC.this.jCheckBox31ActionPerformed(evt);
/*      */       }
/*      */       
/* 1032 */     });
/* 1033 */     this.jCheckBox32.setText("jCheckBox32");
/* 1034 */     this.jCheckBox32.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 1036 */         FiLEC.this.jCheckBox32ActionPerformed(evt);
/*      */       }
/*      */       
/* 1039 */     });
/* 1040 */     this.jCheckBox33.setText("jCheckBox33");
/* 1041 */     this.jCheckBox33.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 1043 */         FiLEC.this.jCheckBox33ActionPerformed(evt);
/*      */       }
/*      */       
/* 1046 */     });
/* 1047 */     this.jCheckBox34.setText("jCheckBox34");
/* 1048 */     this.jCheckBox34.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 1050 */         FiLEC.this.jCheckBox34ActionPerformed(evt);
/*      */       }
/*      */       
/* 1053 */     });
/* 1054 */     this.jCheckBox35.setText("jCheckBox35");
/* 1055 */     this.jCheckBox35.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 1057 */         FiLEC.this.jCheckBox35ActionPerformed(evt);
/*      */       }
/*      */       
/* 1060 */     });
/* 1061 */     this.jCheckBox36.setText("jCheckBox36");
/* 1062 */     this.jCheckBox36.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 1064 */         FiLEC.this.jCheckBox36ActionPerformed(evt);
/*      */       }
/*      */       
/* 1067 */     });
/* 1068 */     this.jCheckBox37.setText("jCheckBox37");
/* 1069 */     this.jCheckBox37.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 1071 */         FiLEC.this.jCheckBox37ActionPerformed(evt);
/*      */       }
/*      */       
/* 1074 */     });
/* 1075 */     this.jCheckBox38.setText("jCheckBox38");
/* 1076 */     this.jCheckBox38.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 1078 */         FiLEC.this.jCheckBox38ActionPerformed(evt);
/*      */       }
/*      */       
/* 1081 */     });
/* 1082 */     this.jCheckBox39.setText("jCheckBox39");
/* 1083 */     this.jCheckBox39.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 1085 */         FiLEC.this.jCheckBox39ActionPerformed(evt);
/*      */       }
/*      */       
/* 1088 */     });
/* 1089 */     this.jCheckBox40.setText("jCheckBox40");
/* 1090 */     this.jCheckBox40.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 1092 */         FiLEC.this.jCheckBox40ActionPerformed(evt);
/*      */       }
/*      */       
/* 1095 */     });
/* 1096 */     this.jButton3.setText("Select");
/* 1097 */     this.jButton3.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 1099 */         FiLEC.this.jButton3ActionPerformed(evt);
/*      */       }
/*      */       
/* 1102 */     });
/* 1103 */     javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
/* 1104 */     getContentPane().setLayout(layout);
/* 1105 */     layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jSeparator1, -1, 719, 32767).addContainerGap()).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox25).addComponent(this.jCheckBox9).addComponent(this.jCheckBox17).addComponent(this.jCheckBox1).addComponent(this.jCheckBox33)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox26).addComponent(this.jCheckBox10).addComponent(this.jCheckBox18).addComponent(this.jCheckBox2).addComponent(this.jCheckBox34)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox19).addComponent(this.jCheckBox27).addComponent(this.jCheckBox11).addComponent(this.jCheckBox3).addComponent(this.jCheckBox35)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox20).addComponent(this.jCheckBox28).addComponent(this.jCheckBox12).addComponent(this.jCheckBox4).addComponent(this.jCheckBox36)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox21).addComponent(this.jCheckBox29).addComponent(this.jCheckBox13).addComponent(this.jCheckBox5).addComponent(this.jCheckBox37)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox22).addComponent(this.jCheckBox14).addComponent(this.jCheckBox6).addComponent(this.jCheckBox30).addComponent(this.jCheckBox38)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox23).addComponent(this.jCheckBox15).addComponent(this.jCheckBox7).addComponent(this.jCheckBox31).addComponent(this.jCheckBox39))).addGroup(layout.createSequentialGroup().addComponent(this.jButton1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton3))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox24).addComponent(this.jCheckBox16).addComponent(this.jCheckBox32).addComponent(this.jCheckBox40).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(this.jButton4).addComponent(this.jCheckBox8)))))));
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
/* 1180 */     layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jButton1).addComponent(this.jButton2).addComponent(this.jButton4).addComponent(this.jButton3)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jSeparator1, -2, 6, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox1).addComponent(this.jCheckBox2).addComponent(this.jCheckBox3).addComponent(this.jCheckBox4).addComponent(this.jCheckBox5).addComponent(this.jCheckBox6).addComponent(this.jCheckBox7).addComponent(this.jCheckBox8)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox9).addComponent(this.jCheckBox10).addComponent(this.jCheckBox11).addComponent(this.jCheckBox12).addComponent(this.jCheckBox13).addComponent(this.jCheckBox14).addComponent(this.jCheckBox15).addComponent(this.jCheckBox16)).addGap(3, 3, 3).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(this.jCheckBox17).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox18).addComponent(this.jCheckBox19).addComponent(this.jCheckBox20).addComponent(this.jCheckBox21).addComponent(this.jCheckBox22).addComponent(this.jCheckBox23).addComponent(this.jCheckBox24))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox25).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox26).addComponent(this.jCheckBox30).addComponent(this.jCheckBox31).addComponent(this.jCheckBox32).addComponent(this.jCheckBox27).addComponent(this.jCheckBox28).addComponent(this.jCheckBox29))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox33).addComponent(this.jCheckBox35).addComponent(this.jCheckBox36).addComponent(this.jCheckBox38).addComponent(this.jCheckBox37).addComponent(this.jCheckBox39).addComponent(this.jCheckBox40).addComponent(this.jCheckBox34)).addContainerGap()));
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
/* 1246 */     pack();
/*      */   }
/*      */   
/*      */   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1250 */     main1();
/*      */   }
/*      */   
/*      */   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1254 */     System.exit(0);
/*      */   }
/*      */   
/*      */   private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1258 */     javax.swing.JOptionPane.showMessageDialog(this, "FiLEC v1.0 by Ankit Singh\n\nFiLEC = File Link Extractor & Checker", "About", 1);
/*      */   }
/*      */   
/*      */   private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1262 */     this.flag[0] = (this.flag[0] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1266 */     this.flag[1] = (this.flag[1] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1270 */     this.flag[2] = (this.flag[2] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1274 */     this.flag[3] = (this.flag[3] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1278 */     this.flag[4] = (this.flag[4] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1282 */     this.flag[5] = (this.flag[5] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1286 */     this.flag[6] = (this.flag[6] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1290 */     this.flag[7] = (this.flag[7] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1294 */     this.flag[8] = (this.flag[8] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1298 */     this.flag[9] = (this.flag[9] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1302 */     this.flag[10] = (this.flag[10] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1306 */     this.flag[11] = (this.flag[11] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1310 */     this.flag[12] = (this.flag[12] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1314 */     this.flag[13] = (this.flag[13] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1318 */     this.flag[14] = (this.flag[14] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1322 */     this.flag[15] = (this.flag[15] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1326 */     this.flag[16] = (this.flag[16] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1330 */     this.flag[17] = (this.flag[17] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1334 */     this.flag[18] = (this.flag[18] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1338 */     this.flag[19] = (this.flag[19] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox21ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1342 */     this.flag[20] = (this.flag[20] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox22ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1346 */     this.flag[21] = (this.flag[21] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox23ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1350 */     this.flag[22] = (this.flag[22] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox24ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1354 */     this.flag[23] = (this.flag[23] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox25ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1358 */     this.flag[24] = (this.flag[24] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox26ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1362 */     this.flag[25] = (this.flag[25] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox27ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1366 */     this.flag[26] = (this.flag[26] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox28ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1370 */     this.flag[27] = (this.flag[27] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox29ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1374 */     this.flag[28] = (this.flag[28] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox30ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1378 */     this.flag[29] = (this.flag[29] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox31ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1382 */     this.flag[30] = (this.flag[30] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox32ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1386 */     this.flag[31] = (this.flag[31] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox33ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1390 */     this.flag[32] = (this.flag[32] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox34ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1394 */     this.flag[33] = (this.flag[33] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox35ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1398 */     this.flag[34] = (this.flag[34] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox36ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1402 */     this.flag[35] = (this.flag[35] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox37ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1406 */     this.flag[36] = (this.flag[36] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox38ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1410 */     this.flag[37] = (this.flag[37] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox39ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1414 */     this.flag[38] = (this.flag[38] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox40ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1418 */     this.flag[39] = (this.flag[39] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
/* 1422 */     choo();
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
/* 1435 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 1436 */         if ("Windows".equals(info.getName())) {
/* 1437 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 1438 */           break;
/*      */         }
/*      */       }
/*      */     } catch (Exception ex) {
/* 1442 */       javax.swing.JOptionPane.showMessageDialog(null, "L&F error", "Internal error", 0);
/*      */     }
/*      */     
/*      */ 
/*      */ 
/* 1447 */     java.awt.EventQueue.invokeLater(new Runnable()
/*      */     {
/*      */       public void run()
/*      */       {
/* 1451 */         new FiLEC().setVisible(true);
/*      */       }
/*      */     });
/*      */   }
/*      */ }
