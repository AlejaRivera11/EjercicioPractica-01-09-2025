public class CuentaAhorros extends Cuenta {
    protected boolean activa;

    public void CuentaAhorros (float saldo, float tasa) {
      this.saldo = saldo;
      this.tasaAnual = tasa;
    }

    public void retirar () {
        if (activa == true) {

        } else{

        }
    }


}
