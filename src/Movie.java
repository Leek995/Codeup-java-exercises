class Movie {
//    instance variables: what it knows
    String title;
    String genre;
    int rating;

//    What it does
    void playIt() {
        System.out.println("Playing the movie");
    }
}
class MovieTestDrive{
    public static void main(String [] args){
        Movie one = new Movie();
        one.title = "Gone with the stock";
        one.genre = "Tragic";
        one.rating = -2;
        one.playIt();
        Movie two = new Movie();
        two.title = "Lost in the cubicle space";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();
        Movie three = new Movie();
        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;
        three.playIt();
    }
}
