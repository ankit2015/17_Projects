/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.io.File;
/*     */ import javax.swing.JFileChooser;
/*     */ import javax.swing.JMenu;
/*     */ import javax.swing.JMenuItem;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JRadioButtonMenuItem;
/*     */ import javax.swing.JTextArea;
/*     */ 
/*     */ public class DiskPlanner extends javax.swing.JFrame
/*     */ {
/*  13 */   File f = null;
/*  14 */   static long s = 0L;
/*     */   static File[] fi;
/*     */   static long[] si;
/*  17 */   static long l1 = 2147483647L;
/*  18 */   static long l2 = 2147483647L;
/*     */   
/*  20 */   static long x = l1 + l2 + 412352514L;
/*  21 */   static long diff = 0L;
/*     */   private javax.swing.JButton jButton1;
/*     */   private JMenu jMenu1;
/*     */   
/*     */   public DiskPlanner()
/*     */   {
/*  27 */     initComponents();
/*  28 */     changeTheLookAndFeel(3);
/*  29 */     this.jButton1.setEnabled(false);
/*     */   }
/*     */   
/*     */   private JMenu jMenu4;
/*     */   private JMenu jMenu5;
/*     */   
/*  35 */   private void changeTheLookAndFeel(int value) { javax.swing.UIManager.LookAndFeelInfo[] looks = javax.swing.UIManager.getInstalledLookAndFeels();
/*     */     
/*     */     try
/*     */     {
/*  39 */       javax.swing.UIManager.setLookAndFeel(looks[value].getClassName());
/*     */       
/*     */ 
/*  42 */       javax.swing.SwingUtilities.updateComponentTreeUI(this);
/*     */     }
/*     */     catch (Exception exception)
/*     */     {
/*  46 */       JOptionPane.showMessageDialog(this, "L&F error.", "Internal error", 0);
/*     */     }
/*     */   }
/*     */   
/*     */   private JMenu jMenu6;
/*     */   private javax.swing.JMenuBar jMenuBar1;
/*     */   private JMenuItem jMenuItem2;
/*     */   private JMenuItem jMenuItem5;
/*     */   private JMenuItem jMenuItem6;
/*     */   private JRadioButtonMenuItem jRadioButtonMenuItem1;
/*     */   private JRadioButtonMenuItem jRadioButtonMenuItem2;
/*     */   private JRadioButtonMenuItem jRadioButtonMenuItem3;
/*     */   
/*     */   private void initComponents() {
/*  60 */     this.jScrollPane1 = new javax.swing.JScrollPane();
/*  61 */     this.jTextArea1 = new JTextArea();
/*  62 */     this.jButton1 = new javax.swing.JButton();
/*  63 */     this.jSeparator1 = new javax.swing.JSeparator();
/*  64 */     this.jMenuBar1 = new javax.swing.JMenuBar();
/*  65 */     this.jMenu1 = new JMenu();
/*  66 */     this.jMenuItem6 = new JMenuItem();
/*  67 */     this.jMenuItem2 = new JMenuItem();
/*  68 */     this.jMenu4 = new JMenu();
/*  69 */     this.jRadioButtonMenuItem1 = new JRadioButtonMenuItem();
/*  70 */     this.jRadioButtonMenuItem2 = new JRadioButtonMenuItem();
/*  71 */     this.jRadioButtonMenuItem3 = new JRadioButtonMenuItem();
/*  72 */     this.jRadioButtonMenuItem8 = new JRadioButtonMenuItem();
/*  73 */     this.jMenu6 = new JMenu();
/*  74 */     this.jRadioButtonMenuItem4 = new JRadioButtonMenuItem();
/*  75 */     this.jRadioButtonMenuItem5 = new JRadioButtonMenuItem();
/*  76 */     this.jRadioButtonMenuItem6 = new JRadioButtonMenuItem();
/*  77 */     this.jRadioButtonMenuItem7 = new JRadioButtonMenuItem();
/*  78 */     this.jMenu5 = new JMenu();
/*  79 */     this.jMenuItem5 = new JMenuItem();
/*     */     
/*  81 */     setDefaultCloseOperation(3);
/*  82 */     setTitle("Disk Planner");
/*  83 */     setLocationByPlatform(true);
/*  84 */     this.jTextArea1.setColumns(20);
/*  85 */     this.jTextArea1.setEditable(false);
/*  86 */     this.jTextArea1.setRows(5);
/*  87 */     this.jTextArea1.setDoubleBuffered(true);
/*  88 */     this.jScrollPane1.setViewportView(this.jTextArea1);
/*     */     
/*  90 */     this.jButton1.setText("Plan");
/*  91 */     this.jButton1.setToolTipText("First select a folder & the disk type-CD or DVD");
/*  92 */     this.jButton1.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  94 */         DiskPlanner.this.jButton1ActionPerformed(evt);
/*     */       }
/*     */       
/*  97 */     });
/*  98 */     this.jMenu1.setText("File");
/*  99 */     this.jMenuItem6.setText("Select folder...");
/* 100 */     this.jMenuItem6.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 102 */         DiskPlanner.this.jMenuItem6ActionPerformed(evt);
/*     */       }
/*     */       
/* 105 */     });
/* 106 */     this.jMenu1.add(this.jMenuItem6);
/*     */     
/* 108 */     this.jMenuItem2.setText("Save As...");
/* 109 */     this.jMenuItem2.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 111 */         DiskPlanner.this.jMenuItem2ActionPerformed(evt);
/*     */       }
/*     */       
/* 114 */     });
/* 115 */     this.jMenu1.add(this.jMenuItem2);
/*     */     
/* 117 */     this.jMenuBar1.add(this.jMenu1);
/*     */     
/* 119 */     this.jMenu4.setText("Disk");
/* 120 */     this.jRadioButtonMenuItem1.setText("CD");
/* 121 */     this.jMenu4.add(this.jRadioButtonMenuItem1);
/*     */     
/* 123 */     this.jRadioButtonMenuItem2.setText("DVD");
/* 124 */     this.jMenu4.add(this.jRadioButtonMenuItem2);
/*     */     
/* 126 */     this.jRadioButtonMenuItem3.setText("Custom...");
/* 127 */     this.jRadioButtonMenuItem3.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 129 */         DiskPlanner.this.jRadioButtonMenuItem3ActionPerformed(evt);
/*     */       }
/*     */       
/* 132 */     });
/* 133 */     this.jMenu4.add(this.jRadioButtonMenuItem3);
/*     */     
/* 135 */     this.jRadioButtonMenuItem8.setText("BD");
/* 136 */     this.jMenu4.add(this.jRadioButtonMenuItem8);
/*     */     
/* 138 */     this.jMenuBar1.add(this.jMenu4);
/*     */     
/* 140 */     this.jMenu6.setText("Skin");
/* 141 */     this.jRadioButtonMenuItem4.setText("Windows");
/* 142 */     this.jRadioButtonMenuItem4.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 144 */         DiskPlanner.this.jRadioButtonMenuItem4ActionPerformed(evt);
/*     */       }
/*     */       
/* 147 */     });
/* 148 */     this.jMenu6.add(this.jRadioButtonMenuItem4);
/*     */     
/* 150 */     this.jRadioButtonMenuItem5.setText("Classic");
/* 151 */     this.jRadioButtonMenuItem5.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 153 */         DiskPlanner.this.jRadioButtonMenuItem5ActionPerformed(evt);
/*     */       }
/*     */       
/* 156 */     });
/* 157 */     this.jMenu6.add(this.jRadioButtonMenuItem5);
/*     */     
/* 159 */     this.jRadioButtonMenuItem6.setText("Motif");
/* 160 */     this.jRadioButtonMenuItem6.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 162 */         DiskPlanner.this.jRadioButtonMenuItem6ActionPerformed(evt);
/*     */       }
/*     */       
/* 165 */     });
/* 166 */     this.jMenu6.add(this.jRadioButtonMenuItem6);
/*     */     
/* 168 */     this.jRadioButtonMenuItem7.setText("Metal");
/* 169 */     this.jRadioButtonMenuItem7.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 171 */         DiskPlanner.this.jRadioButtonMenuItem7ActionPerformed(evt);
/*     */       }
/*     */       
/* 174 */     });
/* 175 */     this.jMenu6.add(this.jRadioButtonMenuItem7);
/*     */     
/* 177 */     this.jMenuBar1.add(this.jMenu6);
/*     */     
/* 179 */     this.jMenu5.setText("Help");
/* 180 */     this.jMenuItem5.setText("About Disk Planner");
/* 181 */     this.jMenuItem5.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 183 */         DiskPlanner.this.jMenuItem5ActionPerformed(evt);
/*     */       }
/*     */       
/* 186 */     });
/* 187 */     this.jMenu5.add(this.jMenuItem5);
/*     */     
/* 189 */     this.jMenuBar1.add(this.jMenu5);
/*     */     
/* 191 */     setJMenuBar(this.jMenuBar1);
/*     */     
/* 193 */     javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
/* 194 */     getContentPane().setLayout(layout);
/* 195 */     layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(60, 60, 60).addComponent(this.jButton1).addContainerGap(287, 32767)).addComponent(this.jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, -1, 400, 32767).addComponent(this.jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, -1, 400, 32767));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 204 */     layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jScrollPane1, -1, 223, 32767).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jSeparator1, -2, 10, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1).addContainerGap()));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 214 */     pack();
/*     */   }
/*     */   
/*     */   private void jRadioButtonMenuItem3ActionPerformed(ActionEvent evt) {
/* 218 */     String s = JOptionPane.showInputDialog(this, "Enter the destination size in bytes: ", "DVD");
/* 219 */     if (s != null)
/*     */     {
/* 221 */       if (!s.equalsIgnoreCase("DVD"))
/*     */       {
/* 223 */         if ((s != null) && (s != ""))
/*     */         {
/*     */           try
/*     */           {
/* 227 */             x = Long.parseLong(s);
/*     */           }
/*     */           catch (NumberFormatException ex)
/*     */           {
/* 231 */             JOptionPane.showMessageDialog(this, "Invalid input.", "Invalid input", 0);
/*     */           } }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 238 */     this.jTextArea1.setText("Please Wait...");
/* 239 */     fi = this.f.listFiles();
/* 240 */     si = new long[fi.length];
/* 241 */     for (int i = 0; i < fi.length; i++)
/*     */     {
/* 243 */       if (fi[i].isDirectory())
/*     */       {
/*     */ 
/* 246 */         si[i] = Size(fi[i]);
/* 247 */         s = 0L;
/*     */       }
/*     */       else
/*     */       {
/* 251 */         si[i] = fi[i].length();
/*     */       }
/*     */     }
/*     */     
/* 255 */     this.jTextArea1.append("..");
/*     */     
/*     */ 
/* 258 */     for (int i = 0; i < fi.length; i++)
/*     */     {
/* 260 */       for (int j = 0; j < fi.length - 1; j++)
/*     */       {
/* 262 */         if (si[j] < si[(j + 1)])
/*     */         {
/* 264 */           long temp = si[j];
/* 265 */           File temp2 = fi[j];
/*     */           
/* 267 */           si[j] = si[(j + 1)];
/* 268 */           fi[j] = fi[(j + 1)];
/*     */           
/* 270 */           si[(j + 1)] = temp;
/* 271 */           fi[(j + 1)] = temp2;
/*     */         }
/*     */       }
/*     */     }
/* 275 */     this.jTextArea1.append("..");
/* 276 */     this.jTextArea1.setText("");
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 281 */     byte n = 1;
/* 282 */     for (int i = 0; i < si.length; i++)
/*     */     {
/* 284 */       if (si[i] > 0L)
/*     */       {
/* 286 */         diff = x - si[i];
/* 287 */         si[i] = (-1L * si[i]);
/* 288 */         if (diff < 0L)
/*     */         {
/* 290 */           this.jTextArea1.append("\nFolder:- " + fi[i].getName() + "\t\t" + "-- TOO LARGE - Run 'Disk Planner' on this folder individually.");
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/* 295 */           n = (byte)(n + 1);this.jTextArea1.append("\nDisk-" + n + ":- " + fi[i].getName());
/*     */           
/* 297 */           algo(i);
/*     */         }
/*     */       }
/*     */     }
/* 301 */     this.jButton1.setEnabled(false);
/*     */   }
/*     */   
/*     */   private void jRadioButtonMenuItem7ActionPerformed(ActionEvent evt) {
/* 305 */     changeTheLookAndFeel(0);
/*     */   }
/*     */   
/*     */   private void jRadioButtonMenuItem6ActionPerformed(ActionEvent evt) {
/* 309 */     changeTheLookAndFeel(1);
/*     */   }
/*     */   
/*     */   private void jRadioButtonMenuItem5ActionPerformed(ActionEvent evt) {
/* 313 */     changeTheLookAndFeel(2);
/*     */   }
/*     */   
/*     */   private void jRadioButtonMenuItem4ActionPerformed(ActionEvent evt) {
/* 317 */     changeTheLookAndFeel(3);
/*     */   }
/*     */   
/*     */   private void jMenuItem5ActionPerformed(ActionEvent evt) {
/* 321 */     JOptionPane.showMessageDialog(null, "Disk Planner by Ankit Singh,\n\nto get the optimal combination of files and folders for:\n• burning on to a CD/DVD/BD\n• copying on to a pen drive\n\nThis software has the capability to run\non any Operating System in the world.\n\n", "About Disk Planner", 1);
/*     */   }
/*     */   
/*     */   private void jMenuItem2ActionPerformed(ActionEvent evt) {
/* 325 */     JFileChooser fc = new JFileChooser();
/* 326 */     fc.setDoubleBuffered(true);
/* 327 */     javax.swing.filechooser.FileNameExtensionFilter ff = new javax.swing.filechooser.FileNameExtensionFilter("Text Documents (*.txt)", new String[] { "txt" });
/* 328 */     fc.setFileFilter(ff);
/* 329 */     int r = fc.showSaveDialog(this);
/* 330 */     File fs = fc.getSelectedFile();
/*     */     
/* 332 */     if ((r == 1) || (fs.getName().equals("")))
/* 333 */       fs = null;
/* 334 */     boolean flag = false;
/* 335 */     if ((fs != null) && (r == 0))
/*     */     {
/* 337 */       fs = new File(fs + ".txt");
/*     */       
/* 339 */       java.io.FileFilter ff2 = new java.io.FileFilter()
/*     */       {
/*     */         public boolean accept(File pathname) {
/* 342 */           if ((pathname.isFile()) && (pathname.getName().endsWith(".txt"))) {
/* 343 */             return true;
/*     */           }
/* 345 */           return false;
/*     */         }
/* 347 */       };
/* 348 */       File[] a = fs.getParentFile().listFiles(ff2);
/*     */       
/* 350 */       for (short i = 0; i < a.length; i = (short)(i + 1))
/*     */       {
/*     */ 
/* 353 */         if (a[i].toString().equals(fs.toString()))
/*     */         {
/* 355 */           flag = true;
/* 356 */           break;
/*     */         }
/*     */       }
/*     */     }
/* 360 */     if (flag == true)
/*     */     {
/* 362 */       int s = JOptionPane.showConfirmDialog(this, fs.getAbsoluteFile() + " already exists.\nDo you want to replace it?", "Save As", 0, 2);
/* 363 */       if (s == 0)
/*     */       {
/*     */         try
/*     */         {
/* 367 */           java.io.PrintWriter pw = new java.io.PrintWriter(fs);
/* 368 */           pw.write(this.jTextArea1.getText());
/* 369 */           pw.close();
/*     */ 
/*     */         }
/*     */         catch (java.io.FileNotFoundException ex)
/*     */         {
/* 374 */           JOptionPane.showMessageDialog(this, "File not found.", "File Error", 0);
/*     */         }
/*     */         catch (java.io.IOException ioException)
/*     */         {
/* 378 */           JOptionPane.showMessageDialog(this, "Unable to read the file.", "File Error", 0);
/*     */         }
/*     */         catch (SecurityException securityException)
/*     */         {
/* 382 */           JOptionPane.showMessageDialog(this, "You do not have write access to this file.", "File Error", 0);
/*     */         }
/*     */       }
/*     */     }
/* 386 */     else if (fs != null)
/*     */     {
/*     */ 
/*     */       try
/*     */       {
/* 391 */         java.io.PrintWriter pw = new java.io.PrintWriter(fs);
/* 392 */         pw.write(this.jTextArea1.getText());
/* 393 */         pw.close();
/*     */ 
/*     */       }
/*     */       catch (java.io.FileNotFoundException ex)
/*     */       {
/* 398 */         JOptionPane.showMessageDialog(this, "File not found.", "File Error", 0);
/*     */       }
/*     */       catch (java.io.IOException ioException)
/*     */       {
/* 402 */         JOptionPane.showMessageDialog(this, "Unable to read the file.", "File Error", 0);
/*     */       }
/*     */       catch (SecurityException securityException)
/*     */       {
/* 406 */         JOptionPane.showMessageDialog(this, "You do not have write access to this file.", "File Error", 0);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private void jMenuItem6ActionPerformed(ActionEvent evt) {
/* 412 */     JFileChooser fc = new JFileChooser();
/* 413 */     fc.setFileSelectionMode(1);
/* 414 */     fc.setCurrentDirectory(new File("/"));
/* 415 */     fc.setDoubleBuffered(true);
/* 416 */     int r = fc.showDialog(this, "Select folder");
/* 417 */     this.f = fc.getSelectedFile();
/*     */     
/*     */ 
/* 420 */     if ((r == 1) || (this.f.getName().equals(""))) {
/* 421 */       this.f = null;
/* 422 */     } else if (this.f != null) {
/* 423 */       this.jButton1.setEnabled(true);
/*     */     }
/*     */   }
/*     */   
/*     */   public static long Size(File f)
/*     */   {
/* 429 */     File[] ar = f.listFiles();
/* 430 */     for (int i = 0; i < ar.length; i++)
/*     */     {
/* 432 */       if (ar[i].isFile())
/*     */       {
/* 434 */         s += ar[i].length();
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/* 439 */         Size(ar[i]);
/*     */       }
/*     */     }
/*     */     
/* 443 */     return s;
/*     */   }
/*     */   
/*     */   public void algo(int i)
/*     */   {
/* 448 */     for (int j = i + 1; j < si.length; j++)
/*     */     {
/*     */ 
/* 451 */       if (si[j] > 0L)
/*     */       {
/* 453 */         if (si[j] == diff)
/*     */         {
/* 455 */           si[j] = (-1L * si[j]);
/*     */           
/* 457 */           this.jTextArea1.append(" + " + fi[j].getName());
/* 458 */           break;
/*     */         }
/* 460 */         if (si[j] < diff)
/*     */         {
/* 462 */           diff -= si[j];
/* 463 */           si[j] = (-1L * si[j]);
/* 464 */           this.jTextArea1.append(" + " + fi[j].getName());
/*     */           
/* 466 */           algo(j);
/*     */         } } } }
/*     */   
/*     */   private JRadioButtonMenuItem jRadioButtonMenuItem4;
/*     */   private JRadioButtonMenuItem jRadioButtonMenuItem5;
/*     */   private JRadioButtonMenuItem jRadioButtonMenuItem6;
/*     */   private JRadioButtonMenuItem jRadioButtonMenuItem7;
/*     */   private JRadioButtonMenuItem jRadioButtonMenuItem8;
/*     */   private javax.swing.JScrollPane jScrollPane1;
/*     */   private javax.swing.JSeparator jSeparator1;
/*     */   private JTextArea jTextArea1;
/* 477 */   public static void main(String[] args) { java.awt.EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 479 */         new DiskPlanner().setVisible(true);
/*     */       }
/*     */     }); }
/*     */ }
