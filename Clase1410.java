import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class Clase1410
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
        imprimir(a);
        imprimirImagenes(a);
        int op=imprimirImagenesPreguntando(a);
        JOptionPane.showMessageDialog(null,"Selecciono el "+op);
    }
    public static void imprimir(int a[])
    {
        String salida="";
        for(int i=0;i<a.length;i++)
        salida=salida+a[i]+" ";
        JOptionPane.showMessageDialog(null,salida);
    }
    public static void imprimirImagenes(int a[]) 
    {
        JPanel panel = new JPanel();

        for (int i = 0; i < a.length; i++) {
            ImageIcon img = new ImageIcon("imagenes/"+a[i] + ".png");
            panel.add(new JLabel(img));
        }

        JOptionPane.showMessageDialog(null, panel, "Galería de Imágenes", JOptionPane.PLAIN_MESSAGE);
    }
    public static int imprimirImagenesPreguntando(int a[]) 
    {
        ImageIcon[] opcionesImagenes = new ImageIcon[a.length];

        for (int i = 0; i < a.length; i++) 
        {
            opcionesImagenes[i] = new ImageIcon("imagenes/" + a[i] + ".png");
        }

        int seleccion = JOptionPane.showOptionDialog(
                null, 
                "Haz clic en una imagen:", 
                "Galería de Imágenes", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.PLAIN_MESSAGE, 
                null, 
                opcionesImagenes, // Arreglo con los iconos que sirven como botones
                null
        );

        /*if (seleccion != JOptionPane.CLOSED_OPTION) {
            int numeroSeleccionado = a[seleccion];
            JOptionPane.showMessageDialog(null, "Hiciste clic en la imagen: " + numeroSeleccionado);
        }*/
        return seleccion;
    }
}