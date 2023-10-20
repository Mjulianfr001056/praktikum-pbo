package meet2.Tugas.Book;

public class TestBook {
    public static void main(String[] args) {
        Author A1 = new Author("Julian Firdaus", "Firdaus@stis.ac.id", 'L');
        Author A2 = new Author("Farhan Maulana", "Maulana@stis.ac.id", 'L');
        Author A3 = new Author("Sabilla Hamda", "Hamda@stis.ac.id", 'P');
        
        Author[] Authors = new Author[3];
        Authors[0] = A1;
        Authors[1] = A2;
        Authors[2] = A3;
        
        Book B1 = new Book("Mencari Cinta Sejati", Authors, 500000);

        System.out.println(B1);
    }
}

