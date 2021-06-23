/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static com.sun.javafx.tk.Toolkit.getToolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.DAOTrabajador;
import modelo.Trabajador;
import vista.FormTrabajador;

/**
 *
 * @author acer
 */
public class ControladorTrabajador implements ActionListener, MouseListener, KeyListener {

    private Trabajador tra;
    private DAOTrabajador daot;
    private FormTrabajador vistat;

    public ControladorTrabajador(Trabajador tra, DAOTrabajador daot, FormTrabajador vistat) {
        this.tra = tra;
        this.daot = daot;
        this.vistat = vistat;
        this.vistat.btnAgregarTrabajador.addActionListener(this); // agregar boton "agregar"
        this.vistat.btnModificarTrabajador.addActionListener(this);
        this.vistat.btnEliminarTrabajador.addActionListener(this);
        vistat.jTbTrabajador.addMouseListener(this);
        vistat.txtNombreTrabajador.addKeyListener(this);
        vistat.txtApellidoPaterno.addKeyListener(this);
        vistat.txtApellidoMaterno.addKeyListener(this);
        

    }

    public void iniciarFormulaTrabajadores() throws SQLException {

        vistat.setTitle("Formulario Trabajadores");// titulo
        vistat.setLocationRelativeTo(null);// ubicacion
        vistat.setVisible(true); // mostrar el formulario
        vistat.jTbTrabajador.setModel(modelo); // muestra la tabla
        vistat.txtidTrabajador.setEnabled(false);//bloquea el campo "txtIdMaquina"
        vistat.jTbTrabajador.addMouseListener(this);
        vistat.cbxCargo.setModel(daot.ob_cargo());
        vistat.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //dispose , permite cerrar solo la ventana seleccionada
        llenarTabla();
    }

    String[] columnas = {"id_trabajador", "rut", "nombres", "apellido_paterno", "apellido_materno", "cargo_fk"};
    ArrayList<Object[]> datos = new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

    @Override
    public void actionPerformed(ActionEvent e) {
        //boton agregar
        if (vistat.btnAgregarTrabajador == e.getSource()) { //detecta la pulsacion del boton agregar

            tra.setRut(vistat.txtRut.getText()); // toma el usuario ingresa en el formulario y lo guarda en el atributo nombre maquina
            tra.setNombreTrabajador(vistat.txtNombreTrabajador.getText());
            tra.setApellidoPater(vistat.txtApellidoPaterno.getText());
            tra.setApellidoMater(vistat.txtApellidoMaterno.getText());
            tra.setCargos_Trabajador(vistat.cbxCargo.getSelectedItem().toString());
            
            //validacion de campos
            if (tra.validarRut(vistat.txtRut.getText())) {
                if (daot.Agregar(tra)) { // se agraga el objaeto trabajador "tra"
                    JOptionPane.showMessageDialog(null, "agregado exitoso");

                    llenarTabla();
                    limpiar();

                } else {
                    JOptionPane.showMessageDialog(null, "agregado fallida");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Rut Invalido");
            }
            if(tra.validarCamposVacios()){
                
            }else {
                JOptionPane.showMessageDialog(null, "No debe dejar campos  vacios");
            
            }
            

        }

        // boton modificar
        if (vistat.btnModificarTrabajador
                == e.getSource()) {

            tra.setRut(vistat.txtRut.getText());
            tra.setNombreTrabajador(vistat.txtNombreTrabajador.getText());
            tra.setApellidoPater(vistat.txtApellidoPaterno.getText());
            tra.setApellidoMater(vistat.txtApellidoMaterno.getText());
            tra.setCargos_Trabajador(vistat.cbxCargo.getSelectedItem().toString());
            tra.setId_trabajador(Integer.parseInt(vistat.txtidTrabajador.getText()));
            if (daot.Modificar(tra)) {
                JOptionPane.showMessageDialog(null, "Registro Actualizado");
                llenarTabla();
                limpiar();

            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }

        //boton eliminar
        if (e.getSource()
                == vistat.btnEliminarTrabajador) {

            tra.setId_trabajador(Integer.parseInt(vistat.txtidTrabajador.getText()));
            if (daot.Eliminar(tra)) {
                JOptionPane.showMessageDialog(null, "Eliminado");
                llenarTabla();
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }

        }
    }

    public void llenarTabla() {  //carga los datos de la bace de datos a la tabla
        modelo.setRowCount(0);
        datos = daot.consultar();

        // for each
        for (Object[] obj : datos) {
            modelo.addRow(obj);
        }
        vistat.jTbTrabajador.setModel(modelo);

    }

    public void limpiar() {

        vistat.txtidTrabajador.setText("");
        vistat.txtRut.setText("");
        vistat.txtNombreTrabajador.setText("");
        vistat.txtApellidoPaterno.setText("");
        vistat.txtApellidoMaterno.setText("");
        vistat.cbxCargo.setSelectedIndex(0);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vistat.jTbTrabajador) {
            vistat.txtidTrabajador.setText(String.valueOf(vistat.jTbTrabajador.getValueAt(vistat.jTbTrabajador.getSelectedRow(), 0)));
            vistat.txtRut.setText(String.valueOf(vistat.jTbTrabajador.getValueAt(vistat.jTbTrabajador.getSelectedRow(), 1)));
            vistat.txtNombreTrabajador.setText(String.valueOf(vistat.jTbTrabajador.getValueAt(vistat.jTbTrabajador.getSelectedRow(), 2)));
            vistat.txtApellidoPaterno.setText(String.valueOf(vistat.jTbTrabajador.getValueAt(vistat.jTbTrabajador.getSelectedRow(), 3)));
            vistat.txtApellidoMaterno.setText(String.valueOf(vistat.jTbTrabajador.getValueAt(vistat.jTbTrabajador.getSelectedRow(), 4)));
            vistat.cbxCargo.setSelectedItem(String.valueOf(vistat.jTbTrabajador.getValueAt(vistat.jTbTrabajador.getSelectedRow(), 5)));
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
     //validacion de campos vacios
    @Override
    public void keyTyped(KeyEvent evt) {

        if (evt.getSource() == vistat.txtNombreTrabajador) {
            char C = evt.getKeyChar();

            if (Character.isDigit(C)) {

                vistat.getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Ingrese solo Letras");
                vistat.txtNombreTrabajador.setCursor(null); // nombre del campo

            } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                    || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
                    || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                    || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {

                vistat.getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Ingrese solo Letras");
                vistat.txtNombreTrabajador.setCursor(null); // nombre del campo

            }

        }

        if (evt.getSource() == vistat.txtApellidoPaterno) {
            char C = evt.getKeyChar();

            if (Character.isDigit(C)) {

                vistat.getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Ingrese solo Letras");
                vistat.txtApellidoPaterno.setCursor(null); // nombre del campo

            } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                    || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
                    || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                    || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {

                vistat.getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Ingrese solo Letras");
                vistat.txtApellidoMaterno.setCursor(null); // nombre del campo

            }

        }

        if (evt.getSource() == vistat.txtApellidoMaterno) {
            char C = evt.getKeyChar();

            if (Character.isDigit(C)) {

                vistat.getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Ingrese solo Letras");
                vistat.txtApellidoMaterno.setCursor(null); // nombre del campo

            } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                    || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
                    || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                    || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {

                vistat.getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Ingrese solo Letras");
                vistat.txtApellidoMaterno.setCursor(null); // nombre del campo

            }

        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
