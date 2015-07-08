/*     */ package filelisterall;
/*     */ 
/*     */ import java.io.File;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.JFileChooser;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTextArea;
/*     */ 
/*     */ public class FileListerAll extends javax.swing.JFrame
/*     */ {
/*  12 */   static File[] f = null;
/*     */   private JScrollPane jScrollPane1;
/*     */   private JTextArea jTextArea1;
/*     */   
/*     */   public FileListerAll() {
/*  17 */     initComponents();
/*  18 */     changeTheLookAndFeel(3);
/*  19 */     JFileChooser fc = new JFileChooser();
/*  20 */     fc.setFileSelectionMode(1);
/*  21 */     fc.setMultiSelectionEnabled(true);
/*  22 */     int r = fc.showDialog(this, "Select folder");
/*  23 */     f = fc.getSelectedFiles();
/*  24 */     if ((r == 1) || (!f[0].exists()) || (f.length == 0)) {
/*  25 */       System.exit(0);
/*  26 */     } else if (f != null)
/*     */     {
/*  28 */       for (File f1 : f) {
/*  29 */         this.jTextArea1.append(f1.getName().toUpperCase() + "\n\n");
/*  30 */         Size(f1);
/*  31 */         this.jTextArea1.append("\n************************END_OF_LIST************************\n\n");
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private void changeTheLookAndFeel(int value)
/*     */   {
/*  40 */     javax.swing.UIManager.LookAndFeelInfo[] looks = javax.swing.UIManager.getInstalledLookAndFeels();
/*     */     
/*     */     try
/*     */     {
/*  44 */       javax.swing.UIManager.setLookAndFeel(looks[value].getClassName());
/*     */       
/*     */ 
/*  47 */       javax.swing.SwingUtilities.updateComponentTreeUI(this);
/*     */     }
/*     */     catch (Exception exception)
/*     */     {
/*  51 */       javax.swing.JOptionPane.showMessageDialog(this, "L&F error.", "Internal error", 0);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   void Size(File f)
/*     */   {
/*  58 */     int c = 0;
/*  59 */     long l = 0L;
/*     */     
/*  61 */     File[] fi = f.listFiles();
/*  62 */     for (int i = 0; i < fi.length; i++)
/*     */     {
/*  64 */       if (fi[i].isDirectory())
/*     */       {
/*  66 */         this.jTextArea1.append(fi[i].getPath() + "  - FOLDER\n");
/*  67 */         Size(fi[i]);
/*     */       }
/*  69 */       else if (fi[i].isFile())
/*     */       {
/*  71 */         l = fi[i].length();
/*  72 */         if (l < 1024L) {
/*  73 */           this.jTextArea1.append(++c + ">" + fi[i].getName() + "   " + l + " bytes\n");
/*  74 */         } else if ((l > 1024L) && (l < 1048576L)) {
/*  75 */           this.jTextArea1.append(++c + ">" + fi[i].getName() + "   " + l / 1024L + " KB\n");
/*  76 */         } else if (l > 1048576L) {
/*  77 */           this.jTextArea1.append(++c + ">" + fi[i].getName() + "   " + l / 1048576L + " MB\n");
/*     */         }
/*  79 */         l = 0L;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private void initComponents()
/*     */   {
/*  93 */     this.jScrollPane1 = new JScrollPane();
/*  94 */     this.jTextArea1 = new JTextArea();
/*     */     
/*  96 */     setDefaultCloseOperation(3);
/*  97 */     setLocationByPlatform(true);
/*     */     
/*  99 */     this.jTextArea1.setColumns(20);
/* 100 */     this.jTextArea1.setRows(5);
/* 101 */     this.jScrollPane1.setViewportView(this.jTextArea1);
/*     */     
/* 103 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 104 */     getContentPane().setLayout(layout);
/* 105 */     layout.setHorizontalGroup(layout
/* 106 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 107 */       .addComponent(this.jScrollPane1, -1, 504, 32767));
/*     */     
/* 109 */     layout.setVerticalGroup(layout
/* 110 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 111 */       .addComponent(this.jScrollPane1, -1, 499, 32767));
/*     */     
/*     */ 
/* 114 */     pack();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/* 121 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 123 */         new FileListerAll().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }
