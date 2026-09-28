/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog.modular.atividade.pratica;

import prog.modular.OrdemServico;

/**
 *
 * @author 1512771
 */
public class ProgModularAtividadePratica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Servico trocaOleo = new Servico("Troca de Óleo", 60, 150, "oleo");
        Servico pneu = new Servico("Troca de pneu", 90, 300, "pneu");
        Servico motor = new Servico("Troca de motor", 300, 600, "motor");

        Mecanico mecanico1 = new Mecanico(null, null, null, null);
        Mecanico mecanico2 = new Mecanico(null, null, null, null);
        Mecanico mecanico3 = new Mecanico(null, null, null, null);
        
        Box box1 = new Box(0, null, 0, null, mecanico1, null);
        box1.addServicoPermitido(trocaOleo.getCategoria());
        box1.cadastroOrdemServico(1, trocaOleo, "Glender", "RAM", "abc2d34", "em execução", null);

        Box box2 = new Box(0, null, 0, null, mecanico2, null);
        box2.addServicoPermitido(pneu.getCategoria());
        box2.cadastroOrdemServico(2, pneu, "Glender", "RAM", "abc2d34", "em execução", null);

        Box box3 = new Box(0, null, 0, null, mecanico3, null);
        box3.addServicoPermitido(motor.getCategoria());
        box3.cadastroOrdemServico(3, motor, "Glender", "RAM", "abc2d34", "em execução", null);

        
        

    }

}
