package SinemaProjesi;
public class FilmDugumu {
    int filmId;
    FilmDugumu sonraki;

    public FilmDugumu(int filmId){
        this.filmId= filmId;
        this.sonraki=null;
    }
}
