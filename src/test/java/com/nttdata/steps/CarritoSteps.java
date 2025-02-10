package com.nttdata.steps;

import com.nttdata.page.LoginPage;
import com.nttdata.page.MainPage;
import com.nttdata.page.ProductPage;
import com.nttdata.page.PopupPage;
import com.nttdata.page.CarritoPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CarritoSteps {
    private WebDriver driver;

    //constructor
    public CarritoSteps(WebDriver driver){
        this.driver = driver;
    }

    /*Visibilizar Titulo*/
    public boolean visibilizarTitulo(){
        return this.driver.findElement(LoginPage.titulo).isEnabled();
    }
    /*Dar Click para navegar a la pagina de inicio de sesion*/
    public void clickInicioDeSesion(){
        this.driver.findElement(LoginPage.inicioSesion).click();
    }

    /*Escribir el correo*/
    public void typeCorreo(String correo){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.correoInput));
        this.driver.findElement(LoginPage.correoInput).sendKeys(correo);
    }

    /* Escribir el password */
    public void typePassword(String password){
        this.driver.findElement(LoginPage.passwordInput).sendKeys(password);
    }

    /*Hacer click en el botón login*/
    public void login(){
        this.driver.findElement(LoginPage.loginButton).click();
    }
    /*Hacer click en la categoria y luego esperar hasta que se visibilice la subcategoria y dar click */
    public void ClickCategoriaYSubCategoria(){
        this.driver.findElement(MainPage.BtnClothes).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(MainPage.BtnMen));
        this.driver.findElement(MainPage.BtnMen).click();
    }
    /*Hacer click en la imagen para visibilizar la pagina del producto*/
    public void ClickEnImagen(){ this.driver.findElement(ProductPage.Imagen).click();}

    /*Hacer click en agregar unidades para aumentar producto a comprar*/
    public void agregarProducto(int cantidad){
        for(int i=1; i<cantidad; i++){this.driver.findElement(ProductPage.IncreaseBtn).click();}}

    /*Hacer click en añadir producto, luego de agregar unidades de productos*/
    public void añadirProducto(){
        this.driver.findElement(ProductPage.AddBtn).click();
    }

    /*Validar que se muestre el titulo en la pagina del popup*/
    public boolean TextoCompra(){
        return this.driver.findElement(PopupPage.CompraTxt).isEnabled();
    }
    /*Recuperar unidad x precio unitario en la pagina del popup*/
    public int unidadesXPrecio(){
        int unitprice = Integer.parseInt(driver.findElement(PopupPage.UnitPrice).getText());
        int units = Integer.parseInt(driver.findElement(PopupPage.Units).getText());
        return unitprice * units;
    }
    /*Recuperar precio total en la pagina del popup*/
    public int precioTotal(){
        return Integer.parseInt(driver.findElement(PopupPage.TotalPrice).getText());
    }
    /*click en finalizar*/
    public void Finalizar(){
        this.driver.findElement(PopupPage.CompraFinaliceBtn).click();
    }
    /*validar titulo en pagina del carrito de compras*/
    public boolean ValidTitulo(){
        return this.driver.findElement(CarritoPage.CarritoTitle).isEnabled();
    }
    /*Recuperar unidad x precio unitario en la pagina del carrito de compras*/
    public int unidadXPU(){
        int unitprice = Integer.parseInt(driver.findElement(CarritoPage.UnitPrice).getText());
        int units = Integer.parseInt(driver.findElement(CarritoPage.Units).getText());
        return unitprice * units;
    }
    /*Recuperar precio total en la pagina del cvarrito de compras*/
    public int TotalPrice(){
        return Integer.parseInt(driver.findElement(CarritoPage.TotalPrice).getText());
    }
}
