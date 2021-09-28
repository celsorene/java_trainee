public class TesteMetodos {
    
    public	static	void	main(String[]	args) {
        
        //	criando	a	conta
        Conta	minhaConta;
        minhaConta	=	new	Conta();
        
        //	alterando	os	valores	de	minhaConta
        minhaConta.titular	=	"Celsinho";
        minhaConta.saldo	=	1000;
        
        System.out.println("Saldo inicial: " + minhaConta.saldo);
        
        //	saca	200	reais
        minhaConta.saca(200);
        System.out.println("Saque: " + 200 + " -> Saldo: " + minhaConta.saldo);
        
        //	deposita	500	reais
        minhaConta.deposita(500);
        System.out.println("Deposito: " + 500 + " -> Saldo: " + minhaConta.saldo);
        
        //imprime o saldo final
        System.out.println("\nSeu saldo atual: " + minhaConta.saldo);
        System.out.println("Titular: " + minhaConta.titular.toUpperCase());

    }
    
}
