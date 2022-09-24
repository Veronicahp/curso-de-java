import java.util.Date;

public class Vendedor  extends Funcionario {
   
    private int totalItensVendidos;
    private float comissaoItem;

    public Vendedor () {
        super();

    }

   public float calcularSalario() {
    return super.getSalario() + (this.comissaoItem * totalItensVendidos)
   }
}


