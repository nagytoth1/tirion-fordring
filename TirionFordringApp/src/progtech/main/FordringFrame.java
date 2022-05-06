/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package progtech.main;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.sql.Connection;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

public class FordringFrame extends JFrame
{
    private GameScreen gameScreen;


   //extends image

    public FordringFrame()
    {
        mainScreenBasic();
        //initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        choosePanel = new javax.swing.JPanel();
        lblChoose = new javax.swing.JLabel();
        btnAlliance = new javax.swing.JButton();
        btnHorde = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));

        lblChoose.setFont(new java.awt.Font("Inconsolata-g", 0, 18)); // NOI18N
        lblChoose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChoose.setText("Choose your side!");
        lblChoose.setToolTipText("");

        btnAlliance.setText("FOR THE ALLIANCE!");
        btnAlliance.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btnAllianceKeyPressed(evt);
            }
        });

        btnHorde.setText("FOR THE HORDE!");
        btnHorde.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btnHordeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout choosePanelLayout = new javax.swing.GroupLayout(choosePanel);
        choosePanel.setLayout(choosePanelLayout);
        choosePanelLayout.setHorizontalGroup(
            choosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblChoose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
            .addGroup(choosePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(choosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlliance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHorde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        choosePanelLayout.setVerticalGroup(
            choosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choosePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlliance, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHorde, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(choosePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(choosePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void mainScreenBasic()
    {

        choosePanel = new javax.swing.JPanel();
        lblChoose = new javax.swing.JLabel();
        btnAlliance = new javax.swing.JButton();
        btnHorde = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640,640 ));
        setResizable(false);
        setSize(new java.awt.Dimension(640, 640));

        lblChoose.setFont(new java.awt.Font("Inconsolata-g", 0, 18)); // NOI18N
        lblChoose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        gameScreen = new GameScreen();
        add(gameScreen);


        pack();
    }// </editor-fold>//GE

    private void btnAllianceKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnAllianceKeyPressed
    {//GEN-HEADEREND:event_btnAllianceKeyPressed
        mainScreenBasic();
    }//GEN-LAST:event_btnAllianceKeyPressed

    private void btnHordeKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnHordeKeyPressed
    {//GEN-HEADEREND:event_btnHordeKeyPressed
        mainScreenBasic();
    }//GEN-LAST:event_btnHordeKeyPressed

    public static void main(String args[])
    {
        JFrame main = setupFrame(); //meghívja
        Logger l = UtilHelper.Log.initLogger();
        Connection conn = UtilHelper.DBConnection.initConnector();

    }
    
    private static JFrame setupFrame()
    {
        JFrame frame = new FordringFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        return frame;
    }


    

    // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JButton btnAlliance;
    private javax.swing.JButton btnHorde;
    private javax.swing.JPanel choosePanel;
    private javax.swing.JLabel lblChoose;

    // End of variables declaration//GEN-END:variables

}
