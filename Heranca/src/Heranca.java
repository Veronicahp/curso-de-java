public class Heranca {
    public static void main(String[] args) throws Exception {

        Vendedor v = new Vendedor();
        v.setNome("Verônica");
        v.setSalario(1000.0f);
        v.setCpf("90090090090");
        v.setDataNascimento(new Date());
        v.setComissaoItem(10.0f);
        v.setTotalItensVendidos(10);

        System.out.println("O salário do vendedor é: " + v.calcularSalario());

        Motorista m = new Motorista();
        m.setNome("Marcio");
        m.setCpf("90090090091");
        m.setDataNascimento(new Date());
        m.setSalario(salario:500.0f);
    }
}
