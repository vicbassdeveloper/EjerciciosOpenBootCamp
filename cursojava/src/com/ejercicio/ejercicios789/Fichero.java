package com.ejercicio.ejercicios789;

import java.io.*;
import java.util.Scanner;




public class Fichero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        try {
            PrintStream out = new PrintStream("texto.txt");
            out.println("\n" +
                    "'Asesinato en el campo de golf' es uno de los casos más deliciosos de Poirot y su fiel amigo Arthur Hastings. Quizá te suene haberla leído, o también puede que hayas visto su adaptación para la serie 'Agatha Christie's Poirot', con David Suchet en la piel del detective y Hugh Fraser como Hastings. Sea como fuere, prepárate a verla mucho más a menudo, pues esta novela de 1923 acaba de pasar a dominio público.\n" +
                    "\n" +
                    "Christie no es la única autora activa durante ese año a la que le ha ocurrido algo similar con el copyright. La lista incluye también a pesos pesados como Virginia Woolf ('El cuarto de Jacob'), Jalil Gibrán ('El profeta'), Aldous Huxley ('Danza de sátiros' y 'Al margen'), e.e. cummings ('Tulips and Chimneys') y algunos relatos clave de P.G. Wodehouse, como por ejemplo 'El inimitable Jeeves'. La lista completa se puede encontrar en la web de Public Domain Day, dedicada a celebrar todos los clásicos que pasan a ser patrimonio de la humanidad cada 1 de enero.\n" +
                    "\n" +
                    "Las razones tenemos que buscarlas en la actual ley de la propiedad intelectual, también conocida como Mickey Mouse Protection Act o Ley Sonny Bono. En 1998, a instancias de Disney y el ex-marido de Cher, la protección de los derechos de autor en Estados Unidos se extendió durante dos décadas más de lo que hasta entonces marcaba la legislación, que era toda la vida del autor o autora + 50 años. La revisión lo dejó en 70 años para las obras individuales y 120 para las colectivas, lo que significa que 'Steamboat Willie', el primer corto protagonizado por Mickey Mouse, seguirá bajo el amparo de The Walt Disney Company hasta 2024 (siempre que su empresa no se saque otro de estos ases de la manga).\n" +
                    "\n" +
                    "VER\n" +
                    "\n" +
                    "\n" +
                    "Sofía Reyes: 10 cosas sin las que la estrella mexicana no puede vivir\n" +
                    "\n" +
                    "Hace unos años, el activista e intelectual canadiense Wallace J. McLean decidió organizar un Día del Dominio Público cada Año Nuevo para, con suerte, concienciar al público del momento exacto en que los derechos exclusivos de una obra cultural dejaban de aplicarse. Lo de 2019 ha sido un auténtico bombazo, pues ya hemos superado ese paréntesis de veinte años aplicado por el Congreso norteamericano. Relatos de Lovecraft o el quinto volumen de 'En busca del tiempo perdido' pueden dejar de esperar entre bambalinas, pero quizá lo más impresionante de este año sea el apartado cinematográfico : 'Los diez mandamientos' de Cecil B. DeMille, 'El hombre mosca' de Harold Lloyd, 'El peregrino' de Charles Chaplin...\n" +
                    "\n" +
                    "A efectos prácticos, ¿qué lectura debemos hacer de todo esto? La más inmediata: vamos a poder ver muchísimas más ediciones de todas las obras obras que acaban de pasar a dominio público, pues ya no hay que pagar derechos de autor por ellas —las editoriales españolas deben, eso sí, encargar una nueva traducción en caso de querer publicar—. Ahora cualquiera con acceso a un procesador de textos online puede publicar o colgar en internet su versión anotada de 'Un hijo en el frente', de Edith Wharton, sin que ningún abogado llame a su puerta después. Para los albaceas de legados literarios, estas pueden ser muy malas noticias : perder el control de una obra significa resignarse a la posibilidad de que ediciones cutres o llenas de erratas colapsen el mercado. Quizá por ello, el New York Times informa de que Scribner, la editorial que ostenta actualmente los derechos de F. Scott Fitzgerald, se prepara para lanzar una edición definitiva de 'El gran Gatsby' en abril de este año, antes de que el 1 de enero de 2021 acabe con su exclusividad.\n" +
                    "\n" +
                    "Cuando una obra nos empieza a pertenecer a todos, nos pertenece de verdad. En el caso de 'Gatsby', deberíamos prepararnos para la avalancha de remixes, revisiones, juegos literarios y reescrituras que nos esperan. Piensa en lo que ocurrió con 'Orgullo y prejuicio y zombies', pero ahora imagina que el material de partida son la cantidad de obras maestras de la literatura que se publicaron durante la década de los 20. Además, los avances en el cinematógrafo producidos por aquel entonces sólo pueden significar una cosa: cada vez habrá películas más importantes sin copyright. Tampoco deberíamos olvidarnos de la música, aunque lo cierto es que las sonatas para violín de Béla Bartók y el charlestón (por mencionar dos que acaban de pasar a dominio público esta semana) no poseen el mismo capital cultural hoy en día que Christie o Chaplin.\n" +
                    "\n" +
                    "Para terminar, deberíamos mencionar que en España vamos a otro ritmo. Según cuenta Europa Press, la Biblioteca Nacional ha hecho pública una selección de obras pertenecientes a autores fallecidos en 1938, a la que todos podemos acceder libremente desde ya mismo a través de la Biblioteca Digital Hispánica. Juan de la Cierva, Serafín Álvarez Quintero y Edmundo González-Blanco (por destacar tres nombres en un listado de 175) nos oficialmente nuestros, lo que nos hace envidiar un poco los tiempos marcados en la Ley Mickey Mouse...");

        }
        catch (IOException e) {e.getMessage();}


    }

}




