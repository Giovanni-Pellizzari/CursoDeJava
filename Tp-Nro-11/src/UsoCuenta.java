public class UsoCuenta {
    public static void main(String[] args) {

        CuentaCorriente cuenta1 = new CuentaCorriente("Giovanni", 5000);
        CuentaCorriente cuenta2 = new CuentaCorriente("Juan", 5000);

        System.out.println(cuenta1.toString() + "\n" + cuenta2.toString());

        cuenta1.transferencia(cuenta2, 2500);
        System.out.println("La cuenta de " + cuenta1.getNombreTitular() + " posee $" + cuenta1.getSaldo());
        System.out.println("La cuenta de " + cuenta2.getNombreTitular() + " posee $" + cuenta2.getSaldo());
        
    }
    public static class CuentaCorriente {
        private long numeroCuenta;
        private String nombreTitular;
        private float saldo;

        public CuentaCorriente(String nombreTitular, float saldo) {
            this.numeroCuenta = (long)(Math.random()*1000+1);
            this.nombreTitular = nombreTitular;
            this.saldo = saldo;
        }

        public String getNombreTitular() {
            return nombreTitular;
        }
        public void setNombreTitular(String nombreTitular) {
            this.nombreTitular = nombreTitular;
        }
        public long getNumeroCuenta() {
            return numeroCuenta;
        }
        public float getSaldo() {
            return saldo;
        }
        public void setSaldo(float saldo) {
            this.saldo = saldo;
        }

        public void transferencia(CuentaCorriente cuentaCorriente, float monto) {
            if (monto > this.saldo) {
                System.out.println("No tiene dinero suficiente.");
            } else {
                cuentaCorriente.setSaldo(cuentaCorriente.getSaldo() + monto);
                this.saldo -= monto;
                System.out.println("Se realizó la transferencia con éxito.");
            }
        }

        @Override
        public String toString() {
            return "CuentaCorriente{" +
                    "numeroCuenta=" + numeroCuenta +
                    ", nombreTitular='" + nombreTitular + '\'' +
                    ", saldo=" + saldo +
                    '}';
        }
    }


}