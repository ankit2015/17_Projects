/*      */ package ankit_singh;
/*      */ 
/*      */ import java.awt.event.ActionEvent;
/*      */ import java.awt.event.ActionListener;
/*      */ import java.io.BufferedReader;
/*      */ import java.io.PrintWriter;
/*      */ import javax.swing.GroupLayout;
/*      */ import javax.swing.GroupLayout.Alignment;
/*      */ import javax.swing.GroupLayout.ParallelGroup;
/*      */ import javax.swing.GroupLayout.SequentialGroup;
/*      */ import javax.swing.JButton;
/*      */ import javax.swing.JCheckBox;
/*      */ 
/*      */ public class ULEC extends javax.swing.JFrame
/*      */ {
/*      */   PrintWriter outFile;
/*      */   boolean flag1;
/*      */   int page;
/*      */   int retry;
/*      */   java.util.ArrayList<String> unique;
/*   21 */   final java.util.regex.Pattern pat = java.util.regex.Pattern.compile("<title>", 2);
/*      */   String[] ls;
/*      */   String[] fls;
/*      */   java.util.regex.Pattern[] pat2;
/*      */   String[] cs;
/*      */   java.util.regex.Pattern[] pat3;
/*      */   boolean[] flag;
/*      */   private JButton jButton1;
/*      */   private JButton jButton2;
/*      */   private JButton jButton3;
/*      */   private JButton jButton4;
/*      */   private JCheckBox jCheckBox1;
/*      */   private JCheckBox jCheckBox10;
/*      */   private JCheckBox jCheckBox11; private JCheckBox jCheckBox12; private JCheckBox jCheckBox13; private JCheckBox jCheckBox14;
/*   35 */   public ULEC() { initComponents();
/*      */     
/*   37 */     this.ls = new String[40];
/*   38 */     this.cs = new String[40];
/*      */     try
/*      */     {
/*   41 */       java.io.File fi = new java.io.File("list.txt");
/*   42 */       java.io.FileReader fr = new java.io.FileReader(fi);
/*   43 */       BufferedReader br = new BufferedReader(fr);
/*      */       
/*   45 */       int i = 0;
/*   46 */       String line; while (((line = br.readLine()) != null) && (i < 40))
/*      */       {
/*   48 */         this.ls[i] = line;
/*   49 */         this.cs[i] = br.readLine();
/*      */         
/*   51 */         i++;
/*      */       }
/*   53 */       br.close();
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   61 */       int j = 0;
/*      */       
/*   63 */       this.jCheckBox1.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*   64 */       j++;
/*   65 */       if (j < i)
/*   66 */         this.jCheckBox2.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*   67 */       j++;
/*   68 */       if (j < i)
/*   69 */         this.jCheckBox3.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*   70 */       j++;
/*   71 */       if (j < i)
/*   72 */         this.jCheckBox4.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*   73 */       j++;
/*   74 */       if (j < i)
/*   75 */         this.jCheckBox5.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*   76 */       j++;
/*   77 */       if (j < i)
/*   78 */         this.jCheckBox6.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*   79 */       j++;
/*   80 */       if (j < i)
/*   81 */         this.jCheckBox7.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*   82 */       j++;
/*   83 */       if (j < i)
/*   84 */         this.jCheckBox8.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*   85 */       j++;
/*   86 */       if (j < i)
/*   87 */         this.jCheckBox9.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*   88 */       j++;
/*   89 */       if (j < i)
/*   90 */         this.jCheckBox10.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*   91 */       j++;
/*   92 */       if (j < i)
/*   93 */         this.jCheckBox11.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*   94 */       j++;
/*   95 */       if (j < i)
/*   96 */         this.jCheckBox12.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*   97 */       j++;
/*   98 */       if (j < i)
/*   99 */         this.jCheckBox13.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  100 */       j++;
/*  101 */       if (j < i)
/*  102 */         this.jCheckBox14.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  103 */       j++;
/*  104 */       if (j < i)
/*  105 */         this.jCheckBox15.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  106 */       j++;
/*  107 */       if (j < i)
/*  108 */         this.jCheckBox16.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  109 */       j++;
/*  110 */       if (j < i)
/*  111 */         this.jCheckBox17.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  112 */       j++;
/*  113 */       if (j < i)
/*  114 */         this.jCheckBox18.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  115 */       j++;
/*  116 */       if (j < i)
/*  117 */         this.jCheckBox19.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  118 */       j++;
/*  119 */       if (j < i)
/*  120 */         this.jCheckBox20.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  121 */       j++;
/*  122 */       if (j < i)
/*  123 */         this.jCheckBox21.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  124 */       j++;
/*  125 */       if (j < i)
/*  126 */         this.jCheckBox22.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  127 */       j++;
/*  128 */       if (j < i)
/*  129 */         this.jCheckBox23.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  130 */       j++;
/*  131 */       if (j < i)
/*  132 */         this.jCheckBox24.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  133 */       j++;
/*  134 */       if (j < i)
/*  135 */         this.jCheckBox25.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  136 */       j++;
/*  137 */       if (j < i)
/*  138 */         this.jCheckBox26.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  139 */       j++;
/*  140 */       if (j < i)
/*  141 */         this.jCheckBox27.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  142 */       j++;
/*  143 */       if (j < i)
/*  144 */         this.jCheckBox28.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  145 */       j++;
/*  146 */       if (j < i)
/*  147 */         this.jCheckBox29.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  148 */       j++;
/*  149 */       if (j < i)
/*  150 */         this.jCheckBox30.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  151 */       j++;
/*  152 */       if (j < i)
/*  153 */         this.jCheckBox31.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  154 */       j++;
/*  155 */       if (j < i)
/*  156 */         this.jCheckBox32.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  157 */       j++;
/*  158 */       if (j < i)
/*  159 */         this.jCheckBox33.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  160 */       j++;
/*  161 */       if (j < i)
/*  162 */         this.jCheckBox34.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  163 */       j++;
/*  164 */       if (j < i)
/*  165 */         this.jCheckBox35.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  166 */       j++;
/*  167 */       if (j < i)
/*  168 */         this.jCheckBox36.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  169 */       j++;
/*  170 */       if (j < i)
/*  171 */         this.jCheckBox37.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  172 */       j++;
/*  173 */       if (j < i)
/*  174 */         this.jCheckBox38.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  175 */       j++;
/*  176 */       if (j < i)
/*  177 */         this.jCheckBox39.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*  178 */       j++;
/*  179 */       if (j < i) {
/*  180 */         this.jCheckBox40.setText(this.ls[j].substring(0, this.ls[j].lastIndexOf(".")));
/*      */       }
/*      */     }
/*      */     catch (java.io.FileNotFoundException e) {
/*  184 */       javax.swing.JOptionPane.showMessageDialog(null, "'list.txt' file not found\n\nEnsure that the 'list.txt' file exists & is in correct format\n\nFLEC will now exit", "Error", 0);
/*  185 */       System.exit(0);
/*      */     }
/*      */     catch (java.io.IOException e)
/*      */     {
/*  189 */       javax.swing.JOptionPane.showMessageDialog(null, "An IOException occured with the 'list.txt' file\n\nEnsure that the 'list.txt' file is in correct format\n\nFLEC will now exit", "Error", 0);
/*  190 */       System.exit(0);
/*      */     }
/*  192 */     this.flag = new boolean[40];
/*  193 */     for (int i = 0; i < this.flag.length; i++)
/*      */     {
/*  195 */       this.flag[i] = false; } }
/*      */   
/*      */   private JCheckBox jCheckBox15;
/*      */   private JCheckBox jCheckBox16;
/*      */   private JCheckBox jCheckBox17;
/*      */   
/*  201 */   void main1() { String s = this.jTextArea1.getText();
/*  202 */     boolean check = true;
/*  203 */     for (int i = 0; i < this.flag.length; i++)
/*      */     {
/*  205 */       if (this.flag[i] != 0)
/*      */       {
/*  207 */         check = false;
/*      */       }
/*      */     }
/*  210 */     if ("".equals(s))
/*      */     {
/*  212 */       javax.swing.JOptionPane.showMessageDialog(this, "The text area cannot be blank", "Error", 0);
/*      */     }
/*  214 */     else if (check)
/*      */     {
/*  216 */       javax.swing.JOptionPane.showMessageDialog(this, "Select at least one filehosting site", "Error", 0);
/*      */     }
/*      */     else
/*      */     {
/*  220 */       this.unique = new java.util.ArrayList();
/*  221 */       java.io.File file = new java.io.File("C:\\Documents and Settings\\HP_Owner\\Desktop", "ULEC.txt");
/*      */       try
/*      */       {
/*  224 */         java.io.FileWriter fw = new java.io.FileWriter(file, true);
/*  225 */         java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);
/*  226 */         this.outFile = new PrintWriter(bw);
/*      */         
/*  228 */         this.fls = new String[this.ls.length];
/*  229 */         this.pat2 = new java.util.regex.Pattern[this.ls.length];
/*  230 */         this.pat3 = new java.util.regex.Pattern[this.cs.length];
/*      */         
/*  232 */         int n = 0;
/*  233 */         for (int i = 0; i < this.flag.length; i++)
/*      */         {
/*  235 */           if (this.flag[i] != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  240 */             this.fls[n] = this.ls[i];
/*      */             
/*      */ 
/*  243 */             this.pat2[n] = java.util.regex.Pattern.compile(this.ls[i]);
/*      */             
/*      */ 
/*  246 */             this.pat3[n] = java.util.regex.Pattern.compile(this.cs[i]);
/*      */             
/*  248 */             n += 1;
/*      */           }
/*      */         }
/*      */         
/*  252 */         this.fls = ((String[])java.util.Arrays.copyOf(this.fls, n));
/*  253 */         this.pat2 = ((java.util.regex.Pattern[])java.util.Arrays.copyOf(this.pat2, n));
/*  254 */         this.pat3 = ((java.util.regex.Pattern[])java.util.Arrays.copyOf(this.pat3, n));
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  263 */         this.page = 1;
/*  264 */         this.retry = 5;
/*      */         
/*  266 */         this.flag1 = false;
/*      */         
/*  268 */         String[] line = s.split("\n");
/*  269 */         for (int i = 0; i < line.length; i++)
/*      */         {
/*      */ 
/*  272 */           main2(line[i]);
/*      */         }
/*  274 */         this.jTextArea1.setText("");
/*  275 */         this.outFile.println("List of all non-dead & non-redundant links:");
/*  276 */         for (String a : this.unique)
/*      */         {
/*  278 */           this.outFile.println(a);
/*      */         }
/*  280 */         this.outFile.close();
/*  281 */         System.gc();
/*      */       }
/*      */       catch (java.io.IOException e)
/*      */       {
/*  285 */         javax.swing.JOptionPane.showMessageDialog(this, "An IOException occured with the text file", "Error", 0);
/*      */       }
/*      */       catch (NullPointerException e)
/*      */       {
/*  289 */         javax.swing.JOptionPane.showMessageDialog(this, "Please select only valid option(s)", "Error", 0);
/*      */       }
/*      */       finally
/*      */       {
/*  293 */         this.outFile.close();
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   private JCheckBox jCheckBox18;
/*      */   private JCheckBox jCheckBox19;
/*      */   private JCheckBox jCheckBox2;
/*      */   private JCheckBox jCheckBox20;
/*      */   
/*  303 */   void main2(String loc) { try { java.net.URL hp = new java.net.URL(loc);
/*  304 */       java.net.URLConnection hpCon = hp.openConnection();
/*  305 */       int len = hpCon.getContentLength();
/*      */       
/*  307 */       if (len != 0)
/*      */       {
/*      */ 
/*      */ 
/*  311 */         StringBuilder s2 = new StringBuilder();
/*  312 */         StringBuilder s3 = new StringBuilder();
/*  313 */         StringBuilder buf = new StringBuilder("");
/*  314 */         String prefix = "http://";
/*  315 */         this.flag1 = false;
/*      */         
/*  317 */         java.io.InputStream input = hpCon.getInputStream();
/*  318 */         java.io.InputStreamReader in = new java.io.InputStreamReader(input);
/*  319 */         BufferedReader br = new BufferedReader(in);
/*      */         
/*  321 */         this.outFile.println(loc + "\t# " + this.page++);
/*      */         
/*  323 */         java.util.regex.Matcher mat = null;
/*      */         String s1;
/*  325 */         while ((s1 = br.readLine()) != null)
/*      */         {
/*      */ 
/*  328 */           if (!this.flag1)
/*      */           {
/*  330 */             mat = this.pat.matcher(s1);
/*  331 */             if (mat.find())
/*      */             {
/*  333 */               for (int i = mat.end(); i < s1.length(); i++)
/*      */               {
/*  335 */                 char c = s1.charAt(i);
/*  336 */                 if (c == '<') {
/*      */                   break;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*  342 */                 s3 = s3.append(c);
/*      */               }
/*      */               
/*  345 */               this.outFile.println(s3);
/*  346 */               this.flag1 = true;
/*      */             }
/*      */           }
/*      */           else
/*      */           {
/*  351 */             for (int m = 0; m < this.fls.length; m++)
/*      */             {
/*      */ 
/*  354 */               mat = this.pat2[m].matcher(s1);
/*  355 */               while (mat.find())
/*      */               {
/*      */ 
/*  358 */                 for (int i = mat.end(); i < s1.length(); i++)
/*      */                 {
/*      */ 
/*  361 */                   char c = s1.charAt(i);
/*  362 */                   if ((c == ' ') || (c == '<') || (c == '>') || (c == '[') || (c == ']') || (c == '"') || (c == '\''))
/*      */                   {
/*      */ 
/*  365 */                     if (s2.toString().equals(buf.toString()))
/*      */                     {
/*  367 */                       s2 = new StringBuilder();
/*  368 */                       break;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*  374 */                     if (!s2.toString().contains("..."))
/*      */                     {
/*      */ 
/*  377 */                       main3(prefix + this.fls[m] + s2, m);
/*      */                     }
/*      */                     
/*  380 */                     buf = s2;
/*      */                     
/*  382 */                     s2 = new StringBuilder();
/*  383 */                     break;
/*      */                   }
/*      */                   
/*  386 */                   if (i == s1.length() - 1)
/*      */                   {
/*  388 */                     s2 = s2.append(c);
/*      */                     
/*      */ 
/*  391 */                     if (!s2.toString().contains("..."))
/*      */                     {
/*      */ 
/*  394 */                       main3(prefix + this.fls[m] + s2, m);
/*      */                     }
/*      */                     
/*  397 */                     buf = s2;
/*  398 */                     s2 = new StringBuilder();
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*  403 */                     s2 = s2.append(c);
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*  410 */         br.close();
/*  411 */         this.outFile.println();
/*      */       }
/*      */     }
/*      */     catch (java.net.MalformedURLException e)
/*      */     {
/*  416 */       javax.swing.JOptionPane.showMessageDialog(this, "This generated URL is invalid:\n" + loc, "Error", 0);
/*      */     }
/*      */     catch (java.io.IOException e)
/*      */     {
/*  420 */       javax.swing.JOptionPane.showMessageDialog(this, "Unable to access this web-page:\n" + loc + "\n\nThe reasons may include:\n1. No Internet access or\n" + "2. web-page temporarily unavailable or\n3. web-page does not exists", "Error", 0);
/*      */     } }
/*      */   
/*      */   private JCheckBox jCheckBox21;
/*      */   private JCheckBox jCheckBox22;
/*      */   private JCheckBox jCheckBox23;
/*      */   
/*  427 */   void main3(String loc, int m) { if (loc.contains("rapidshare.com/files/"))
/*      */     {
/*      */       try
/*      */       {
/*      */ 
/*  432 */         java.net.URL hp = new java.net.URL(loc);
/*  433 */         java.net.URLConnection hpCon = hp.openConnection();
/*  434 */         int len = hpCon.getContentLength();
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  440 */         java.io.InputStream input = hpCon.getInputStream();
/*  441 */         java.io.InputStreamReader in = new java.io.InputStreamReader(input);
/*  442 */         BufferedReader br = new BufferedReader(in);
/*  443 */         String s1 = br.readLine();
/*      */         
/*  445 */         if (s1.contains("<script"))
/*      */         {
/*      */ 
/*  448 */           if (this.unique.contains(loc))
/*      */           {
/*  450 */             this.outFile.println(loc + " ====>REDUNDANT");
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*  455 */             this.outFile.println(loc);
/*  456 */             this.unique.add(loc);
/*      */           }
/*      */           
/*      */         }
/*  460 */         else if (s1.contains(this.pat3[m].toString()))
/*      */         {
/*      */ 
/*  463 */           this.outFile.println(loc + " ---->DEAD");
/*      */         }
/*      */         
/*      */       }
/*      */       catch (java.net.MalformedURLException e)
/*      */       {
/*  469 */         javax.swing.JOptionPane.showMessageDialog(this, "This RS URL is invalid:\n" + loc, "Error", 0);
/*      */       }
/*      */       catch (java.io.IOException e)
/*      */       {
/*  473 */         this.retry -= 1;
/*      */         
/*  475 */         if (this.retry == 0)
/*      */         {
/*  477 */           this.outFile.println(loc + " *****NOT-CHECKED");
/*  478 */           this.retry = 5;
/*      */         }
/*      */         else
/*      */         {
/*  482 */           main3(loc, m);
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
/*  493 */         java.net.URL hp = new java.net.URL(loc);
/*  494 */         java.net.URLConnection hpCon = hp.openConnection();
/*  495 */         int len = hpCon.getContentLength();
/*      */         
/*  497 */         if (len != 0)
/*      */         {
/*      */ 
/*      */ 
/*  501 */           java.io.InputStream input = hpCon.getInputStream();
/*  502 */           java.io.InputStreamReader in = new java.io.InputStreamReader(input);
/*  503 */           BufferedReader br = new BufferedReader(in);
/*  504 */           boolean alive = false;
/*      */           
/*  506 */           java.util.regex.Matcher mat = null;
/*      */           String s1;
/*  508 */           while ((s1 = br.readLine()) != null)
/*      */           {
/*      */ 
/*  511 */             mat = this.pat3[m].matcher(s1);
/*  512 */             if (mat.find())
/*      */             {
/*      */ 
/*  515 */               if (this.unique.contains(loc))
/*      */               {
/*  517 */                 this.outFile.println(loc + " ====>REDUNDANT");
/*  518 */                 alive = true;
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*  524 */                 this.outFile.println(loc);
/*  525 */                 this.unique.add(loc);
/*  526 */                 alive = true;
/*      */               }
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*  532 */           if (!alive)
/*      */           {
/*  534 */             this.outFile.println(loc + " ---->DEAD");
/*      */           }
/*      */           
/*  537 */           br.close();
/*      */         }
/*      */         
/*      */       }
/*      */       catch (java.net.MalformedURLException e)
/*      */       {
/*  543 */         javax.swing.JOptionPane.showMessageDialog(this, "This filehost URL is invalid:\n" + loc, "Error", 0);
/*      */       }
/*      */       catch (java.io.IOException e)
/*      */       {
/*  547 */         this.retry -= 1;
/*      */         
/*  549 */         if (this.retry == 0)
/*      */         {
/*  551 */           this.outFile.println(loc + " *****NOT-CHECKED");
/*  552 */           this.retry = 5;
/*      */         }
/*      */         else
/*      */         {
/*  556 */           main3(loc, m);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   private JCheckBox jCheckBox24;
/*      */   private JCheckBox jCheckBox25;
/*      */   private JCheckBox jCheckBox26;
/*      */   private JCheckBox jCheckBox27;
/*      */   private JCheckBox jCheckBox28;
/*      */   private JCheckBox jCheckBox29;
/*      */   private JCheckBox jCheckBox3;
/*      */   private JCheckBox jCheckBox30;
/*      */   
/*      */   private void initComponents()
/*      */   {
/*  573 */     this.jButton1 = new JButton();
/*  574 */     this.jButton2 = new JButton();
/*  575 */     this.jButton3 = new JButton();
/*  576 */     this.jSeparator1 = new javax.swing.JSeparator();
/*  577 */     this.jCheckBox1 = new JCheckBox();
/*  578 */     this.jCheckBox2 = new JCheckBox();
/*  579 */     this.jCheckBox3 = new JCheckBox();
/*  580 */     this.jCheckBox4 = new JCheckBox();
/*  581 */     this.jCheckBox5 = new JCheckBox();
/*  582 */     this.jCheckBox6 = new JCheckBox();
/*  583 */     this.jCheckBox7 = new JCheckBox();
/*  584 */     this.jCheckBox8 = new JCheckBox();
/*  585 */     this.jCheckBox9 = new JCheckBox();
/*  586 */     this.jCheckBox10 = new JCheckBox();
/*  587 */     this.jCheckBox11 = new JCheckBox();
/*  588 */     this.jCheckBox12 = new JCheckBox();
/*  589 */     this.jButton4 = new JButton();
/*  590 */     this.jCheckBox13 = new JCheckBox();
/*  591 */     this.jCheckBox14 = new JCheckBox();
/*  592 */     this.jCheckBox15 = new JCheckBox();
/*  593 */     this.jCheckBox16 = new JCheckBox();
/*  594 */     this.jCheckBox17 = new JCheckBox();
/*  595 */     this.jCheckBox18 = new JCheckBox();
/*  596 */     this.jCheckBox19 = new JCheckBox();
/*  597 */     this.jCheckBox20 = new JCheckBox();
/*  598 */     this.jCheckBox21 = new JCheckBox();
/*  599 */     this.jCheckBox22 = new JCheckBox();
/*  600 */     this.jCheckBox23 = new JCheckBox();
/*  601 */     this.jCheckBox24 = new JCheckBox();
/*  602 */     this.jCheckBox25 = new JCheckBox();
/*  603 */     this.jCheckBox26 = new JCheckBox();
/*  604 */     this.jCheckBox27 = new JCheckBox();
/*  605 */     this.jCheckBox28 = new JCheckBox();
/*  606 */     this.jCheckBox29 = new JCheckBox();
/*  607 */     this.jCheckBox30 = new JCheckBox();
/*  608 */     this.jCheckBox31 = new JCheckBox();
/*  609 */     this.jCheckBox32 = new JCheckBox();
/*  610 */     this.jCheckBox33 = new JCheckBox();
/*  611 */     this.jCheckBox34 = new JCheckBox();
/*  612 */     this.jCheckBox35 = new JCheckBox();
/*  613 */     this.jCheckBox36 = new JCheckBox();
/*  614 */     this.jCheckBox37 = new JCheckBox();
/*  615 */     this.jCheckBox38 = new JCheckBox();
/*  616 */     this.jCheckBox39 = new JCheckBox();
/*  617 */     this.jCheckBox40 = new JCheckBox();
/*  618 */     this.jScrollPane1 = new javax.swing.JScrollPane();
/*  619 */     this.jTextArea1 = new javax.swing.JTextArea();
/*      */     
/*  621 */     setDefaultCloseOperation(3);
/*  622 */     setTitle("ULEC (URL Link Extractor & Checker)");
/*      */     
/*  624 */     this.jButton1.setText("Extract");
/*  625 */     this.jButton1.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  627 */         ULEC.this.jButton1ActionPerformed(evt);
/*      */       }
/*      */       
/*  630 */     });
/*  631 */     this.jButton2.setText("Exit");
/*  632 */     this.jButton2.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  634 */         ULEC.this.jButton2ActionPerformed(evt);
/*      */       }
/*      */       
/*  637 */     });
/*  638 */     this.jButton3.setText("Reset");
/*  639 */     this.jButton3.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  641 */         ULEC.this.jButton3ActionPerformed(evt);
/*      */       }
/*      */       
/*  644 */     });
/*  645 */     this.jCheckBox1.setText("jCheckBox1");
/*  646 */     this.jCheckBox1.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  648 */         ULEC.this.jCheckBox1ActionPerformed(evt);
/*      */       }
/*      */       
/*  651 */     });
/*  652 */     this.jCheckBox2.setText("jCheckBox2");
/*  653 */     this.jCheckBox2.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  655 */         ULEC.this.jCheckBox2ActionPerformed(evt);
/*      */       }
/*      */       
/*  658 */     });
/*  659 */     this.jCheckBox3.setText("jCheckBox3");
/*  660 */     this.jCheckBox3.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  662 */         ULEC.this.jCheckBox3ActionPerformed(evt);
/*      */       }
/*      */       
/*  665 */     });
/*  666 */     this.jCheckBox4.setText("jCheckBox4");
/*  667 */     this.jCheckBox4.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  669 */         ULEC.this.jCheckBox4ActionPerformed(evt);
/*      */       }
/*      */       
/*  672 */     });
/*  673 */     this.jCheckBox5.setText("jCheckBox5");
/*  674 */     this.jCheckBox5.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  676 */         ULEC.this.jCheckBox5ActionPerformed(evt);
/*      */       }
/*      */       
/*  679 */     });
/*  680 */     this.jCheckBox6.setText("jCheckBox6");
/*  681 */     this.jCheckBox6.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  683 */         ULEC.this.jCheckBox6ActionPerformed(evt);
/*      */       }
/*      */       
/*  686 */     });
/*  687 */     this.jCheckBox7.setText("jCheckBox7");
/*  688 */     this.jCheckBox7.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  690 */         ULEC.this.jCheckBox7ActionPerformed(evt);
/*      */       }
/*      */       
/*  693 */     });
/*  694 */     this.jCheckBox8.setText("jCheckBox8");
/*  695 */     this.jCheckBox8.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  697 */         ULEC.this.jCheckBox8ActionPerformed(evt);
/*      */       }
/*      */       
/*  700 */     });
/*  701 */     this.jCheckBox9.setText("jCheckBox9");
/*  702 */     this.jCheckBox9.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  704 */         ULEC.this.jCheckBox9ActionPerformed(evt);
/*      */       }
/*      */       
/*  707 */     });
/*  708 */     this.jCheckBox10.setText("jCheckBox10");
/*  709 */     this.jCheckBox10.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  711 */         ULEC.this.jCheckBox10ActionPerformed(evt);
/*      */       }
/*      */       
/*  714 */     });
/*  715 */     this.jCheckBox11.setText("jCheckBox11");
/*  716 */     this.jCheckBox11.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  718 */         ULEC.this.jCheckBox11ActionPerformed(evt);
/*      */       }
/*      */       
/*  721 */     });
/*  722 */     this.jCheckBox12.setText("jCheckBox12");
/*  723 */     this.jCheckBox12.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  725 */         ULEC.this.jCheckBox12ActionPerformed(evt);
/*      */       }
/*      */       
/*  728 */     });
/*  729 */     this.jButton4.setText("About");
/*  730 */     this.jButton4.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  732 */         ULEC.this.jButton4ActionPerformed(evt);
/*      */       }
/*      */       
/*  735 */     });
/*  736 */     this.jCheckBox13.setText("jCheckBox13");
/*  737 */     this.jCheckBox13.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  739 */         ULEC.this.jCheckBox13ActionPerformed(evt);
/*      */       }
/*      */       
/*  742 */     });
/*  743 */     this.jCheckBox14.setText("jCheckBox14");
/*  744 */     this.jCheckBox14.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  746 */         ULEC.this.jCheckBox14ActionPerformed(evt);
/*      */       }
/*      */       
/*  749 */     });
/*  750 */     this.jCheckBox15.setText("jCheckBox15");
/*  751 */     this.jCheckBox15.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  753 */         ULEC.this.jCheckBox15ActionPerformed(evt);
/*      */       }
/*      */       
/*  756 */     });
/*  757 */     this.jCheckBox16.setText("jCheckBox16");
/*  758 */     this.jCheckBox16.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  760 */         ULEC.this.jCheckBox16ActionPerformed(evt);
/*      */       }
/*      */       
/*  763 */     });
/*  764 */     this.jCheckBox17.setText("jCheckBox17");
/*  765 */     this.jCheckBox17.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  767 */         ULEC.this.jCheckBox17ActionPerformed(evt);
/*      */       }
/*      */       
/*  770 */     });
/*  771 */     this.jCheckBox18.setText("jCheckBox18");
/*  772 */     this.jCheckBox18.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  774 */         ULEC.this.jCheckBox18ActionPerformed(evt);
/*      */       }
/*      */       
/*  777 */     });
/*  778 */     this.jCheckBox19.setText("jCheckBox19");
/*  779 */     this.jCheckBox19.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  781 */         ULEC.this.jCheckBox19ActionPerformed(evt);
/*      */       }
/*      */       
/*  784 */     });
/*  785 */     this.jCheckBox20.setText("jCheckBox20");
/*  786 */     this.jCheckBox20.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  788 */         ULEC.this.jCheckBox20ActionPerformed(evt);
/*      */       }
/*      */       
/*  791 */     });
/*  792 */     this.jCheckBox21.setText("jCheckBox21");
/*  793 */     this.jCheckBox21.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  795 */         ULEC.this.jCheckBox21ActionPerformed(evt);
/*      */       }
/*      */       
/*  798 */     });
/*  799 */     this.jCheckBox22.setText("jCheckBox22");
/*  800 */     this.jCheckBox22.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  802 */         ULEC.this.jCheckBox22ActionPerformed(evt);
/*      */       }
/*      */       
/*  805 */     });
/*  806 */     this.jCheckBox23.setText("jCheckBox23");
/*  807 */     this.jCheckBox23.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  809 */         ULEC.this.jCheckBox23ActionPerformed(evt);
/*      */       }
/*      */       
/*  812 */     });
/*  813 */     this.jCheckBox24.setText("jCheckBox24");
/*  814 */     this.jCheckBox24.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  816 */         ULEC.this.jCheckBox24ActionPerformed(evt);
/*      */       }
/*      */       
/*  819 */     });
/*  820 */     this.jCheckBox25.setText("jCheckBox25");
/*  821 */     this.jCheckBox25.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  823 */         ULEC.this.jCheckBox25ActionPerformed(evt);
/*      */       }
/*      */       
/*  826 */     });
/*  827 */     this.jCheckBox26.setText("jCheckBox26");
/*  828 */     this.jCheckBox26.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  830 */         ULEC.this.jCheckBox26ActionPerformed(evt);
/*      */       }
/*      */       
/*  833 */     });
/*  834 */     this.jCheckBox27.setText("jCheckBox27");
/*  835 */     this.jCheckBox27.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  837 */         ULEC.this.jCheckBox27ActionPerformed(evt);
/*      */       }
/*      */       
/*  840 */     });
/*  841 */     this.jCheckBox28.setText("jCheckBox28");
/*  842 */     this.jCheckBox28.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  844 */         ULEC.this.jCheckBox28ActionPerformed(evt);
/*      */       }
/*      */       
/*  847 */     });
/*  848 */     this.jCheckBox29.setText("jCheckBox29");
/*  849 */     this.jCheckBox29.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  851 */         ULEC.this.jCheckBox29ActionPerformed(evt);
/*      */       }
/*      */       
/*  854 */     });
/*  855 */     this.jCheckBox30.setText("jCheckBox30");
/*  856 */     this.jCheckBox30.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  858 */         ULEC.this.jCheckBox30ActionPerformed(evt);
/*      */       }
/*      */       
/*  861 */     });
/*  862 */     this.jCheckBox31.setText("jCheckBox31");
/*  863 */     this.jCheckBox31.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  865 */         ULEC.this.jCheckBox31ActionPerformed(evt);
/*      */       }
/*      */       
/*  868 */     });
/*  869 */     this.jCheckBox32.setText("jCheckBox32");
/*  870 */     this.jCheckBox32.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  872 */         ULEC.this.jCheckBox32ActionPerformed(evt);
/*      */       }
/*      */       
/*  875 */     });
/*  876 */     this.jCheckBox33.setText("jCheckBox33");
/*  877 */     this.jCheckBox33.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  879 */         ULEC.this.jCheckBox33ActionPerformed(evt);
/*      */       }
/*      */       
/*  882 */     });
/*  883 */     this.jCheckBox34.setText("jCheckBox34");
/*  884 */     this.jCheckBox34.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  886 */         ULEC.this.jCheckBox34ActionPerformed(evt);
/*      */       }
/*      */       
/*  889 */     });
/*  890 */     this.jCheckBox35.setText("jCheckBox35");
/*  891 */     this.jCheckBox35.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  893 */         ULEC.this.jCheckBox35ActionPerformed(evt);
/*      */       }
/*      */       
/*  896 */     });
/*  897 */     this.jCheckBox36.setText("jCheckBox36");
/*  898 */     this.jCheckBox36.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  900 */         ULEC.this.jCheckBox36ActionPerformed(evt);
/*      */       }
/*      */       
/*  903 */     });
/*  904 */     this.jCheckBox37.setText("jCheckBox37");
/*  905 */     this.jCheckBox37.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  907 */         ULEC.this.jCheckBox37ActionPerformed(evt);
/*      */       }
/*      */       
/*  910 */     });
/*  911 */     this.jCheckBox38.setText("jCheckBox38");
/*  912 */     this.jCheckBox38.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  914 */         ULEC.this.jCheckBox38ActionPerformed(evt);
/*      */       }
/*      */       
/*  917 */     });
/*  918 */     this.jCheckBox39.setText("jCheckBox39");
/*  919 */     this.jCheckBox39.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  921 */         ULEC.this.jCheckBox39ActionPerformed(evt);
/*      */       }
/*      */       
/*  924 */     });
/*  925 */     this.jCheckBox40.setText("jCheckBox40");
/*  926 */     this.jCheckBox40.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  928 */         ULEC.this.jCheckBox40ActionPerformed(evt);
/*      */       }
/*      */       
/*  931 */     });
/*  932 */     this.jTextArea1.setColumns(20);
/*  933 */     this.jTextArea1.setRows(5);
/*  934 */     this.jScrollPane1.setViewportView(this.jTextArea1);
/*      */     
/*  936 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  937 */     getContentPane().setLayout(layout);
/*  938 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox25).addComponent(this.jCheckBox9).addComponent(this.jCheckBox17).addComponent(this.jCheckBox1).addComponent(this.jCheckBox33)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox26).addComponent(this.jCheckBox10).addComponent(this.jCheckBox18).addComponent(this.jCheckBox2).addComponent(this.jCheckBox34)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox19).addComponent(this.jCheckBox27).addComponent(this.jCheckBox11).addComponent(this.jCheckBox3).addComponent(this.jCheckBox35)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox20).addComponent(this.jCheckBox28).addComponent(this.jCheckBox12).addComponent(this.jCheckBox4).addComponent(this.jCheckBox36)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox21).addComponent(this.jCheckBox29).addComponent(this.jCheckBox13).addComponent(this.jCheckBox5).addComponent(this.jCheckBox37)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox22).addComponent(this.jCheckBox14).addComponent(this.jCheckBox6).addComponent(this.jCheckBox30).addComponent(this.jCheckBox38)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox23).addComponent(this.jCheckBox15).addComponent(this.jCheckBox7).addComponent(this.jCheckBox31).addComponent(this.jCheckBox39)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox24).addComponent(this.jCheckBox16).addComponent(this.jCheckBox8).addComponent(this.jCheckBox32).addComponent(this.jCheckBox40))).addGroup(layout.createSequentialGroup().addGap(96, 96, 96).addComponent(this.jButton1).addGap(18, 18, 18).addComponent(this.jButton2).addGap(18, 18, 18).addComponent(this.jButton3).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 313, 32767).addComponent(this.jButton4).addGap(23, 23, 23)).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jSeparator1, -1, 696, 32767).addContainerGap()).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1, -1, 696, 32767).addContainerGap()));
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
/* 1016 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton1).addComponent(this.jButton2).addComponent(this.jButton3).addComponent(this.jButton4)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jSeparator1, -2, 6, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox1).addComponent(this.jCheckBox2).addComponent(this.jCheckBox3).addComponent(this.jCheckBox4).addComponent(this.jCheckBox5).addComponent(this.jCheckBox6).addComponent(this.jCheckBox7).addComponent(this.jCheckBox8)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox9).addComponent(this.jCheckBox10).addComponent(this.jCheckBox11).addComponent(this.jCheckBox12).addComponent(this.jCheckBox13).addComponent(this.jCheckBox14).addComponent(this.jCheckBox15).addComponent(this.jCheckBox16)).addGap(3, 3, 3).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jCheckBox17).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox18).addComponent(this.jCheckBox19).addComponent(this.jCheckBox20).addComponent(this.jCheckBox21).addComponent(this.jCheckBox22).addComponent(this.jCheckBox23).addComponent(this.jCheckBox24))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox25).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox26).addComponent(this.jCheckBox30).addComponent(this.jCheckBox31).addComponent(this.jCheckBox32).addComponent(this.jCheckBox27).addComponent(this.jCheckBox28).addComponent(this.jCheckBox29))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox33).addComponent(this.jCheckBox35).addComponent(this.jCheckBox36).addComponent(this.jCheckBox38).addComponent(this.jCheckBox37).addComponent(this.jCheckBox39).addComponent(this.jCheckBox40).addComponent(this.jCheckBox34)).addContainerGap()));
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
/* 1084 */     pack(); }
/*      */   
/*      */   private JCheckBox jCheckBox31;
/*      */   
/* 1088 */   private void jButton1ActionPerformed(ActionEvent evt) { main1(); }
/*      */   
/*      */   private JCheckBox jCheckBox32;
/*      */   
/* 1092 */   private void jButton2ActionPerformed(ActionEvent evt) { System.exit(0); }
/*      */   
/*      */   private JCheckBox jCheckBox33;
/*      */   
/* 1096 */   private void jButton3ActionPerformed(ActionEvent evt) { this.jTextArea1.setText(""); }
/*      */   
/*      */   private JCheckBox jCheckBox34;
/*      */   
/* 1100 */   private void jButton4ActionPerformed(ActionEvent evt) { javax.swing.JOptionPane.showMessageDialog(this, "ULEC v1.0 by Ankit Singh\n\nULEC = URL Link Extractor & Checker", "About", 1); }
/*      */   
/*      */   private JCheckBox jCheckBox35;
/*      */   private void jCheckBox1ActionPerformed(ActionEvent evt) {
/* 1104 */     this.flag[0] = (this.flag[0] == 0 ? 1 : false); }
/*      */   
/*      */ 
/*      */   private void jCheckBox2ActionPerformed(ActionEvent evt) {
/* 1108 */     this.flag[1] = (this.flag[1] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox3ActionPerformed(ActionEvent evt) {
/* 1112 */     this.flag[2] = (this.flag[2] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox4ActionPerformed(ActionEvent evt) {
/* 1116 */     this.flag[3] = (this.flag[3] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox5ActionPerformed(ActionEvent evt) {
/* 1120 */     this.flag[4] = (this.flag[4] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox6ActionPerformed(ActionEvent evt) {
/* 1124 */     this.flag[5] = (this.flag[5] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox7ActionPerformed(ActionEvent evt) {
/* 1128 */     this.flag[6] = (this.flag[6] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox8ActionPerformed(ActionEvent evt) {
/* 1132 */     this.flag[7] = (this.flag[7] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox9ActionPerformed(ActionEvent evt) {
/* 1136 */     this.flag[8] = (this.flag[8] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox10ActionPerformed(ActionEvent evt) {
/* 1140 */     this.flag[9] = (this.flag[9] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox11ActionPerformed(ActionEvent evt) {
/* 1144 */     this.flag[10] = (this.flag[10] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox12ActionPerformed(ActionEvent evt) {
/* 1148 */     this.flag[11] = (this.flag[11] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox13ActionPerformed(ActionEvent evt) {
/* 1152 */     this.flag[12] = (this.flag[12] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox14ActionPerformed(ActionEvent evt) {
/* 1156 */     this.flag[13] = (this.flag[13] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox15ActionPerformed(ActionEvent evt) {
/* 1160 */     this.flag[14] = (this.flag[14] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox16ActionPerformed(ActionEvent evt) {
/* 1164 */     this.flag[15] = (this.flag[15] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox17ActionPerformed(ActionEvent evt) {
/* 1168 */     this.flag[16] = (this.flag[16] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox18ActionPerformed(ActionEvent evt) {
/* 1172 */     this.flag[17] = (this.flag[17] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox19ActionPerformed(ActionEvent evt) {
/* 1176 */     this.flag[18] = (this.flag[18] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox20ActionPerformed(ActionEvent evt) {
/* 1180 */     this.flag[19] = (this.flag[19] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox21ActionPerformed(ActionEvent evt) {
/* 1184 */     this.flag[20] = (this.flag[20] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox22ActionPerformed(ActionEvent evt) {
/* 1188 */     this.flag[21] = (this.flag[21] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox23ActionPerformed(ActionEvent evt) {
/* 1192 */     this.flag[22] = (this.flag[22] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox24ActionPerformed(ActionEvent evt) {
/* 1196 */     this.flag[23] = (this.flag[23] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox25ActionPerformed(ActionEvent evt) {
/* 1200 */     this.flag[24] = (this.flag[24] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox26ActionPerformed(ActionEvent evt) {
/* 1204 */     this.flag[25] = (this.flag[25] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox27ActionPerformed(ActionEvent evt) {
/* 1208 */     this.flag[26] = (this.flag[26] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox28ActionPerformed(ActionEvent evt) {
/* 1212 */     this.flag[27] = (this.flag[27] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox29ActionPerformed(ActionEvent evt) {
/* 1216 */     this.flag[28] = (this.flag[28] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox30ActionPerformed(ActionEvent evt) {
/* 1220 */     this.flag[29] = (this.flag[29] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox31ActionPerformed(ActionEvent evt) {
/* 1224 */     this.flag[30] = (this.flag[30] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox32ActionPerformed(ActionEvent evt) {
/* 1228 */     this.flag[31] = (this.flag[31] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox33ActionPerformed(ActionEvent evt) {
/* 1232 */     this.flag[32] = (this.flag[32] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox34ActionPerformed(ActionEvent evt) {
/* 1236 */     this.flag[33] = (this.flag[33] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox35ActionPerformed(ActionEvent evt) {
/* 1240 */     this.flag[34] = (this.flag[34] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox36ActionPerformed(ActionEvent evt) {
/* 1244 */     this.flag[35] = (this.flag[35] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox37ActionPerformed(ActionEvent evt) {
/* 1248 */     this.flag[36] = (this.flag[36] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox38ActionPerformed(ActionEvent evt) {
/* 1252 */     this.flag[37] = (this.flag[37] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox39ActionPerformed(ActionEvent evt) {
/* 1256 */     this.flag[38] = (this.flag[38] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox40ActionPerformed(ActionEvent evt) {
/* 1260 */     this.flag[39] = (this.flag[39] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private JCheckBox jCheckBox36;
/*      */   private JCheckBox jCheckBox37;
/*      */   private JCheckBox jCheckBox38;
/*      */   private JCheckBox jCheckBox39;
/*      */   private JCheckBox jCheckBox4;
/*      */   private JCheckBox jCheckBox40;
/*      */   private JCheckBox jCheckBox5;
/*      */   
/*      */   public static void main(String[] args) {
/*      */     try {
/* 1273 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 1274 */         if ("Windows".equals(info.getName())) {
/* 1275 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 1276 */           break;
/*      */         }
/*      */       }
/*      */     } catch (Exception ex) {
/* 1280 */       javax.swing.JOptionPane.showMessageDialog(null, "L&F error", "Internal error", 0);
/*      */     }
/*      */     
/*      */ 
/*      */ 
/* 1285 */     java.awt.EventQueue.invokeLater(new Runnable()
/*      */     {
/*      */       public void run()
/*      */       {
/* 1289 */         new ULEC().setVisible(true);
/*      */       }
/*      */     });
/*      */   }
/*      */   
/*      */   private JCheckBox jCheckBox6;
/*      */   private JCheckBox jCheckBox7;
/*      */   private JCheckBox jCheckBox8;
/*      */   private JCheckBox jCheckBox9;
/*      */   private javax.swing.JScrollPane jScrollPane1;
/*      */   private javax.swing.JSeparator jSeparator1;
/*      */   private javax.swing.JTextArea jTextArea1;
/*      */ }
