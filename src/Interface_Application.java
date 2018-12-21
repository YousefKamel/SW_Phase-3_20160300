import java.io.*;
import java.util.*;
import java.util.Scanner;
/***********************************************************************************************/
public class Interface_Application 
{
	public void View_Options()
	{}
	////////////////////////////////////////
	class Item
	{
		private String ID;
		private String Place;
		private String Type;
	    private String FinderName;
		private String Special_Description;
		///////////////////////////////////
		public Item(String s1, String s2, String s3, String s4, String s5) 
		{
			ID = new String(s1);
			Place = new String(s2);
			Type = new String(s3);
			FinderName = new String(s4);
			Special_Description = new String(s5);
		}
		///////////////////////////////////
		public String Get_ID()
		{
			return ID;
		}
		///////////////////////////////////
		public String Get_Place()
		{
			return Place;
		}
		///////////////////////////////////
		public String Get_Finder() 
		{
			return FinderName;
		}
		///////////////////////////////////
		public String Get_Type() 
		{
			return Type;
		}
		///////////////////////////////////
		public String Get_Description()
		{
			return Special_Description;
		}
	}
	/*****************************************************************************************/
	class User
	{
		private String Name;
		private String Password;
		private String Phone;
	    private ArrayList<Message> MsgQueue = new ArrayList<>();
	    ///////////////////////////////////
	    User()
	    {
	    }
	    public User(String s1, String s2, String s3)
	    {
	    	Name = new String(s1);
			Password = new String(s2);
			Phone = new String(s3);
	    }
		///////////////////////////////////
		public String Get_Name() 
		{
			return Name;
		}
		///////////////////////////////////
		public String Get_Password()
		{
			return Password;
		}
		///////////////////////////////////
		public String Get_Phone() 
		{
			return Phone;
		}
		///////////////////////////////////
		public void View_Messages()
		{
			for(int i=0; i< MsgQueue.size(); i++)
			{
				MsgQueue.get(i).View_Msg();
			}
		}
		//////////////////////////////////
		public void Add_Msg()
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Subject: ");
			String sub = input.nextLine();
			System.out.println("Enter Date: ");
			String dt = input.nextLine();
			System.out.println("Enter Content: ");
			String con = input.nextLine();
			Message m = new Message(sub, dt, con);
			MsgQueue.add(m);
		}
	}
	/*****************************************************************************************/
	class Message
	{
		public String Subject;
		public String MsgDate;
		public String Content;
		///////////////////////////////
		public Message(String s1, String s2, String s3)
		{
			Subject = new String(s1);
			MsgDate = new String(s2);
			Content = new String(s3);
		}
		/////////////////////////////////
		public void View_Msg()
		{
			System.out.println("Date: ");
			System.out.print(MsgDate);
			System.out.println("Subject: ");
			System.out.print(Subject);
			System.out.println("Content: ");
			System.out.print(Content);
		}
	}
    /**************************************************************************************/
	class ListOfItems
	{
		//public ArrayList<Item> AvailableItems = new ArrayList<>();
		///////////////////////////////
		public ListOfItems()
		{
		}
		//////////////////////////////
		public void AddItem()
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter ID: ");
			String s1 = input.nextLine();
			System.out.println("Enter Place: ");
			String s2 = input.nextLine();
			System.out.println("Enter Type: ");
			String s3 = input.nextLine();
			System.out.println("Enter Finder Name: ");
			String s4 = input.nextLine();
			System.out.println("Enter Special Description: ");
			String s5 = input.nextLine();
			Item m = new Item(s1, s2, s3, s4, s5);
			AvailableItems.add(m);
		}
		///////////////////////////////
		public void ViewItems()
		{
			for(int i=0; i< AvailableItems.size(); i++)
			{
				System.out.print("Item No. ");
				System.out.println(i+1);
				System.out.print("ID: ");
				System.out.println(AvailableItems.get(i).Get_ID());
				System.out.print("Type: ");
				System.out.println(AvailableItems.get(i).Get_Type());
				System.out.print("Finder Name: ");
				System.out.println(AvailableItems.get(i).Get_Finder());
				System.out.println("---------------");
			}
		}
		///////////////////////////////
		public void RemoveItem(int ItemNo)
		{
			AvailableItems.remove(ItemNo-1);
		}
		////////////////////////////////
		public ArrayList<Item> Get_List()
		{
			return AvailableItems;
		}
	}
	/**************************************************************************************/
	class Users
	{
		//public ArrayList<User> App_Users = new ArrayList<>();
		////////////////////////////////
		public Users()
		{
		}
		///////////////////////////////
		public void AddUser()
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Name: ");
			String s1 = input.nextLine();
			System.out.println("Enter Password: ");
			String s2 = input.nextLine();
			System.out.println("Enter Phone: ");
			String s3 = input.nextLine();
			User m = new User(s1, s2, s3);
			App_Users.add(m);
			System.out.println("Your Account has been created successfully. ");
		}
		//////////////////////////////
		public void RemoveUser(String UserName)
		{
			for(int i=0; i< App_Users.size(); i++)
			{
				if( (App_Users.get(i).Get_Name()).equals(UserName) )
				{
					App_Users.remove(i);
				}
			}
		}
		///////////////////////////////
		/*public ArrayList<User> Get_List()
		{
			return App_Users;
		}*/
	}
	/**************************************************************************************/
	class Registration
	{
		//public Users ListOfUsers;
		//public Users List2;
		/////////////////////////////
		public void Create_Account()
		{
			/*List2 = new Users();
			ArrayList<User> App_Users = List2.Get_List();*/
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Name: ");
			String s1 = input.nextLine();
			System.out.println("Enter Password: ");
			String s2 = input.nextLine();
			System.out.println("Enter Phone: ");
			String s3 = input.nextLine();
			User m = new User(s1, s2, s3);
			App_Users.add(m);
			System.out.println("Your Account has been created successfully. ");
		}
		///////////////////////////
		public void Login()
		{
			/*List2 = new Users();
			ArrayList<User> App_Users = List2.Get_List();*/
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter User Name: ");
			String s1 = input.nextLine();
			System.out.println("Enter Password: ");
			String s2 = input.nextLine();
			System.out.println(App_Users.size());
			for(int i=0; i< App_Users.size(); i++)
			{
				if((App_Users.get(i).Get_Name()).equals(s1) && (App_Users.get(i).Get_Password()).equals(s2))
				{
					System.out.println("Successfully logged in. ");
					Logged_in_User_No = i;
				}
				else
				{
					System.out.println("Wrong User Name or Password! Please Try Again. ");
					break;
				}
			}
		}
		/////////////////////////////
		public void Logout()
		{
			Logged_in_User_No = -1;
			System.out.println("You have been logged out successfully. ");
		}
	}
	/**************************************************************************************/
		public static void main(String[] args) 
		{
			Interface_Application App = new Interface_Application();
			App.View_Options();
		}
}
/**************************************************************************************/
	class Report
	{
		public Item FoundItem;
		public String ReporterName;
		public ListOfItems List;
		//public Users List2;
		////////////////////////////
		public void Fill_Reporter_Form()
		{
			List = new ListOfItems();
			ArrayList<Item> AvailableItems = List.Get_List();
			
			/*List2 = new Users();
			ArrayList<User> App_Users = List2.Get_List();*/
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter ID: ");
			String s1 = input.nextLine();
			System.out.println("Enter Place: ");
			String s2 = input.nextLine();
			System.out.println("Enter Type: ");
			String s3 = input.nextLine();
			System.out.println("Enter Special Description: ");
			String s5 = input.nextLine();
			
			ReporterName = new String ( App_Users.get(Logged_in_User_No).Get_Name() );
			
			FoundItem = new Item(s1, s2, s3, ReporterName, s5);
			AvailableItems.add(FoundItem);
			System.out.println("Your Item was reported successfully.");
		}
	}
	/**************************************************************************************/
	class Request
	{
		public Item LostItem;
		public String OwnerName;
		public Request_Handler List;
		//public Users List2;
		/////////////////////////////
		public Request()
		{
			
		}
		/////////////////////////////
		public Request(Item m, String s)
		{
			LostItem = new Item(m.Get_ID(), m.Get_Place(), m.Get_Type(), m.Get_Finder(), m.Get_Description());
			OwnerName = new String(s);
		}
		////////////////////////////
		public void Fill_Owner_Form()
		{
			List = new Request_Handler();
			ArrayList<Request> ListOfRequests = List.Get_List();
			
			/*List2 = new Users();
			ArrayList<User> App_Users = List2.Get_List();*/
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Item ID: ");
			String s1 = input.nextLine();
			System.out.println("Enter Place: ");
			String s2 = input.nextLine();
			System.out.println("Enter Special Description: ");
			String s5 = input.nextLine();
			
			OwnerName = new String ( App_Users.get(Logged_in_User_No).Get_Name() );
			LostItem = new Item(s1, s2, "", OwnerName, s5);
			Request r = new Request(LostItem, OwnerName);
			ListOfRequests.add(r);
			
			System.out.println("Your Request was sent successfully.");
		}
	}
	/**************************************************************************************/
	class Request_Handler
	{
		public ArrayList<Request> ListOfRequests = new ArrayList<>();
		///////////////////////////////////
		public Request_Handler()
		{
		}
		//////////////////////////////////
		public void View_Requests()
		{
			for(int i=0; i< ListOfRequests.size(); i++)
			{
				System.out.println("Request No. ");
				System.out.print(i+1);
				System.out.println("Place: ");
				System.out.print(ListOfRequests.get(i).LostItem.Get_Place());
				System.out.println("Finder Name: ");
				System.out.print(ListOfRequests.get(i).LostItem.Get_Finder());
				System.out.println("Special Description: ");
				System.out.print(ListOfRequests.get(i).LostItem.Get_Description());
				System.out.println("---------------");
			}
		}
		///////////////////////////////
		public ArrayList<Request> Get_List()
		{
			return ListOfRequests;
		}
	}
	/**************************************************************************************/
	class User_Services
	{
		public void Show_Available_Services()
		{
			System.out.println(" 1) View Available Items. ");
			System.out.println(" 2) Report a new Item. ");
			System.out.println(" 3) Request an Item. ");
			System.out.println(" 4) Logout. ");
			System.out.println(" Enter Your Choice: ");
		}
	}