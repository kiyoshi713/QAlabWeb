package com.nttdata.page;

import org.openqa.selenium.By;

public class PopupPage {

    /*texto sobre el nombre del producto a comprar*/
    public static By CompraTxt = By.xpath("//*[@id=\"myModalLabel\"]/text()");

    /*texto precio unitario del producto*/
    public static By UnitPrice = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[1]/div/div[2]/p");

    /*texto de unidades de producto*/
    public static By Units = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[1]/div/div[2]/span[3]/strong");

    /*texto de precio total de producto resultado de precio unitario x unidades */
    public static By TotalPrice = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/p[4]/span[2]");

    /*boton para dar click al momento que la compra se ha finalizado*/
    public static By CompraFinaliceBtn = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a");
}
