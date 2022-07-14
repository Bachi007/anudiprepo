import java.util.*;
class myGenerics{
public static void main(String args[]){

ArrayList<Book> hm=new ArrayList<Book>();
Book b1= new Book(101,"Let us C",200);
Book b2= new Book(102,"Let us Java",400);
Book b3= new Book(103,"Let us Python",300);

hm.add(b1);
hm.add(b2);
hm.add(b3);
Collections.sort(hm);
for(Book it:hm)
System.out.println(it.bookId+" is "+it.bookName+" price is"+it.bookPrice);

}
}