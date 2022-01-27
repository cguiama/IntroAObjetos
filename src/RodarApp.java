public class RodarApp {
    public static void main(String[] args) {

        //construtor padrão sem parametros
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW Serie i");
        carro1.setCapacidadeTanque(60);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(5.40));

        // construtor com objetos que tem sobrecarga (valores predefinidos)

        Carro carro2 = new Carro("Cinza", "Celta", 40);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(5.40));
    }
}
