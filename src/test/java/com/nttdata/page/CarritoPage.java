package com.nttdata.page;

import org.openqa.selenium.By;

public class CarritoPage {

    /*titulo que figura en la pagina del carrito de compra*/
    public static By CarritoTitle = By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[1]/h1");

    /*texto precio unitario del producto*/
    public static By UnitPrice = By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[2]/ul/li/div/div[2]/div[2]/div[2]/span");

    /*texto sobre unidades del producto*/
    public static By Units = By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[2]/ul/li/div/div[3]/div/div[2]/div/div[1]/div/input");

    /*texto precio total de productos que es el resultado de precio unitario x unidades*/
    public static By TotalPrice = By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[1]/div[2]/div[2]/span[2]");
}
