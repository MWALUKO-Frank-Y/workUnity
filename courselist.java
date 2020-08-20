package course;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class courseList extends javax.swing.JFrame implements ActionListener{

    JMenuBar mb;
    JMenu m1,m2,m3,m4;
    JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15;
    
    public courseList() {
        initComponents();
        initComponents();
        setBounds(150, 10, 1080, 607);

        ImageIcon im = new ImageIcon(ClassLoader.getSystemResource("course/images/.jpg"));
        JLabel ii = new JLabel(im);
        ii.setBounds(0, 0, 1080, 607);
       add(ii);

        JLabel h1 = new JLabel("course list");
        h1.setForeground(Color.white);
        h1.setFont(new Font("serif", Font.BOLD, 40));
        h1.setBounds(140, 0, 2000, 50);
        ii.add(h1);

        JLabel h = new JLabel("Choose your proffessional,your dreamz are here");
        h.setForeground(Color.WHITE);
        h.setFont(new Font("serif", Font.BOLD, 20));
        h.setBounds(240, 50, 2000, 27);
        ii.add(h);
        
        mb=new JMenuBar();
        mb.setBounds(300, 100, 400, 20);
       ii.add(mb);
       
       m1=new JMenu("choose course");
        m1.setBounds(0, 190, 100, 30);
       mb.add(m1);
       
       m2=new JMenu("choose module");
        m2.setBounds(5, 170, 200, 30);
       mb.add(m2);
       
       m3=new JMenu("choose year");
        m3.setBounds(10, 170, 200, 30);
       mb.add(m3);
       
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
    if(ae.getActionCommand().equals("For new applicant")){
        new applicant().setVisible(true);
        
    }
    else if(ae.getActionCommand().equals("For current applicant")){
        new current applicant().setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(courseList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(courseList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(courseList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(courseList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new courseList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    // End of variables declaration                   
}
