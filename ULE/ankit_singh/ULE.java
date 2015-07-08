/*      */ package ankit_singh;
/*      */ 
/*      */ import java.awt.event.ActionEvent;
/*      */ import java.awt.event.ActionListener;
/*      */ import java.io.PrintWriter;
/*      */ import javax.swing.GroupLayout;
/*      */ import javax.swing.GroupLayout.Alignment;
/*      */ import javax.swing.GroupLayout.ParallelGroup;
/*      */ import javax.swing.GroupLayout.SequentialGroup;
/*      */ import javax.swing.JButton;
/*      */ import javax.swing.JCheckBox;
/*      */ import javax.swing.LayoutStyle.ComponentPlacement;
/*      */ 
/*      */ public class ULE extends javax.swing.JFrame
/*      */ {
/*      */   PrintWriter outFile;
/*      */   boolean flag1;
/*      */   int page;
/*      */   int retry;
/*      */   java.util.ArrayList<String> unique;
/*   21 */   final java.util.regex.Pattern pat = java.util.regex.Pattern.compile("<title>", 2);
/*      */   
/*      */   String[] ls;
/*      */   
/*      */   String[] fls;
/*      */   
/*      */   java.util.regex.Pattern[] pat2;
/*      */   
/*      */   String[] cs;
/*      */   java.util.regex.Pattern[] pat3;
/*      */   boolean[] flag;
/*      */   
/*      */   public ULE()
/*      */   {
/*   35 */     initComponents();
/*      */     
/*   37 */     this.ls = new String[40];
/*   38 */     this.cs = new String[40];
/*      */     try
/*      */     {
/*   41 */       java.io.File fi = new java.io.File("list.txt");
/*   42 */       java.io.FileReader fr = new java.io.FileReader(fi);
/*   43 */       java.io.BufferedReader br = new java.io.BufferedReader(fr);
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
/*  195 */       this.flag[i] = false;
/*      */     }
/*      */   }
/*      */   
/*      */   void main1()
/*      */   {
/*  201 */     String s = this.jTextArea1.getText();
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
/*      */ 
/*      */   void main2(String loc)
/*      */   {
/*      */     try
/*      */     {
/*  303 */       java.net.URL hp = new java.net.URL(loc);
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
/*      */ 
/*  318 */         java.io.InputStream input = hpCon.getInputStream();
/*  319 */         java.io.InputStreamReader in = new java.io.InputStreamReader(input);
/*  320 */         java.io.BufferedReader br = new java.io.BufferedReader(in);
/*      */         
/*  322 */         this.outFile.println(loc + "\t# " + this.page++);
/*      */         
/*  324 */         java.util.regex.Matcher mat = null;
/*      */         String s1;
/*  326 */         while ((s1 = br.readLine()) != null)
/*      */         {
/*      */ 
/*  329 */           if (!this.flag1)
/*      */           {
/*  331 */             mat = this.pat.matcher(s1);
/*  332 */             if (mat.find())
/*      */             {
/*  334 */               for (int i = mat.end(); i < s1.length(); i++)
/*      */               {
/*  336 */                 char c = s1.charAt(i);
/*  337 */                 if (c == '<') {
/*      */                   break;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*  343 */                 s3 = s3.append(c);
/*      */               }
/*      */               
/*  346 */               this.outFile.println(s3);
/*  347 */               this.flag1 = true;
/*      */             }
/*      */           }
/*      */           else
/*      */           {
/*  352 */             for (int m = 0; m < this.fls.length; m++)
/*      */             {
/*      */ 
/*  355 */               mat = this.pat2[m].matcher(s1);
/*  356 */               while (mat.find())
/*      */               {
/*      */ 
/*  359 */                 for (int i = mat.end(); i < s1.length(); i++)
/*      */                 {
/*      */ 
/*  362 */                   char c = s1.charAt(i);
/*  363 */                   if ((c == ' ') || (c == '<') || (c == '>') || (c == '[') || (c == ']') || (c == '"') || (c == '\''))
/*      */                   {
/*      */ 
/*  366 */                     if (s2.toString().equals(buf.toString()))
/*      */                     {
/*  368 */                       s2 = new StringBuilder();
/*  369 */                       break;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*  375 */                     if (!s2.toString().contains("..."))
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*  380 */                       String link = prefix + this.fls[m] + s2;
/*  381 */                       if (this.unique.contains(link))
/*      */                       {
/*  383 */                         this.outFile.println(link + " ====>REDUNDANT");
/*      */ 
/*      */                       }
/*      */                       else
/*      */                       {
/*  388 */                         this.outFile.println(link);
/*  389 */                         this.unique.add(link);
/*      */                       }
/*      */                     }
/*      */                     
/*  393 */                     buf = s2;
/*      */                     
/*  395 */                     s2 = new StringBuilder();
/*  396 */                     break;
/*      */                   }
/*      */                   
/*  399 */                   if (i == s1.length() - 1)
/*      */                   {
/*  401 */                     s2 = s2.append(c);
/*      */                     
/*      */ 
/*  404 */                     if (!s2.toString().contains("..."))
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*  409 */                       String link = prefix + this.fls[m] + s2;
/*  410 */                       if (this.unique.contains(link))
/*      */                       {
/*  412 */                         this.outFile.println(link + " ====>REDUNDANT");
/*      */ 
/*      */                       }
/*      */                       else
/*      */                       {
/*  417 */                         this.outFile.println(link);
/*  418 */                         this.unique.add(link);
/*      */                       }
/*      */                     }
/*      */                     
/*  422 */                     buf = s2;
/*  423 */                     s2 = new StringBuilder();
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*  428 */                     s2 = s2.append(c);
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*  435 */         br.close();
/*  436 */         this.outFile.println();
/*      */       }
/*      */     }
/*      */     catch (java.net.MalformedURLException e)
/*      */     {
/*  441 */       javax.swing.JOptionPane.showMessageDialog(this, "This generated URL is invalid:\n" + loc, "Error", 0);
/*      */     }
/*      */     catch (java.io.IOException e)
/*      */     {
/*  445 */       javax.swing.JOptionPane.showMessageDialog(this, "Unable to access this web-page:\n" + loc + "\n\nThe reasons may include:\n1. No Internet access or\n" + "2. web-page temporarily unavailable or\n3. web-page does not exists", "Error", 0);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   private JButton jButton1;
/*      */   
/*      */ 
/*      */ 
/*      */   private JButton jButton2;
/*      */   
/*      */ 
/*      */ 
/*      */   private JButton jButton3;
/*      */   
/*      */ 
/*      */ 
/*      */   private JButton jButton4;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox1;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox10;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox11;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox12;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox13;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox14;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox15;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox16;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox17;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox18;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox19;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox2;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox20;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox21;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox22;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox23;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox24;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox25;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox26;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox27;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox28;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox29;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox3;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox30;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox31;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox32;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox33;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox34;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox35;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox36;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox37;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox38;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox39;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox4;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox40;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox5;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox6;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox7;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox8;
/*      */   
/*      */ 
/*      */   private JCheckBox jCheckBox9;
/*      */   
/*      */ 
/*      */   private javax.swing.JScrollPane jScrollPane1;
/*      */   
/*      */ 
/*      */   private javax.swing.JSeparator jSeparator1;
/*      */   
/*      */ 
/*      */   private javax.swing.JTextArea jTextArea1;
/*      */   
/*      */ 
/*      */   private void initComponents()
/*      */   {
/*  598 */     this.jButton1 = new JButton();
/*  599 */     this.jButton2 = new JButton();
/*  600 */     this.jButton3 = new JButton();
/*  601 */     this.jSeparator1 = new javax.swing.JSeparator();
/*  602 */     this.jCheckBox1 = new JCheckBox();
/*  603 */     this.jCheckBox2 = new JCheckBox();
/*  604 */     this.jCheckBox3 = new JCheckBox();
/*  605 */     this.jCheckBox4 = new JCheckBox();
/*  606 */     this.jCheckBox5 = new JCheckBox();
/*  607 */     this.jCheckBox6 = new JCheckBox();
/*  608 */     this.jCheckBox7 = new JCheckBox();
/*  609 */     this.jCheckBox8 = new JCheckBox();
/*  610 */     this.jCheckBox9 = new JCheckBox();
/*  611 */     this.jCheckBox10 = new JCheckBox();
/*  612 */     this.jCheckBox11 = new JCheckBox();
/*  613 */     this.jCheckBox12 = new JCheckBox();
/*  614 */     this.jButton4 = new JButton();
/*  615 */     this.jCheckBox13 = new JCheckBox();
/*  616 */     this.jCheckBox14 = new JCheckBox();
/*  617 */     this.jCheckBox15 = new JCheckBox();
/*  618 */     this.jCheckBox16 = new JCheckBox();
/*  619 */     this.jCheckBox17 = new JCheckBox();
/*  620 */     this.jCheckBox18 = new JCheckBox();
/*  621 */     this.jCheckBox19 = new JCheckBox();
/*  622 */     this.jCheckBox20 = new JCheckBox();
/*  623 */     this.jCheckBox21 = new JCheckBox();
/*  624 */     this.jCheckBox22 = new JCheckBox();
/*  625 */     this.jCheckBox23 = new JCheckBox();
/*  626 */     this.jCheckBox24 = new JCheckBox();
/*  627 */     this.jCheckBox25 = new JCheckBox();
/*  628 */     this.jCheckBox26 = new JCheckBox();
/*  629 */     this.jCheckBox27 = new JCheckBox();
/*  630 */     this.jCheckBox28 = new JCheckBox();
/*  631 */     this.jCheckBox29 = new JCheckBox();
/*  632 */     this.jCheckBox30 = new JCheckBox();
/*  633 */     this.jCheckBox31 = new JCheckBox();
/*  634 */     this.jCheckBox32 = new JCheckBox();
/*  635 */     this.jCheckBox33 = new JCheckBox();
/*  636 */     this.jCheckBox34 = new JCheckBox();
/*  637 */     this.jCheckBox35 = new JCheckBox();
/*  638 */     this.jCheckBox36 = new JCheckBox();
/*  639 */     this.jCheckBox37 = new JCheckBox();
/*  640 */     this.jCheckBox38 = new JCheckBox();
/*  641 */     this.jCheckBox39 = new JCheckBox();
/*  642 */     this.jCheckBox40 = new JCheckBox();
/*  643 */     this.jScrollPane1 = new javax.swing.JScrollPane();
/*  644 */     this.jTextArea1 = new javax.swing.JTextArea();
/*      */     
/*  646 */     setDefaultCloseOperation(3);
/*  647 */     setTitle("ULE (URL Link Extractor)");
/*      */     
/*  649 */     this.jButton1.setText("Extract");
/*  650 */     this.jButton1.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  652 */         ULE.this.jButton1ActionPerformed(evt);
/*      */       }
/*      */       
/*  655 */     });
/*  656 */     this.jButton2.setText("Exit");
/*  657 */     this.jButton2.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  659 */         ULE.this.jButton2ActionPerformed(evt);
/*      */       }
/*      */       
/*  662 */     });
/*  663 */     this.jButton3.setText("Reset");
/*  664 */     this.jButton3.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  666 */         ULE.this.jButton3ActionPerformed(evt);
/*      */       }
/*      */       
/*  669 */     });
/*  670 */     this.jCheckBox1.setText("jCheckBox1");
/*  671 */     this.jCheckBox1.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  673 */         ULE.this.jCheckBox1ActionPerformed(evt);
/*      */       }
/*      */       
/*  676 */     });
/*  677 */     this.jCheckBox2.setText("jCheckBox2");
/*  678 */     this.jCheckBox2.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  680 */         ULE.this.jCheckBox2ActionPerformed(evt);
/*      */       }
/*      */       
/*  683 */     });
/*  684 */     this.jCheckBox3.setText("jCheckBox3");
/*  685 */     this.jCheckBox3.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  687 */         ULE.this.jCheckBox3ActionPerformed(evt);
/*      */       }
/*      */       
/*  690 */     });
/*  691 */     this.jCheckBox4.setText("jCheckBox4");
/*  692 */     this.jCheckBox4.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  694 */         ULE.this.jCheckBox4ActionPerformed(evt);
/*      */       }
/*      */       
/*  697 */     });
/*  698 */     this.jCheckBox5.setText("jCheckBox5");
/*  699 */     this.jCheckBox5.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  701 */         ULE.this.jCheckBox5ActionPerformed(evt);
/*      */       }
/*      */       
/*  704 */     });
/*  705 */     this.jCheckBox6.setText("jCheckBox6");
/*  706 */     this.jCheckBox6.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  708 */         ULE.this.jCheckBox6ActionPerformed(evt);
/*      */       }
/*      */       
/*  711 */     });
/*  712 */     this.jCheckBox7.setText("jCheckBox7");
/*  713 */     this.jCheckBox7.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  715 */         ULE.this.jCheckBox7ActionPerformed(evt);
/*      */       }
/*      */       
/*  718 */     });
/*  719 */     this.jCheckBox8.setText("jCheckBox8");
/*  720 */     this.jCheckBox8.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  722 */         ULE.this.jCheckBox8ActionPerformed(evt);
/*      */       }
/*      */       
/*  725 */     });
/*  726 */     this.jCheckBox9.setText("jCheckBox9");
/*  727 */     this.jCheckBox9.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  729 */         ULE.this.jCheckBox9ActionPerformed(evt);
/*      */       }
/*      */       
/*  732 */     });
/*  733 */     this.jCheckBox10.setText("jCheckBox10");
/*  734 */     this.jCheckBox10.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  736 */         ULE.this.jCheckBox10ActionPerformed(evt);
/*      */       }
/*      */       
/*  739 */     });
/*  740 */     this.jCheckBox11.setText("jCheckBox11");
/*  741 */     this.jCheckBox11.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  743 */         ULE.this.jCheckBox11ActionPerformed(evt);
/*      */       }
/*      */       
/*  746 */     });
/*  747 */     this.jCheckBox12.setText("jCheckBox12");
/*  748 */     this.jCheckBox12.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  750 */         ULE.this.jCheckBox12ActionPerformed(evt);
/*      */       }
/*      */       
/*  753 */     });
/*  754 */     this.jButton4.setText("About");
/*  755 */     this.jButton4.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  757 */         ULE.this.jButton4ActionPerformed(evt);
/*      */       }
/*      */       
/*  760 */     });
/*  761 */     this.jCheckBox13.setText("jCheckBox13");
/*  762 */     this.jCheckBox13.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  764 */         ULE.this.jCheckBox13ActionPerformed(evt);
/*      */       }
/*      */       
/*  767 */     });
/*  768 */     this.jCheckBox14.setText("jCheckBox14");
/*  769 */     this.jCheckBox14.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  771 */         ULE.this.jCheckBox14ActionPerformed(evt);
/*      */       }
/*      */       
/*  774 */     });
/*  775 */     this.jCheckBox15.setText("jCheckBox15");
/*  776 */     this.jCheckBox15.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  778 */         ULE.this.jCheckBox15ActionPerformed(evt);
/*      */       }
/*      */       
/*  781 */     });
/*  782 */     this.jCheckBox16.setText("jCheckBox16");
/*  783 */     this.jCheckBox16.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  785 */         ULE.this.jCheckBox16ActionPerformed(evt);
/*      */       }
/*      */       
/*  788 */     });
/*  789 */     this.jCheckBox17.setText("jCheckBox17");
/*  790 */     this.jCheckBox17.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  792 */         ULE.this.jCheckBox17ActionPerformed(evt);
/*      */       }
/*      */       
/*  795 */     });
/*  796 */     this.jCheckBox18.setText("jCheckBox18");
/*  797 */     this.jCheckBox18.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  799 */         ULE.this.jCheckBox18ActionPerformed(evt);
/*      */       }
/*      */       
/*  802 */     });
/*  803 */     this.jCheckBox19.setText("jCheckBox19");
/*  804 */     this.jCheckBox19.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  806 */         ULE.this.jCheckBox19ActionPerformed(evt);
/*      */       }
/*      */       
/*  809 */     });
/*  810 */     this.jCheckBox20.setText("jCheckBox20");
/*  811 */     this.jCheckBox20.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  813 */         ULE.this.jCheckBox20ActionPerformed(evt);
/*      */       }
/*      */       
/*  816 */     });
/*  817 */     this.jCheckBox21.setText("jCheckBox21");
/*  818 */     this.jCheckBox21.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  820 */         ULE.this.jCheckBox21ActionPerformed(evt);
/*      */       }
/*      */       
/*  823 */     });
/*  824 */     this.jCheckBox22.setText("jCheckBox22");
/*  825 */     this.jCheckBox22.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  827 */         ULE.this.jCheckBox22ActionPerformed(evt);
/*      */       }
/*      */       
/*  830 */     });
/*  831 */     this.jCheckBox23.setText("jCheckBox23");
/*  832 */     this.jCheckBox23.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  834 */         ULE.this.jCheckBox23ActionPerformed(evt);
/*      */       }
/*      */       
/*  837 */     });
/*  838 */     this.jCheckBox24.setText("jCheckBox24");
/*  839 */     this.jCheckBox24.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  841 */         ULE.this.jCheckBox24ActionPerformed(evt);
/*      */       }
/*      */       
/*  844 */     });
/*  845 */     this.jCheckBox25.setText("jCheckBox25");
/*  846 */     this.jCheckBox25.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  848 */         ULE.this.jCheckBox25ActionPerformed(evt);
/*      */       }
/*      */       
/*  851 */     });
/*  852 */     this.jCheckBox26.setText("jCheckBox26");
/*  853 */     this.jCheckBox26.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  855 */         ULE.this.jCheckBox26ActionPerformed(evt);
/*      */       }
/*      */       
/*  858 */     });
/*  859 */     this.jCheckBox27.setText("jCheckBox27");
/*  860 */     this.jCheckBox27.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  862 */         ULE.this.jCheckBox27ActionPerformed(evt);
/*      */       }
/*      */       
/*  865 */     });
/*  866 */     this.jCheckBox28.setText("jCheckBox28");
/*  867 */     this.jCheckBox28.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  869 */         ULE.this.jCheckBox28ActionPerformed(evt);
/*      */       }
/*      */       
/*  872 */     });
/*  873 */     this.jCheckBox29.setText("jCheckBox29");
/*  874 */     this.jCheckBox29.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  876 */         ULE.this.jCheckBox29ActionPerformed(evt);
/*      */       }
/*      */       
/*  879 */     });
/*  880 */     this.jCheckBox30.setText("jCheckBox30");
/*  881 */     this.jCheckBox30.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  883 */         ULE.this.jCheckBox30ActionPerformed(evt);
/*      */       }
/*      */       
/*  886 */     });
/*  887 */     this.jCheckBox31.setText("jCheckBox31");
/*  888 */     this.jCheckBox31.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  890 */         ULE.this.jCheckBox31ActionPerformed(evt);
/*      */       }
/*      */       
/*  893 */     });
/*  894 */     this.jCheckBox32.setText("jCheckBox32");
/*  895 */     this.jCheckBox32.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  897 */         ULE.this.jCheckBox32ActionPerformed(evt);
/*      */       }
/*      */       
/*  900 */     });
/*  901 */     this.jCheckBox33.setText("jCheckBox33");
/*  902 */     this.jCheckBox33.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  904 */         ULE.this.jCheckBox33ActionPerformed(evt);
/*      */       }
/*      */       
/*  907 */     });
/*  908 */     this.jCheckBox34.setText("jCheckBox34");
/*  909 */     this.jCheckBox34.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  911 */         ULE.this.jCheckBox34ActionPerformed(evt);
/*      */       }
/*      */       
/*  914 */     });
/*  915 */     this.jCheckBox35.setText("jCheckBox35");
/*  916 */     this.jCheckBox35.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  918 */         ULE.this.jCheckBox35ActionPerformed(evt);
/*      */       }
/*      */       
/*  921 */     });
/*  922 */     this.jCheckBox36.setText("jCheckBox36");
/*  923 */     this.jCheckBox36.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  925 */         ULE.this.jCheckBox36ActionPerformed(evt);
/*      */       }
/*      */       
/*  928 */     });
/*  929 */     this.jCheckBox37.setText("jCheckBox37");
/*  930 */     this.jCheckBox37.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  932 */         ULE.this.jCheckBox37ActionPerformed(evt);
/*      */       }
/*      */       
/*  935 */     });
/*  936 */     this.jCheckBox38.setText("jCheckBox38");
/*  937 */     this.jCheckBox38.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  939 */         ULE.this.jCheckBox38ActionPerformed(evt);
/*      */       }
/*      */       
/*  942 */     });
/*  943 */     this.jCheckBox39.setText("jCheckBox39");
/*  944 */     this.jCheckBox39.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  946 */         ULE.this.jCheckBox39ActionPerformed(evt);
/*      */       }
/*      */       
/*  949 */     });
/*  950 */     this.jCheckBox40.setText("jCheckBox40");
/*  951 */     this.jCheckBox40.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  953 */         ULE.this.jCheckBox40ActionPerformed(evt);
/*      */       }
/*      */       
/*  956 */     });
/*  957 */     this.jTextArea1.setColumns(20);
/*  958 */     this.jTextArea1.setRows(5);
/*  959 */     this.jScrollPane1.setViewportView(this.jTextArea1);
/*      */     
/*  961 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  962 */     getContentPane().setLayout(layout);
/*  963 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox25).addComponent(this.jCheckBox9).addComponent(this.jCheckBox17).addComponent(this.jCheckBox1).addComponent(this.jCheckBox33)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox26).addComponent(this.jCheckBox10).addComponent(this.jCheckBox18).addComponent(this.jCheckBox2).addComponent(this.jCheckBox34)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox19).addComponent(this.jCheckBox27).addComponent(this.jCheckBox11).addComponent(this.jCheckBox3).addComponent(this.jCheckBox35)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox20).addComponent(this.jCheckBox28).addComponent(this.jCheckBox12).addComponent(this.jCheckBox4).addComponent(this.jCheckBox36)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox21).addComponent(this.jCheckBox29).addComponent(this.jCheckBox13).addComponent(this.jCheckBox5).addComponent(this.jCheckBox37)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox22).addComponent(this.jCheckBox14).addComponent(this.jCheckBox6).addComponent(this.jCheckBox30).addComponent(this.jCheckBox38)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox23).addComponent(this.jCheckBox15).addComponent(this.jCheckBox7).addComponent(this.jCheckBox31).addComponent(this.jCheckBox39)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox24).addComponent(this.jCheckBox16).addComponent(this.jCheckBox8).addComponent(this.jCheckBox32).addComponent(this.jCheckBox40))).addGroup(layout.createSequentialGroup().addGap(96, 96, 96).addComponent(this.jButton1).addGap(18, 18, 18).addComponent(this.jButton2).addGap(18, 18, 18).addComponent(this.jButton3).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 310, 32767).addComponent(this.jButton4).addGap(23, 23, 23)).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jSeparator1, -1, 693, 32767).addContainerGap()).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1, -1, 693, 32767).addContainerGap()));
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
/* 1041 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton1).addComponent(this.jButton2).addComponent(this.jButton3).addComponent(this.jButton4)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jSeparator1, -2, 6, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox1).addComponent(this.jCheckBox2).addComponent(this.jCheckBox3).addComponent(this.jCheckBox4).addComponent(this.jCheckBox5).addComponent(this.jCheckBox6).addComponent(this.jCheckBox7).addComponent(this.jCheckBox8)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox9).addComponent(this.jCheckBox10).addComponent(this.jCheckBox11).addComponent(this.jCheckBox12).addComponent(this.jCheckBox13).addComponent(this.jCheckBox14).addComponent(this.jCheckBox15).addComponent(this.jCheckBox16)).addGap(3, 3, 3).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jCheckBox17).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox18).addComponent(this.jCheckBox19).addComponent(this.jCheckBox20).addComponent(this.jCheckBox21).addComponent(this.jCheckBox22).addComponent(this.jCheckBox23).addComponent(this.jCheckBox24))).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox25).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox26).addComponent(this.jCheckBox30).addComponent(this.jCheckBox31).addComponent(this.jCheckBox32).addComponent(this.jCheckBox27).addComponent(this.jCheckBox28).addComponent(this.jCheckBox29))).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox33).addComponent(this.jCheckBox35).addComponent(this.jCheckBox36).addComponent(this.jCheckBox38).addComponent(this.jCheckBox37).addComponent(this.jCheckBox39).addComponent(this.jCheckBox40).addComponent(this.jCheckBox34)).addContainerGap()));
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
/* 1109 */     pack();
/*      */   }
/*      */   
/*      */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 1113 */     main1();
/*      */   }
/*      */   
/*      */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 1117 */     System.exit(0);
/*      */   }
/*      */   
/*      */   private void jButton3ActionPerformed(ActionEvent evt) {
/* 1121 */     this.jTextArea1.setText("");
/*      */   }
/*      */   
/*      */   private void jButton4ActionPerformed(ActionEvent evt) {
/* 1125 */     javax.swing.JOptionPane.showMessageDialog(this, "ULEC v1.0 by Ankit Singh\n\nULEC = URL Link Extractor & Checker", "About", 1);
/*      */   }
/*      */   
/*      */   private void jCheckBox1ActionPerformed(ActionEvent evt) {
/* 1129 */     this.flag[0] = (this.flag[0] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox2ActionPerformed(ActionEvent evt) {
/* 1133 */     this.flag[1] = (this.flag[1] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox3ActionPerformed(ActionEvent evt) {
/* 1137 */     this.flag[2] = (this.flag[2] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox4ActionPerformed(ActionEvent evt) {
/* 1141 */     this.flag[3] = (this.flag[3] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox5ActionPerformed(ActionEvent evt) {
/* 1145 */     this.flag[4] = (this.flag[4] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox6ActionPerformed(ActionEvent evt) {
/* 1149 */     this.flag[5] = (this.flag[5] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox7ActionPerformed(ActionEvent evt) {
/* 1153 */     this.flag[6] = (this.flag[6] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox8ActionPerformed(ActionEvent evt) {
/* 1157 */     this.flag[7] = (this.flag[7] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox9ActionPerformed(ActionEvent evt) {
/* 1161 */     this.flag[8] = (this.flag[8] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox10ActionPerformed(ActionEvent evt) {
/* 1165 */     this.flag[9] = (this.flag[9] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox11ActionPerformed(ActionEvent evt) {
/* 1169 */     this.flag[10] = (this.flag[10] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox12ActionPerformed(ActionEvent evt) {
/* 1173 */     this.flag[11] = (this.flag[11] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox13ActionPerformed(ActionEvent evt) {
/* 1177 */     this.flag[12] = (this.flag[12] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox14ActionPerformed(ActionEvent evt) {
/* 1181 */     this.flag[13] = (this.flag[13] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox15ActionPerformed(ActionEvent evt) {
/* 1185 */     this.flag[14] = (this.flag[14] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox16ActionPerformed(ActionEvent evt) {
/* 1189 */     this.flag[15] = (this.flag[15] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox17ActionPerformed(ActionEvent evt) {
/* 1193 */     this.flag[16] = (this.flag[16] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox18ActionPerformed(ActionEvent evt) {
/* 1197 */     this.flag[17] = (this.flag[17] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox19ActionPerformed(ActionEvent evt) {
/* 1201 */     this.flag[18] = (this.flag[18] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox20ActionPerformed(ActionEvent evt) {
/* 1205 */     this.flag[19] = (this.flag[19] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox21ActionPerformed(ActionEvent evt) {
/* 1209 */     this.flag[20] = (this.flag[20] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox22ActionPerformed(ActionEvent evt) {
/* 1213 */     this.flag[21] = (this.flag[21] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox23ActionPerformed(ActionEvent evt) {
/* 1217 */     this.flag[22] = (this.flag[22] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox24ActionPerformed(ActionEvent evt) {
/* 1221 */     this.flag[23] = (this.flag[23] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox25ActionPerformed(ActionEvent evt) {
/* 1225 */     this.flag[24] = (this.flag[24] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox26ActionPerformed(ActionEvent evt) {
/* 1229 */     this.flag[25] = (this.flag[25] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox27ActionPerformed(ActionEvent evt) {
/* 1233 */     this.flag[26] = (this.flag[26] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox28ActionPerformed(ActionEvent evt) {
/* 1237 */     this.flag[27] = (this.flag[27] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox29ActionPerformed(ActionEvent evt) {
/* 1241 */     this.flag[28] = (this.flag[28] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox30ActionPerformed(ActionEvent evt) {
/* 1245 */     this.flag[29] = (this.flag[29] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox31ActionPerformed(ActionEvent evt) {
/* 1249 */     this.flag[30] = (this.flag[30] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox32ActionPerformed(ActionEvent evt) {
/* 1253 */     this.flag[31] = (this.flag[31] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox33ActionPerformed(ActionEvent evt) {
/* 1257 */     this.flag[32] = (this.flag[32] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox34ActionPerformed(ActionEvent evt) {
/* 1261 */     this.flag[33] = (this.flag[33] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox35ActionPerformed(ActionEvent evt) {
/* 1265 */     this.flag[34] = (this.flag[34] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox36ActionPerformed(ActionEvent evt) {
/* 1269 */     this.flag[35] = (this.flag[35] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox37ActionPerformed(ActionEvent evt) {
/* 1273 */     this.flag[36] = (this.flag[36] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox38ActionPerformed(ActionEvent evt) {
/* 1277 */     this.flag[37] = (this.flag[37] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox39ActionPerformed(ActionEvent evt) {
/* 1281 */     this.flag[38] = (this.flag[38] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox40ActionPerformed(ActionEvent evt) {
/* 1285 */     this.flag[39] = (this.flag[39] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static void main(String[] args)
/*      */   {
/*      */     try
/*      */     {
/* 1298 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 1299 */         if ("Windows".equals(info.getName())) {
/* 1300 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 1301 */           break;
/*      */         }
/*      */       }
/*      */     } catch (Exception ex) {
/* 1305 */       javax.swing.JOptionPane.showMessageDialog(null, "L&F error", "Internal error", 0);
/*      */     }
/*      */     
/*      */ 
/*      */ 
/* 1310 */     java.awt.EventQueue.invokeLater(new Runnable()
/*      */     {
/*      */       public void run()
/*      */       {
/* 1314 */         new ULE().setVisible(true);
/*      */       }
/*      */     });
/*      */   }
/*      */ }
