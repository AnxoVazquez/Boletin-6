package boletin6;

/**
 *
 * @author avazquezsuarez
 */
public class Conta {
    private String nome,numero_conta;
    private double saldo;
    
    
    public Conta(){
        
    }
    
    public Conta(String nombre,String numerodecuenta,Double saldo_disponible){
        nome= nombre;
        numero_conta= numerodecuenta;
        saldo=saldo_disponible;
     
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(String numero_conta) {
        this.numero_conta = numero_conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void Ingresar(int dinero){
        if(dinero>=0){
        saldo= saldo+dinero;
        }
        else{
            System.out.println("Numero negativo");  
        }
    }
    
    public void Retirar(int dinero){
        if(saldo>=dinero){
            saldo= saldo-dinero;
        }
        else{
            System.out.println("Falta de saldo");
        }
    }
    
    public void visulizar(){
      System.out.println("Nombre: "+nome + " Nº de cuenta: "+ numero_conta + " Saldo disponible: "+ saldo);
    }
    
     
}


