/*
 * To change this template, choose Tools | Templates
 * and ope  n the template in the editor.
 */
package tipcalculator;

import java.awt.Dimension;
import java.awt.event.FocusEvent;
import java.text.DecimalFormat;
import javax.swing.BoxLayout;

/**
 *
 * @author Shwetha
 */


public class TipFrame extends javax.swing.JFrame {

    /**
     * Creates new form TipFrame
     */
    
    public static int h;
    public static int w;
    
    public static boolean enabled_tax = false;
    public static boolean enabled_deduction = false;
    
    public static int guests = 1;
    public static boolean flag_changed;
    public static boolean flag_changed1;
    public static String[] ar = new String[11];
    public static String[] br = new String[11];
    public static int i;
    public static String ar_values = new String();
    public static String br_values = new String();
    
    public static int index;
    public static int index1;
    public static int index3;
    public static int q = 0;
    //public static String[] names_split = new String[100];
    
    
    
    public static Boolean flag_Tailor = false;
    public static Boolean flag_Tailored = false;
    
    
    public static int qual = 0;
    public static double total;
    public static int lim = 10000;
    public static double tipRate;
    public static double deduction;
    public static double tax;
    public static String[] split = new String[lim];       
    public static String[] split1 = new String[lim];
    
    
    public static String[] values = new String[100];
    public static double sum = 0.0;
    public static double sum_tip = 0.0;
    public static double billtotal = 0.0;
    
    public javax.swing.JTextField jt = new javax.swing.JTextField();
    public javax.swing.JTextField jt1 = new javax.swing.JTextField();
    public static double tips = 0.0;
    
    public static double totals;
    public static double rate = 0.0;
    public static double tipRates;
    
    
    public static double deductions;
    public static double taxes = 0.0;
    
    public static int minimum;
    public static int maximum;
    public static int val;
    
    //public javax.swing.JTextField[] a = new javax.swing.JTextField[guests+2];
    //public javax.swing.JTextField[] b = new javax.swing.JTextField[guests+2];
    public javax.swing.JTextField[] a;
    public javax.swing.JTextField[] b;
    
    public static String[] names = new String[guests+1];
    
    public static String names_guests = new String();
    
    
    
    
    
    public TipFrame() {
        initComponents();
        jTextField1.setText(Integer.toString(guests));
        
        jTextField1.addFocusListener(new java.awt.event.FocusListener() {

            @Override
            public void focusGained(FocusEvent fe) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void focusLost(FocusEvent fe) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                guests = Integer.parseInt(((javax.swing.JTextField)fe.getSource()).getText());
               // System.out.println("Guest focus lost");
                split = new String[lim];
            }
        });
        
        
        
        //split = new String[lim];
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        //jTextField6.setText("");
        jTextField6.setText(Double.toString(tips));
        
        jTextField1.setColumns(4);
        jTextField2.setColumns(4);
        jTextField3.setColumns(4);
        jTextField4.setColumns(4);
        jTextField5.setColumns(4);
        jTextField6.setColumns(4);
        
        //guests = Integer.parseInt(jTextField1.getText());
        ar[0] = "0";
        br[0] = "0";
        int n = 1000;
        a = new javax.swing.JTextField[guests+n];
        b = new javax.swing.JTextField[guests+n];
        //split = new String[guests+2];
        //split1 = new String[guests+2];
        
        
        
        
        Configuration c = new Configuration();
        
        minimum = c.Min;
        maximum = c.Max;
        
        
        
        val = quality.getValue();
        
        tipRate = (maximum - minimum)* q/100;
        
        String tip = Double.toString(tipRate);
       // System.out.println(jTextField2.getText());
        if(jTextField2.getText() == "")
        {
            jTextField5.setText("");
        }
        else
        {
            jTextField5.setText(tip);
        }
       // System.out.println(jTextField4.isEditable());
    
        quality.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        quality.setMajorTickSpacing(20);
        quality.setMinorTickSpacing(5);
        quality.setPaintTicks(true);
        quality.setValue(10);
   
        Configuration c1 = new Configuration();
        
        
       // System.out.println(c1.Tax_Include.isSelected());
        
        if(enabled_deduction == true)
        {
            jTextField3.setEnabled(true);
        }
        else if(enabled_deduction == false)
        {
            jTextField3.setEnabled(false);
        }
        
        if(enabled_tax == true)
        {
            jTextField4.setEnabled(true);
        }
        else if(enabled_tax == false)
        {
            jTextField4.setEnabled(false);
        }
        
        
        
        if(flag_changed == false)
        {
           
        }
       else
        {
         
            
          System.out.println("Ar_Values"+ar_values);
          split= ar_values.split("\\s+");
          for(int sp=0; sp<split.length;sp++)
          {
              System.out.println(split[sp]);
          }
        }
        
        if(flag_changed1 == false)
        {
              
        }
        
        else
        {
          System.out.println(br_values);
          split1= br_values.split("\\s+");
          System.out.println("Split1 length"+split1.length);
          for(int sp=0; sp<split1.length;sp++)
          {
              System.out.println(split1[sp]);
          }
        }
        
    }
    
    

    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        quality = new javax.swing.JSlider();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        Calculate = new javax.swing.JButton();
        Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tip");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Guests");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 72, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField1InputMethodTextChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 31, 0, 0);
        getContentPane().add(jTextField1, gridBagConstraints);

        jTextField2.setText("jTextField2");
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField2MouseExited(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 31, 0, 0);
        getContentPane().add(jTextField2, gridBagConstraints);

        jTextField3.setText("jTextField3");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 31, 0, 0);
        getContentPane().add(jTextField3, gridBagConstraints);

        quality.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qualityStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 164;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 31, 0, 0);
        getContentPane().add(quality, gridBagConstraints);

        jTextField4.setText("jTextField4");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 31, 0, 0);
        getContentPane().add(jTextField4, gridBagConstraints);

        jTextField5.setText("jTextField5");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 31, 0, 0);
        getContentPane().add(jTextField5, gridBagConstraints);

        jLabel2.setText("Quality");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 72, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setText("Bill Total");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 72, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setText("Bill Deduction");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 72, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setText("Tax");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 72, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);

        jLabel6.setText("Tip Rate");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 72, 0, 0);
        getContentPane().add(jLabel6, gridBagConstraints);

        jButton1.setText("Tip Tailoring");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 46, 0, 0);
        getContentPane().add(jButton1, gridBagConstraints);

        jButton2.setText("Configure");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 17, 0, 0);
        getContentPane().add(jButton2, gridBagConstraints);

        jTextField6.setText("jTextField6");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 0, 19);
        getContentPane().add(jTextField6, gridBagConstraints);

        jButton3.setText("Help");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 0, 19);
        getContentPane().add(jButton3, gridBagConstraints);

        Calculate.setText("Calculate");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 6, 0, 0);
        getContentPane().add(Calculate, gridBagConstraints);

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 28, 11, 0);
        getContentPane().add(Reset, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        String s;
        //double total;
        s = jTextField2.getText();
        total = Integer.parseInt(s);
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    String s;
    //int guests;
    s = jTextField1.getText();
    guests = Integer.parseInt(s);
   // System.out.println(guests);    
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
        String s;
        //double deduction;
        s = jTextField3.getText();
        deduction = Integer.parseInt(s);
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
        String s;
        //double tax;
        s = jTextField4.getText();
        
        Boolean b1 = isNumeric(s);  
        
        if(b1==false)
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Invalid entry!");
        }
        
        
        else
        {
        tax = Integer.parseInt(s);
        
        if(tax<0)
        {
            System.out.println("Error");
            javax.swing.JOptionPane.showMessageDialog(this, "Tax cannot be less than 0!");
        }
        }
    }//GEN-LAST:event_jTextField4ActionPerformed

public static boolean isNumeric(String str)  
{  
  try  
  {  
    double d = Double.parseDouble(str);  
  }  
  catch(NumberFormatException nfe)  
  {  
    return false;  
  }  
  return true;  
}    
    
    
    
    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
        String s;
        //double tipRate;
        s = jTextField5.getText();
        tipRate = Integer.parseInt(s);
        
        Configuration c1 = new Configuration();
        String s1 = c1.Minimum.getText();
        String s2 = c1.Maximum.getText();
        int min = Integer.parseInt(s1);
        int max = Integer.parseInt(s2);
        
        if(tipRate < min )
        {
            javax.swing.JOptionPane.showMessageDialog(this, "TipRate < Minimum!");
        }
        
        else if(tipRate > max)
        {
            javax.swing.JOptionPane.showMessageDialog(this, "TipRate > Maximum!");
        }
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        guests = Integer.parseInt(jTextField1.getText());
       // System.out.println(guests+"Guests");
        
        flag_changed = true;
        flag_changed1 = true;
    
        String g = jTextField1.getText();
        String g1 = jTextField2.getText();
        String g2 = jTextField3.getText();
        String g3 = jTextField4.getText();
        String g4 = jTextField5.getText();
        
        //guests = Integer.parseInt(jTextField1.getText());
        //System.out.println(guests);
        
        
        int inc = 50;
      //  System.out.println(names_guests);
       
        if(Integer.parseInt(jTextField1.getText()) > 99)
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Invalid Guest entry!");
            jTextField1.requestFocus();
        }
        
        else
        {
        
       if(g.isEmpty() == false)
        {
            guests = Integer.parseInt(g);
        }
        
        else
        {
            guests = 1;
        }
        
        if(g1.isEmpty() == false)
        {
            billtotal = Double.parseDouble(g1);
        }
        
        else
        {
            billtotal = 0.0;
        }
        
        if(g2.isEmpty() == false)
        {
            deduction = Double.parseDouble(g);
        }
        
        else
        {
            deduction = 0.0;
        }
        
        
        if(g3.isEmpty() == false)
        {
            tax = Double.parseDouble(g);
        }
        
        else
        {
            tax = 0.0;
        }
        
        if(g4.isEmpty() == false)
        {
            tipRate = Double.parseDouble(g);
        }
        
        else
        {
            tipRate = 0.0;
        }
      
        //System.out.println(guests);
        
        this.setVisible(false);
        
        //TipTailor t1 = new TipTailor();
        TipTailored t2 = new TipTailored();
       
     //   t1.setVisible(true);
       // t1.jTextField2.setText(g);
        //t1.jPanel1.setVisible(true);
        int x = 20;
        int y = 20;
        
        t2.setVisible(true);
        
        int locx;
        int locy;
        int cur;
        
        
        locx = t2.jTextField1.getX();
        locy = t2.jTextField1.getY();
        
        //locx = 10;
        //locy = 10;
        
        //System.out.println(t1.jPanel1.getLocation());
        
        int sliderx = 20;
        int slidery = 20;
        
        
        cur = locy;
        
        int p = 50;
        
       // System.out.println("Number of guests inside method "+guests);
        
        for(i = 1; i <= guests;i++)
        {
            int prev;
            
         
            
            int height_scroll = t2.Scrolled.getPreferredSize().height;
             int height_panel = t2.jPanel1.getPreferredSize().height;
        
             t2.Scrolled.setPreferredSize(new Dimension(400,height_scroll+40));
             t2.jPanel1.setPreferredSize(new Dimension(300,height_panel+40));
        
     //   System.out.println(t2.Scrolled.getPreferredSize());
      //  System.out.println(t2.jPanel1.getPreferredSize());
        t2.revalidate();
        
        t2.jTextField2.setText(g);
        t2.jPanel1.setVisible(true);
            
            
            a[i] = new javax.swing.JTextField(10);
            b[i] = new javax.swing.JTextField(10);
            //t1.jPanel1.add(a[i]);
            //t1.jPanel1.add(b[i]);
            //t1.jPanel1.setSize(i, a1);
            
            t2.jPanel1.add(a[i]);
            t2.jPanel1.add(b[i]);
            
            
            a[i].setVisible(true);
            a[i].setSize(50,20);
            a[i].setOpaque(true);
            
            b[i].setVisible(true);
            b[i].setSize(50,20);
            b[i].setOpaque(true);
            
            Configuration cc = new Configuration();
            String ss = cc.Maximum.getText();
            Double d = Double.parseDouble(ss);
            Double s = tipRate * d;
            
            
           // System.out.println("Setting values");
           // System.out.println(split[i-1]);
           //a[i].setText(split[i-1]);
          //  b[i].setText(split1[1]);
           // System.out.println("Split1 value "+split1[i-1]);
          // b[i].setText(split1[i-1]);
         //   System.out.println(split.length+"Length");
          //  System.out.println(i);
            a[i].setText(Double.toString(tips));
            b[i].setText("Guest# "+i);
            
            //t1.pack();
           // t2.pack();
          
            
            a[i].setLocation(locx,cur+50);
            cur = a[i].getY();
            b[i].setLocation(locx+100, cur);
            cur = b[i].getY();
               
            
            //t1.jPanel1.revalidate();
            //t1.jPanel1.repaint();
            
            //t2.jPanel1.revalidate();
            
            
            //t2.jPanel1.revalidate();
            t2.jPanel1.repaint();
            
        }   
         
        for(int o = 1; o<= guests; o++)
        {
            jt = a[o];
            index1 = o;
            index3 = 1;
           
             a[o].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt1) {
                arrayActionPerformed(evt1);
            }
        }); 
         //index3++;  
        }
        
        for(int o = 1; o<= guests; o++)
        {
            jt = a[o];
            index1 = o;
            index3 = 1;
           
            a[o].addFocusListener(new java.awt.event.FocusListener() {

                @Override
                public void focusGained(FocusEvent fe) {
                 //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    System.out.println("Focus gained");
                }

                @Override
                public void focusLost(FocusEvent fe) {
                   // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    Double d1 = 0.0;
                    Boolean flag_error = false;
                    
                    //System.out.println("Here Focus lost");
                    if( fe.getSource() instanceof javax.swing.JTextField) {
                     
                    String s1 = ((javax.swing.JTextField)fe.getSource()).getText();
                    try
                    {
                        d1 = Double.parseDouble(s1);
                        if(d1>tips)
                        {
                            tips+=d1;
                            jTextField6.setText(Double.toString(tips));
                        }
                        else if(d1<tips)
                        {
                            tips-=d1;
                            jTextField6.setText(Double.toString(tips));
                        }
                    }
                    catch(NumberFormatException nfe)
                    {
                        flag_error = true;
                        
                        javax.swing.JOptionPane.showMessageDialog(rootPane, "Enter a number");
                        ((javax.swing.JTextField)fe.getSource()).requestFocus();
                    }
                            
                    
      // System.out.println(d1);
       
                    ar_values += s1+ " ";
                    System.out.println(ar_values);


                    sum_tip += d1;
       
   }
                }
            });
            
         //index3++;  
        }
       
       
        
        for(int k = 1; k<= guests; k++)
        {
            jt1 = b[k];
           index = k;
            
             jt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt1) {
                nameActionPerformed(evt1, index);
            }
        }); 
           
        }
    
        for(int k = 1; k<= guests; k++)
        {
            jt1 = b[k];
           index = k;
            
           b[k].addFocusListener(new java.awt.event.FocusListener() {

                @Override
                public void focusGained(FocusEvent fe) {
                   // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    System.out.println("Focus gained 2");
                }

                @Override
                public void focusLost(FocusEvent fe1) {
                   // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                     if( fe1.getSource() instanceof javax.swing.JTextField) {
       
                     String s1 = ((javax.swing.JTextField)fe1.getSource()).getText(); 
       
                     String name1 = ((javax.swing.JTextField)fe1.getSource()).getText();
                     //  System.out.println(name1);
       
                     //names_guests += " "+name1;
       
                     br_values += s1+ " ";
                     //System.out.println(br_values);
       
   }
                }
            });  
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

 public void nameActionPerformed(java.awt.event.ActionEvent e1, int i){
 /*  if( e1.getSource() instanceof javax.swing.JTextField) {
       
       String s1 = ((javax.swing.JTextField)e1.getSource()).getText(); 
       
       String name1 = ((javax.swing.JTextField)e1.getSource()).getText();
     //  System.out.println(name1);
       
       names_guests += " "+name1;
       
       br_values += s1+ " ";
       //System.out.println(br_values);
       
   }*/
}     
    
    
 public void arrayActionPerformed(java.awt.event.ActionEvent e){    // Tip amount per individual
   /*if( e.getSource() instanceof javax.swing.JTextField) {
       
       String s1 = ((javax.swing.JTextField)e.getSource()).getText();
       Double d1 = Double.parseDouble(s1);
       
      // System.out.println(d1);
       
       ar_values += s1+ " ";
       System.out.println(ar_values);
  
       
       sum_tip += d1;
       
   }*/
} 
  


public void printValues()
{
    int z;
   
    
   for(z = 1; z<=guests; z++)
    {
       // System.out.println(values[z]);
    }
}
    
    
public void update()
{
    TipTailor t = new TipTailor();
    TipFrame f = new TipFrame();
    t.setVisible(false);
    f.setVisible(true);
    
    
    
}


public void sendValues(javax.swing.JTextField[] a)
{
    int len = a.length;
    
    for(int i = 1; i<=len; i++ )
    {
        values[i]=a[i].getText();
    }
}

    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new UserGuide().setVisible(true);
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField1InputMethodTextChanged
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_jTextField1InputMethodTextChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         
        String g = jTextField1.getText();
        if(g.isEmpty() == false)
        {
            guests = Integer.parseInt(g);
        }
        
        String g1 = jTextField2.getText();
        if(g1.isEmpty() == false)
        {
            billtotal = Double.parseDouble(g1);
        }
        
        
        String g2 = jTextField3.getText();
        if(g2.isEmpty() == false)
        {
            deduction = Double.parseDouble(g);
        }
        
        String g3 = jTextField4.getText();
        if(g3.isEmpty() == false)
        {
            tax = Double.parseDouble(g);
        }
        
        
        String g4 = jTextField5.getText();
        if(g4.isEmpty() == false)
        {
            tipRate = Double.parseDouble(g);
        }
        
       
        this.setVisible(false);
        Configuration c1 = new Configuration();
        c1.setVisible(true);
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField2MouseExited

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        // TODO add your handling code here:
        
        Boolean flag_tax = false;
        Boolean flag_deduction = false;

        
      /*  String s = jTextField2.getText();
        
        double i = Double.parseDouble(s);
        */
        /*
        String t = jTextField5.getText();
        tipRates = Double.parseDouble(t);
        */
        
        
        
        String i1 = jTextField1.getText();
        String i2 = jTextField2.getText();
        String i3 = jTextField3.getText();
        String i4 = jTextField4.getText();
        String i5 = jTextField5.getText();
        
        if(i1.isEmpty() == true)
        {
             javax.swing.JOptionPane.showMessageDialog(this, "Enter guests!");
        }
        else
        {
           if(Integer.parseInt(i1) < 0)
            {
                javax.swing.JOptionPane.showMessageDialog(this, "Enter valid number of guests!");
            }
        }
        
        if(i2.isEmpty() == true)
        {
             javax.swing.JOptionPane.showMessageDialog(this, "Enter total!");
        }
        
        else
        {
           if(Double.parseDouble(i2) < 0)
            {
                javax.swing.JOptionPane.showMessageDialog(this, "Enter valid Bill Total amount!");
            }
           else
           {
                billtotal = Double.parseDouble(i2);
           }
        }
        
        if(jTextField3.isEnabled() == true){
        
        if(jTextField3.getText().isEmpty() == true)
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Enter Deduction!");
        }
        }
        if(jTextField4.getText().isEmpty() == false && jTextField2.getText().isEmpty() == false)
        {
            if((Double.parseDouble(jTextField4.getText())) > (Double.parseDouble(jTextField2.getText())))
            {
                javax.swing.JOptionPane.showMessageDialog(this, "Tax is greater than the Bill Amount!");
            }
        }
        
        String s2 = jTextField5.getText();
        rate = Double.parseDouble(s2);
        
        
      
        
        if(jTextField4.isEnabled() == true)
        {
            String taxt = jTextField4.getText();
            if(taxt.isEmpty() == false)
            {
            flag_tax = true;
            
            String st;
            st = jTextField4.getText();
            taxes = Double.parseDouble(st);
            }  
            else
            {
                javax.swing.JOptionPane.showMessageDialog(this, "Please enter tax amount!");
            }
        }
        
        if(jTextField3.isEnabled() == true)
        {
            String pp = jTextField3.getText();
            if(pp.isEmpty() == false){
            flag_deduction = true;
            String sd;
            sd = jTextField4.getText();
            taxes = Double.parseDouble(sd);
            }
            else
            {
                javax.swing.JOptionPane.showMessageDialog(this, "Please enter deduction amount!");
                jTextField3.requestFocus();
            }
        }
        
        
        
        
        if(flag_tax == true && flag_deduction == true)
        {
            tips = (billtotal+taxes-deduction)*(tipRate/100);
            
        }
        
        else if(flag_tax == true && flag_deduction == false)
        {
            tips = (billtotal+taxes)*(tipRate/100);
        }
        
        else if(flag_tax == false && flag_deduction == true)
        {
            tips = (billtotal-deduction)*(tipRate/100);
        }
        
        else if(flag_tax == false && flag_deduction == false)
        {
            tips = (billtotal)*(tipRate/100);
        }
        
       // System.out.println(billtotal);
       // System.out.println(tipRates);
        //System.out.println(tips);
        
        String results = Double.toString(tips);
        String k = new DecimalFormat("0.00").format(tips);
        //jTextField6.setText(results);
        jTextField6.setText(k);
        
        System.out.println("Tips amount: " +tips);
        
    }//GEN-LAST:event_CalculateActionPerformed

    private void qualityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qualityStateChanged
        // TODO add your handling code here:
        q = quality.getValue();
        Configuration c = new Configuration();
        
        Double max = Double.parseDouble(c.Maximum.getText());
        Double min = Double.parseDouble(c.Minimum.getText());
        //System.out.println(q);
        
        tipRate = (max-min)*q/100;
        jTextField5.setText(Double.toString(tipRate));
        
    }//GEN-LAST:event_qualityStateChanged

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("1");
        jTextField2.setText("");
        
        if(enabled_deduction == true)
        {
            jTextField3.setText("0"); // deduction
        }
        else
        {
            jTextField3.setText(""); // deduction
        }
        
        if(enabled_tax == true)
        {
            jTextField4.setText("0"); //tax
        }
        else
        {
            jTextField4.setText(""); //tax
        }
        
        jTextField5.setText("");
        jTextField6.setText("");
    }//GEN-LAST:event_ResetActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    public String getGuests()
    {
        String s;
        s = Integer.toString(guests);
        return s;
    }
    
   
    
    
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
            java.util.logging.Logger.getLogger(TipFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate;
    private javax.swing.JButton Reset;
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField6;
    public javax.swing.JSlider quality;
    // End of variables declaration//GEN-END:variables
}
