package com.poo.urnaeletronica;

// import com.poo.urnaeletronica.view.CadastrarCargo;
// import com.poo.urnaeletronica.view.CadastrarEleicao;

// import com.poo.urnaeletronica.view.CadastrarEleitor;
import com.poo.urnaeletronica.view.CadastrarCandidato;
// import com.poo.urnaeletronica.view.Login;
import com.poo.urnaeletronica.view.Menu;
import com.poo.urnaeletronica.view.UrnaEletronica;
// import com.poo.urnaeletronica.view.VisualizarCandidato;
// import com.poo.urnaeletronica.view.VisualizarCargo;
// import com.poo.urnaeletronica.view.VisualizarEleicao;
// import com.poo.urnaeletronica.view.VisualizarEleitor;

public class App {
    public static void main(String[] args) throws Exception {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Menu menu = new Menu();
                menu.start();
               
                // new Login().setVisible(true);
               
                CadastrarCandidato cadastrarCandidato = new CadastrarCandidato();
                cadastrarCandidato.start();
               
                // CadastrarEleitor cadastrarEleitor = new CadastrarEleitor();
                // cadastrarEleitor.start();

                // CadastrarCargo cadastrarCargo = new CadastrarCargo();
                // cadastrarCargo.start();
            
                // CadastrarEleicao cadastrarEleicao = new CadastrarEleicao();
                // cadastrarEleicao.start();

                UrnaEletronica urnaeletronica = new UrnaEletronica();
                urnaeletronica.start();

                // VisualizarCandidato visualizarCandidato = new VisualizarCandidato();
                // VisualizarEleitor visualizarEleitor = new VisualizarEleitor();
                // VisualizarCargo visualizarCargo = new VisualizarCargo();
                // VisualizarEleicao visualizarEleicao = new VisualizarEleicao();

                // visualizarCandidato.start();
                // visualizarEleitor.start();
                // visualizarCargo.start();
                // visualizarEleicao.start();
            }
        });
   }
}
