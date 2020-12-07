
package Paquete;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class Difícil extends JFrame implements ActionListener {
    
    public Difícil() {
        JToolBar barraHerramientas = new JToolBar();
	JLabel lblFilas = new JLabel();
	JLabel lblColumnas = new JLabel();
	//txtColumnas = new JTextField();
	//txtFilas = new JTextField();
	btnCrear = new JButton();
	panel = new JPanel( null );
        
        
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//lblFilas.setText("Numero de filas");
	//barraHerramientas.add(lblFilas);
	//txtFilas.setPreferredSize(new Dimension(50, 25));
	//barraHerramientas.add(txtFilas);
	//lblColumnas.setText("Nuemro de columna");
	//barraHerramientas.add(lblColumnas);
	//txtColumnas.setPreferredSize(new Dimension(50, 25));
	//barraHerramientas.add(txtColumnas);
	btnCrear.setText("¡JUGAR!");
	btnCrear.addActionListener(this);
	barraHerramientas.add(btnCrear);
	this.add(barraHerramientas, BorderLayout.PAGE_START);
        this.add(panel, BorderLayout.CENTER);
	this.setSize(410, 330);
	this.setLocationRelativeTo(null);
        
    }
    
    public void actionPerformed( ActionEvent evt ) {

           
 	JLabel Nivel=new JLabel("Difícil");
        Font fuente=new Font("Vivaldi", Font.BOLD, 30);
        panel.removeAll();

        text [][] botones = new text[9][9];
        
        for( int fila = 0 ; fila < 9; fila++ )
        {
           
            for( int columna = 0 ; columna < 9; columna++ )
            {
                
                botones[fila][columna] = new text( 75 * columna, 30 * fila, 75, 30 );
                
                panel.add( botones[fila][columna] );
            }
        }
                Nivel.setBounds(200,300,100,100);
                Nivel.setFont(fuente);
                panel.add(Nivel);
		panel.updateUI();
          
        // x=Integer.parseInt(botones[0][0].getText());
        // botones[0][0].setBackground(Color.GREEN); 
           
	}   

    
    public class text extends JTextField implements ActionListener {
    
    public text( int pos_x, int pos_y, int ancho, int alto ){ 
      
        setBounds(pos_x, pos_y, ancho, alto);
        
        addActionListener( this );
    }
    
       public void actionPerformed( ActionEvent e ){
           
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Vivaldi", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Difícil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Difícil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Difícil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Difícil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Difícil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Difícil().setVisible(true);
            }
        });
    }
    
    JButton btnCrear;
    JPanel panel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
