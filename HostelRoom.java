class HostelRoom {
    String roomNo;
    int occupied;
      public static void main(){
        HostelRoom roomA=new HostelRoom();
        HostelRoom roomB=new HostelRoom();
        roomA.roomNo="C-101";
        roomB.roomNo="C-102";
        roomA.occupied++;
        roomA.occupied++;
        roomA.occupied++;

        System.out.println(roomA.roomNo+" "+roomA.occupied);
         System.out.println(roomB.roomNo+" "+roomB.occupied);
    }
}
