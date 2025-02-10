package com.nttdata.page;

import org.openqa.selenium.By;

public class MainPage {
    /*Boton para acceder a la ventana de la categoria clothes*/
    public static By BtnClothes = By.xpath("//*[@id=\"category-3\"]/a");

    /*Boton para acceder a la ventana de la subcategoria Man*/
    public static By BtnMen = By.xpath("//*[@id=\"left-column\"]/div[1]/ul/li[2]/ul/li[1]/a");
}
