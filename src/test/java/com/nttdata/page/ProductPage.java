package com.nttdata.page;

import org.openqa.selenium.By;

public class ProductPage {
    /*Imagen del producto para realizar click y navegar a las secciones de agregar unidad*/
    public static By Imagen = By.xpath("//*[@id=\"js-product-list\"]/div[1]/div/article/div/div[1]/a/picture/img");

    /*Boton para incrementar la cantidad de productos a comprar*/
    public static By IncreaseBtn = By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]");

    /*Boton para añadir al carrito el producto seleccionado*/
    public static By AddBtn = By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button");
}
