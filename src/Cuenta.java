public class Cuenta {

    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;


    public Cuenta (float saldo, float tasaAnual){
    this.saldo = saldo;
    this.tasaAnual = tasaAnual;
    }

    public void consignar(float cantidad){
        this.saldo = saldo + cantidad;
    }

    public void retirar (float cantidad){
        if (saldo>=cantidad){
            this.saldo = saldo - cantidad;
        }else{
            System.out.println("Saldo insuficiente para este retiro");
        }
    }

    public void calcularInteres(){
        
    }

    public void extractoMensual(){
    }

    
}
