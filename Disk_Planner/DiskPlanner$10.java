/*     */ import java.io.File;
/*     */ import java.io.FileFilter;
/*     */
/*     */ class DiskPlanner$10
/*     */   implements FileFilter
/*     */ {
/*     */   DiskPlanner$10(DiskPlanner paramDiskPlanner) {}
/*     */   
/*     */   public boolean accept(File pathname)
/*     */   {
/* 342 */     if ((pathname.isFile()) && (pathname.getName().endsWith(".txt"))) {
/* 343 */       return true;
/*     */     }
/* 345 */     return false;
/*     */   }
/*     */ }
