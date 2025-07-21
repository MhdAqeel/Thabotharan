public class TestBook{
	public static void main (String []args){
		Author a1 = new Author("E.L.James","example@gmail.com",'f');
		Book myBook = new Book("Fifty Shades Of Grey" , a1 , 400);
		
		/*System.out.println("The Name Of The Book Is : "+ myBook.getTitle());
		System.out.println("The Author Of The Book Is : "+ myBook.getAuthor());
		System.out.println("The Number Of The Pages In The Book Is : "+myBook.getPages());*/
		System.out.println(myBook.toString());
	}
}