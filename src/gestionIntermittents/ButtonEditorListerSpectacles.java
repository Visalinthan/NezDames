package gestionIntermittents;

import javax.swing.JCheckBox;

/**
 *
 * @author gaellecastel
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
  
public class ButtonEditorListerSpectacles extends DefaultCellEditor {
  protected JButton button;
  private String    label;
  private boolean   isPushed;
  private int laLigneSelectionnee;
  
  public ButtonEditorListerSpectacles(JCheckBox checkBox) {
    super(checkBox);
    button = new JButton();
    button.setOpaque(true);
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        fireEditingStopped();
      }
    });
  }
  
  @Override
  public Component getTableCellEditorComponent(JTable table, Object value,
                   boolean isSelected, int row, int column) {
    if (isSelected) {
      button.setForeground(table.getSelectionForeground());
      button.setBackground(table.getSelectionBackground());
    } else{
      button.setForeground(table.getForeground());
      button.setBackground(table.getBackground());
            laLigneSelectionnee = row;
    }
    label = (value ==null) ? "" : value.toString();
    button.setText( label );
    isPushed = true;
    return button;
  }
  
  @Override
  public Object getCellEditorValue() {
    if (isPushed)  {
      new IntermittentListerSpectacles(laLigneSelectionnee).setVisible(true);
    }
    isPushed = false;
    return new String( label ) ;
  }
    
  @Override
  public boolean stopCellEditing() {
    isPushed = false;
    return super.stopCellEditing();
  }
  
  @Override
  protected void fireEditingStopped() {
    super.fireEditingStopped();
  }
}
