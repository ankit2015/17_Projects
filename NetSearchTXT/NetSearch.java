
/**
 * @author Ankit Singh
 */

/*
 * NetSearch2.java
 *
 *   Started on Feb 28, 2009, 03:32:02 PM
 * Completed on Mar 06, 2009, 12:47:05 AM
 */



/**
 *
 * @author Ankit Singh
 */
public class NetSearch extends javax.swing.JFrame
{

    /** Creates new form NetSearch */
    public NetSearch()
    {
        initComponents();
        javax.swing.UIManager.LookAndFeelInfo looks[];
        looks = javax.swing.UIManager.getInstalledLookAndFeels();
        try // change look and feel
        {
         // set look and feel for this application
            javax.swing.UIManager.setLookAndFeel( looks[ 3 ].getClassName() );

         // update components in this application
            javax.swing.SwingUtilities.updateComponentTreeUI( this );
        } // end try
        catch ( Exception exception )
        {
            javax.swing.JOptionPane.showMessageDialog(this,"L&F error.","Internal error",javax.swing.JOptionPane.ERROR_MESSAGE);
        } // end catch
        jButton1.requestFocusInWindow();
    }

    void main2()
    {
        try
        {
            String loc=jTextField1.getText();
            java.net.URL hp = new java.net.URL(loc);
            java.net.URLConnection hpCon = hp.openConnection();
            int len = hpCon.getContentLength();
            if (len != 0)
            {
                String s = jTextField2.getText();
                if (s == null)
                {
                    javax.swing.JOptionPane.showMessageDialog(null, "Search string can not be blank.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                }
                else if (s != null && !s.equals(""))
                {
                    char c;
                    String s1;                                // s1 = each line of the HTML page is read into it.
                    StringBuilder s2 = new StringBuilder();  // s2 = the holder of the searched matter.
                    StringBuilder s3 = new StringBuilder(""); // s3 = the holder of the searched Title.
                    StringBuilder buf=new StringBuilder("");
                    String prefix=jTextField4.getText().isEmpty() ? "http://" : jTextField4.getText() ;
//                    String suffix=jTextField5.getText().isEmpty() ? "http://" : jTextField5.getText() ;
                    boolean flag=false;
                    java.io.InputStream input = hpCon.getInputStream();
                    java.io.InputStreamReader in = new java.io.InputStreamReader(input);
                    java.io.BufferedReader br = new java.io.BufferedReader(in);
                    java.io.File file = new java.io.File("C:\\Documents and Settings\\HP_Owner\\My Documents", "NS01.txt");
                    java.io.FileWriter fw = new java.io.FileWriter(file,true);
                    java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);
                    java.io.PrintWriter outFile = new java.io.PrintWriter(bw);
          //          outFile.println("<title>NetSearch Links001</title>");
          //          outFile.println("<body bgcolor=\"#C0C0C0\">");
          //          outFile.println("<p>URL: <a href=\""+loc+"\">");
                    outFile.println("URL: "+loc);
                    java.util.regex.Pattern pat = java.util.regex.Pattern.compile("<title>",java.util.regex.Pattern.CASE_INSENSITIVE);
                    java.util.regex.Matcher mat = null;
                    java.util.regex.Pattern pat2 = java.util.regex.Pattern.compile(s);//,java.util.regex.Pattern.CASE_INSENSITIVE);
                    while ((s1 = br.readLine()) != null)
                    {
                        System.out.println(s1);
                        if(flag==false)
                        {
                            mat = pat.matcher(s1);
                            if(mat.find())
                            {
                                //System.out.println("&&&&&&&&"+s1);
                                for (int i = mat.end(); i<s1.length() ; i++)
                                {
                                    //System.out.print(i+" ");
                                    c = s1.charAt(i);
                                    if (c == '<')
                                    {
                                        //System.out.println("\nbreak !!!");
                                        break;
                                    }
                                    else
                                    {
                                        s3 = s3.append(c);
                                    }
                                }
                                //System.out.println("s3="+s3);
                                //System.out.println("********Title : "+s3+"<br>");
                                outFile.println("Title: "+s3);
                                flag=true;
                                //s3=new StringBuilder("");
                                //System.out.println("s3="+s3);
                            }
                        }
                        else
                        {
                            mat=pat2.matcher(s1);
                            while ( mat.find() )
                            {
                                System.out.println("&&&&&&&&"+s1);
                                for (int i = mat.end(); i<s1.length() ; i++)
                                {
                                    System.out.print(i+" ");
                                    c = s1.charAt(i);
                                    if (c == ' ' || c == '<' || c == '>' || c == '[' || c == ']' || c == '"' || c == '\'')
                                    {
                                        System.out.println("\nbreak !!!");
                                        if(  s2.toString().equals( buf.toString() )  )
                                        {
                                            s2=new StringBuilder();
                                            break;
                                        }

//                                        else if(i == s1.length())
//                                        {
//                                            System.out.println("ANKIT---"+s2);
//                                        }

                                        else
                                        {
              //                              System.out.println(prefix+s+s2);
              //                              outFile.println("<a href=\"" + prefix + s + s2 + "\">");
                                            outFile.println(prefix + s + s2);
                                            buf=s2;
                                        }
                                        s2=new StringBuilder();
                                        break;
                                    }

                                    else if(i == s1.length()-1)
                                    {
                                        s2 = s2.append(c);
               //                         System.out.println("ankit"+s2);
               //                         System.out.println(prefix+s+s2);
               //                         outFile.println("<a href=\"" + prefix + s + s2 + "\">");
                                        outFile.println(prefix + s + s2);
                                        buf=s2;
                                        s2=new StringBuilder();
                                    }

                                    else
                                    {
                                        s2 = s2.append(c);
                                    }
                                }
//                            while(mat.find())
//                            {
//                                int i=mat.end();
//                                c=s1.charAt(i);
//                                while (  c != ' ' || c != '<' || c != '>' || c != '[' || c != ']' || c != '"' || i<s1.length() )
//                                {
//                                    s2=s2.append(s1.charAt(i++));
//                                }
//                                System.out.println(prefix+s+s2);
//                            }
//                                System.out.println("http://"+s2);
//                                outFile.println("<a href=\"http://" + s2 + "\">");
//                                outFile.println("http://"+s2 + "</a> <br>");
//                                s2=new StringBuilder();
                            }
                        }
                    }
                    br.close();
                    outFile.print( jTextField3.getText().isEmpty() ? "" : "Pass  : "+jTextField3.getText()+"<br>" ) ;
                    outFile.println();
                    outFile.close();
                    jTextField1.setText("");
                    jTextField3.setText("");
                }
            }
        }
        catch (java.io.IOException ex)
        {
            javax.swing.JOptionPane.showMessageDialog(null, "Invalid URL / No network available", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NetSearch2");
        setFocusCycleRoot(false);
        setLocationByPlatform(true);
        setResizable(false);

        jLabel1.setText("URL      :");

        jLabel2.setText("Search  :");

        jTextField2.setText("rapidshare.com/files/");

        jButton1.setText("OK");
        jButton1.setFocusCycleRoot(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton1FocusGainedHandler(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Pass     :");

        jLabel4.setText("Prefix   :");

        jLabel5.setText("Suffix   :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        main2();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1FocusGainedHandler(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusGainedHandler
        java.awt.datatransfer.Clipboard cb = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
        Object o="";
        try
        {
            try
            {
                o = cb.getData(new java.awt.datatransfer.DataFlavor("text/plain;class=java.lang.String"));
            }
            catch (ClassNotFoundException ex)
            {}
        }
        catch (java.awt.datatransfer.UnsupportedFlavorException ex)
        {}
        catch (java.io.IOException ex)
        {}
        jTextField1.setText((String)o);
        jButton1.requestFocusInWindow();
    }//GEN-LAST:event_jButton1FocusGainedHandler

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NetSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

}
