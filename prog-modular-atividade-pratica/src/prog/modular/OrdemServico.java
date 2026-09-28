package prog.modular;

import java.util.Scanner;

import prog.modular.atividade.pratica.Servico;

public class OrdemServico {
    private int codigo;
    private String cliente, modeloVeiculo, placaVeiculo;
    private String status = "aberta";
    private double valorEstimado;
    private Servico servico;

    public OrdemServico(int codigo, Servico servico, String cliente, String modeloVeiculo, String placaVeiculo,
            String status, double valorEstimado) {
        this.codigo = codigo;
        this.servico = servico;
        this.cliente = cliente;
        this.modeloVeiculo = modeloVeiculo;
        this.placaVeiculo = placaVeiculo;
        this.status = status;
        this.valorEstimado = valorEstimado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        while (!(status.equals("aberta") || status.equals("em execução") || status.equals("finalizada"))) {
            System.out.println("--- STATUS PERMITIDOS ---");
            System.out.println("aberta");
            System.out.println("em execução");
            System.out.println("finalizada");
            this.status = status;
        }
    }

    public double getValorEstimado() {
        return valorEstimado;
    }

    public void setValorEstimado() {
        this.valorEstimado = servico.getValor();
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Servico getServico() {
        return servico;
    }

    public String getCategoriaServico() {
        return servico.getCategoria();
    }

    public void cadastroOrdemServico(int codigo, Servico servico, String cliente, String modeloVeiculo,
            String placaVeiculo,
            String status, double valorEstimado) {
        new OrdemServico(codigo, servico, cliente, modeloVeiculo, placaVeiculo, status, valorEstimado);
    }

}
