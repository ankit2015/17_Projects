/*      */ package ankit_singh;
/*      */ 
/*      */ import java.awt.event.ActionEvent;
/*      */ import java.awt.event.ActionListener;
/*      */ import javax.swing.GroupLayout;
/*      */ import javax.swing.GroupLayout.Alignment;
/*      */ import javax.swing.GroupLayout.ParallelGroup;
/*      */ import javax.swing.GroupLayout.SequentialGroup;
/*      */ import javax.swing.JButton;
/*      */ import javax.swing.JCheckBox;
/*      */ import javax.swing.JTextField;
/*      */ import javax.swing.LayoutStyle.ComponentPlacement;
/*      */ 
/*      */ public class FLE extends javax.swing.JFrame
/*      */ {
/*      */   java.io.PrintWriter outFile;
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
/*      */   boolean[] flag;
/*      */   private JButton jButton1;
/*      */   private JButton jButton2;
/*      */   
/*      */   public FLE()
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
/*  235 */         this.outFile = new java.io.PrintWriter(bw);
/*  236 */         this.outFile.println(title);
/*  237 */         this.outFile.println();
/*      */         
/*  239 */         this.fls = new String[this.ls.length];
/*  240 */         this.pat2 = new java.util.regex.Pattern[this.ls.length];
/*      */         
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
/*      */ 
/*      */ 
/*  259 */             n += 1;
/*      */           }
/*      */         }
/*      */         
/*  263 */         this.fls = ((String[])java.util.Arrays.copyOf(this.fls, n));
/*  264 */         this.pat2 = ((java.util.regex.Pattern[])java.util.Arrays.copyOf(this.pat2, n));
/*      */         
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
/*  338 */         this.outFile.println("List of all non-redundant links:");
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
/*      */ 
/*      */ 
/*      */       }
/*      */       finally
/*      */       {
/*      */ 
/*      */ 
/*  356 */         this.outFile.close();
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   void main2(String loc)
/*      */   {
/*      */     try
/*      */     {
/*  366 */       java.net.URL hp = new java.net.URL(loc);
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
/*      */ 
/*  380 */         java.io.InputStream input = hpCon.getInputStream();
/*  381 */         java.io.InputStreamReader in = new java.io.InputStreamReader(input);
/*  382 */         java.io.BufferedReader br = new java.io.BufferedReader(in);
/*      */         
/*  384 */         this.outFile.println(loc + "\tPg " + this.page++);
/*      */         
/*  386 */         java.util.regex.Matcher mat = null;
/*      */         String s1;
/*  388 */         while ((s1 = br.readLine()) != null)
/*      */         {
/*      */ 
/*  391 */           if (!this.flag1)
/*      */           {
/*  393 */             mat = this.pat.matcher(s1);
/*  394 */             if (mat.find())
/*      */             {
/*  396 */               this.flag1 = true;
/*      */             }
/*      */           }
/*      */           else
/*      */           {
/*  401 */             for (int m = 0; m < this.fls.length; m++)
/*      */             {
/*      */ 
/*  404 */               mat = this.pat2[m].matcher(s1);
/*  405 */               while (mat.find())
/*      */               {
/*      */ 
/*  408 */                 for (int i = mat.end(); i < s1.length(); i++)
/*      */                 {
/*      */ 
/*  411 */                   char c = s1.charAt(i);
/*  412 */                   if ((c == ' ') || (c == '<') || (c == '>') || (c == '[') || (c == ']') || (c == '"') || (c == '\''))
/*      */                   {
/*      */ 
/*  415 */                     if (s2.toString().equals(buf.toString()))
/*      */                     {
/*  417 */                       s2 = new StringBuilder();
/*  418 */                       break;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*  424 */                     if (!s2.toString().contains("..."))
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*  429 */                       String link = prefix + this.fls[m] + s2;
/*  430 */                       if (this.unique.contains(link))
/*      */                       {
/*  432 */                         this.outFile.println(link + " ====>REDUNDANT");
/*      */ 
/*      */                       }
/*      */                       else
/*      */                       {
/*  437 */                         this.outFile.println(link);
/*  438 */                         this.unique.add(link);
/*      */                       }
/*      */                     }
/*      */                     
/*  442 */                     buf = s2;
/*      */                     
/*  444 */                     s2 = new StringBuilder();
/*  445 */                     break;
/*      */                   }
/*      */                   
/*  448 */                   if (i == s1.length() - 1)
/*      */                   {
/*  450 */                     s2 = s2.append(c);
/*      */                     
/*      */ 
/*  453 */                     if (!s2.toString().contains("..."))
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*  458 */                       String link = prefix + this.fls[m] + s2;
/*  459 */                       if (this.unique.contains(link))
/*      */                       {
/*  461 */                         this.outFile.println(link + " ====>REDUNDANT");
/*      */ 
/*      */                       }
/*      */                       else
/*      */                       {
/*  466 */                         this.outFile.println(link);
/*  467 */                         this.unique.add(link);
/*      */                       }
/*      */                     }
/*      */                     
/*  471 */                     buf = s2;
/*  472 */                     s2 = new StringBuilder();
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*  477 */                     s2 = s2.append(c);
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*  484 */         br.close();
/*  485 */         this.outFile.println();
/*      */       }
/*      */     }
/*      */     catch (java.net.MalformedURLException e)
/*      */     {
/*  490 */       javax.swing.JOptionPane.showMessageDialog(this, "This generated URL is invalid:\n" + loc, "Error", 0);
/*      */     }
/*      */     catch (java.io.IOException e)
/*      */     {
/*  494 */       javax.swing.JOptionPane.showMessageDialog(this, "Unable to access this web-page:\n" + loc + "\n\nThe reasons may include:\n1. No Internet access or\n" + "2. web-page temporarily unavailable or\n3. web-page does not exists", "Error", 0);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   private JButton jButton3;
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
/*      */   private JCheckBox jCheckBox5;
/*      */   
/*      */   private JCheckBox jCheckBox6;
/*      */   
/*      */   private JCheckBox jCheckBox7;
/*      */   
/*      */   private JCheckBox jCheckBox8;
/*      */   
/*      */   private JCheckBox jCheckBox9;
/*      */   
/*      */   private javax.swing.JLabel jLabel1;
/*      */   
/*      */   private javax.swing.JLabel jLabel2;
/*      */   
/*      */   private javax.swing.JLabel jLabel3;
/*      */   
/*      */   private javax.swing.JLabel jLabel4;
/*      */   
/*      */   private javax.swing.JSeparator jSeparator1;
/*      */   
/*      */   private JTextField jTextField1;
/*      */   
/*      */   private JTextField jTextField2;
/*      */   
/*      */   private JTextField jTextField3;
/*      */   
/*      */   private JTextField jTextField4;
/*      */   
/*      */   String Title(String loc)
/*      */   {
/*      */     try
/*      */     {
/*  642 */       java.net.URL hp = new java.net.URL(loc);
/*  643 */       java.net.URLConnection hpCon = hp.openConnection();
/*      */       
/*      */ 
/*      */ 
/*  647 */       StringBuilder s3 = new StringBuilder("");
/*      */       
/*  649 */       java.io.InputStream input = hpCon.getInputStream();
/*  650 */       java.io.InputStreamReader in = new java.io.InputStreamReader(input);
/*  651 */       java.io.BufferedReader br = new java.io.BufferedReader(in);
/*      */       
/*  653 */       java.util.regex.Matcher mat = null;
/*      */       String s1;
/*  655 */       while ((s1 = br.readLine()) != null)
/*      */       {
/*  657 */         mat = this.pat.matcher(s1);
/*  658 */         if (mat.find())
/*      */         {
/*  660 */           for (int i = mat.end(); i < s1.length(); i++)
/*      */           {
/*  662 */             char c = s1.charAt(i);
/*  663 */             if (c == '<') {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*  669 */             s3 = s3.append(c);
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*  674 */       String s = s3.toString().trim().replace('*', '-');
/*  675 */       s = s.replace('|', '-');
/*  676 */       s = s.replace('\'', '-');
/*  677 */       s = s.replace(':', '-');
/*  678 */       s = s.replace('"', '-');
/*  679 */       s = s.replace('<', '-');
/*  680 */       s = s.replace('>', '-');
/*  681 */       s = s.replace('?', '-');
/*  682 */       return s.replace('/', '-');
/*      */ 
/*      */     }
/*      */     catch (java.net.MalformedURLException e)
/*      */     {
/*  687 */       javax.swing.JOptionPane.showMessageDialog(this, "The 'First Page' URL is invalid", "Error", 0);
/*      */     }
/*      */     catch (java.io.IOException e)
/*      */     {
/*  691 */       javax.swing.JOptionPane.showMessageDialog(this, "Unable to access 'First Page' due to:\n1. No Internet access or\n2. 'First Page' temporarily unavailable or\n3. 'First Page' does not exists", "Error", 0);
/*      */       
/*  693 */       return "FLE";
/*      */     }
/*  695 */     return "FLE";
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private void initComponents()
/*      */   {
/*  706 */     this.jLabel1 = new javax.swing.JLabel();
/*  707 */     this.jTextField1 = new JTextField();
/*  708 */     this.jLabel2 = new javax.swing.JLabel();
/*  709 */     this.jTextField2 = new JTextField();
/*  710 */     this.jLabel3 = new javax.swing.JLabel();
/*  711 */     this.jTextField3 = new JTextField();
/*  712 */     this.jLabel4 = new javax.swing.JLabel();
/*  713 */     this.jTextField4 = new JTextField();
/*  714 */     this.jButton1 = new JButton();
/*  715 */     this.jButton2 = new JButton();
/*  716 */     this.jButton3 = new JButton();
/*  717 */     this.jSeparator1 = new javax.swing.JSeparator();
/*  718 */     this.jCheckBox1 = new JCheckBox();
/*  719 */     this.jCheckBox2 = new JCheckBox();
/*  720 */     this.jCheckBox3 = new JCheckBox();
/*  721 */     this.jCheckBox4 = new JCheckBox();
/*  722 */     this.jCheckBox5 = new JCheckBox();
/*  723 */     this.jCheckBox6 = new JCheckBox();
/*  724 */     this.jCheckBox7 = new JCheckBox();
/*  725 */     this.jCheckBox8 = new JCheckBox();
/*  726 */     this.jCheckBox9 = new JCheckBox();
/*  727 */     this.jCheckBox10 = new JCheckBox();
/*  728 */     this.jCheckBox11 = new JCheckBox();
/*  729 */     this.jCheckBox12 = new JCheckBox();
/*  730 */     this.jButton4 = new JButton();
/*  731 */     this.jCheckBox13 = new JCheckBox();
/*  732 */     this.jCheckBox14 = new JCheckBox();
/*  733 */     this.jCheckBox15 = new JCheckBox();
/*  734 */     this.jCheckBox16 = new JCheckBox();
/*  735 */     this.jCheckBox17 = new JCheckBox();
/*  736 */     this.jCheckBox18 = new JCheckBox();
/*  737 */     this.jCheckBox19 = new JCheckBox();
/*  738 */     this.jCheckBox20 = new JCheckBox();
/*  739 */     this.jCheckBox21 = new JCheckBox();
/*  740 */     this.jCheckBox22 = new JCheckBox();
/*  741 */     this.jCheckBox23 = new JCheckBox();
/*  742 */     this.jCheckBox24 = new JCheckBox();
/*  743 */     this.jCheckBox25 = new JCheckBox();
/*  744 */     this.jCheckBox26 = new JCheckBox();
/*  745 */     this.jCheckBox27 = new JCheckBox();
/*  746 */     this.jCheckBox28 = new JCheckBox();
/*  747 */     this.jCheckBox29 = new JCheckBox();
/*  748 */     this.jCheckBox30 = new JCheckBox();
/*  749 */     this.jCheckBox31 = new JCheckBox();
/*  750 */     this.jCheckBox32 = new JCheckBox();
/*  751 */     this.jCheckBox33 = new JCheckBox();
/*  752 */     this.jCheckBox34 = new JCheckBox();
/*  753 */     this.jCheckBox35 = new JCheckBox();
/*  754 */     this.jCheckBox36 = new JCheckBox();
/*  755 */     this.jCheckBox37 = new JCheckBox();
/*  756 */     this.jCheckBox38 = new JCheckBox();
/*  757 */     this.jCheckBox39 = new JCheckBox();
/*  758 */     this.jCheckBox40 = new JCheckBox();
/*      */     
/*  760 */     setDefaultCloseOperation(3);
/*  761 */     setTitle("FLE (Forum Link Extractor)");
/*      */     
/*  763 */     this.jLabel1.setText("First Page    :");
/*      */     
/*  765 */     this.jLabel2.setText("Second Page:");
/*      */     
/*  767 */     this.jLabel3.setText("Third Page   :");
/*      */     
/*  769 */     this.jLabel4.setText("Last Page    :");
/*      */     
/*  771 */     this.jButton1.setText("Extract");
/*  772 */     this.jButton1.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  774 */         FLE.this.jButton1ActionPerformed(evt);
/*      */       }
/*      */       
/*  777 */     });
/*  778 */     this.jButton2.setText("Exit");
/*  779 */     this.jButton2.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  781 */         FLE.this.jButton2ActionPerformed(evt);
/*      */       }
/*      */       
/*  784 */     });
/*  785 */     this.jButton3.setText("Reset");
/*  786 */     this.jButton3.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  788 */         FLE.this.jButton3ActionPerformed(evt);
/*      */       }
/*      */       
/*  791 */     });
/*  792 */     this.jCheckBox1.setText("jCheckBox1");
/*  793 */     this.jCheckBox1.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  795 */         FLE.this.jCheckBox1ActionPerformed(evt);
/*      */       }
/*      */       
/*  798 */     });
/*  799 */     this.jCheckBox2.setText("jCheckBox2");
/*  800 */     this.jCheckBox2.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  802 */         FLE.this.jCheckBox2ActionPerformed(evt);
/*      */       }
/*      */       
/*  805 */     });
/*  806 */     this.jCheckBox3.setText("jCheckBox3");
/*  807 */     this.jCheckBox3.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  809 */         FLE.this.jCheckBox3ActionPerformed(evt);
/*      */       }
/*      */       
/*  812 */     });
/*  813 */     this.jCheckBox4.setText("jCheckBox4");
/*  814 */     this.jCheckBox4.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  816 */         FLE.this.jCheckBox4ActionPerformed(evt);
/*      */       }
/*      */       
/*  819 */     });
/*  820 */     this.jCheckBox5.setText("jCheckBox5");
/*  821 */     this.jCheckBox5.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  823 */         FLE.this.jCheckBox5ActionPerformed(evt);
/*      */       }
/*      */       
/*  826 */     });
/*  827 */     this.jCheckBox6.setText("jCheckBox6");
/*  828 */     this.jCheckBox6.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  830 */         FLE.this.jCheckBox6ActionPerformed(evt);
/*      */       }
/*      */       
/*  833 */     });
/*  834 */     this.jCheckBox7.setText("jCheckBox7");
/*  835 */     this.jCheckBox7.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  837 */         FLE.this.jCheckBox7ActionPerformed(evt);
/*      */       }
/*      */       
/*  840 */     });
/*  841 */     this.jCheckBox8.setText("jCheckBox8");
/*  842 */     this.jCheckBox8.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  844 */         FLE.this.jCheckBox8ActionPerformed(evt);
/*      */       }
/*      */       
/*  847 */     });
/*  848 */     this.jCheckBox9.setText("jCheckBox9");
/*  849 */     this.jCheckBox9.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  851 */         FLE.this.jCheckBox9ActionPerformed(evt);
/*      */       }
/*      */       
/*  854 */     });
/*  855 */     this.jCheckBox10.setText("jCheckBox10");
/*  856 */     this.jCheckBox10.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  858 */         FLE.this.jCheckBox10ActionPerformed(evt);
/*      */       }
/*      */       
/*  861 */     });
/*  862 */     this.jCheckBox11.setText("jCheckBox11");
/*  863 */     this.jCheckBox11.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  865 */         FLE.this.jCheckBox11ActionPerformed(evt);
/*      */       }
/*      */       
/*  868 */     });
/*  869 */     this.jCheckBox12.setText("jCheckBox12");
/*  870 */     this.jCheckBox12.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  872 */         FLE.this.jCheckBox12ActionPerformed(evt);
/*      */       }
/*      */       
/*  875 */     });
/*  876 */     this.jButton4.setText("About");
/*  877 */     this.jButton4.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  879 */         FLE.this.jButton4ActionPerformed(evt);
/*      */       }
/*      */       
/*  882 */     });
/*  883 */     this.jCheckBox13.setText("jCheckBox13");
/*  884 */     this.jCheckBox13.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  886 */         FLE.this.jCheckBox13ActionPerformed(evt);
/*      */       }
/*      */       
/*  889 */     });
/*  890 */     this.jCheckBox14.setText("jCheckBox14");
/*  891 */     this.jCheckBox14.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  893 */         FLE.this.jCheckBox14ActionPerformed(evt);
/*      */       }
/*      */       
/*  896 */     });
/*  897 */     this.jCheckBox15.setText("jCheckBox15");
/*  898 */     this.jCheckBox15.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  900 */         FLE.this.jCheckBox15ActionPerformed(evt);
/*      */       }
/*      */       
/*  903 */     });
/*  904 */     this.jCheckBox16.setText("jCheckBox16");
/*  905 */     this.jCheckBox16.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  907 */         FLE.this.jCheckBox16ActionPerformed(evt);
/*      */       }
/*      */       
/*  910 */     });
/*  911 */     this.jCheckBox17.setText("jCheckBox17");
/*  912 */     this.jCheckBox17.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  914 */         FLE.this.jCheckBox17ActionPerformed(evt);
/*      */       }
/*      */       
/*  917 */     });
/*  918 */     this.jCheckBox18.setText("jCheckBox18");
/*  919 */     this.jCheckBox18.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  921 */         FLE.this.jCheckBox18ActionPerformed(evt);
/*      */       }
/*      */       
/*  924 */     });
/*  925 */     this.jCheckBox19.setText("jCheckBox19");
/*  926 */     this.jCheckBox19.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  928 */         FLE.this.jCheckBox19ActionPerformed(evt);
/*      */       }
/*      */       
/*  931 */     });
/*  932 */     this.jCheckBox20.setText("jCheckBox20");
/*  933 */     this.jCheckBox20.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  935 */         FLE.this.jCheckBox20ActionPerformed(evt);
/*      */       }
/*      */       
/*  938 */     });
/*  939 */     this.jCheckBox21.setText("jCheckBox21");
/*  940 */     this.jCheckBox21.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  942 */         FLE.this.jCheckBox21ActionPerformed(evt);
/*      */       }
/*      */       
/*  945 */     });
/*  946 */     this.jCheckBox22.setText("jCheckBox22");
/*  947 */     this.jCheckBox22.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  949 */         FLE.this.jCheckBox22ActionPerformed(evt);
/*      */       }
/*      */       
/*  952 */     });
/*  953 */     this.jCheckBox23.setText("jCheckBox23");
/*  954 */     this.jCheckBox23.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  956 */         FLE.this.jCheckBox23ActionPerformed(evt);
/*      */       }
/*      */       
/*  959 */     });
/*  960 */     this.jCheckBox24.setText("jCheckBox24");
/*  961 */     this.jCheckBox24.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  963 */         FLE.this.jCheckBox24ActionPerformed(evt);
/*      */       }
/*      */       
/*  966 */     });
/*  967 */     this.jCheckBox25.setText("jCheckBox25");
/*  968 */     this.jCheckBox25.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  970 */         FLE.this.jCheckBox25ActionPerformed(evt);
/*      */       }
/*      */       
/*  973 */     });
/*  974 */     this.jCheckBox26.setText("jCheckBox26");
/*  975 */     this.jCheckBox26.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  977 */         FLE.this.jCheckBox26ActionPerformed(evt);
/*      */       }
/*      */       
/*  980 */     });
/*  981 */     this.jCheckBox27.setText("jCheckBox27");
/*  982 */     this.jCheckBox27.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  984 */         FLE.this.jCheckBox27ActionPerformed(evt);
/*      */       }
/*      */       
/*  987 */     });
/*  988 */     this.jCheckBox28.setText("jCheckBox28");
/*  989 */     this.jCheckBox28.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  991 */         FLE.this.jCheckBox28ActionPerformed(evt);
/*      */       }
/*      */       
/*  994 */     });
/*  995 */     this.jCheckBox29.setText("jCheckBox29");
/*  996 */     this.jCheckBox29.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/*  998 */         FLE.this.jCheckBox29ActionPerformed(evt);
/*      */       }
/*      */       
/* 1001 */     });
/* 1002 */     this.jCheckBox30.setText("jCheckBox30");
/* 1003 */     this.jCheckBox30.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1005 */         FLE.this.jCheckBox30ActionPerformed(evt);
/*      */       }
/*      */       
/* 1008 */     });
/* 1009 */     this.jCheckBox31.setText("jCheckBox31");
/* 1010 */     this.jCheckBox31.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1012 */         FLE.this.jCheckBox31ActionPerformed(evt);
/*      */       }
/*      */       
/* 1015 */     });
/* 1016 */     this.jCheckBox32.setText("jCheckBox32");
/* 1017 */     this.jCheckBox32.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1019 */         FLE.this.jCheckBox32ActionPerformed(evt);
/*      */       }
/*      */       
/* 1022 */     });
/* 1023 */     this.jCheckBox33.setText("jCheckBox33");
/* 1024 */     this.jCheckBox33.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1026 */         FLE.this.jCheckBox33ActionPerformed(evt);
/*      */       }
/*      */       
/* 1029 */     });
/* 1030 */     this.jCheckBox34.setText("jCheckBox34");
/* 1031 */     this.jCheckBox34.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1033 */         FLE.this.jCheckBox34ActionPerformed(evt);
/*      */       }
/*      */       
/* 1036 */     });
/* 1037 */     this.jCheckBox35.setText("jCheckBox35");
/* 1038 */     this.jCheckBox35.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1040 */         FLE.this.jCheckBox35ActionPerformed(evt);
/*      */       }
/*      */       
/* 1043 */     });
/* 1044 */     this.jCheckBox36.setText("jCheckBox36");
/* 1045 */     this.jCheckBox36.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1047 */         FLE.this.jCheckBox36ActionPerformed(evt);
/*      */       }
/*      */       
/* 1050 */     });
/* 1051 */     this.jCheckBox37.setText("jCheckBox37");
/* 1052 */     this.jCheckBox37.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1054 */         FLE.this.jCheckBox37ActionPerformed(evt);
/*      */       }
/*      */       
/* 1057 */     });
/* 1058 */     this.jCheckBox38.setText("jCheckBox38");
/* 1059 */     this.jCheckBox38.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1061 */         FLE.this.jCheckBox38ActionPerformed(evt);
/*      */       }
/*      */       
/* 1064 */     });
/* 1065 */     this.jCheckBox39.setText("jCheckBox39");
/* 1066 */     this.jCheckBox39.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1068 */         FLE.this.jCheckBox39ActionPerformed(evt);
/*      */       }
/*      */       
/* 1071 */     });
/* 1072 */     this.jCheckBox40.setText("jCheckBox40");
/* 1073 */     this.jCheckBox40.addActionListener(new ActionListener() {
/*      */       public void actionPerformed(ActionEvent evt) {
/* 1075 */         FLE.this.jCheckBox40ActionPerformed(evt);
/*      */       }
/*      */       
/* 1078 */     });
/* 1079 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 1080 */     getContentPane().setLayout(layout);
/* 1081 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox25).addComponent(this.jCheckBox9).addComponent(this.jCheckBox17).addComponent(this.jCheckBox1).addComponent(this.jCheckBox33)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox26).addComponent(this.jCheckBox10).addComponent(this.jCheckBox18).addComponent(this.jCheckBox2).addComponent(this.jCheckBox34)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox19).addComponent(this.jCheckBox27).addComponent(this.jCheckBox11).addComponent(this.jCheckBox3).addComponent(this.jCheckBox35)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox20).addComponent(this.jCheckBox28).addComponent(this.jCheckBox12).addComponent(this.jCheckBox4).addComponent(this.jCheckBox36)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox21).addComponent(this.jCheckBox29).addComponent(this.jCheckBox13).addComponent(this.jCheckBox5).addComponent(this.jCheckBox37)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox22).addComponent(this.jCheckBox14).addComponent(this.jCheckBox6).addComponent(this.jCheckBox30).addComponent(this.jCheckBox38)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox23).addComponent(this.jCheckBox15).addComponent(this.jCheckBox7).addComponent(this.jCheckBox31).addComponent(this.jCheckBox39)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox24).addComponent(this.jCheckBox16).addComponent(this.jCheckBox8).addComponent(this.jCheckBox32).addComponent(this.jCheckBox40))).addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel2).addComponent(this.jLabel1).addComponent(this.jLabel3).addComponent(this.jLabel4)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(16, 16, 16).addComponent(this.jButton1).addGap(18, 18, 18).addComponent(this.jButton2).addGap(18, 18, 18).addComponent(this.jButton3).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 311, 32767).addComponent(this.jButton4).addGap(13, 13, 13)).addComponent(this.jTextField3, -1, 624, 32767).addComponent(this.jTextField2, -1, 624, 32767).addComponent(this.jTextField4, -1, 624, 32767).addComponent(this.jTextField1, -1, 624, 32767)).addGap(10, 10, 10)).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jSeparator1, -1, 694, 32767).addContainerGap()));
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
/* 1169 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1).addComponent(this.jTextField1, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.jTextField2, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel3).addComponent(this.jTextField3, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel4).addComponent(this.jTextField4, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton1).addComponent(this.jButton2).addComponent(this.jButton3).addComponent(this.jButton4)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jSeparator1, -2, 6, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox1).addComponent(this.jCheckBox2).addComponent(this.jCheckBox3).addComponent(this.jCheckBox4).addComponent(this.jCheckBox5).addComponent(this.jCheckBox6).addComponent(this.jCheckBox7).addComponent(this.jCheckBox8)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox9).addComponent(this.jCheckBox10).addComponent(this.jCheckBox11).addComponent(this.jCheckBox12).addComponent(this.jCheckBox13).addComponent(this.jCheckBox14).addComponent(this.jCheckBox15).addComponent(this.jCheckBox16)).addGap(3, 3, 3).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jCheckBox17).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox18).addComponent(this.jCheckBox19).addComponent(this.jCheckBox20).addComponent(this.jCheckBox21).addComponent(this.jCheckBox22).addComponent(this.jCheckBox23).addComponent(this.jCheckBox24))).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox25).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox26).addComponent(this.jCheckBox30).addComponent(this.jCheckBox31).addComponent(this.jCheckBox32).addComponent(this.jCheckBox27).addComponent(this.jCheckBox28).addComponent(this.jCheckBox29))).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jCheckBox33).addComponent(this.jCheckBox35).addComponent(this.jCheckBox36).addComponent(this.jCheckBox38).addComponent(this.jCheckBox37).addComponent(this.jCheckBox39).addComponent(this.jCheckBox40).addComponent(this.jCheckBox34)).addContainerGap(-1, 32767)));
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
/* 1251 */     pack();
/*      */   }
/*      */   
/*      */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 1255 */     main1();
/*      */   }
/*      */   
/*      */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 1259 */     System.exit(0);
/*      */   }
/*      */   
/*      */   private void jButton3ActionPerformed(ActionEvent evt) {
/* 1263 */     this.jTextField1.setText("");
/* 1264 */     this.jTextField2.setText("");
/* 1265 */     this.jTextField3.setText("");
/* 1266 */     this.jTextField4.setText("");
/*      */   }
/*      */   
/*      */   private void jButton4ActionPerformed(ActionEvent evt) {
/* 1270 */     javax.swing.JOptionPane.showMessageDialog(this, "FLE v1.0 by Ankit Singh\n\nFLE = Forum Link Extractor", "About", 1);
/*      */   }
/*      */   
/*      */   private void jCheckBox1ActionPerformed(ActionEvent evt) {
/* 1274 */     this.flag[0] = (this.flag[0] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox2ActionPerformed(ActionEvent evt) {
/* 1278 */     this.flag[1] = (this.flag[1] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox3ActionPerformed(ActionEvent evt) {
/* 1282 */     this.flag[2] = (this.flag[2] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox4ActionPerformed(ActionEvent evt) {
/* 1286 */     this.flag[3] = (this.flag[3] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox5ActionPerformed(ActionEvent evt) {
/* 1290 */     this.flag[4] = (this.flag[4] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox6ActionPerformed(ActionEvent evt) {
/* 1294 */     this.flag[5] = (this.flag[5] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox7ActionPerformed(ActionEvent evt) {
/* 1298 */     this.flag[6] = (this.flag[6] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox8ActionPerformed(ActionEvent evt) {
/* 1302 */     this.flag[7] = (this.flag[7] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox9ActionPerformed(ActionEvent evt) {
/* 1306 */     this.flag[8] = (this.flag[8] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox10ActionPerformed(ActionEvent evt) {
/* 1310 */     this.flag[9] = (this.flag[9] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox11ActionPerformed(ActionEvent evt) {
/* 1314 */     this.flag[10] = (this.flag[10] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox12ActionPerformed(ActionEvent evt) {
/* 1318 */     this.flag[11] = (this.flag[11] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox13ActionPerformed(ActionEvent evt) {
/* 1322 */     this.flag[12] = (this.flag[12] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox14ActionPerformed(ActionEvent evt) {
/* 1326 */     this.flag[13] = (this.flag[13] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox15ActionPerformed(ActionEvent evt) {
/* 1330 */     this.flag[14] = (this.flag[14] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox16ActionPerformed(ActionEvent evt) {
/* 1334 */     this.flag[15] = (this.flag[15] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox17ActionPerformed(ActionEvent evt) {
/* 1338 */     this.flag[16] = (this.flag[16] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox18ActionPerformed(ActionEvent evt) {
/* 1342 */     this.flag[17] = (this.flag[17] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox19ActionPerformed(ActionEvent evt) {
/* 1346 */     this.flag[18] = (this.flag[18] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox20ActionPerformed(ActionEvent evt) {
/* 1350 */     this.flag[19] = (this.flag[19] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox21ActionPerformed(ActionEvent evt) {
/* 1354 */     this.flag[20] = (this.flag[20] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox22ActionPerformed(ActionEvent evt) {
/* 1358 */     this.flag[21] = (this.flag[21] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox23ActionPerformed(ActionEvent evt) {
/* 1362 */     this.flag[22] = (this.flag[22] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox24ActionPerformed(ActionEvent evt) {
/* 1366 */     this.flag[23] = (this.flag[23] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox25ActionPerformed(ActionEvent evt) {
/* 1370 */     this.flag[24] = (this.flag[24] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox26ActionPerformed(ActionEvent evt) {
/* 1374 */     this.flag[25] = (this.flag[25] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox27ActionPerformed(ActionEvent evt) {
/* 1378 */     this.flag[26] = (this.flag[26] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox28ActionPerformed(ActionEvent evt) {
/* 1382 */     this.flag[27] = (this.flag[27] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox29ActionPerformed(ActionEvent evt) {
/* 1386 */     this.flag[28] = (this.flag[28] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox30ActionPerformed(ActionEvent evt) {
/* 1390 */     this.flag[29] = (this.flag[29] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox31ActionPerformed(ActionEvent evt) {
/* 1394 */     this.flag[30] = (this.flag[30] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox32ActionPerformed(ActionEvent evt) {
/* 1398 */     this.flag[31] = (this.flag[31] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox33ActionPerformed(ActionEvent evt) {
/* 1402 */     this.flag[32] = (this.flag[32] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox34ActionPerformed(ActionEvent evt) {
/* 1406 */     this.flag[33] = (this.flag[33] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox35ActionPerformed(ActionEvent evt) {
/* 1410 */     this.flag[34] = (this.flag[34] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox36ActionPerformed(ActionEvent evt) {
/* 1414 */     this.flag[35] = (this.flag[35] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox37ActionPerformed(ActionEvent evt) {
/* 1418 */     this.flag[36] = (this.flag[36] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox38ActionPerformed(ActionEvent evt) {
/* 1422 */     this.flag[37] = (this.flag[37] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox39ActionPerformed(ActionEvent evt) {
/* 1426 */     this.flag[38] = (this.flag[38] == 0 ? 1 : false);
/*      */   }
/*      */   
/*      */   private void jCheckBox40ActionPerformed(ActionEvent evt) {
/* 1430 */     this.flag[39] = (this.flag[39] == 0 ? 1 : false);
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
/* 1443 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 1444 */         if ("Windows".equals(info.getName())) {
/* 1445 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 1446 */           break;
/*      */         }
/*      */       }
/*      */     } catch (Exception ex) {
/* 1450 */       javax.swing.JOptionPane.showMessageDialog(null, "L&F error", "Internal error", 0);
/*      */     }
/*      */     
/*      */ 
/*      */ 
/* 1455 */     java.awt.EventQueue.invokeLater(new Runnable()
/*      */     {
/*      */       public void run()
/*      */       {
/* 1459 */         new FLE().setVisible(true);
/*      */       }
/*      */     });
/*      */   }
/*      */ }
