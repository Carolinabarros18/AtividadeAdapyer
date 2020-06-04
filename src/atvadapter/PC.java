
package ATVadapter;


public abstract class PC implements Dispositivo {
   

    public void carregarFilme() {
        System.out.println("Carregando filme...");
    }

    public void pesquisarFilme() {
        System.out.println("Pesquisando filme");
        
    }

    public void assistirFilme() {
        System.out.println("Iniciando filme.");
    }
    
    
}
    

