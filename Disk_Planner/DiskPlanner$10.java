import java.io.File;
import java.io.FileFilter;

class DiskPlanner$10
  implements FileFilter
{
  DiskPlanner$10(DiskPlanner paramDiskPlanner) {}
  
  public boolean accept(File pathname)
  {
    if ((pathname.isFile()) && (pathname.getName().endsWith(".txt"))) {
      return true;
    }
    return false;
  }
}
