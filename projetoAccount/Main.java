
package projetoAccount;

/**
 *
 * @author Samuel Sobreira
 */
public class Main {
    
    
    public static void main(String[]args){
        Conta con = new Conta("Jose de Alencar",666,23,290,"PagSeguro",233434,0001,459.3);
        con.exibirInfos(con.getNome(), con.getCpf(), con.getIdade(),con.getCodBanco(),con.getNomeBanco(),con.getNumeroConta(),con.getAgencia(),con.getSaldo());
        con.operadorBank(con.getSaldo());
    
    }
}
