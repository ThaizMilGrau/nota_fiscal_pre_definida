
public class NotaFiscal {

    private String empresa;

    private int cnpj;

    private String naturezaDaTransacao;

    private String formaDePagamento;

    private double valor;

    private String produtoServico;

    private String hora;

    private String data;

    public static void main(String[] args) {
        //criando uma instancia
        NotaFiscal nota = new NotaFiscal();

        //Atribuindo valores aos atributos
        nota.empresa = "Galaxia";
        nota.cnpj = 256894510;
        nota.naturezaDaTransacao = "Venda";
        nota.formaDePagamento = "Dinheiro";
        nota.valor = 444.00;
        nota.produtoServico = "Blusa de Moletom";
        nota.hora = "15:06";
        nota.data = "2024.04.07";

        //Exibindo a notra fiscal
        System.out.println ("Empresa: " + nota.empresa);
        System.out.println ("CNPJ: " + nota.cnpj);
        System.out.println ("Natuteza da transação: " + nota.naturezaDaTransacao);
        System.out.println ("Forma de pagamento: " + nota.formaDePagamento);
        System.out.println ("Valor da Nota: " + nota.valor);
        System.out.println ("Produto: " + nota.produtoServico);
        System.out.println ("Hora: " + nota.hora);
        System.out.println ("Data: " + nota.data);
    }
}
