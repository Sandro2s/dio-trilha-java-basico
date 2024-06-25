public class CaixaEletronica {
    public static void main(String[] args) throws Exception {
       double saldo = 25.0;
       double valorSolicitado = 30.0;

       if(valorSolicitado < saldo)
       saldo = saldo - valorSolicitado;
       else
       System.out.println("Saldo Insuficiente");

       
       System.out.println(saldo);

    }
}
