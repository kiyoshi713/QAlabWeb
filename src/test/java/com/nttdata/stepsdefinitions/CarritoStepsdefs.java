package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CarritoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

public class CarritoStepsdefs {

    private WebDriver driver;
    private CarritoSteps carritoSteps(WebDriver driver){
        return new CarritoSteps(driver);
    }
    CarritoSteps carritoSteps = new CarritoSteps(driver);

    @Given("estoy en la pagina web de la tienda")
    public void estoyEnLaPaginaWebDeLaTienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/pe/");
        screenShot();

        Assert.assertTrue(carritoSteps(driver).visibilizarTitulo());
        carritoSteps(driver).clickInicioDeSesion();
    }

    @And("me logueo con mi  usuario {string} y clave {string}")
    public void meLogueoConMiUsuarioYClave(String correo, String clave) {
        carritoSteps(driver).typeCorreo(correo);
        carritoSteps(driver).typePassword(clave);
        carritoSteps(driver).login();
    }

    @When("navego a la categoria {string} y subcategoria {string}")
    public void navegoALaCategoriaYSubcategoria(String arg0, String arg1) {
        carritoSteps(driver).ClickCategoriaYSubCategoria();
    }

    @And("agrego {int} unidades del primer producto al carrito")
    public void agregoUnidadesDelPrimerProductoAlCarrito(int cantidad) {
        carritoSteps(driver).ClickEnImagen();
        carritoSteps(driver).agregarProducto(cantidad);
        carritoSteps(driver).añadirProducto();
    }

    @Then("valido en el popup la confirmacion del producto agregado")
    public void validoEnElPopupLaConfirmacionDelProductoAgregado() {
        Assert.assertTrue(carritoSteps(driver).TextoCompra());
    }

    @And("valido el popup el monto total sea calculado correctamente")
    public void validoElPopupElMontoTotalSeaCalculadoCorrectamente() {
        Assert.assertEquals(carritoSteps(driver).unidadesXPrecio(),carritoSteps(driver).precioTotal());
    }

    @When("finalizo la compra")
    public void finalizoLaCompra() {
        carritoSteps(driver).Finalizar();
    }

    @Then("valido el titulo de la pagina del carrito")
    public void validoElTituloDeLaPaginaDelCarrito() {
    carritoSteps(driver).ValidTitulo();
    }

    @And("vuelvo a validar el calculo del precio del carrito")
    public void vuelvoAValidarElCalculoDelPrecioDelCarrito() {
    Assert.assertEquals(carritoSteps(driver).unidadXPU(), carritoSteps(driver).TotalPrice());
    }
}
