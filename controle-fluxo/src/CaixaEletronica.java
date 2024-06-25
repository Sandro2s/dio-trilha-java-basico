public class CaixaEletronica {
    public static void main(String[] args) throws Exception {
       double saldo = 25.0;
       double valorSolicitado = 25.1;

       if(valorSolicitado <= saldo){
        saldo = saldo - valorSolicitado;
        System.out.println("Novo saldo: R$" + saldo);
       }else
       System.out.println("Saldo Insuficiente : R$" + saldo);


    }
}
