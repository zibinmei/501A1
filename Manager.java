//Zibin Mei
//1085722

import java.util.Scanner;


//main manager this class interact with the movie, movienode and goal is to manage the data in the list
public class Manager
{
	private MovieNode head;
	Scanner in = new Scanner(System.in);
	// default constructor
    public Manager()
    {
        head = null;
    }

		//input - name
		private String inName(){
			String i = null;
			do{
				System.out.println("Enter Name: ");
				i =in.nextLine();
			}while (i == null || i == "");
			return i.toUpperCase();
		}

    //prompt the user to fill in movie info and add to a node then put in the last spot on list.
    public void addMovie()
    {
			String name;
			String[] cast=new String[3];
			String genre="other";
			int rating=0;
			//ask for name
			name = inName();
			//asking for cast
			for (int k=0;k<3;k++)
			{
				int j=k+1;
				System.out.println("Enter Cast #"+j+": ");
				cast[k]=in.nextLine();
			}

			//asking for genre type
			boolean i =true;
			while (i)
			{
				System.out.println("Enter Genre: ");
				String a=in.nextLine();

				if (a.equals("action")|| a.equals("drama")||a.equals("science fiction")||a.equals("comedy")||a.equals("horror")||a.equals("martial arts")||a.equals("other"))
				{
					genre = a;
					i= false;
				}
				else
					System.out.println("Choose: action, drama, science fiction, comedy, horror, martial arts or 'other'");
			}
			//ask for rating - limits to 1-5
			boolean rateflag = true;
			while (rateflag)
			{
				System.out.println("Enter Rating (1-5): ");
				int rate=0;
				try
				{
					rate=in.nextInt();
					in.nextLine();
				}
				catch (Exception e)
				{
					System.out.println("Error!");
					in.next();
				}

				if (rate >0 && rate <=5)
				{
					rateflag = false;
					rating = rate;
				}
				else
					System.out.println("Only 1-5");
			}
			add(new MovieNode(new Movie(name,cast,genre,rating)));
		}
	    //use to all node to the list -use in class
		public void add(MovieNode aNode)
		{
			if (head == null)
			{
				head = aNode;
			}
			else
			{
				MovieNode current = head;
				MovieNode previous = null;
			while (current != null)
			{
				previous = current;
				current = current.getNext();
			}
				previous.setNext(aNode);
			}
		}
		//use to display all item in the list,
		public void display()
		{
			MovieNode temp = head;
			if (temp == null)
				System.out.println(">>EMPTY LIST<<");

			while (temp != null)
			{
				Movie data = temp.getData();
				String MovieName=data.getName();
				String MovieGenre=data.getGenre();
				String[] MovieCast=data.getCast();
				int MovieRating=data.getRating();
				System.out.println();
				System.out.println(MovieName+"\n"+MovieGenre);
				System.out.println(MovieCast[0]+"\n"+MovieCast[1]+"\n"+MovieCast[2]);
				System.out.println(MovieRating+"\n");
				temp = temp.getNext();
			}
	}
	//use to search a movie and display it - runs through each node and show results.
	public void search()
	{
		//grabbing input- convert to upper case
		MovieNode temp = head;
		boolean n = true;
		System.out.print("Search Title: ");
		String i=in.nextLine();
		String input = i.toUpperCase();
		System.out.println("Search for " +input);



		if (temp == null)
			System.out.println(">>EMPTY<<");

		//main display loop - same as display method
		while (temp != null && n)
		{
			System.out.println("Searching Node...");
			Movie findMovie = temp.getData();
			String findMovieTitle = findMovie.getName();

			if (input.equals(findMovieTitle))
			{
				n=false;
				String MovieName=findMovie.getName();
				String MovieGenre=findMovie.getGenre();
				String[] MovieCast=findMovie.getCast();
				int MovieRating=findMovie.getRating();
				System.out.println();
				System.out.println(MovieName+"\n"+MovieGenre);
				System.out.println(MovieCast[0]+"\n"+MovieCast[1]+"\n"+MovieCast[2]);
				System.out.println(MovieRating+"\n");
			}
			//show not found
			else
			{
				System.out.print("Not Found, ");
				temp = temp.getNext();
			}
		}
		//indicate search is complete
		System.out.println("Search Complete");
	}
	//use to remove the last node
	public void remove()
	{
		MovieNode current = head;
		MovieNode previous = null;

		if (current == null)
			System.out.println(">>List is empty<<");

		System.out.print("Remove Title: ");
		String someTitle = in.nextLine();
		String removeTitle=someTitle.toUpperCase();
		boolean removeflag = true;

		while (current !=null && removeflag)
		{

			String currentTitle=current.getData().getName();

			if (currentTitle.equals(removeTitle))
			{
				previous.setNext(current.getNext());
				current =null;
				removeflag=false;
				return;
			}
			else
			{
				previous=current;
				current=current.getNext();
			}
			if (current == null)
				System.out.println("Movie not found");

		}
	}
	//use to display list backward
	public void oppsite()
	{
		//set up node count
		int k = 0;
		MovieNode count= head;
		//empty list checker
		if (count == null)
			System.out.println(">>EMPTY LIST<<");
		//add 1 to node count
		while (count != null)
		{
			k++;
			count = count.getNext();
		}

		//main dispaly loop-
		for (int j=k; j>0; j--)
		{
			MovieNode temp = head;
			//runs to grab the last node
			for (int i=1;i<j;i++)
				temp=temp.getNext();

			//display current node data
			Movie data = temp.getData();
			String MovieName=data.getName();
			String MovieGenre=data.getGenre();
			String[] MovieCast=data.getCast();
			int MovieRating=data.getRating();
			System.out.println();
			System.out.println(MovieName+"\n"+MovieGenre);
			System.out.println(MovieCast[0]+"\n"+MovieCast[1]+"\n"+MovieCast[2]);
			System.out.println(MovieRating+"\n");
			temp = temp.getNext();
		}


	}
}
