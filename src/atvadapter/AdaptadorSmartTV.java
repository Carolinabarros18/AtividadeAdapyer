
package ATVadapter;

public class AdaptadorSmartTV  extends SmartTV implements Dispositivo{
    

    public void carregarFilme() {
        this.carregarAplicacoes();
        System.out.println("Carregando filme");
    }

    public void pesquisarFilme() {
        this.verificarRede();
        System.out.println("Pesquisando filme");
    }

    public void assistirFilme() {
        this.verificarRede();
        System.out.println("Iniciando filme");
        
    }

    private void carregarAplicacoes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void verificarRede() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

  
    
    
    
}
    

