import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        try (var leitor = new Scanner(System.in)) {
            System.out.printf("Informe os meses: ");
            int entrada = leitor.nextInt();
            int mesada = 50;
            int resultado = entrada * mesada;        
            
            
            System.out.printf("Você terá "+ resultado + " Reais");
        }
        
    }
}