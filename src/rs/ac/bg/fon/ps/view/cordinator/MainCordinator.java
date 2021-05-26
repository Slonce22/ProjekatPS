/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.bg.fon.ps.view.cordinator;

import java.util.HashMap;
import java.util.Map;
import rs.ac.bg.fon.ps.domain.Trening;
import rs.ac.bg.fon.ps.view.constant.Constants;
import rs.ac.bg.fon.ps.view.controller.LoginController;
import rs.ac.bg.fon.ps.view.controller.MainController;
import rs.ac.bg.fon.ps.view.controller.TreningController;
import rs.ac.bg.fon.ps.view.controller.TreningPrikaziSveController;
import rs.ac.bg.fon.ps.view.form.FrmLogin;
import rs.ac.bg.fon.ps.view.form.FrmMain;
import rs.ac.bg.fon.ps.view.form.FrmPrikazTreninga;
import rs.ac.bg.fon.ps.view.form.FrmUnosTreninga;
import rs.ac.bg.fon.ps.view.form.util.FormMode;

/**
 *
 * @author USER
 */
public class MainCordinator {
    
    private static MainCordinator instance;
    private final MainController mainController;
    
    private final Map<String, Object> params;
    
    private MainCordinator(){
        mainController = new MainController(new FrmMain());
        params = new HashMap<>();
    }
    
    public static MainCordinator getInstance() {
        if (instance == null)
            instance = new MainCordinator();
        return instance;
    }
    
    public void openLoginForm(){
        LoginController loginController = new LoginController(new FrmLogin());
        loginController.openForm();
    }
    
    public void openMainForm() {
        mainController.openForm();
    }
    
    public void openFrmUnosTreninga() {
        TreningController treningController = new TreningController(new FrmUnosTreninga(mainController.getFrmMain(), true));
        treningController.openForm(FormMode.FORM_ADD);
    }
    
    public void openFrmPrikazTreninga() {
        FrmPrikazTreninga form = new FrmPrikazTreninga(mainController.getFrmMain(), true);
        TreningPrikaziSveController sviTreninziController = new TreningPrikaziSveController(form);
        sviTreninziController.openForm();
    }
    
    public void openFrmDetaljiTreninga() {
        FrmUnosTreninga details = new FrmUnosTreninga(mainController.getFrmMain(), true);
        TreningController treningController = new TreningController(details);
        treningController.openForm(FormMode.FORM_VIEW);
        params.put(Constants.PARAM_TRENING, details);
    }
    
    public MainController getMainController() {
        return mainController;
    }
    
    public void addParam(String name, Object obj) {
        params.put(name, obj);
    }

    public Object getParam(String name) {
        return params.get(name);
    }
}
