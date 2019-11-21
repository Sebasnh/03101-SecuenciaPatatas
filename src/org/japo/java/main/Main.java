/*
 * Copyright 2019 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public class Main {

    public static void main(String[] args) {

        final String ENCARGADO = "Jaimito";
        final String LISTA_COMPRA = "Patatas";
        final double DINERO = 1.00;
        final int CANTIDAD = 3;
        final double PRECIO_PATATAS = 0.30;
        final String IMPREVISTO = "Piruleta";
        final double PRECIO_PIRULETA = 0.20;

        System.out.println("Secuencia de Patatas");
        System.out.println("====================");

        System.out.printf("Persona encargada .....: %s%n", ENCARGADO);
        System.out.printf("Artículo encargado ....: %s%n", LISTA_COMPRA);
        System.out.printf("Cantidad encargada ....: %d%n", CANTIDAD);

        System.out.println("---");

        System.out.printf(Locale.ENGLISH, "Precio encargo ........: %.2f €/kg%n", PRECIO_PATATAS);
        System.out.printf(Locale.ENGLISH, "Dinero suministrado ...: %.2f €%n", DINERO);

        System.out.println("---");
        System.out.printf("Artículo imprevisto ...: %s%n", IMPREVISTO);
        System.out.printf(Locale.ENGLISH, "Precio imprevisto .....: %.2f €%n", PRECIO_PIRULETA);

        System.out.println("---");

        double dineroCompra1 = DINERO - PRECIO_PIRULETA;

        int kilos = (int) (dineroCompra1 / PRECIO_PATATAS);

        double vueltas = kilos % PRECIO_PATATAS;

        System.out.printf("Cantidad comprada .....: %d Kg%n", kilos);
        System.out.printf(Locale.ENGLISH, "Dinero devuelto .......: %.2f €%n", vueltas);

    }

}
