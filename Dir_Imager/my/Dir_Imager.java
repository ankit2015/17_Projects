/*    */ package my;
/*    */ 
/*    */ import java.io.File;
/*    */ import javax.swing.JFileChooser;
/*    */ import javax.swing.UIManager;
/*    */ import javax.swing.UIManager.LookAndFeelInfo;
/*    */ 
/*    */ public class Dir_Imager
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/* 12 */     int value = 3;
/*    */     
/* 14 */     UIManager.LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
/*    */     try
/*    */     {
/* 17 */       UIManager.setLookAndFeel(looks[value].getClassName());
/* 18 */       javax.swing.SwingUtilities.updateComponentTreeUI(null);
/*    */     }
/*    */     catch (Exception e) {}
/*    */     
/* 22 */     JFileChooser fc = new JFileChooser();
/* 23 */     fc.setFileSelectionMode(1);
/* 24 */     fc.setMultiSelectionEnabled(true);
/* 25 */     int r = fc.showDialog(fc, "Select target folder(s)");
/* 26 */     File[] f = fc.getSelectedFiles();
/* 27 */     if ((r == 1) || (f[0].getName().equals("")))
/*    */     {
/*    */ 
/* 30 */       System.exit(0);
/*    */     }
/* 32 */     else if (f != null)
/*    */     {
/* 34 */       String loc = "C:\\Dir_Images\\";
/* 35 */       new File(loc).mkdir();
/* 36 */       for (int i = 0; i < f.length; i++)
/*    */       {
/* 38 */         loc = loc + f[i].getName();
/* 39 */         File fo = new File(loc);
/* 40 */         if (fo.mkdir())
/*    */         {
/*    */ 
/* 43 */           Imager(loc, f[i]);
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   private static void Imager(String loc, File f)
/*    */   {
/* 51 */     File[] fi = f.listFiles();
/* 52 */     for (int i = 0; i < fi.length; i++)
/*    */     {
/* 54 */       if (fi[i].isDirectory())
/*    */       {
/* 56 */         String lo = loc.concat("\\").concat(fi[i].getName());
/*    */         
/* 58 */         File fo = new File(lo);
/* 59 */         fo.mkdir();
/*    */         
/* 61 */         Imager(lo, fi[i]);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       }
/* 68 */       else if ((fi[i].isFile()) && (fi[i].length() > 1048576L))
/*    */       {
/* 70 */         File f2 = new File(loc, fi[i].getName());
/*    */         try
/*    */         {
/* 73 */           f2.createNewFile();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         }
/*    */         catch (java.io.IOException ex)
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/* 84 */           javax.swing.JOptionPane.showMessageDialog(null, "An I/O error occured.", "I/O Error", 0);
/* 85 */           System.exit(0);
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ }
