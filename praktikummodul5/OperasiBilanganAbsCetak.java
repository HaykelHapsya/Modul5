package praktikummodul5;

final class OperasiBilanganAbsCetak {
    private static void cetakSemua(OperasiBilanganAbs[]OB, double a, double b){
        OB[0] = new OperasiPenjumlahan();
        OB[1] = new OperasiPengurangan();
        OB[2] = new OperasiPerkalian();
        OB[3] = new OperasiPembagian();
        
        for (int i = 0; i < OB.length; i++) {
            OB[i].setA(a);
            OB[i].setB(b);
            OB[i].setC();
            OB[i].tampil();
        }
    }
    public static void main(String[]args){
        OperasiBilanganAbs[] arr1 = new OperasiBilanganAbs[4];
        cetakSemua(arr1, 6.5, 0.5);
    }
}
