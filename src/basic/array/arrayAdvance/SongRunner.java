package basic.array.arrayAdvance;

class SongRunner{
	public static void main(String[] args) {
		Song[] songs= new Song[5];
        
        Song song1=new Song();
        song1.setName("Dhaakad");
        song1.setMovieName("Dangal");
        
         Song song2=new Song();
        song2.setName("Malang");
        song2.setMovieName("Drive");

        Song song3=new Song();
        song3.setName("Dil Nu");
        song3.setMovieName("Kashish");

        Song song4=new Song();
        song4.setName("Khuda jaane");
        song4.setMovieName("bachna ae haseeno");

        Song song5=new Song();
        song5.setName("Noor");
        song5.setMovieName("Khayaal");

        for(int i=0;i<songs.length;i++){
         if(i==0){
         	songs[i]=song1;
         }else if(i==1){
         	songs[i]=song2;
         }
         if(i==2){
         	songs[i]=song3;
         }else if(i==3){
         	songs[i]=song4;
         }else if (i==4){
         	songs[i]=song5;
         }
         }
         
         for(int i=0;i<songs.length;i++){
          Song song=  songs[i];
         	if(song !=null){
         		System.out.println("Song Name");
         		System.out.println(song.getName());
         		System.out.println("Movie Name");
         		System.out.println(song.getMovieName());
         		System.out.println();         	
         	}
         }




	}
}