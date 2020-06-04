
package ATVadapter;

public class MainClass {
    
    public static void main(String[] args) {
        
        System.out.println("--- TESTE DO COMPUTADOR ---\n");
        
        Dispositivo d = new PC() {};
       
            
        
        
        d.pesquisarFilme();
        d.carregarFilme();
        d.assistirFilme();
        
         System.out.println("\n--- TESTE DA SMARTTV ---\n");
        
        d = new AdaptadorSmartTV();
        
       
        d.pesquisarFilme();
        d.carregarFilme();
        d.assistirFilme();
        
        
    }
    
}


