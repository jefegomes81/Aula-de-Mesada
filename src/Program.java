java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        try (var leitor = new Scanner(System.in)) {
            System.out.println("Informe os meses: ");
            int entrada = leitor.nextInt();
            int mesada = 50;
            int resultado = entrada * mesada;        
            
            
            System.out.println("Voce tera "+ resultado + " reais em " + entrada + " meses");
        }
        
    }
}