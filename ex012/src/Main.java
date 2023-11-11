public class Main {
    public static void main(String[] args) {
        Video[] listaVideos = new Video[5];
        listaVideos[0] = new Video("Aula 1 de POO");
        listaVideos[1] = new Video("Aula 12 de PHP");
        listaVideos[2] = new Video("Aula 24 de Python");
        //listaVideos[3] = new Video("Aula 3 de Javascript");
        //listaVideos[4] = new Video("Aula 7 de Ruby");

//        for (Video video : listaVideos) {
//            if (video != null) {
//                System.out.println(video.toString());
//            }
//
//        }
//
        Gafanhoto[] listaGafanhotos = new Gafanhoto[3];
        listaGafanhotos[0] = new Gafanhoto("Jubileu", 22, 'M', "juba");
        listaGafanhotos[1] = new Gafanhoto("Crueza", 12, 'F', "cruezita");
//
//        for (Gafanhoto gafanhoto : listaGafanhotos) {
//            if (gafanhoto != null) {
//                System.out.println(gafanhoto.toString());
//            }
//
//        }
        Visualizacao[] listaVisualizacoes = new Visualizacao[5];
        listaVisualizacoes[0] = new Visualizacao(listaGafanhotos[0], listaVideos[1]);
        listaVisualizacoes[1] = new Visualizacao(listaGafanhotos[1], listaVideos[1]);
        listaVisualizacoes[2] = new Visualizacao(listaGafanhotos[0], listaVideos[1]);

        for (Visualizacao visualization : listaVisualizacoes) {
            if (visualization != null) {
                System.out.println(visualization.toString());
            }
        }
    }
}