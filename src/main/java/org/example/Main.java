package org.example;

import java.util.Scanner;

/*Se te pide escribir un programa en Java para la tienda de helados
FROZEN ubicados en Laureles, que necesita calcular el total de sus ventas
diarias. El programa debe calcular el total basándose en el número de
helados vendidos de diferentes tipos y sus precios. (+2.5)

Construir diagrama de entradas del problema

-Declarar e inicializar variables para almacenar los precios de tres tipos
de helados: simple, doble y especial. (Asigne los valores que considere);

-Declarar variables para almacenar la cantidad vendida de cada tipo de
helado.

-Declarar variable de tipo String para almacenar los nombres que
considere necesarios.

-El programa debe calcular el total de ventas para cada tipo de helado y
luego sumar estos totales para obtener el total general de ventas del día.

-Finalmente, el programa debe imprimir el total de ventas para cada tipo
de helado y el total general de ventas del día.

*/
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int simple = 2000, doble = 2500, especial = 50000, precioHelado, cantidadHelados;
        Scanner leerDato=new Scanner(System.in);
        System.out.println("tenemos 3 precios para su helado y esos son:\n 1.Simple :$2000 (contiene una bola de helado)\n 2.Doble:$3000 (contiene dos bolas de helado)\n 3.Especial:$5000(contiene dos bolas de helado,barquillo,chantilly y chispas de chocolate)\n ¿Que precio deseas?(no olvide seleccionarlo con su respectivo numero)");
        precioHelado = leerDato.nextInt();

        if (precioHelado == 1) {
            System.out.println("El tipo seleccionado ha sido Simple");
            precioHelado = simple;
        } else if (precioHelado == 2) {
            System.out.println("El tipo seleccionado ha sido Doble");
            precioHelado = doble;
        } else if (precioHelado == 3) {
            System.out.println("El tipo seleccionado ha sido Especial");
            precioHelado = especial;
        } else if (precioHelado < 1 || precioHelado > 3) {
            System.out.println("caracter invalido, por favor ingrese uno correspondiente a lo deseado");
        }
        System.out.println("cuantos helados decea?");
        cantidadHelados = leerDato.nextInt();
        int total = cantidadHelados * precioHelado;

        System.out.println("La cantidad de elados son" + cantidadHelados + " y el precio  total es:$" + total+"chao");
    }
}

