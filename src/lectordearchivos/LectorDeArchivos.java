package lectordearchivos;

/**
 *
 * @author DarkOverlord689
 */
public class LectorDeArchivos {

    public static void main(String[] args) {
        PanelEditor panel = new PanelEditor();
        VentanaEditor ventana = new VentanaEditor();

        ventana.addEventos(panel);
        ventana.setSize(800, 600);
        ventana.setLocationRelativeTo(null);
        ventana.add(panel);
        ventana.setVisible(true);
    }

}
