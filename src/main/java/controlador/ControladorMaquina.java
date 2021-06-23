/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.DAOMaquina;
import modelo.Maquina;
import vista.FormMaquina;

public class ControladorMaquina implements ActionListener, MouseListener {

//      Maquina ma = new Maquina();
//    //patron singleton
//    Conexion conectar = Conexion.getInstance();
//    Connection con;
    // IMPORTA LAS CLASES
    private Maquina ma;
    private DAOMaquina daom;
    private FormMaquina vista;

    public ControladorMaquina(Maquina ma, DAOMaquina daom, FormMaquina vista) {
        this.ma = ma;
        this.daom = daom;
        this.vista = vista;
        this.vista.btnAgregar.addActionListener(this); // agregar boton "agregar"
        this.vista.btnModificar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        

    }

    public void iniciarFormulaMaquina() {

        vista.setTitle("Formulario Máquinas");// titulo
        vista.setLocationRelativeTo(null);// ubicacion
        vista.setVisible(true); // mostrar el formulario
        vista.jTableAserradero.setModel(modelo); // muestra la tabla
        vista.txtId.enable(false);
        vista.jTableAserradero.addMouseListener(this);
        vista.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //dispose , permite cerrar solo la ventana seleccionada
        llenarTabla();
    }

    String[] columnas = {"id", "Nombre", "ubicacion", "tipo"};
    ArrayList<Object[]> datos = new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

    @Override
    public void actionPerformed(ActionEvent e) {

        if (vista.btnAgregar == e.getSource()) { //detecta la pulsacion del boton agragar

            ma.setNombreMaquina(vista.txtNombreMaquina.getText()); // toma el usuario ingresa en el formulario y lo guarda en el atributo nombre maquina
            ma.setUbicacionMaquina(vista.txtUbicacionMaquina.getText());
            ma.setTipoMaquina(vista.txtTipoMaquina.getText());

            if (daom.Agregar(ma)) { // se agraga el objaeto maquina "ma"
                JOptionPane.showMessageDialog(null, "agregado exitoso");

                llenarTabla();
                limpiar();

            } else {
                JOptionPane.showMessageDialog(null, "agregado fallida");
            }

        }
        // nueva linea
        if (e.getSource() == vista.btnModificar) {
            
            ma.setIdMaquina(Integer.parseInt(vista.txtId.getText()));
            ma.setNombreMaquina(vista.txtNombreMaquina.getText());
            ma.setUbicacionMaquina(vista.txtUbicacionMaquina.getText());
            ma.setTipoMaquina(vista.txtTipoMaquina.getText());
            

            if (daom.Modificar(ma)) {
                JOptionPane.showMessageDialog(null, "Registro Actualizado");
                llenarTabla();
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
        }
        // btn eliminar 
        if (e.getSource() == vista.btnEliminar) {

            ma.setIdMaquina(Integer.parseInt(vista.txtId.getText()));
            if (daom.Eliminar(ma)) {
                JOptionPane.showMessageDialog(null, "Eliminado");
                llenarTabla();
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }

        }
    
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vista.jTableAserradero) {
            vista.txtNombreMaquina.setText(String.valueOf(vista.jTableAserradero.getValueAt(vista.jTableAserradero.getSelectedRow(), 1)));
            vista.txtUbicacionMaquina.setText(String.valueOf(vista.jTableAserradero.getValueAt(vista.jTableAserradero.getSelectedRow(), 2)));
            vista.txtTipoMaquina.setText(String.valueOf(vista.jTableAserradero.getValueAt(vista.jTableAserradero.getSelectedRow(), 3)));
          vista.txtId.setText(String.valueOf(vista.jTableAserradero.getValueAt(vista.jTableAserradero.getSelectedRow(), 0)));

        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public void llenarTabla() { //carga los datos de la bace de datos a la tabla
        modelo.setRowCount(0);
        datos = daom.consultar();

        // for each
        for (Object[] obj : datos) {
            modelo.addRow(obj);
        }
        vista.jTableAserradero.setModel(modelo);

    }

    public void limpiar() {

        vista.txtNombreMaquina.setText("");
        vista.txtUbicacionMaquina.setText("");
        vista.txtTipoMaquina.setText("");
        vista.txtId.setText("");
        
    }

}
