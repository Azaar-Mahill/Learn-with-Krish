/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mymementoproject;

//import java.awt.event.*;
//import javax.swing.*;

public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

	Caretaker caretaker = new Caretaker();
	
	Originator originator = new Originator();
	
	int saveFiles = 0, currentArticle = 0, total=0, average=0;
        boolean enableUndoButton;
        boolean enableRedoButton;
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        undo = new javax.swing.JButton();
        redo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        theArticle = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        theArticle1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        theArticle2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Player's points table");

        save.setText("save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        undo.setText("undo");
        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionPerformed(evt);
            }
        });

        redo.setText("redo");
        redo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redoActionPerformed(evt);
            }
        });

        theArticle.setColumns(20);
        theArticle.setRows(5);
        jScrollPane1.setViewportView(theArticle);

        theArticle1.setColumns(20);
        theArticle1.setRows(5);
        jScrollPane2.setViewportView(theArticle1);

        jLabel2.setText("Total");

        theArticle2.setColumns(20);
        theArticle2.setRows(5);
        jScrollPane3.setViewportView(theArticle2);

        jLabel3.setText("Average");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(save)
                        .addGap(97, 97, 97)
                        .addComponent(undo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(redo))
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(undo)
                    .addComponent(redo))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String textInTextArea = theArticle.getText();
        int points = Integer.parseInt(textInTextArea);
        System.out.println(points);
        
	originator.set(textInTextArea);
	caretaker.addMomento(originator.storeInMomento());
				
	saveFiles++;
	currentArticle++;
        
        total = total + points;  
	System.out.println("Total "+ total);			
	System.out.println("Save Files "+ saveFiles);
        System.out.println("Average "+ total/currentArticle);
        
        theArticle.setText("");
        theArticle1.setText(Integer.toString(total));
        theArticle2.setText(Integer.toString(total/currentArticle));
				
	enableUndoButton = true;
    }//GEN-LAST:event_saveActionPerformed

    private void undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionPerformed
        if(enableUndoButton == true){
            if(currentArticle >=1) {
		currentArticle--;
						
		String textBoxString = originator.restoreFromMomento(caretaker.getMomento(currentArticle));
						
		theArticle.setText(textBoxString);
		int points = Integer.parseInt(textBoxString);
                total = total - points;
                
                theArticle.setText("");
                theArticle1.setText(Integer.toString(total));
                theArticle2.setText(Integer.toString(total/currentArticle));
		enableRedoButton=true;
                System.out.println(enableRedoButton);
						
            }else {
		enableUndoButton = false;
            }
            
        }else{
            System.out.println("undo is not enable yet");
        }
    }//GEN-LAST:event_undoActionPerformed

    private void redoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redoActionPerformed
        if(enableRedoButton == true){
            if((saveFiles - 1) > currentArticle) {
							
                currentArticle++;
							
                String textBoxString = originator.restoreFromMomento(caretaker.getMomento(currentArticle));
							
                theArticle.setText(textBoxString);
                int points = Integer.parseInt(textBoxString);
                
                total = total + points;
                
                theArticle.setText("");
                theArticle1.setText(Integer.toString(total));
                theArticle2.setText(Integer.toString(total/currentArticle));
							
		enableUndoButton = true;					
							
            }else {
                enableRedoButton=false;
		
            }
            
        }else{
            System.out.println("redo is not enable yet");
        }
    }//GEN-LAST:event_redoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton redo;
    private javax.swing.JButton save;
    private javax.swing.JTextArea theArticle;
    private javax.swing.JTextArea theArticle1;
    private javax.swing.JTextArea theArticle2;
    private javax.swing.JButton undo;
    // End of variables declaration//GEN-END:variables
}
