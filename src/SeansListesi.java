public class SeansListesi {
    private SeansNode head;

    public SeansListesi(){
      this.head =null;
    }
  public void seansEkle(Seans yeniSeans) {
      SeansNode newNode = new SeansNode(yeniSeans);
      if(head == null) {
        head = newNode;
      } else {
        SeansNode temp = head;
        while(temp.next != null){
          temp = temp.next;
        }
        temp.next = newNode;
      }
    }
}
