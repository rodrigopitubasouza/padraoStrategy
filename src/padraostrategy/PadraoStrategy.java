/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostrategy;

/**
 *
 * @author ice
 */
public class PadraoStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto produtoTv = new TV();
        Produto produtoCamera = new Camera();
        Produto produtoCelular = new Celular();
        
        System.out.println(produtoTv.getNome() + " na promoção " + produtoTv.desconto()+ "%");
        System.out.println(produtoCamera.getNome() + " na promoção " + produtoCamera.desconto()+ "%");
        System.out.println(produtoCelular.getNome() + " na promoção " + produtoCelular.desconto()+ "%");
        
        
    }
    
}
