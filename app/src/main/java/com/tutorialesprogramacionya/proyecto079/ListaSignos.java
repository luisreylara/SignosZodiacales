package com.tutorialesprogramacionya.proyecto079;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaSignos {


    private static List<Signo> lista= new ArrayList<>(Arrays.asList(
            new Signo("Aries",R.drawable.aries,"Aries (21 de marzo-20 de abril)","Los nacidos bajo el signo de Aries suelen ser personas muy adaptables, que pueden llevarse bien con los demás por su creatividad y espontaneidad. Son detallistas y observadores."),
            new Signo("Tauro",R.drawable.tauro,"Tauro (21 de abril- 21 de mayo)","Este es un signo amoroso, al que le gusta ser romántico en sus mejores momentos. También es amante de la fuerza y de la resistencia, con una gran voluntad para hacer las cosas y encaminarlas hacia el camino correcto."),
            new Signo("Géminis",R.drawable.geminis,"Géminis (22 de mayo-21 de junio)","La inteligencia es una de sus cualidades más conocidas y reconocidas, pero no sólo de mente, también a la hora de actuar. Suelen ser personas equilibradas, adaptables y muy entregadas al amor."),
            new Signo("Cáncer",R.drawable.cancer,"Cáncer (22 de junio-22 de julio)","Son personas hogareñas, románticas y muy apasionadas. Les encanta compartir en familia todos los momentos, además de ser entregadas y dedicadas. Suelen ser personas admiradas y muy simpáticas, por lo que le suelen caer bien a todo el mundo."),
            new Signo("Leo",R.drawable.leo,"Leo (23 de julio-23 de agosto)","Les gusta ser líderes, apoyándose en sus ideas y convicciones. Les encanta llamar la atención y tener la de los demás siempre sobre de ellos, aunque hay veces que les gana la soberbia."),
            new Signo("Virgo",R.drawable.virgo,"Virgo (24 de agosto-23 de septiembre)","Son personas de carácter fuerte, con ideas firmes y claras, pues cuando quieren algo lo consiguen a como dé lugar. Tienen habilidad para convencer a los demás, para ser el centro de atracción y el alma de las fiestas o las reuniones."),
            new Signo("Libra",R.drawable.libra,"Libra (24 de septiembre-23 de octubre)","El equilibrio siempre está presente en su vida, al ser amante de la estabilidad y la paridad en todos los sentidos. Es gente tranquila, a la que le gusta la armonía y hasta la soledad en algunos momentos, aunque también puede resultar todo lo contrario, con desorden y ruido."),
            new Signo("Escorpión",R.drawable.escorpion,"Escorpión (24 de octubre-22 de noviembre)","De mente calculadora, con carácter fuerte, pero bondadoso en el fondo. Hábiles para negociar o alcanzar sus metas. Los obstáculos se convierten en retos que por lo regular superan sin miramientos. También son apasionados."),
            new Signo("Sagitario",R.drawable.sagitario,"Sagitario (23 de noviembre-21 de diciembre)","Suelen ser desordenados, atrabancados o hasta berrinchudos si las cosas no se dan como las pensaron. En contraparte, son capaces de enfocar toda su energía para solucionar dificultades."),
            new Signo("Capricornio",R.drawable.capricorn,"Capricornio (22 de diciembre-20 de enero)","Prácticas, con una habilidad nata para encontrarle solución a las cosas, aunque parezcan casos perdidos. Son amantes del orden, la estabilidad y de que todo camine conforme lo han planeado."),
            new Signo("Acuario",R.drawable.acuario,"Acuario (21 de enero-18 de febrero)","Amorosas, cariñosas y muy sensibles suelen ser las personas nacidas bajo este signo. Les gustan las causas nobles y el dar sin esperar algo a cambio."),
            new Signo("Piscis",R.drawable.piscis,"Piscis (19 de febrero-20 de marzo)","La honestidad puede llegar a ser una de sus mejores cualidades. Manejan un carácter tranquilo, muy alivianado y consolador. Creen en los demás, aunque eso les pueda acarrear alguna dificultad al ser mal pagados.")
    ));

    public static List<Signo> retornarTodos()
    {
        return lista;
    }

    public static Signo retornar(String nombre)
    {
        for(int f=0;f<lista.size();f++)
            if (nombre.equalsIgnoreCase(lista.get(f).getNombre()))
                return lista.get(f);
        return null;
    }
}
