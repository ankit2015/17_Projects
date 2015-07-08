/*     */ package checkagainst;
/*     */ 
/*     */ import java.io.BufferedReader;
/*     */ import javax.swing.JFileChooser;
/*     */ import javax.swing.JOptionPane;
/*     */ 
/*     */ public class CheckAgainst
/*     */ {
/*     */   public static void main(String[] args)
/*     */   {
/*  11 */     int value = 3;
/*     */     
/*  13 */     javax.swing.UIManager.LookAndFeelInfo[] looks = javax.swing.UIManager.getInstalledLookAndFeels();
/*     */     try
/*     */     {
/*  16 */       javax.swing.UIManager.setLookAndFeel(looks[value].getClassName());
/*  17 */       javax.swing.SwingUtilities.updateComponentTreeUI(null);
/*     */     }
/*     */     catch (Exception e) {}
/*     */     
/*  21 */     JFileChooser fc = new JFileChooser();
/*  22 */     fc.setMultiSelectionEnabled(true);
/*  23 */     fc.setFileSelectionMode(0);
/*  24 */     fc.setFileHidingEnabled(false);
/*  25 */     javax.swing.filechooser.FileNameExtensionFilter filter = new javax.swing.filechooser.FileNameExtensionFilter("TEXT & HTML files only", new String[] { "txt", "htm", "html" });
/*  26 */     fc.setFileFilter(filter);
/*  27 */     int r = fc.showDialog(fc, "Select atleast two files");
/*  28 */     java.io.File[] files = fc.getSelectedFiles();
/*  29 */     for (int i = 0; i < files.length; i++) {}
/*     */     
/*     */ 
/*     */ 
/*  33 */     if (r == 1)
/*     */     {
/*  35 */       System.exit(0);
/*     */     }
/*  37 */     if (files.length < 2)
/*     */     {
/*  39 */       files = null;
/*  40 */       JOptionPane.showMessageDialog(null, "You need to select atleast two files\n\nPlease try again!\n\nCheckAgainst will now exit", "Error", 0);
/*  41 */       System.exit(0);
/*     */     }
/*     */     else
/*     */     {
/*  45 */       java.util.ArrayList<String> unique = new java.util.ArrayList();
/*     */       try
/*     */       {
/*  48 */         java.io.File fi = files[0];
/*  49 */         java.io.FileReader fr = new java.io.FileReader(fi);
/*  50 */         BufferedReader br = new BufferedReader(fr);
/*     */         String line;
/*  52 */         while ((line = br.readLine()) != null)
/*     */         {
/*     */ 
/*  55 */           if (!"".equals(line))
/*     */           {
/*  57 */             unique.add(line);
/*     */           }
/*     */         }
/*  60 */         br.close();fr.close();
/*  61 */         for (java.util.Iterator i$ = unique.iterator(); i$.hasNext(); a = (String)i$.next()) {}
/*     */       }
/*     */       catch (java.io.FileNotFoundException e)
/*     */       {
/*     */         String a;
/*     */         
/*     */ 
/*  68 */         JOptionPane.showMessageDialog(null, "The first file was not found\n\nEnsure that the first file exists\n\nCheckAgainst will now exit", "Error", 0);
/*     */ 
/*     */       }
/*     */       catch (java.io.IOException e)
/*     */       {
/*  73 */         JOptionPane.showMessageDialog(null, "An IOException occured with the first file\n\nCheckAgainst will now exit", "Error", 0);
/*     */       }
/*     */       
/*     */       try
/*     */       {
/*  78 */         java.io.File fil = new java.io.File(files[0].getParent(), "checked.txt");
/*  79 */         java.io.FileWriter fw = new java.io.FileWriter(fil, true);
/*  80 */         java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);
/*  81 */         java.io.PrintWriter outFile = new java.io.PrintWriter(bw);
/*  82 */         outFile.println("Contents of each file not found in the first file - " + files[0].getName() + " are:");
/*     */         
/*  84 */         for (int i = 1; i < files.length; i++)
/*     */         {
/*     */ 
/*  87 */           outFile.println("");
/*  88 */           outFile.println(files[i]);
/*     */           try
/*     */           {
/*  91 */             java.io.File fi = files[i];
/*  92 */             java.io.FileReader fr = new java.io.FileReader(fi);
/*  93 */             BufferedReader br = new BufferedReader(fr);
/*     */             
/*     */             String line;
/*  96 */             while ((line = br.readLine()) != null)
/*     */             {
/*     */ 
/*  99 */               if ((!"".equals(line)) && 
/*     */               
/* 101 */                 (!unique.contains(line)))
/*     */               {
/* 103 */                 outFile.println(line);
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */             br.close();fr.close();
/*     */ 
/*     */           }
/*     */           catch (java.io.FileNotFoundException e)
/*     */           {
/*     */ 
/* 118 */             JOptionPane.showMessageDialog(null, "The other file was not found\n\nEnsure that the other files exist\n\nCheckAgainst will now exit", "Error", 0);
/*     */ 
/*     */ 
/*     */           }
/*     */           catch (java.io.IOException e)
/*     */           {
/*     */ 
/* 125 */             JOptionPane.showMessageDialog(null, "An IOException occured with the other file\n\nCheckAgainst will now exit", "Error", 0);
/*     */           }
/*     */         }
/*     */         
/* 129 */         outFile.close();bw.close();fw.close();
/*     */       }
/*     */       catch (java.io.FileNotFoundException e)
/*     */       {
/* 133 */         JOptionPane.showMessageDialog(null, "A FileNotFoundException occured with the file 'checked.txt'", "Error", 0);
/*     */ 
/*     */       }
/*     */       catch (java.io.IOException e)
/*     */       {
/* 138 */         JOptionPane.showMessageDialog(null, "An IOException occured with the file 'checked.txt'", "Error", 0);
/*     */       }
/*     */     }
/*     */   }
/*     */ }
