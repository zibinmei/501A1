//Zibin Mei
//1085722
/


//create Movie nodes class - this is same as the class example.


public class MovieNode
{
	private Movie data;
	private MovieNode next;

	//default constructor - set next node to null
	public MovieNode(Movie someData)
	{
		data = someData;
		next = null;
	}
	//default constructor - set next node to some data
	public MovieNode(Movie someData, MovieNode next)
	{
		data = someData;
		this.next = next;
	}

	//use to grab data off the node
	public Movie getData()
	{
		return(data);
	}
	//use to grab the nextnode
	public MovieNode getNext()
	{
		return(next);
	}

	//set data of current node
	public void setData(Movie i)
	{
		data = i;
	}
	//set address for next node
	public void setNext(MovieNode n)
	{
		this.next = n;
	}



}
