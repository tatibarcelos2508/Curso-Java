public class Carro {


    String cor;
    String modelo;
    int capacidadeTanque;

    public  Carro(){

    }

    public Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }


    void setCor(String cor){
        this.cor= cor;
    }
    String getcor(){
        return cor;
    }
    void setModelo(String modelo){
        this.modelo= modelo;
    }
    String getModelo(){
        return modelo;
    }
    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque= capacidadeTanque;
    }
    int getCapacidadeTanque(){
        return capacidadeTanque;
    }
    double valorTotalTanque(double valorCombustivel){
        return this.capacidadeTanque*valorCombustivel;
    }

    public static void main(String[] args) {

        Carro carro1= new Carro();

        carro1.setCor("azul");
        carro1.setModelo("caminhonete");
        carro1.setCapacidadeTanque(9);
        System.out.println(carro1.getcor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
       System.out.println(carro1.valorTotalTanque(20.00));

       Carro carro2= new Carro ("vermelho","KWID",
               66);

        System.out.println(carro2.getcor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.valorTotalTanque(20.00));
    }
}
