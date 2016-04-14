package nezdames.serialisation;

import gestionSpectacles.SpectaclesLister;
import gestionSpectacles.SpectacleAjouter;
import gestionIntermittents.IntermittentsLister;
import gestionIntermittents.IntermittentModifierMotPasse;
import gestionIntermittents.IntermittentAjouter;
import gestionContratsCession.ContratCessionAjouter;
import gestionContratsCession.ContratCessionLister;
import gestionRepresentations.RepresentationLister;
import gestionRepresentations.RepresentationAjouter;
import classesMetier.Spectacle;
import classesMetier.Intermittent;
import classesMetier.ContratCession;
import classesMetier.Lieu;
import classesMetier.PersonneStructure;
import classesMetier.Structure;
import gestionContratsCession.ContratCessionListerEditer;
import gestionContratsCession.ContratCessionListerUtil;
import gestionIntermittents.IntermittentsListerUtil;
import gestionLieux.LieuAjouter;
import gestionLieux.LieuxLister;
import gestionLieux.LieuxListerUtil;
import gestionRepresentations.RepresentationListerUtil;
import gestionSpectacles.SpectaclesListerUtil;
import gestionStructure.AjouterPersonne;
import gestionStructure.StructureAjouter;
import gestionStructure.StructureLister;
import gestionStructure.StructureListerUtil;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gaellecastel
 */
public class MenuPrincipalUtil extends javax.swing.JFrame {

    public MenuPrincipalUtil() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelBanniere = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuIntermittents = new javax.swing.JMenu();
        jMenuItemListerIntermittents = new javax.swing.JMenuItem();
        jMenuSpectacles = new javax.swing.JMenu();
        jMenuItemListerSpectacles = new javax.swing.JMenuItem();
        jMenuContratsProduction = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItemListerContratsProduction = new javax.swing.JMenuItem();
        menuItemLieux = new javax.swing.JMenu();
        jMenuItemListerLieux = new javax.swing.JMenuItem();
        jMenuClient = new javax.swing.JMenu();
        lmsclient = new javax.swing.JMenuItem();

        setBackground(new java.awt.Color(204, 204, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelBanniere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banniere2.png")));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banniereEcole2.png")));

        jMenuIntermittents.setText("Intermittents");
        jMenuIntermittents.setFont(new java.awt.Font("Hannotate SC", 0, 14)); // NOI18N

        jMenuItemListerIntermittents.setFont(new java.awt.Font("Hannotate SC", 0, 14)); // NOI18N
        jMenuItemListerIntermittents.setText("Lister les intermittents");
        jMenuItemListerIntermittents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListerIntermittentsActionPerformed(evt);
            }
        });
        jMenuIntermittents.add(jMenuItemListerIntermittents);

        jMenuBar.add(jMenuIntermittents);

        jMenuSpectacles.setText("Spectacles");
        jMenuSpectacles.setFont(new java.awt.Font("Hannotate SC", 0, 14)); // NOI18N

        jMenuItemListerSpectacles.setFont(new java.awt.Font("Hannotate SC", 0, 14)); // NOI18N
        jMenuItemListerSpectacles.setText("Lister les spectacles");
        jMenuItemListerSpectacles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListerSpectaclesActionPerformed(evt);
            }
        });
        jMenuSpectacles.add(jMenuItemListerSpectacles);

        jMenuBar.add(jMenuSpectacles);

        jMenuContratsProduction.setText("Contrats de cession");
        jMenuContratsProduction.setFont(new java.awt.Font("Hannotate SC", 0, 14)); // NOI18N
        jMenuContratsProduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuContratsProductionActionPerformed(evt);
            }
        });

        jMenuItem3.setFont(new java.awt.Font("Hannotate SC", 0, 14)); // NOI18N
        jMenuItem3.setText("Lister les représentations des contrats de cession");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuContratsProduction.add(jMenuItem3);

        jMenuItemListerContratsProduction.setFont(new java.awt.Font("Hannotate SC", 0, 14)); // NOI18N
        jMenuItemListerContratsProduction.setText("Lister les contrats de cession");
        jMenuItemListerContratsProduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListerContratsProductionActionPerformed(evt);
            }
        });
        jMenuContratsProduction.add(jMenuItemListerContratsProduction);

        jMenuBar.add(jMenuContratsProduction);

        menuItemLieux.setText("Lieux");
        menuItemLieux.setFont(new java.awt.Font("Hannotate SC", 0, 14)); // NOI18N

        jMenuItemListerLieux.setFont(new java.awt.Font("Hannotate SC", 0, 14)); // NOI18N
        jMenuItemListerLieux.setText("Lister les lieux");
        jMenuItemListerLieux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListerLieuxActionPerformed(evt);
            }
        });
        menuItemLieux.add(jMenuItemListerLieux);

        jMenuBar.add(menuItemLieux);

        jMenuClient.setText("Structure");

        lmsclient.setText("lister les structures");
        lmsclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lmsclientActionPerformed(evt);
            }
        });
        jMenuClient.add(lmsclient);

        jMenuBar.add(jMenuClient);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelBanniere)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelBanniere)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(931, 493));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemListerIntermittentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListerIntermittentsActionPerformed
        new IntermittentsListerUtil().setVisible(true);
    }//GEN-LAST:event_jMenuItemListerIntermittentsActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       // this.dispose();
            //sérialisation
            try {
                // sérialisation des intermittents
                FileOutputStream fichierIntermittents = new FileOutputStream("lesIntermittents.txt");
                ObjectOutputStream fluxIntermittents = new ObjectOutputStream(fichierIntermittents);
                fluxIntermittents.writeObject(NezDamesSerialisation.lesIntermittents);
                fluxIntermittents.close();
                
                // sérialisation des spectacles
                FileOutputStream fichierSpectacles = new FileOutputStream("lesSpectacles.txt");
                ObjectOutputStream fluxSpectacles = new ObjectOutputStream(fichierSpectacles);
                fluxSpectacles.writeObject(NezDamesSerialisation.lesSpectacles);
                fluxSpectacles.close();
                
                // sérialisation des contrats de production
                FileOutputStream fichierContratsCession = new FileOutputStream("lesContratsCession.txt");
                ObjectOutputStream fluxContratsCession = new ObjectOutputStream(fichierContratsCession);
                fluxContratsCession.writeObject(NezDamesSerialisation.lesContratsCession);
                fluxContratsCession.close();
                
                 // sérialisation des lieux
                FileOutputStream fichierLieux = new FileOutputStream("lesLieux.txt");
                ObjectOutputStream fluxLieux = new ObjectOutputStream(fichierLieux);
                fluxLieux.writeObject(NezDamesSerialisation.lesLieux);
                fluxLieux.close();
                
                 // sérialisation des personnes
                FileOutputStream fichierPersonne = new FileOutputStream("lesPersonnes.txt");
                ObjectOutputStream fluxPersonnes = new ObjectOutputStream(fichierPersonne);
                fluxPersonnes.writeObject(NezDamesSerialisation.lesPersonnes);
                fluxPersonnes.close();
                
                // sérialisation des structures
                FileOutputStream fichierStructure = new FileOutputStream("lesStructures.txt");
                ObjectOutputStream fluxStructures = new ObjectOutputStream(fichierStructure);
                fluxStructures.writeObject(NezDamesSerialisation.lesStructures);
                fluxStructures.close();
                
                this.dispose();
            }
            catch (IOException e) {
                JOptionPane.showMessageDialog(null,"Problème d'entrée/sortie");
            }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            // chargement des intermittents
            FileInputStream fichierIntermittents = new FileInputStream("lesIntermittents.txt");
            ObjectInputStream fluxIntermittents = new ObjectInputStream(fichierIntermittents);
            NezDamesSerialisation.lesIntermittents = (ArrayList<Intermittent>) fluxIntermittents.readObject();
            
            // chargement des spectacles
            FileInputStream fichierSpectacles = new FileInputStream("lesSpectacles.txt");
            ObjectInputStream fluxSpectacles = new ObjectInputStream(fichierSpectacles);
            NezDamesSerialisation.lesSpectacles = (ArrayList<Spectacle>) fluxSpectacles.readObject();
            
            // chargement des contrats de production
            FileInputStream fichierContratsCession = new FileInputStream("lesContratsCession.txt");
            ObjectInputStream fluxContratsCession = new ObjectInputStream(fichierContratsCession);
            NezDamesSerialisation.lesContratsCession = (ArrayList<ContratCession>) fluxContratsCession.readObject();
            
             // chargement des lieux
            FileInputStream fichierLieux = new FileInputStream("lesLieux.txt");
            ObjectInputStream fluxLieux = new ObjectInputStream(fichierLieux);
            NezDamesSerialisation.lesLieux = (ArrayList<Lieu>) fluxLieux.readObject();
            
               // chargement des personnes
            FileInputStream fichierPersonne = new FileInputStream("lesPersonnes.txt");
            ObjectInputStream fluxPersonne = new ObjectInputStream(fichierPersonne);
            NezDamesSerialisation.lesPersonnes = (ArrayList<PersonneStructure>) fluxPersonne.readObject();
            
            // chargement des structures
            FileInputStream fichierStructure = new FileInputStream("lesStructures.txt");
            ObjectInputStream fluxStructure = new ObjectInputStream(fichierStructure);
            NezDamesSerialisation.lesStructures = (ArrayList<Structure>) fluxStructure.readObject();
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Nouveaux fichiers");
        }
        catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Problème");
        }
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItemListerSpectaclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListerSpectaclesActionPerformed
        new SpectaclesListerUtil().setVisible(true);
    }//GEN-LAST:event_jMenuItemListerSpectaclesActionPerformed

    private void jMenuItemListerLieuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListerLieuxActionPerformed
        new LieuxListerUtil().setVisible(true);
    }//GEN-LAST:event_jMenuItemListerLieuxActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new RepresentationListerUtil().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuContratsProductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuContratsProductionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuContratsProductionActionPerformed

    private void lmsclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lmsclientActionPerformed
        new StructureListerUtil().setVisible(true);
    }//GEN-LAST:event_lmsclientActionPerformed

    private void jMenuItemListerContratsProductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListerContratsProductionActionPerformed
        new ContratCessionListerUtil().setVisible(true);
    }//GEN-LAST:event_jMenuItemListerContratsProductionActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipalUtil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalUtil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalUtil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalUtil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalUtil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBanniere;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuClient;
    private javax.swing.JMenu jMenuContratsProduction;
    private javax.swing.JMenu jMenuIntermittents;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemListerContratsProduction;
    private javax.swing.JMenuItem jMenuItemListerIntermittents;
    private javax.swing.JMenuItem jMenuItemListerLieux;
    private javax.swing.JMenuItem jMenuItemListerSpectacles;
    private javax.swing.JMenu jMenuSpectacles;
    private javax.swing.JMenuItem lmsclient;
    private javax.swing.JMenu menuItemLieux;
    // End of variables declaration//GEN-END:variables
}
