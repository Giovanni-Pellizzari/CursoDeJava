public class Tp05 {
   static class Fraccion{
        private int num , den;

        public Fraccion(){
            this.num =1;
            this.den=1;
        }

        public Fraccion(int num){
            this.num = num;
            this.den = 1;
        }

        public Fraccion(int num , int den){
            this.num = num;
            this.setDen(den);
        }

        public Fraccion(Fraccion f){
            this.num = f.getNum();
            this.den = f.getDen();
        }

        public int getNum(){
            return this.num;
        }

        public int getDen(){
            return this.den;
        }

        public void setNum(int num){
            this.num = num;
        }

        public void setDen(int den){
            if (den == 0){
                System.out.println("El denominador debe ser distinto de 0");
            }
            this.den = den;
        }

        private int mcd(int a, int b){
            return (a*b) / this.maximoComunDivisor(a,b);
        }

        public int maximoComunDivisor(int a, int b){
            int temporal;
            while (b!=0){
                temporal = b;
                b = a%b;
                a = temporal;
            }
            return a;
        }

        public Fraccion suma(Fraccion otra){
            int mcm = this.mcd(this.getDen(), otra.getDen());
            int diferenciaFraccionActual = mcm / this.getDen();
            int diferenciaOtraFraccion = mcm / otra.getDen();
            Fraccion resultado = new Fraccion();
            resultado.setNum((diferenciaFraccionActual * this.getNum()) + (diferenciaOtraFraccion * otra.getNum()));
            resultado.setDen(mcm);
            return resultado;
        }

        public Fraccion resta(Fraccion otra){
            int mcm = this.mcd(this.getDen(), otra.getDen());
            int diferenciaFraccionActual = mcm / this.getDen();
            int diferenciaOtraFraccion = mcm / otra.getDen();
            Fraccion resultado = new Fraccion();
            resultado.setNum((diferenciaFraccionActual * this.getNum()) + (diferenciaOtraFraccion * otra.getNum()));
            resultado.setDen(mcm);
            return resultado;
        }

        public Fraccion producto(Fraccion otra){
            return new Fraccion(this.getNum() * otra.getNum(), this.getDen() * otra.getDen());
        }

        public Fraccion cociente(Fraccion otra){
            return new Fraccion(this.getNum() * otra.getDen(), this.getDen() * otra.getNum());
        }

        public Fraccion simplificar(){
            int mcd = this.maximoComunDivisor(this.getNum(),this.getDen());
            return new Fraccion(this.getNum() / mcd, this.getDen() / mcd);
        }

        public String toString(){
           String texto=num+" / "+den;
           return texto;
        }

    }


    public static void main(String[] args) {


        Fraccion a = new Fraccion(6,5);
        Fraccion b = new Fraccion(-2,3);
        Fraccion c = new Fraccion(7,2);
        Fraccion d = new Fraccion(2,30);
        Fraccion e = new Fraccion(1,3);
        Fraccion f = new Fraccion(5,1);

        Fraccion a1 = b.producto(c);
        Fraccion a2 = a1.suma(d);
        Fraccion a3 = a2.suma(a);
        Fraccion a4 = e.cociente(f);
        Fraccion a5 = a3.cociente(a4);

        System.out.println(a5.simplificar());


    }
}