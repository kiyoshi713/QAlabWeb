package com.nttdata.page;

import org.openqa.selenium.By;

public class LoginPage {

    //Localizadores de elementos
    /*Titulo de la pagina inicial para validar el ingreso a la pagina*/
    public static By titulo = By.xpath("//*[@id=\"_desktop_logo\"]/h1/a/img");

    /*Boton inicio de sesion de la pagina inicial para navegar al form de credenciales*/
    public static By inicioSesion = By.xpath("//*[@id=\"_mobile_user_info\"]/div/a/span");

    /*Input para ingresar el correo para loguearse*/
    public static By correoInput = By.id("field-email");

    /*Input para ingresar la clave para loguearse*/
    public static By passwordInput = By.id("field-password");

    /*Boton para loguearse*/
    public static By loginButton = By.id("submit-login");

}
