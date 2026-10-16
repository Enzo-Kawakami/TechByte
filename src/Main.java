import Controller.ProdutoController;
import Model.ProdutoService;

void main(){


    ProdutoService service = new ProdutoService();
    ProdutoController controller = new ProdutoController(service);

   controller.cadastrar();

    IO.println(controller.mostrar());

    controller.deletar(5);

    IO.println(controller.mostrar());

    controller.atualizar(3,100000000.00);

    IO.println(controller.mostrar());


}
