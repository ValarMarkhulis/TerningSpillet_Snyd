/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Klient;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author chris
 */
public class Spil_skærm extends javax.swing.JPanel {

    public static int WIDTH = 60;

    public static int BOX_WIDTH = 450;
    public static int BOX_HEIGHT = 80;
    private int antal_terninger = 6;
    private KlientFunk klient;
    public int[] terninger = new int[6];

    /**
     * Creates new form Spil_skærm
     */
    public Spil_skærm() {
        initComponents();

    }

    public void tegnTerninger(int antal) {
        antal_terninger = antal;
        repaint();
    }

    public void paintComponent(Graphics g) {
        // Herunder referer g til et Graphics-objekt man kan tegne med
        super.paintComponent(g);                // tegn først baggrunden på panelet
        
//        terninger[0] = 1;
//        terninger[1] = 2;
//        terninger[2] = 3;
//        terninger[3] = 4;
//        terninger[4] = 5;
//        terninger[5] = 6;

        int hjørne = 0;
        int xpos = 50;
        int ypos = 60;
        int xmargin = 10;
        int ymargin = 10;
        // Box der skalaere
        //ymargin+(WIDTH*(antal_terninger+1)
        g.drawRoundRect(xpos, ypos, 430, BOX_HEIGHT, 5, 5);
        for (int i = 0; i < antal_terninger; i++) {
            g.drawRect(xpos + xmargin, ypos + ymargin, WIDTH, WIDTH);
            int tal = terninger[i];
            switch (tal) {
                case 6:
                    // Lav 6'ere
                    // Venstre prikker
                    g.fillArc(xpos + xmargin + 10, ypos + ymargin + 10, WIDTH / 5, WIDTH / 5, 0, 360);
                    g.fillArc(xpos + xmargin + 10, ypos + ymargin + 20 + 5, WIDTH / 5, WIDTH / 5, 0, 360);
                    g.fillArc(xpos + xmargin + 10, ypos + ymargin + 35 + 5, WIDTH / 5, WIDTH / 5, 0, 360);

                    // Højre
                    g.fillArc(xpos + xmargin + 37, ypos + ymargin + 10, WIDTH / 5, WIDTH / 5, 0, 360);
                    g.fillArc(xpos + xmargin + 37, ypos + ymargin + 20 + 5, WIDTH / 5, WIDTH / 5, 0, 360);
                    g.fillArc(xpos + xmargin + 37, ypos + ymargin + 35 + 5, WIDTH / 5, WIDTH / 5, 0, 360);
                    break;
                case 5:
                    // 5'er
                    // Venstre prikker
                    g.fillArc(xpos + xmargin + 10, ypos + ymargin + 10, WIDTH / 5, WIDTH / 5, 0, 360);
                    g.fillArc(xpos + xmargin + 10, ypos + ymargin + 35 + 5, WIDTH / 5, WIDTH / 5, 0, 360);

                    // Midterste prik
                    g.fillArc(xpos + xmargin + 24, ypos + ymargin + 25, WIDTH / 5, WIDTH / 5, 0, 360);

                    // Højre prikker
                    g.fillArc(xpos + xmargin + 38, ypos + ymargin + 10, WIDTH / 5, WIDTH / 5, 0, 360);
                    g.fillArc(xpos + xmargin + 38, ypos + ymargin + 35 + 5, WIDTH / 5, WIDTH / 5, 0, 360);
                    break;
                case 4:
                    // 4'er
                    // Venstre prikker
                    g.fillArc(xpos + xmargin + 10, ypos + ymargin + 10, WIDTH / 5, WIDTH / 5, 0, 360);
                    g.fillArc(xpos + xmargin + 10, ypos + ymargin + 35 + 5, WIDTH / 5, WIDTH / 5, 0, 360);

                    // Højre prikker
                    g.fillArc(xpos + xmargin + 38, ypos + ymargin + 10, WIDTH / 5, WIDTH / 5, 0, 360);
                    g.fillArc(xpos + xmargin + 38, ypos + ymargin + 35 + 5, WIDTH / 5, WIDTH / 5, 0, 360);
                    break;
                case 3:
                    // 3'er
                    // Venstre prikker
                    g.fillArc(xpos + xmargin + 10, ypos + ymargin + 10, WIDTH / 5, WIDTH / 5, 0, 360);

                    // Midterste prik
                    g.fillArc(xpos + xmargin + 24, ypos + ymargin + 25, WIDTH / 5, WIDTH / 5, 0, 360);

                    // Højre prikker
                    g.fillArc(xpos + xmargin + 38, ypos + ymargin + 40, WIDTH / 5, WIDTH / 5, 0, 360);
                    break;

                case 2:
                    // Venstre prikker
                    g.fillArc(xpos + xmargin + 10, ypos + ymargin + 10, WIDTH / 5, WIDTH / 5, 0, 360);
                    // Højre prikker
                    g.fillArc(xpos + xmargin + 38, ypos + ymargin + 40, WIDTH / 5, WIDTH / 5, 0, 360);
                    break;

                case 1:
                    // Midterste prik
                    g.fillArc(xpos + xmargin + 24, ypos + ymargin + 25, WIDTH/5, WIDTH/5, 0, 360);
                    break;

                default:
                    break;
            }
            xpos += 70;
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(600, 500));

        jButton1.setText("Tegn terninger");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSlider1.setMajorTickSpacing(1);
        jSlider1.setMaximum(6);
        jSlider1.setMinimum(2);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setValue(6);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        jSpinner1.setValue(3);
        jSpinner1.setVerifyInputWhenFocusTarget(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Antal");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Værdi");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 255, 0));
        jButton2.setText("Gæt!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 51, 51));
        jButton3.setText("Løgner!");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(54, 54, 54))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       terninger = klient.getTerninger();
       repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    void setlogik(KlientFunk klient) {
        this.klient = klient;
    }
}
