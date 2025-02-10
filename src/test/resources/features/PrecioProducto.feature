Feature: Product - Store

@testPrecioProducto
Scenario Outline: Validacion del precio de un producto

Given estoy en la pagina web de la tienda

And me logueo con mi  usuario "<user>" y clave "<password>"

When navego a la categoria "<categoria>" y subcategoria "Men"

And agrego 2 unidades del primer producto al carrito

Then valido en el popup la confirmacion del producto agregado

And valido el popup el monto total sea calculado correctamente

When finalizo la compra

Then valido el titulo de la pagina del carrito

And  vuelvo a validar el calculo del precio del carrito

Examples:
| user            | password       | categoria |
| kiyo.izuku5keima@gmail.com | Kiyo7132& | clothes    |
| kiyo.izuku5@gmail.com | Kiyo7132 | clothes    |
| kiyo.izuku5keima@gmail.com | Kiyo7132& | Autos    |


