package gerenciamento.de.aeroporto;

public class GerenciamentoDeAeroporto {

    public static void main(String[] args) {
        Aviao a1 = new Aviao(1, "GOL");
        Aviao a2 = new Aviao(2, "GOL");
        Aviao a3 = new Aviao(3, "GOL");
        Aviao a4 = new Aviao(4, "GOL");
        
        Aeroporto curitiba = new Aeroporto(1, "Curitiba");
        Aeroporto londrina = new Aeroporto(2, "Londrina");
        
        londrina.decolar(a1);
        curitiba.aterrissar(a1);
        
        londrina.decolar(a2);
        curitiba.aterrissar(a2);
        
        curitiba.decolar(a3);
        londrina.aterrissar(a3);
        
        curitiba.decolar(a4);
        londrina.aterrissar(a4);
        
        System.out.println("----- CURITIBA -----");
        curitiba.listar();
        System.out.println("----- LONDRINA -----");
        londrina.listar();
    }
}
