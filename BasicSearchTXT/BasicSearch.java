
/**
 * @author Ankit Singh
 */

 

public class BasicSearch
{
    public static void main(String[] args) throws Exception
    {
        int value = 3;
        javax.swing.UIManager.LookAndFeelInfo looks[];
        looks = javax.swing.UIManager.getInstalledLookAndFeels();
        try
        {
            javax.swing.UIManager.setLookAndFeel(looks[value].getClassName());
            javax.swing.SwingUtilities.updateComponentTreeUI(null);
        }
        catch (Exception exception)
        {}
        javax.swing.JFileChooser fc = new javax.swing.JFileChooser();
        fc.setMultiSelectionEnabled(true);
        int r = fc.showDialog(fc, "Select target file(s)");
        java.io.File[] f = fc.getSelectedFiles();
        if (r == javax.swing.JFileChooser.CANCEL_OPTION || (f[0].getName().equals("")))
            f = null;
        else if (f != null)
        {
            String s = javax.swing.JOptionPane.showInputDialog(fc, "Enter the search string: ", "http://rapidshare.com/files/");
            if (s == null)
            {
                javax.swing.JOptionPane.showMessageDialog(fc,"Search string can not be blank.","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
            else if (s != null && !s.equals(""))
            {
                for (int k = 0; k < f.length; k++)
                {
                    char c;
                    String s1, s2 = "";
                    java.io.FileReader fr = new java.io.FileReader(f[k]);
                    java.io.BufferedReader br = new java.io.BufferedReader(fr);

                    java.io.File file = new java.io.File(f[k].getParent(), "BS01.txt");
                    java.io.FileWriter fw = new java.io.FileWriter(file,true);
                    java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);
                    java.io.PrintWriter outFile = new java.io.PrintWriter(bw);
    //                outFile.println("<html>");
    //                outFile.println();
    //                outFile.println("<head>");
    //                outFile.println("<meta http-equiv=\"Content-Language\" content=\"en-us\">");
    //                outFile.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">");
              //      outFile.println("<title>BS-001</title>");
    //                outFile.println("</head>");
    //                outFile.println();
              //      outFile.println("<body bgcolor=\"#C0C0C0\"><p>");
    //                outFile.println();
    //                outFile.print("<p>");


                    String temp="";
                    while ( (s1 = br.readLine()) != null)
                    {
    //                    System.out.println(s1);
                        for (int i = 0,j=0 ; i < s1.length(); )
                        {
                            while( i<s1.length() && j<s.length() && (c=s1.charAt(i++))==s.charAt(j++) )
                            {
                                s2=s2+c;
                            }
                            if(j==s.length())
                            {
                                while( i<s1.length() )
                                {
                                    c=s1.charAt(i++);
                                    if(c==' ' || c=='<' || c=='>' || c=='[' || c==']' || c=='"')
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        s2=s2+c;
                                    }
                                }
                                if(!s2.equals(temp) && !s2.equals(s))
                                {
    //                                System.out.println(s2);
              //                      outFile.println("<a href=\""+s2+"\">");
              //                      outFile.println(s2+"</a> <br>");
                                    outFile.println(s2);
                                    temp=s2;
                                }
                            }
                            j=0;
                            s2="";
                        }
                    }
                    br.close();
    //                outFile.println("</p>");
    //                outFile.println();
             //       outFile.println("</p></body>");
    //                outFile.println();
             //       outFile.println("</html>");
                    outFile.println();
                    outFile.close();
//                    System.exit(0);
                }
            }
            System.exit(0);
        }
    }
}
