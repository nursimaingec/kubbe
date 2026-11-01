package filmYonetimi;

public class FilmNode {
   
    private Film data;
    private FilmNode next;

    public FilmNode(Film data) {
        this.data = data;
        this.next = null;
    }

    public Film getData() { return data; }
    public void setData(Film data) { this.data = data; }

    public FilmNode getNext() { return next; }
    public void setNext(FilmNode next) { this.next = next; }

}
