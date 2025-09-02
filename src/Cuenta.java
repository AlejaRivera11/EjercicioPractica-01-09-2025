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
    }

    public void retirar (float cantidad){
    }

    public void calcularInteres(){
    }

    public void extractoMensual(){
    }

    
}
