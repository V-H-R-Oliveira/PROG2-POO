package gerenciamento.de.aeroporto;
import java.util.ArrayList;

public class Aeroporto {
    public int prefixo;
    public String nome;
    ArrayList<Aviao> patio;
    ArrayList<Aviao> saida;
    
    // MÉTODOS
    public void decolar(Aviao aviao) {
        patio.remove(aviao);
        
    }
    public void aterrissar(Aviao aviao) {
        patio.add(aviao);
    }
    
    public void listar() {
        for (int i=0; i < patio.size(); i++) {
            System.out.println("AVIÃO " + (i+1) + ":");
            System.out.println("Prefixo: " + this.patio.get(i).prefixo);
            System.out.println("Companhia: " + this.patio.get(i).companhia);
        }
    }
    
    // CONTRUTOR
    public Aeroporto(int prefixo, String nome) {
        this.prefixo = prefixo;
        this.nome = nome;
        this.patio = new ArrayList();
        this.saida = new ArrayList();
    }
}
