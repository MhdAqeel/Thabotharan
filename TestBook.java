public class TestBook{
	public static void main (String []args){
		Author a1 = new Author("E.L.James","example@gmail.com",'f');
		String word="Fifty Shades Of Grey"; 
		Book myBook = new Book(word , a1 , 400); //method over-ride
		
		System.out.println("the name of the auther is : "+myBook.getAuthor().getName());
		System.out.println();
		/*System.out.println("The Name Of The Book Is : "+ myBook.getTitle());
		System.out.println("The Author Of The Book Is : "+ myBook.getAuthor());
		System.out.println("The Number Of The Pages In The Book Is : "+myBook.getPages());*/
		myBook.setPage(1000);
		
		System.out.println(myBook.toString());
		System.out.println("name of the author"+myBook.getAuthor().getName());
	}
}