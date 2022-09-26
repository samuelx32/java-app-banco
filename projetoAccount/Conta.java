
package projetoAccount;

import javax.swing.JOptionPane;

/**
 *
 * @author Samuel Sobreira
 */
public class Conta {
    private String nome, nomeBanco;
    private int idade, cpf;
    private int codBanco;
    private int numeroConta, agencia;
    private double saldo;
    
    Conta (String nome, int cpf, int idade, int codBanco, String nomeBanco, int numeroConta, int agencia, double saldo){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.codBanco = codBanco;
        this.nomeBanco = nomeBanco;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nomeBanco
     */
    public String getNomeBanco() {
        return nomeBanco;
    }

    /**
     * @param nomeBanco the nomeBanco to set
     */
    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the cpf
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the codBanco
     */
    public int getCodBanco() {
        return codBanco;
    }

    /**
     * @param codBanco the codBanco to set
     */
    public void setCodBanco(int codBanco) {
        this.codBanco = codBanco;
    }

    /**
     * @return the numeroConta
     */
    public int getNumeroConta() {
        return numeroConta;
    }

    /**
     * @param numeroConta the numeroConta to set
     */
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    /**
     * @return the agencia
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void exibirInfos(String nome, int cpf, int idade, int codBanco, String nomeBanco, int numeroConta, int agencia, double saldo){
        JOptionPane.showMessageDialog(null, 
                "Nome: "+nome+
                "\nCPF: "+cpf+
                "\nIdade: "+idade+
                "\nCódigo do Banco: "+codBanco+
                "\nNome do Banco: "+nomeBanco+
                "\nNúmero da Conta: "+numeroConta+        
                "\nAgencia: "+agencia+
                "\nSaldo: "+saldo);
    }
    
    public void operadorBank (double saldo){
        String[] ops = {"Depositar","Sacar"};
        int op = JOptionPane.showOptionDialog(null, "O QUE DESEJA FAZER?", "OPERAÇÕES", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, ops, ops[0]);
      
        switch(op){
            case 0:
                JOptionPane.showInputDialog("Digite o Valor para Depositar: ");
                break;
            case 1:
                JOptionPane.showInputDialog("Digite o Valor para Sacar: ");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
}
