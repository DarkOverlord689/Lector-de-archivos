package lectordearchivos;

/**
 *
 * @author DarkOverlord689
 */
public class VentanaEditor extends javax.swing.JFrame {

    public VentanaEditor() {
        initComponents();
    }

    public void addEventos(PanelEditor editor) {
        OpcionAbrir.addActionListener(editor);
        OpcionSalir.addActionListener(editor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        OpcionAbrir = new javax.swing.JMenuItem();
        OpcionSalir = new javax.swing.JMenuItem();
        separador = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuArchivo.setText("Archivo");

        OpcionAbrir.setText("Abrir");
        OpcionAbrir.setName("abrir"); // NOI18N
        MenuArchivo.add(OpcionAbrir);

        OpcionSalir.setText("Salir");
        OpcionSalir.setName("salir"); // NOI18N
        MenuArchivo.add(OpcionSalir);
        MenuArchivo.add(separador);

        jMenuBar1.add(MenuArchivo);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenuItem OpcionAbrir;
    private javax.swing.JMenuItem OpcionSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator separador;
    // End of variables declaration//GEN-END:variables
}
