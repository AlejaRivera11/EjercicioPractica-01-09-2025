public class Cuenta {

    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual = 1;
    protected float comisionMensual = 0;

    public Cuenta (float saldo, float tasaAnual){
    this.saldo = saldo;
    this.tasaAnual = tasaAnual;
    }

    public void consignar(float cantidad){
        this.saldo = saldo + cantidad;
        numeroConsignaciones = numeroConsignaciones + 1;
    }

    public void retirar (float cantidad){
       // float nuevoSaldo = saldo - cantidad;
        if (saldo>=cantidad){
            this.saldo = saldo - cantidad;
            numeroRetiros = numeroRetiros + 1;
        }else{
            System.out.println("Saldo insuficiente para este retiro");
        }
    }

    public void calcularInteres(){
        float interesMensual = saldo*(tasaAnual/(12*100));
        this.saldo = saldo + interesMensual;
    }

    public void extractoMensual(){
        saldo = saldo - comisionMensual;
    }

    public void imprimir(){
        System.out.println("El saldo es: " + saldo);
        
    }

    
}
