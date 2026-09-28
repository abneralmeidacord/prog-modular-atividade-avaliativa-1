package prog.modular.atividade.pratica;

import java.util.ArrayList;

import prog.modular.OrdemServico;

public class Box {
    private int numId, capacidadeMax;
    private ArrayList<String> servicosPermitidos;
    private String local;
    private Mecanico responsavel;
    private ArrayList<OrdemServico> ordemServicos;

    public Box(int numId, ArrayList<String> servicosPermitidos, int capacidadeMax, String local, Mecanico responsavel,
            ArrayList<OrdemServico> ordemServicos) {
        this.numId = numId;
        this.servicosPermitidos = servicosPermitidos;
        this.capacidadeMax = capacidadeMax;
        this.local = local;
        this.responsavel = responsavel;
        this.ordemServicos = ordemServicos;
    }

    public int getNumId() {
        return numId;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }

    public ArrayList<String> getServicosPermitidos() {
        return servicosPermitidos;
    }

    public void setServicosPermitidos(ArrayList<String> servicosPermitidos) {
        this.servicosPermitidos = servicosPermitidos;
    }

    public void addServicoPermitido(String servico) {
        servicosPermitidos.add(servico);
    }

    public int getCapacidadeMax() {
        return capacidadeMax;
    }

    public void setCapacidadeMax(int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Mecanico getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Mecanico responsavel) {
        this.responsavel = responsavel;
    }

    public ArrayList<OrdemServico> getOrdemServicos() {
        return ordemServicos;
    }

    public void cadastroOrdemServico(int codigo, Servico servico, String cliente, String modeloVeiculo,
            String placaVeiculo,
            String status, double valorEstimado) {
        OrdemServico ord = new OrdemServico(codigo, servico, cliente, modeloVeiculo, placaVeiculo, status,
                valorEstimado);
        if (servicosPermitidos.contains(ord.getCategoriaServico()) && ord.getStatus() != "aberta") {
            ordemServicos.add(ord);
        } else if (!servicosPermitidos.contains(ord.getCategoriaServico()) && ord.getStatus() != "aberta") {
            System.out.println("Tipo de servico não permitido tente novamente");
        } else if (servicosPermitidos.contains(ord.getCategoriaServico()) && ord.getStatus() == "aberta") {
            System.out.println("Tipo de status 'Aberta' não é permitido tente novamente");
        } else if (!servicosPermitidos.contains(ord.getCategoriaServico()) && ord.getStatus() == "aberta") {
            System.out.println("Tipo de servico e status 'Aberta' não permitido tente novamente ");
        }
    }

}
