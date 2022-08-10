package virtual.lock.java;
import java.io.*;
import java.util.*;

public class Lock {
	
	public static void main(String[] args) {
	    System.out.println("---------------------------------------");
		System.out.println("Application : Locked.com");
		System.out.println("---------------------------------------");
		System.out.println("Developer Details");
		System.out.println("---------------------------------------");
		System.out.println("Name        : Tarun Rajanala");
		System.out.println("Email       : tarunsairajanala@gmail.com");
		System.out.println("Designation : Software Developer");
		System.out.println("---------------------------------------");
		System.out.println("\n\nUser File Operations");
		System.out.println("---------------------------------------");
		System.out.println("1) Display the files");
		System.out.println("2) File operations");
		System.out.println("3) Close the Application");
		System.out.println("---------------------------------------");
		System.out.print("\nPlease choose an option from above : ");
				
		short ch = 0,innch = 0;
		
		lp : while(true)
		{
			Scanner sc = new Scanner(System.in);
			ch = sc.nextShort();
			switch(ch)
			{
			
			case 1: 
				File file = new File("C:\\Users\\asus\\Desktop\\locker");
				String[] files = file.list();
				System.out.println("\n---------------------------------------");
			    System.out.println("Displaying the files and directories from a directory");
			    for(int i = 0; i<files.length;i++)
				{
					System.out.println(files[i]);
				}
				System.out.println("---------------------------------------");
				System.out.print("Please choose another option to continue : ");
				break;
			case 2: 
				System.out.println("\n---------------------------------------");
				System.out.println("1) Add a file to directory");
				System.out.println("2) Delete a file from directory");
				System.out.println("3) Search a file from directory");
				System.out.println("4) Back to Main Menu");
				System.out.println("---------------------------------------");
				System.out.print("\nPlease choose an option from above : ");
				ip : while(true)
				{
				  Scanner input = new Scanner(System.in);
				  innch = input.nextShort();
				  switch(innch)
				  {
				   case 1 : 
					     System.out.println("\n---------------------------------------");
						 System.out.println("Adding contents into file and saving into directory");
						 try
						 {
							Scanner af = new Scanner(System.in);
							System.out.print("Please enter the filename to be created : ");
							String name = af.nextLine();
							File fexist = new File("C:\\Users\\asus\\Desktop\\locker"+name);
							if(fexist.exists())
							{
								System.out.println("File already exists");
							}
							else
							{
							 FileWriter fwrite = new FileWriter("C:\\Users\\asus\\Desktop\\locker"+name);
							 System.out.print("Please enter the file content : ");
							 String content = af.nextLine() + "\n";
							 fwrite.write(content);
							 fwrite.close();
							 System.out.println("File created with a name : "+ name);
							}
									 
						}
						catch (Exception e)
						{
						  e.printStackTrace();
						}							 
						System.out.println("---------------------------------------");
						System.out.print("Please choose another option to continue : ");
						break;
					case 2 : 
						System.out.println("\n---------------------------------------");
						System.out.println("Deleting a file from directory");
						Scanner af = new Scanner(System.in);
						System.out.print("Please enter the filename to be deleted : ");
						String deletename = af.nextLine();
						File fd = new File("C:\\Users\\asus\\Desktop\\locker"+deletename);
						if(fd.exists())
						{
						  if(fd.delete())
						   {
							System.out.println("File deleted successfully");
						   }
						    else
						   {
							System.out.println("Failed to delete the file");
						   }
						 }
						else
						{
						 System.out.println("File does not exist in directory");
						}
						 System.out.println("---------------------------------------");
						 System.out.print("Please choose another option to continue : ");
						 break;
					case 3 : 
						 System.out.println("\n---------------------------------------");
						 System.out.println("Searching a file in the directory");
						try
							{
							 File filesearch = new File("C:\\Users\\asus\\Desktop\\locker");
							 String[] search = filesearch.list();
							 System.out.print("Please enter filename to search : ");
							 Scanner fs = new Scanner(System.in);
							 String files1 = fs.nextLine();
							 int flag = 0;
							 if(search == null)
							 System.out.println("Empty directory");
							else
							{
							for(int i =0;i<search.length;i++)
							{
								String filename = search[i];
								if(filename.equals(files1))
								{
								 System.out.println("File found : " +filename);
								 flag = 1;
								}
							}
						    }
							if (flag == 0)
							System.out.println("File not found : "+files1);
							}
						
						  catch(NullPointerException ne)
						  {
							System.out.println("Please specify the correct folder name");
						  }	
						    System.out.println("---------------------------------------");
						    System.out.print("Please choose another option to continue : ");
							break;
					case 4 : 
						System.out.println("\n---------------------------------------");
						System.out.println("In Main Menu");
					    System.out.println("---------------------------------------");
						break ip;
						default : System.out.print("Please select a number from above list : ");
						}
						
					}
					System.out.print("Please choose another option to continue : ");
					break;
			case 3: System.out.println("\n---------------------------------------");
					System.out.println("Program Closed by User");
					System.out.println("---------------------------------------");
					break lp;
			default : System.out.print("Please select a number from above list : ");
			}

		}
		
	}

	}


