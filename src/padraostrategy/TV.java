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
public class TV extends Produto{
    
    public TV() {
        this.nome = "TV";
        this.promocao = new PromocaoQueimaEstoque();
    }
}
