package Ej1;
public class Ventana extends javax.swing.JFrame {
    public Ventana() {
        initComponents();
        this.setSize(400, 260);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btnCopiar = new javax.swing.JButton();
        txtCopia = new javax.swing.JTextField();
        txtOriginal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        btnCopiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCopiar.setText("Copiar");
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCopiar);
        btnCopiar.setBounds(160, 130, 100, 40);

        txtCopia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtCopia);
        txtCopia.setBounds(250, 60, 110, 40);

        txtOriginal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtOriginal);
        txtOriginal.setBounds(50, 60, 110, 40);

        pack();
    }// </editor-fold>                        

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {      
        txtCopia.setText(txtOriginal.getText());
    }                                         

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCopiar;
    private javax.swing.JTextField txtCopia;
    private javax.swing.JTextField txtOriginal;
    // End of variables declaration                   
}
