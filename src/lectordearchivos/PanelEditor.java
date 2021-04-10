package lectordearchivos;

/**
 *
 * @author DarkOverlord689
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.filechooser.FileNameExtensionFilter;
import util.Archivo;

public class PanelEditor extends javax.swing.JPanel implements ActionListener {

    public PanelEditor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();

        setBorder(javax.swing.BorderFactory.createLineBorder(getBackground(), 15));
        setLayout(new java.awt.BorderLayout());

        area.setBackground(new java.awt.Color(153, 255, 204));
        area.setColumns(20);
        area.setRows(5);
        scroll.setViewportView(area);

        add(scroll, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem origen = (JMenuItem) e.getSource();
        switch (origen.getName()) {
            case "abrir":
                abrirArchivo();
                break;

            case "Salir":
                System.exit(0);
        }
    }

    private void abrirArchivo() {
        JFileChooser seleccion = new JFileChooser();
        FileNameExtensionFilter filtro1 = new FileNameExtensionFilter("Archivos de texto", "txt");
        FileNameExtensionFilter filtro2 = new FileNameExtensionFilter("codigo fuente de java", "java");

        seleccion.setFileFilter(filtro1);
        seleccion.setFileFilter(filtro2);
        int opcion = seleccion.showOpenDialog(this);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            String archivo = "" + seleccion.getSelectedFile();
            File archivoExtension = new File(archivo);

            if (archivoExtension.getName().endsWith(".txt") || archivoExtension.getName().endsWith(".java")) {
//                endsWith para validar extensiones
                ArrayList<String> lista = Archivo.leerArchivo(archivo);
                area.setText("");

                for (String linea : lista) {
                    area.append(linea + "\n");
                }
            }
        }

    }
}
