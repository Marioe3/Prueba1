package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.DAOUsuario;
import modelo.Usuario;
import vista.FormLogin;
import vista.VistaBienvenido;

/**
 *
 * @author acer
 */
public class Controlador implements ActionListener {

    private FormLogin viewLog;
    private Usuario modelUsu;
    private DAOUsuario modelDAOUsu;

    public Controlador(FormLogin viewLog, Usuario modelUsu, DAOUsuario modelDAOUsu) {
        this.viewLog = viewLog;
        this.modelUsu = modelUsu;
        this.modelDAOUsu = modelDAOUsu;
        this.viewLog.btnIngresar.addActionListener(this);

    }

    public void iniciarFormLogin() {
        viewLog.setTitle("LOGIN");
        viewLog.setLocationRelativeTo(null);
        viewLog.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (viewLog.btnIngresar == ae.getSource()) {
            modelUsu.setUsuario(viewLog.txtUsuario.getText());
            modelUsu.setClave(viewLog.txtClave.getText());

            if (modelDAOUsu.validarUsuario(modelUsu)) {
                JOptionPane.showMessageDialog(null, "Validacion de usuario exitosa");
                
                 VistaBienvenido vistab = new VistaBienvenido();
                
                ControladorBienvenido ctrb = new ControladorBienvenido(vistab);
                ctrb.iniciarVistaBienvenida(); 
                
                
            } else {
                JOptionPane.showMessageDialog(null, "El Usuario No Existe");
            }

        }

    }

}
