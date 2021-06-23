/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import controlador.Controlador;
import controlador.ControladorMaquina;
import controlador.ControladorTrabajador;
import java.sql.SQLException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.Conexion;
import modelo.DAOMaquina;
import modelo.DAOTrabajador;
import modelo.DAOUsuario;
import modelo.Maquina;
import modelo.Trabajador;
import modelo.Usuario;
import vista.FormLogin;
import vista.FormMaquina;
import vista.FormTrabajador;

/**
 *
 * @author acer
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, UnsupportedLookAndFeelException {
//      Conexion con= Conexion.getInstance();
//      con.conectar();
        UIManager.setLookAndFeel(new BernsteinLookAndFeel());
        FormLogin log = new FormLogin();
        Usuario usu = new Usuario();
        DAOUsuario dusu = new DAOUsuario();

        Controlador ctrl = new Controlador(log, usu, dusu);
        ctrl.iniciarFormLogin();
        
        //inicia maquina
//        FormMaquina vista = new FormMaquina();
//        Maquina ma = new Maquina();
//        DAOMaquina daom = new DAOMaquina();
//        ControladorMaquina ctrm = new ControladorMaquina(ma, daom, vista);
//        ctrm.iniciarFormulaMaquina();
        
        
                //inicia Trabajadores
//        FormTrabajador vistat = new FormTrabajador();
//        Trabajador tra = new Trabajador();
//        DAOTrabajador daot = new DAOTrabajador();
//        ControladorTrabajador ctrt = new ControladorTrabajador(tra, daot, vistat);
//        ctrt.iniciarFormulaTrabajadores();
    }
}

        
    
    
    

