//Zibin Mei
//1085722


//this class sets up the movie infos
public class Movie
{
	//4 attribute of movie
	private String name;
	private String [] cast = new String[3];
	private String genre;
	private int rating;


	//default constructor
	public Movie(String n,String[] c,String g,int r)
	{
		this.name = n;
		this.cast = c;
		this.genre = g;
		this.rating = r;
	}

	//use to set the attributes
	public void setname(String n)
	{
		this.name = n;
	}

	public void setcast(String[] c)
	{
		this.cast = c;
	}

	public void setgenre(String a)
	{
		this.genre=a;
	}


	public void setrating(int k)
	{
		this.rating = k;
	}


	//use to grab the moive info
	public String getName()
	{
		return name;
	}

	public String[] getCast()
	{
		return cast;
	}

	public String getGenre()
	{
		return genre;
	}

	public int getRating()
	{
		return rating;
	}
















}
