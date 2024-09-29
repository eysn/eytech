
package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;


public class TaxTabHeader extends JLabel {
    
    public TaxTabHeader(String Text){
    super(Text);
    setOpaque(true);
    setBackground(Color.WHITE);
    setFont(new Font("sanserif", 1, 12));
    setForeground(new Color(102, 102, 102));
    setBorder(new EmptyBorder(10,5,10,5));
    
    }
    @Override
        protected void paintComponent(Graphics grphcs){
            super.paintComponent(grphcs);
            grphcs.setColor(new Color(230,230,230));
            grphcs.drawLine(0, getHeight()-1, getWidth(), getHeight()-1);
    
    }
    
}