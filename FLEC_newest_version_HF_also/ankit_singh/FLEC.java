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
/*      */ import javax.swing.JCheckBox;
/*      */ import javax.swing.JTextField;
/*      */ 
/*      */ public class FLEC extends javax.swing.JFrame
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
/*      */   String[] cs;
/*      */   java.util.regex.Pattern[] pat3;
/*      */   boolean[] flag;
/*      */   private javax.swing.JButton jButton1;
/*      */   
/*      */   public FLEC()
/*      */   {
/*   35 */     initComponents();
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
/*  195 */       this.flag[i] = false;
/*      */     }
/*      */   }
/*      */   
/*      */   void main1()
/*      */   {
/*  201 */     String f = this.jTextField1.getText();
/*  202 */     StringBuilder s = new StringBuilder(this.jTextField2.getText());
/*  203 */     StringBuilder t = new StringBuilder(this.jTextField3.getText());
/*  204 */     String l = this.jTextField4.getText();
/*      */     
/*  206 */     boolean check = true;
/*  207 */     for (int i = 0; i < this.flag.length; i++)
/*      */     {
/*  209 */       if (this.flag[i] != 0)
/*      */       {
/*  211 */         check = false;
/*      */       }
/*      */     }
/*  214 */     if (("".equals(f)) || ("".contentEquals(s)) || ("".contentEquals(t)) || ("".equals(l)))
/*      */     {
/*  216 */       javax.swing.JOptionPane.showMessageDialog(this, "None of the text-fields can be blank", "Error", 0);
/*      */     }
/*  218 */     else if (s.length() != t.length())
/*      */     {
/*  220 */       javax.swing.JOptionPane.showMessageDialog(this, "The length of Second & Third page need to be equal", "Error", 0);
/*      */     }
/*  222 */     else if (check)
/*      */     {
/*  224 */       javax.swing.JOptionPane.showMessageDialog(this, "Select at least one filehosting site", "Error", 0);
/*      */     }
/*      */     else
/*      */     {
/*  228 */       this.unique = new java.util.ArrayList();
/*  229 */       String title = Title(f);
/*  230 */       java.io.File file = new java.io.File("C:\\Documents and Settings\\HP_Owner\\Desktop", title + ".txt");
/*      */       try
/*      */       {
/*  233 */         java.io.FileWriter fw = new java.io.FileWriter(file, true);
/*  234 */         java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);
/*  235 */         this.outFile = new PrintWriter(bw);
/*  236 */         this.outFile.println(title);
/*  237 */         this.outFile.println();
/*      */         
/*  239 */         this.fls = new String[this.ls.length];
/*  240 */         this.pat2 = new java.util.regex.Pattern[this.ls.length];
/*  241 */         this.pat3 = new java.util.regex.Pattern[this.cs.length];
/*      */         
/*  243 */         int n = 0;
/*  244 */         for (int i = 0; i < this.flag.length; i++)
/*      */         {
/*  246 */           if (this.flag[i] != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  251 */             this.fls[n] = this.ls[i];
/*      */             
/*      */ 
/*  254 */             this.pat2[n] = java.util.regex.Pattern.compile(this.ls[i]);
/*      */             
/*      */ 
/*  257 */             this.pat3[n] = java.util.regex.Pattern.compile(this.cs[i]);
/*      */             
/*  259 */             n += 1;
/*      */           }
/*      */         }
/*      */         
/*  263 */         this.fls = ((String[])java.util.Arrays.copyOf(this.fls, n));
/*  264 */         this.pat2 = ((java.util.regex.Pattern[])java.util.Arrays.copyOf(this.pat2, n));
/*  265 */         this.pat3 = ((java.util.regex.Pattern[])java.util.Arrays.copyOf(this.pat3, n));
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  274 */         this.page = 1;
/*  275 */         this.retry = 5;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  280 */         int len = s.length();
/*  281 */         int j = 0;int k = 0;
/*  282 */         if (s.length() == t.length())
/*      */         {
/*  284 */           for (int i = 0; i < len; i++)
/*      */           {
/*      */ 
/*  287 */             if (s.codePointAt(j) == t.codePointAt(j))
/*      */             {
/*  289 */               s.deleteCharAt(j);
/*  290 */               t.deleteCharAt(j);
/*      */             }
/*      */             else
/*      */             {
/*  294 */               j++;
/*      */             }
/*      */             
/*  297 */             if ((j == 1) && (k == 0))
/*      */             {
/*  299 */               k = i;
/*      */             }
/*      */           }
/*      */         }
/*      */         
/*  304 */         int c = 0;
/*      */         try
/*      */         {
/*  307 */           c = Integer.parseInt(t.toString()) - Integer.parseInt(s.toString());
/*      */         }
/*      */         catch (NumberFormatException e)
/*      */         {
/*  311 */           javax.swing.JOptionPane.showMessageDialog(this, "Unable to generate forum-page-url counter due to invalid input", "Error", 0);
/*  312 */           System.exit(0);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  318 */         this.flag1 = false;
/*  319 */         main2(f);
/*  320 */         j = k + j;
/*  321 */         String txt2 = this.jTextField2.getText();
/*  322 */         int i = c;
/*  323 */         if (c == 1)
/*      */         {
/*  325 */           i += c;
/*      */         }
/*  327 */         while (!l.contentEquals(s))
/*      */         {
/*  329 */           s = new StringBuilder(txt2);
/*  330 */           s.replace(k, j, Integer.toString(i));
/*  331 */           main2(s.toString());
/*  332 */           i += c;
/*      */         }
/*  334 */         this.jTextField1.setText("");
/*  335 */         this.jTextField2.setText("");
/*  336 */         this.jTextField3.setText("");
/*  337 */         this.jTextField4.setText("");
/*  338 */         this.outFile.println("List of all non-dead & non-redundant links:");
/*  339 */         for (String a : this.unique)
/*      */         {
/*  341 */           this.outFile.println(a);
/*      */         }
/*  343 */         this.outFile.close();
/*  344 */         System.gc();
/*      */       }
/*      */       catch (java.io.IOException e)
/*      */       {
/*  348 */         javax.swing.JOptionPane.showMessageDialog(this, "An IOException occured with the text file", "Error", 0);
/*      */       }
/*      */       catch (NullPointerException e)
/*      */       {
/*  352 */         javax.swing.JOptionPane.showMessageDialog(this, "Please select only valid option(s)", "Error", 0);
/*      */       }
/*      */       finally
/*      */       {
/*  356 */         this.outFile.close();
/*      */       } } }
/*      */   
/*      */   private javax.swing.JButton jButton2;
/*      */   private javax.swing.JButton jButton3;
/*      */   private javax.swing.JButton jButton4;
/*      */   private JCheckBox jCheckBox1;
/*      */   private JCheckBox jCheckBox10;
/*      */   private JCheckBox jCheckBox11;
/*      */   private JCheckBox jCheckBox12;
/*  366 */   void main2(String loc) { try { java.net.URL hp = new java.net.URL(loc);
/*  367 */       java.net.URLConnection hpCon = hp.openConnection();
/*  368 */       int len = hpCon.getContentLength();
/*      */       
/*  370 */       if (len != 0)
/*      */       {
/*      */ 
/*      */ 
/*  374 */         StringBuilder s2 = new StringBuilder();
/*  375 */         StringBuilder buf = new StringBuilder("");
/*  376 */         String prefix = "http://";
/*  377 */         this.flag1 = false;
/*      */         
/*  379 */         java.io.InputStream input = hpCon.getInputStream();
/*  380 */         java.io.InputStreamReader in = new java.io.InputStreamReader(input);
/*  381 */         BufferedReader br = new BufferedReader(in);
/*      */         
/*  383 */         this.outFile.println(loc + "\tPg " + this.page++);
/*      */         
/*  385 */         java.util.regex.Matcher mat = null;
/*      */         String s1;
/*  387 */         while ((s1 = br.readLine()) != null)
/*      */         {
/*      */ 
/*  390 */           if (!this.flag1)
/*      */           {
/*  392 */             mat = this.pat.matcher(s1);
/*  393 */             if (mat.find())
/*      */             {
/*  395 */               this.flag1 = true;
/*      */             }
/*      */           }
/*      */           else
/*      */           {
/*  400 */             for (int m = 0; m < this.fls.length; m++)
/*      */             {
/*      */ 
/*  403 */               mat = this.pat2[m].matcher(s1);
/*  404 */               while (mat.find())
/*      */               {
/*      */ 
/*  407 */                 for (int i = mat.end(); i < s1.length(); i++)
/*      */                 {
/*      */ 
/*  410 */                   char c = s1.charAt(i);
/*  411 */                   if ((c == ' ') || (c == '<') || (c == '>') || (c == '[') || (c == ']') || (c == '"') || (c == '\''))
/*      */                   {
/*      */ 
/*  414 */                     if (s2.toString().equals(buf.toString()))
/*      */                     {
/*  416 */                       s2 = new StringBuilder();
/*  417 */                       break;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*  423 */                     if (!s2.toString().contains("..."))
/*      */                     {
/*      */ 
/*  426 */                       main3(prefix + this.fls[m] + s2, m);
/*      */                     }
/*      */                     
/*  429 */                     buf = s2;
/*      */                     
/*  431 */                     s2 = new StringBuilder();
/*  432 */                     break;
/*      */                   }
/*      */                   
/*  435 */                   if (i == s1.length() - 1)
/*      */                   {
/*  437 */                     s2 = s2.append(c);
/*      */                     
/*      */ 
/*  440 */                     if (!s2.toString().contains("..."))
/*      */                     {
/*      */ 
/*  443 */                       main3(prefix + this.fls[m] + s2, m);
/*      */                     }
/*      */                     
/*  446 */                     buf = s2;
/*  447 */                     s2 = new StringBuilder();
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*  452 */                     s2 = s2.append(c);
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*  459 */         br.close();
/*  460 */         this.outFile.println();
/*      */       }
/*      */     }
/*      */     catch (java.net.MalformedURLException e)
/*      */     {
/*  465 */       javax.swing.JOptionPane.showMessageDialog(this, "This generated URL is invalid:\n" + loc, "Error", 0);
/*      */     }
/*      */     catch (java.io.IOException e)
/*      */     {
/*  469 */       javax.swing.JOptionPane.showMessageDialog(this, "Unable to access this web-page:\n" + loc + "\n\nThe reasons may include:\n1. No Internet access or\n" + "2. web-page temporarily unavailable or\n3. web-page does not exists", "Error", 0);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   void main3(String loc, int m)
/*      */   {
/*  476 */     if (loc.contains("rapidshare.com/files/"))
/*      */     {
/*      */       try
/*      */       {
/*      */ 
/*  481 */         java.net.URL hp = new java.net.URL(loc);
/*  482 */         java.net.URLConnection hpCon = hp.openConnection();
/*  483 */         int len = hpCon.getContentLength();
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  489 */         java.io.InputStream input = hpCon.getInputStream();
/*  490 */         java.io.InputStreamReader in = new java.io.InputStreamReader(input);
/*  491 */         BufferedReader br = new BufferedReader(in);
/*  492 */         String s1 = br.readLine();
/*      */         
/*  494 */         if (s1.contains("<script"))
/*      */         {
/*      */ 
/*  497 */           if (this.unique.contains(loc))
/*      */           {
/*  499 */             this.outFile.println(loc + " ====>REDUNDANT");
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*  504 */             this.outFile.println(loc);
/*  505 */             this.unique.add(loc);
/*      */           }
/*      */           
/*      */         }
/*  509 */         else if (s1.contains(this.pat3[m].toString()))
/*      */         {
/*      */ 
/*  512 */           this.outFile.println(loc + " ---->DEAD");
/*      */         }
/*      */         
/*      */       }
/*      */       catch (java.net.MalformedURLException e)
/*      */       {
/*  518 */         javax.swing.JOptionPane.showMessageDialog(this, "This RS URL is invalid:\n" + loc, "Error", 0);
/*      */       }
/*      */       catch (java.io.IOException e)
/*      */       {
/*  522 */         this.retry -= 1;
/*      */         
/*  524 */         if (this.retry == 0)
/*      */         {
/*  526 */           this.outFile.println(loc + " *****NOT-CHECKED");
/*  527 */           this.retry = 5;
/*      */         }
/*      */         else
/*      */         {
/*  531 */           main3(loc, m);
/*      */ 
/*      */         }
/*      */         
/*      */       }
/*      */       
/*      */     }
/*  538 */     else if (loc.contains("hotfile.com/dl/"))
/*      */     {
/*      */       try
/*      */       {
/*      */ 
/*  543 */         java.net.URL hp = new java.net.URL(loc);
/*  544 */         java.net.URLConnection hpCon = hp.openConnection();
/*  545 */         int len = hpCon.getContentLength();
/*      */         
/*  547 */         if (len != 0)
/*      */         {
/*      */ 
/*      */ 
/*  551 */           java.io.InputStream input = hpCon.getInputStream();
/*  552 */           java.io.InputStreamReader in = new java.io.InputStreamReader(input);
/*  553 */           BufferedReader br = new BufferedReader(in);
/*  554 */           boolean alive = false;
/*      */           
/*  556 */           java.util.regex.Matcher mat = null;
/*      */           String s1;
/*  558 */           while ((s1 = br.readLine()) != null)
/*      */           {
/*      */ 
/*  561 */             mat = this.pat3[m].matcher(s1);
/*  562 */             if (mat.find())
/*      */             {
/*      */ 
/*  565 */               if (this.unique.contains(loc))
/*      */               {
/*  567 */                 this.outFile.println(loc + " ====>REDUNDANT");
/*  568 */                 alive = true;
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*  574 */                 this.outFile.println(loc);
/*  575 */                 this.unique.add(loc);
/*  576 */                 alive = true;
/*      */               }
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*  582 */           if (!alive)
/*      */           {
/*  584 */             this.outFile.println(loc + " ---->DEAD FOR SURE");
/*      */           }
/*      */           
/*  587 */           br.close();
/*      */         }
/*      */         
/*      */       }
/*      */       catch (java.net.MalformedURLException e)
/*      */       {
/*  593 */         javax.swing.JOptionPane.showMessageDialog(this, "This HF URL is invalid:\n" + loc, "Error", 0);
/*      */ 
/*      */       }
/*      */       catch (java.io.IOException e)
/*      */       {
/*  598 */         this.outFile.println(loc + " ---->DEAD");
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
/*  619 */         java.net.URL hp = new java.net.URL(loc);
/*  620 */         java.net.URLConnection hpCon = hp.openConnection();
/*  621 */         int len = hpCon.getContentLength();
/*      */         
/*  623 */         if (len != 0)
/*      */         {
/*      */ 
/*      */ 
/*  627 */           java.io.InputStream input = hpCon.getInputStream();
/*  628 */           java.io.InputStreamReader in = new java.io.InputStreamReader(input);
/*  629 */           BufferedReader br = new BufferedReader(in);
/*  630 */           boolean alive = false;
/*      */           
/*  632 */           java.util.regex.Matcher mat = null;
/*      */           String s1;
/*  634 */           while ((s1 = br.readLine()) != null)
/*      */           {
/*      */ 
/*  637 */             mat = this.pat3[m].matcher(s1);
/*  638 */             if (mat.find())
/*      */             {
/*      */ 
/*  641 */               if (this.unique.contains(loc))
/*      */               {
/*  643 */                 this.outFile.println(loc + " ====>REDUNDANT");
/*  644 */                 alive = true;
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*  650 */                 this.outFile.println(loc);
/*  651 */                 this.unique.add(loc);
/*  652 */                 alive = true;
/*      */               }
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*  658 */           if (!alive)
/*      */           {
/*  660 */             this.outFile.println(loc + " ---->DEAD");
/*      */           }
/*      */           
/*  663 */           br.close();
/*      */         }
/*      */         
/*      */       }
/*      */       catch (java.net.MalformedURLException e)
/*      */       {
/*  669 */         javax.swing.JOptionPane.showMessageDialog(this, "This filehost URL is invalid:\n" + loc, "Error", 0);
/*      */       }
/*      */       catch (java.io.IOException e)
/*      */       {
/*  673 */         this.retry -= 1;
/*      */         
/*  675 */         if (this.retry == 0)
/*      */         {
/*  677 */           this.outFile.println(loc + " *****NOT-CHECKED");
/*  678 */           this.retry = 5;
/*      */         }
/*      */         else
/*      */         {
/*  682 */           main3(loc, m);
/*      */         }
/*      */       } }
/*      */   }
/*      */   
/*      */   private JCheckBox jCheckBox13;
/*      */   private JCheckBox jCheckBox14;
/*      */   private JCheckBox jCheckBox15;
/*      */   private JCheckBox jCheckBox16;
/*      */   private JCheckBox jCheckBox17;
/*      */   private JCheckBox jCheckBox18;
/*      */   private JCheckBox jCheckBox19;
/*      */   
/*      */   String Title(String loc) {
/*  696 */     try { java.net.URL hp = new java.net.URL(loc);
/*  697 */       java.net.URLConnection hpCon = hp.openConnection();
/*      */       
/*      */ 
/*      */ 
/*  701 */       StringBuilder s3 = new StringBuilder("");
/*      */       
/*  703 */       java.io.InputStream input = hpCon.getInputStream();
/*  704 */       java.io.InputStreamReader in = new java.io.InputStreamReader(input);
/*  705 */       BufferedReader br = new BufferedReader(in);
/*      */       
/*  707 */       java.util.regex.Matcher mat = null;
/*      */       String s1;
/*  709 */       while ((s1 = br.readLine()) != null)
/*      */       {
/*  711 */         mat = this.pat.matcher(s1);
/*  712 */         if (mat.find())
/*      */         {
/*  714 */           for (int i = mat.end(); i < s1.length(); i++)
/*      */           {
/*  716 */             char c = s1.charAt(i);
/*  717 */             if (c == '<') {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*  723 */             s3 = s3.append(c);
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*  728 */       String s = s3.toString().trim().replace('*', '-');
/*  729 */       s = s.replace('|', '-');
/*  730 */       s = s.replace('\'', '-');
/*  731 */       s = s.replace(':', '-');
/*  732 */       s = s.replace('"', '-');
/*  733 */       s = s.replace('<', '-');
/*  734 */       s = s.replace('>', '-');
/*  735 */       s = s.replace('?', '-');
/*  736 */       return s.replace('/', '-');
/*      */ 
/*      */     }
/*      */     catch (java.net.MalformedURLException e)
/*      */     {
/*  741 */       javax.swing.JOptionPane.showMessageDialog(this, "The 'First Page' URL is invalid", "Error", 0);
/*      */     }
/*      */     catch (java.io.IOException e)
/*      */     {
/*  745 */       javax.swing.JOptionPane.showMessageDialog(this, "Unable to access 'First Page' due to:\n1. No Internet access or\n2. 'First Page' temporarily unavailable or\n3. 'First Page' does not exists", "Error", 0);
/*      */       
/*  747 */       return "FLEC";
/*      */     }
/*  749 */     return "FLEC";
/*      */   }
/*      */   
/*      */   private JCheckBox jCheckBox2;
/*      */   private JCheckBox jCheckBox20;
/*      */   private JCheckBox jCheckBox21;
/*      */   private JCheckBox jCheckBox22;
/*      */   private JCheckBox jCheckBox23;
/*      */   private JCheckBox jCheckBox24;
/*      */   private JCheckBox jCheckBox25;
/*      */   
/*  760 */   private void initComponents() { this.jLabel1 = new javax.swing.JLabel();
/*  761 */     this.jTextField1 = new JTextField();
/*  762 */     this.jLabel2 = new javax.swing.JLabel();
/*  763 */     this.jTextField2 = new JTextField();
/*  764 */     this.jLabel3 = new javax.swing.JLabel();
/*  765 */     this.jTextField3 = new JTextField();
/*  766 */     this.jLabel4 = new javax.swing.JLabel();
/*  767 */     this.jTextField4 = new JTextField();
/*  768 */     this.jButton1 = new javax.swing.JButton();
/*  769 */     this.jButton2 = new javax.swing.JButton();
/*  770 */     this.jButton3 = new javax.swing.JButton();
/*  771 */     this.jSeparator1 = new javax.swing.JSeparator();
/*  772 */     this.jCheckBox1 = new JCheckBox();
/*  773 */     this.jCheckBox2 = new JCheckBox();
/*  774 */     this.jCheckBox3 = new JCheckBox();
/*  775 */     this.jCheckBox4 = new JCheckBox();
/*  776 */     this.jCheckBox5 = new JCheckBox();
/*  777 */     this.jCheckBox6 = new JCheckBox();
/*  778 */     this.jCheckBox7 = new JCheckBox();
/*  779 */     this.jCheckBox8 = new JCheckBox();
/*  780 */     this.jCheckBox9 = new JCheckBox();
/*  781 */     this.jCheckBox10 = new JCheckBox();
/*  782 */     this.jCheckBox11 = new JCheckBox();
/*  783 */     this.jCheckBox12 = new JCheckBox();
/*  784 */     this.jButton4 = new javax.swing.JButton();
/*  785 */     this.jCheckBox13 = new JCheckBox();
/*  786 */     this.jCheckBox14 = new JCheckBox();
/*  787 */     this.jCheckBox15 = new JCheckBox();
/*  788 */     this.jCheckBox16 = new JCheckBox();
/*  789 */     this.jCheckBox17 = new JCheckBox();
/*  790 */     this.jCheckBox18 = new JCheckBox();
/*  791 */     this.jCheckBox19 = new JCheckBox();
/*  792 */     this.jCheckBox20 = new JCheckBox();
/*  793 */     this.jCheckBox21 = new JCheckBox();
/*  794 */     this.jCheckBox22 = new JCheckBox();
/*  795 */     this.jCheckBox23 = new JCheckBox();
/*  796 */     this.jCheckBox24 = new JCheckBox();
/*  797 */     this.jCheckBox25 = new JCheckBox();
/*  798 */     this.jCheckBox26 = new JCheckBox();
/*  799 */     this.jCheckBox27 = new JCheckBox();
/*  800 */     this.jCheckBox28 = new JCheckBox();
/*  801 */     this.jCheckBox29 = new JCheckBox();
/*  802 */     this.jCheckBox30 = new JCheckBox();
/*  803 */     this.jCheckBox31 = new JCheckBox();
/*  804 */     this.jCheckBox32 = new JCheckBox();
/*  805 */     this.jCheckBox33 = new JCheckBox();
/*  806 */     this.jCheckBox34 = new JCheckBox();
/*  807 */     this.jCheckBox35 = new JCheckBox();
/*  808 */     this.jCheckBox36 = new JCheckBox();
/*  809 */     this.jCheckBox37 = new JCheckBox();
/*  810 */     this.jCheckBox38 = new JCheckBox();
/*  811 */     this.jCheckBox39 = new JCheckBox();
/*  812 */     this.jCheckBox40 = new JCheckBox();
/*      */     
/*  814 */     setDefaultCloseOperation(3);
/*  815 */     setTitle("FLEC (Forum Link Extractor & Checker)");
/*      */     
/*  817 */     this.jLabel1.setText("First Page    :");
/*      */     
/*  819 */     this.jLabel2.setText("Second Page:");
/*      */     
/*  821 */     this.jLabel3.setText("Third Page   :");
/*      */     
/*  823 */     this.jLabel4.setText("Last Page    :");
/*      */     
/*  825 */     this.jButton1.setText("Extract");
/*  826 */     this.jButton1.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  828 */         FLEC.this.jButton1ActionPerformed(evt);
/*      */       }
/*      */       
/*  831 */     });
/*  832 */     this.jButton2.setText("Exit");
/*  833 */     this.jButton2.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  835 */         FLEC.this.jButton2ActionPerformed(evt);
/*      */       }
/*      */       
/*  838 */     });
/*  839 */     this.jButton3.setText("Reset");
/*  840 */     this.jButton3.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  842 */         FLEC.this.jButton3ActionPerformed(evt);
/*      */       }
/*      */       
/*  845 */     });
/*  846 */     this.jCheckBox1.setText("jCheckBox1");
/*  847 */     this.jCheckBox1.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  849 */         FLEC.this.jCheckBox1ActionPerformed(evt);
/*      */       }
/*      */       
/*  852 */     });
/*  853 */     this.jCheckBox2.setText("jCheckBox2");
/*  854 */     this.jCheckBox2.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  856 */         FLEC.this.jCheckBox2ActionPerformed(evt);
/*      */       }
/*      */       
/*  859 */     });
/*  860 */     this.jCheckBox3.setText("jCheckBox3");
/*  861 */     this.jCheckBox3.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  863 */         FLEC.this.jCheckBox3ActionPerformed(evt);
/*      */       }
/*      */       
/*  866 */     });
/*  867 */     this.jCheckBox4.setText("jCheckBox4");
/*  868 */     this.jCheckBox4.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  870 */         FLEC.this.jCheckBox4ActionPerformed(evt);
/*      */       }
/*      */       
/*  873 */     });
/*  874 */     this.jCheckBox5.setText("jCheckBox5");
/*  875 */     this.jCheckBox5.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  877 */         FLEC.this.jCheckBox5ActionPerformed(evt);
/*      */       }
/*      */       
/*  880 */     });
/*  881 */     this.jCheckBox6.setText("jCheckBox6");
/*  882 */     this.jCheckBox6.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  884 */         FLEC.this.jCheckBox6ActionPerformed(evt);
/*      */       }
/*      */       
/*  887 */     });
/*  888 */     this.jCheckBox7.setText("jCheckBox7");
/*  889 */     this.jCheckBox7.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  891 */         FLEC.this.jCheckBox7ActionPerformed(evt);
/*      */       }
/*      */       
/*  894 */     });
/*  895 */     this.jCheckBox8.setText("jCheckBox8");
/*  896 */     this.jCheckBox8.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  898 */         FLEC.this.jCheckBox8ActionPerformed(evt);
/*      */       }
/*      */       
/*  901 */     });
/*  902 */     this.jCheckBox9.setText("jCheckBox9");
/*  903 */     this.jCheckBox9.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  905 */         FLEC.this.jCheckBox9ActionPerformed(evt);
/*      */       }
/*      */       
/*  908 */     });
/*  909 */     this.jCheckBox10.setText("jCheckBox10");
/*  910 */     this.jCheckBox10.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  912 */         FLEC.this.jCheckBox10ActionPerformed(evt);
/*      */       }
/*      */       
/*  915 */     });
/*  916 */     this.jCheckBox11.setText("jCheckBox11");
/*  917 */     this.jCheckBox11.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  919 */         FLEC.this.jCheckBox11ActionPerformed(evt);
/*      */       }
/*      */       
/*  922 */     });
/*  923 */     this.jCheckBox12.setText("jCheckBox12");
/*  924 */     this.jCheckBox12.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  926 */         FLEC.this.jCheckBox12ActionPerformed(evt);
/*      */       }
/*      */       
/*  929 */     });
/*  930 */     this.jButton4.setText("About");
/*  931 */     this.jButton4.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  933 */         FLEC.this.jButton4ActionPerformed(evt);
/*      */       }
/*      */       
/*  936 */     });
/*  937 */     this.jCheckBox13.setText("jCheckBox13");
/*  938 */     this.jCheckBox13.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  940 */         FLEC.this.jCheckBox13ActionPerformed(evt);
/*      */       }
/*      */       
/*  943 */     });
/*  944 */     this.jCheckBox14.setText("jCheckBox14");
/*  945 */     this.jCheckBox14.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  947 */         FLEC.this.jCheckBox14ActionPerformed(evt);
/*      */       }
/*      */       
/*  950 */     });
/*  951 */     this.jCheckBox15.setText("jCheckBox15");
/*  952 */     this.jCheckBox15.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  954 */         FLEC.this.jCheckBox15ActionPerformed(evt);
/*      */       }
/*      */       
/*  957 */     });
/*  958 */     this.jCheckBox16.setText("jCheckBox16");
/*  959 */     this.jCheckBox16.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  961 */         FLEC.this.jCheckBox16ActionPerformed(evt);
/*      */       }
/*      */       
/*  964 */     });
/*  965 */     this.jCheckBox17.setText("jCheckBox17");
/*  966 */     this.jCheckBox17.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  968 */         FLEC.this.jCheckBox17ActionPerformed(evt);
/*      */       }
/*      */       
/*  971 */     });
/*  972 */     this.jCheckBox18.setText("jCheckBox18");
/*  973 */     this.jCheckBox18.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  975 */         FLEC.this.jCheckBox18ActionPerformed(evt);
/*      */       }
/*      */       
/*  978 */     });
/*  979 */     this.jCheckBox19.setText("jCheckBox19");
/*  980 */     this.jCheckBox19.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  982 */         FLEC.this.jCheckBox19ActionPerformed(evt);
/*      */       }
/*      */       
/*  985 */     });
/*  986 */     this.jCheckBox20.setText("jCheckBox20");
/*  987 */     this.jCheckBox20.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  989 */         FLEC.this.jCheckBox20ActionPerformed(evt);
/*      */       }
/*      */       
/*  992 */     });
/*  993 */     this.jCheckBox21.setText("jCheckBox21");
/*  994 */     this.jCheckBox21.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  996 */         FLEC.this.jCheckBox21ActionPerformed(evt);
/*      */       }
/*      */       
/*  999 */     });
/* 1000 */     this.jCheckBox22.setText("jCheckBox22");
/* 1001 */     this.jCheckBox22.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1003 */         FLEC.this.jCheckBox22ActionPerformed(evt);
/*      */       }
/*      */       
/* 1006 */     });
/* 1007 */     this.jCheckBox23.setText("jCheckBox23");
/* 1008 */     this.jCheckBox23.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1010 */         FLEC.this.jCheckBox23ActionPerformed(evt);
/*      */       }
/*      */       
/* 1013 */     });
/* 1014 */     this.jCheckBox24.setText("jCheckBox24");
/* 1015 */     this.jCheckBox24.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1017 */         FLEC.this.jCheckBox24ActionPerformed(evt);
/*      */       }
/*      */       
/* 1020 */     });
/* 1021 */     this.jCheckBox25.setText("jCheckBox25");
/* 1022 */     this.jCheckBox25.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1024 */         FLEC.this.jCheckBox25ActionPerformed(evt);
/*      */       }
/*      */       
/* 1027 */     });
/* 1028 */     this.jCheckBox26.setText("jCheckBox26");
/* 1029 */     this.jCheckBox26.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1031 */         FLEC.this.jCheckBox26ActionPerformed(evt);
/*      */       }
/*      */       
/* 1034 */     });
/* 1035 */     this.jCheckBox27.setText("jCheckBox27");
/* 1036 */     this.jCheckBox27.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1038 */         FLEC.this.jCheckBox27ActionPerformed(evt);
/*      */       }
/*      */       
/* 1041 */     });
/* 1042 */     this.jCheckBox28.setText("jCheckBox28");
/* 1043 */     this.jCheckBox28.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1045 */         FLEC.this.jCheckBox28ActionPerformed(evt);
/*      */       }
/*      */       
/* 1048 */     });
/* 1049 */     this.jCheckBox29.setText("jCheckBox29");
/* 1050 */     this.jCheckBox29.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1052 */         FLEC.this.jCheckBox29ActionPerformed(evt);
/*      */       }
/*      */       
/* 1055 */     });
/* 1056 */     this.jCheckBox30.setText("jCheckBox30");
/* 1057 */     this.jCheckBox30.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1059 */         FLEC.this.jCheckBox30ActionPerformed(evt);
/*      */       }
/*      */       
/* 1062 */     });
/* 1063 */     this.jCheckBox31.setText("jCheckBox31");
/* 1064 */     this.jCheckBox31.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1066 */         FLEC.this.jCheckBox31ActionPerformed(evt);
/*      */       }
/*      */       
/* 1069 */     });
/* 1070 */     this.jCheckBox32.setText("jCheckBox32");
/* 1071 */     this.jCheckBox32.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1073 */         FLEC.this.jCheckBox32ActionPerformed(evt);
/*      */       }
/*      */       
/* 1076 */     });
/* 1077 */     this.jCheckBox33.setText("jCheckBox33");
/* 1078 */     this.jCheckBox33.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1080 */         FLEC.this.jCheckBox33ActionPerformed(evt);
/*      */       }
/*      */       
/* 1083 */     });
/* 1084 */     this.jCheckBox34.setText("jCheckBox34");
/* 1085 */     this.jCheckBox34.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1087 */         FLEC.this.jCheckBox34ActionPerformed(evt);
/*      */       }
/*      */       
/* 1090 */     });
/* 1091 */     this.jCheckBox35.setText("jCheckBox35");
/* 1092 */     this.jCheckBox35.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1094 */         FLEC.this.jCheckBox35ActionPerformed(evt);
/*      */       }
/*      */       
/* 1097 */     });
/* 1098 */     this.jCheckBox36.setText("jCheckBox36");
/* 1099 */     this.jCheckBox36.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1101 */         FLEC.this.jCheckBox36ActionPerformed(evt);
/*      */       }
/*      */       
/* 1104 */     });
/* 1105 */     this.jCheckBox37.setText("jCheckBox37");
/* 1106 */     this.jCheckBox37.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1108 */         FLEC.this.jCheckBox37ActionPerformed(evt);
/*      */       }
/*      */       
/* 1111 */     });
/* 1112 */     this.jCheckBox38.setText("jCheckBox38");
/* 1113 */     this.jCheckBox38.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1115 */         FLEC.this.jCheckBox38ActionPerformed(evt);
/*      */       }
/*      */       
/* 1118 */     });
/* 1119 */     this.jCheckBox39.setText("jCheckBox39");
/* 1120 */     this.jCheckBox39.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1122 */         FLEC.this.jCheckBox39ActionPerformed(evt);
/*      */       }
/*      */       
/* 1125 */     });
/* 1126 */     this.jCheckBox40.setText("jCheckBox40");
/* 1127 */     this.jCheckBox40.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1129 */         FLEC.this.jCheckBox40ActionPerformed(evt);
/*      */       }
/*      */       
/* 1132 */     });
/* 1133 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 1134 */     getContentPane().setLayout(layout);
/* 1135 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox25).addComponent(this.jCheckBox9).addComponent(this.jCheckBox17).addComponent(this.jCheckBox1).addComponent(this.jCheckBox33)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox26).addComponent(this.jCheckBox10).addComponent(this.jCheckBox18).addComponent(this.jCheckBox2).addComponent(this.jCheckBox34)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox19).addComponent(this.jCheckBox27).addComponent(this.jCheckBox11).addComponent(this.jCheckBox3).addComponent(this.jCheckBox35)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox20).addComponent(this.jCheckBox28).addComponent(this.jCheckBox12).addComponent(this.jCheckBox4).addComponent(this.jCheckBox36)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox21).addComponent(this.jCheckBox29).addComponent(this.jCheckBox13).addComponent(this.jCheckBox5).addComponent(this.jCheckBox37)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox22).addComponent(this.jCheckBox14).addComponent(this.jCheckBox6).addComponent(this.jCheckBox30).addComponent(this.jCheckBox38)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox23).addComponent(this.jCheckBox15).addComponent(this.jCheckBox7).addComponent(this.jCheckBox31).addComponent(this.jCheckBox39)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox24).addComponent(this.jCheckBox16).addComponent(this.jCheckBox8).addComponent(this.jCheckBox32).addComponent(this.jCheckBox40))).addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel2).addComponent(this.jLabel1).addComponent(this.jLabel3).addComponent(this.jLabel4)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(16, 16, 16).addComponent(this.jButton1).addGap(18, 18, 18).addComponent(this.jButton2).addGap(18, 18, 18).addComponent(this.jButton3).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, 32767).addComponent(this.jButton4).addGap(13, 13, 13)).addComponent(this.jTextField3, -1, 614, 32767).addComponent(this.jTextField2, -1, 614, 32767).addComponent(this.jTextField4, -1, 614, 32767).addComponent(this.jTextField1, -1, 614, 32767)).addGap(10, 10, 10)).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jSeparator1, -1, 684, 32767).addContainerGap()));
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
/* 1223 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1).addComponent(this.jTextField1, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.jTextField2, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel3).addComponent(this.jTextField3, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel4).addComponent(this.jTextField4, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton1).addComponent(this.jButton2).addComponent(this.jButton3).addComponent(this.jButton4)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jSeparator1, -2, 6, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox1).addComponent(this.jCheckBox2).addComponent(this.jCheckBox3).addComponent(this.jCheckBox4).addComponent(this.jCheckBox5).addComponent(this.jCheckBox6).addComponent(this.jCheckBox7).addComponent(this.jCheckBox8)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox9).addComponent(this.jCheckBox10).addComponent(this.jCheckBox11).addComponent(this.jCheckBox12).addComponent(this.jCheckBox13).addComponent(this.jCheckBox14).addComponent(this.jCheckBox15).addComponent(this.jCheckBox16)).addGap(3, 3, 3).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jCheckBox17).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox18).addComponent(this.jCheckBox19).addComponent(this.jCheckBox20).addComponent(this.jCheckBox21).addComponent(this.jCheckBox22).addComponent(this.jCheckBox23).addComponent(this.jCheckBox24))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox25).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox26).addComponent(this.jCheckBox30).addComponent(this.jCheckBox31).addComponent(this.jCheckBox32).addComponent(this.jCheckBox27).addComponent(this.jCheckBox28).addComponent(this.jCheckBox29))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox33).addComponent(this.jCheckBox35).addComponent(this.jCheckBox36).addComponent(this.jCheckBox38).addComponent(this.jCheckBox37).addComponent(this.jCheckBox39).addComponent(this.jCheckBox40).addComponent(this.jCheckBox34)).addContainerGap(-1, 32767)));
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
/* 1305 */     pack();
/*      */   }
/*      */   
/*      */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 1309 */     main1();
/*      */   }
/*      */   
/*      */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 1313 */     System.exit(0);
/*      */   }
/*      */   
/*      */   private void jButton3ActionPerformed(ActionEvent evt) {
/* 1317 */     this.jTextField1.setText("");
/* 1318 */     this.jTextField2.setText("");
/* 1319 */     this.jTextField3.setText("");
/* 1320 */     this.jTextField4.setText("");
/*      */   }
/*      */   
/*      */   private void jButton4ActionPerformed(ActionEvent evt) {
/* 1324 */     javax.swing.JOptionPane.showMessageDialog(this, "FLEC v1.0 by Ankit Singh\n\nFLEC = Forum Link Extractor & Checker", "About", 1);
/*      */   }
/*      */   
/*      */   private void jCheckBox1ActionPerformed(ActionEvent evt) {
/* 1328 */     this.flag[0] = (this.flag[0] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox2ActionPerformed(ActionEvent evt) {
/* 1332 */     this.flag[1] = (this.flag[1] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox3ActionPerformed(ActionEvent evt) {
/* 1336 */     this.flag[2] = (this.flag[2] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox4ActionPerformed(ActionEvent evt) {
/* 1340 */     this.flag[3] = (this.flag[3] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox5ActionPerformed(ActionEvent evt) {
/* 1344 */     this.flag[4] = (this.flag[4] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox6ActionPerformed(ActionEvent evt) {
/* 1348 */     this.flag[5] = (this.flag[5] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox7ActionPerformed(ActionEvent evt) {
/* 1352 */     this.flag[6] = (this.flag[6] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox8ActionPerformed(ActionEvent evt) {
/* 1356 */     this.flag[7] = (this.flag[7] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox9ActionPerformed(ActionEvent evt) {
/* 1360 */     this.flag[8] = (this.flag[8] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox10ActionPerformed(ActionEvent evt) {
/* 1364 */     this.flag[9] = (this.flag[9] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox11ActionPerformed(ActionEvent evt) {
/* 1368 */     this.flag[10] = (this.flag[10] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox12ActionPerformed(ActionEvent evt) {
/* 1372 */     this.flag[11] = (this.flag[11] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox13ActionPerformed(ActionEvent evt) {
/* 1376 */     this.flag[12] = (this.flag[12] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox14ActionPerformed(ActionEvent evt) {
/* 1380 */     this.flag[13] = (this.flag[13] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox15ActionPerformed(ActionEvent evt) {
/* 1384 */     this.flag[14] = (this.flag[14] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox16ActionPerformed(ActionEvent evt) {
/* 1388 */     this.flag[15] = (this.flag[15] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox17ActionPerformed(ActionEvent evt) {
/* 1392 */     this.flag[16] = (this.flag[16] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox18ActionPerformed(ActionEvent evt) {
/* 1396 */     this.flag[17] = (this.flag[17] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox19ActionPerformed(ActionEvent evt) {
/* 1400 */     this.flag[18] = (this.flag[18] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox20ActionPerformed(ActionEvent evt) {
/* 1404 */     this.flag[19] = (this.flag[19] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox21ActionPerformed(ActionEvent evt) {
/* 1408 */     this.flag[20] = (this.flag[20] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox22ActionPerformed(ActionEvent evt) {
/* 1412 */     this.flag[21] = (this.flag[21] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox23ActionPerformed(ActionEvent evt) {
/* 1416 */     this.flag[22] = (this.flag[22] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox24ActionPerformed(ActionEvent evt) {
/* 1420 */     this.flag[23] = (this.flag[23] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox25ActionPerformed(ActionEvent evt) {
/* 1424 */     this.flag[24] = (this.flag[24] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox26ActionPerformed(ActionEvent evt) {
/* 1428 */     this.flag[25] = (this.flag[25] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox27ActionPerformed(ActionEvent evt) {
/* 1432 */     this.flag[26] = (this.flag[26] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox28ActionPerformed(ActionEvent evt) {
/* 1436 */     this.flag[27] = (this.flag[27] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox29ActionPerformed(ActionEvent evt) {
/* 1440 */     this.flag[28] = (this.flag[28] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox30ActionPerformed(ActionEvent evt) {
/* 1444 */     this.flag[29] = (this.flag[29] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox31ActionPerformed(ActionEvent evt) {
/* 1448 */     this.flag[30] = (this.flag[30] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox32ActionPerformed(ActionEvent evt) {
/* 1452 */     this.flag[31] = (this.flag[31] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox33ActionPerformed(ActionEvent evt) {
/* 1456 */     this.flag[32] = (this.flag[32] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox34ActionPerformed(ActionEvent evt) {
/* 1460 */     this.flag[33] = (this.flag[33] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox35ActionPerformed(ActionEvent evt) {
/* 1464 */     this.flag[34] = (this.flag[34] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox36ActionPerformed(ActionEvent evt) {
/* 1468 */     this.flag[35] = (this.flag[35] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox37ActionPerformed(ActionEvent evt) {
/* 1472 */     this.flag[36] = (this.flag[36] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */ 
/* 1476 */   private void jCheckBox38ActionPerformed(ActionEvent evt) { this.flag[37] = (this.flag[37] == 0 ? 1 : false); }
/*      */   
/*      */   private JCheckBox jCheckBox26;
/*      */   
/* 1480 */   private void jCheckBox39ActionPerformed(ActionEvent evt) { this.flag[38] = (this.flag[38] == 0 ? 1 : false); }
/*      */   
/*      */   private JCheckBox jCheckBox27;
/*      */   
/* 1484 */   private void jCheckBox40ActionPerformed(ActionEvent evt) { this.flag[39] = (this.flag[39] == 0 ? 1 : false); }
/*      */   
/*      */   private JCheckBox jCheckBox28;
/*      */   private JCheckBox jCheckBox29;
/*      */   private JCheckBox jCheckBox3;
/*      */   private JCheckBox jCheckBox30;
/*      */   private JCheckBox jCheckBox31;
/*      */   private JCheckBox jCheckBox32;
/*      */   
/*      */   public static void main(String[] args)
/*      */   {
/*      */     try
/*      */     {
/* 1497 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 1498 */         if ("Windows".equals(info.getName())) {
/* 1499 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 1500 */           break;
/*      */         }
/*      */       }
/*      */     } catch (Exception ex) {
/* 1504 */       javax.swing.JOptionPane.showMessageDialog(null, "L&F error", "Internal error", 0);
/*      */     }
/*      */     
/*      */ 
/*      */ 
/* 1509 */     java.awt.EventQueue.invokeLater(new Runnable()
/*      */     {
/*      */       public void run()
/*      */       {
/* 1513 */         new FLEC().setVisible(true);
/*      */       }
/*      */     });
/*      */   }
/*      */   
/*      */   private JCheckBox jCheckBox33;
/*      */   private JCheckBox jCheckBox34;
/*      */   private JCheckBox jCheckBox35;
/*      */   private JCheckBox jCheckBox36;
/*      */   private JCheckBox jCheckBox37;
/*      */   private JCheckBox jCheckBox38;
/*      */   private JCheckBox jCheckBox39;
/*      */   private JCheckBox jCheckBox4;
/*      */   private JCheckBox jCheckBox40;
/*      */   private JCheckBox jCheckBox5;
/*      */   private JCheckBox jCheckBox6;
/*      */   private JCheckBox jCheckBox7;
/*      */   private JCheckBox jCheckBox8;
/*      */   private JCheckBox jCheckBox9;
/*      */   private javax.swing.JLabel jLabel1;
/*      */   private javax.swing.JLabel jLabel2;
/*      */   private javax.swing.JLabel jLabel3;
/*      */   private javax.swing.JLabel jLabel4;
/*      */   private javax.swing.JSeparator jSeparator1;
/*      */   private JTextField jTextField1;
/*      */   private JTextField jTextField2;
/*      */   private JTextField jTextField3;
/*      */   private JTextField jTextField4;
/*      */ }
