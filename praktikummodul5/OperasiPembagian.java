package praktikummodul5;

public class OperasiPembagian extends OperasiBilanganAbs{
    @Override
     protected void setA(double a){
        this.a =a;
    }
     
    @Override
     protected void setB(double b){
        this.b =b;
    }
     
    @Override
     protected void setC(){
     }
     
    @Override
     protected double getA(){
        return this.a;
    }
     
    @Override
     protected double getB(){
        return this.b;
    }
     
    @Override
      protected double getC(){
        return a/b;
    }
      
    @Override
    protected void tampil (){
         System.out.println("Operasi Pembagian");
         System.out.println("Nilai A =" + this.getA());
         System.out.println("Nilai B =" + this.getB());
         System.out.println("Nilai A : B =" + this.getC());
         System.out.println("====================");
    }
}
