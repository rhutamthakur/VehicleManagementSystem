import java.util.*;
class Factory
{
	protected String name,eid,cc,add;
	protected int np;
	protected float pn,bud;
	Scanner sc= new Scanner(System.in);
	public void ownerDetails()
	{
		System.out.println("Enter Car Owner details:");
		System.out.print("Name: ");
		name=sc.nextLine();
		System.out.print("Email ID: ");
		eid=sc.nextLine();
		System.out.print("Address: ");
		add=sc.nextLine();
		System.out.print("Contact: ");
		pn=sc.nextFloat();
		System.out.print("Car Company: ");
		sc.nextLine();
		cc=sc.nextLine();
		System.out.print("Number Plate(Last 4 digits only): ");
		np=sc.nextInt();
		System.out.print("Budget: ");
		bud=sc.nextFloat();
	}
	public boolean search(int x)
	{
		if(np==x) return true;
		else return false;
	}
	public void dispOwnerData()
	{	
		System.out.println("DETAILS:");
		System.out.println("Owner's Name : "+name);
		System.out.println("Email ID     : "+eid);
		System.out.println("Contact      : "+pn);
		System.out.println("Address      : "+add);
		System.out.println("Car Company  : "+cc);
		System.out.println("Number Plate : "+np);
		System.out.println();
		System.out.println("******************\n\n");
	}
}
class Hatchback extends Factory
{
	private String cname,wind,color,rims;
	private float ms,mil,hp,pw,pms,pmil,php,baseprice=250000,totprice;
	private char ans;
	Scanner sc= new Scanner(System.in);
	public void hatchbackDetails()
	{
		System.out.println("Enter Car Details:");
		System.out.print("Name Of Your Car: ");
		cname=sc.nextLine();
		System.out.print("Do you want your windows to be tinted?(Y/N): ");
		ans=sc.next().charAt(0);
		if(ans=='y'||ans=='Y')
		wind="Tinted";
		else
		wind="Plain";
		System.out.print("Color Of Your Car: ");
		sc.nextLine();
		color=sc.nextLine();
		System.out.print("Company Of Rims: ");
		rims=sc.nextLine();
		System.out.print("Maximum Speed Of Your Car: ");
		ms=sc.nextFloat();
		System.out.print("Mileage Of Car: ");
		mil=sc.nextFloat();
		System.out.print("Horsepower Of Your Car: ");
		hp=sc.nextFloat();
	}
	public void changeCarColor()
	{
		System.out.println("Enter the Color:");
		color=sc.nextLine();
	}
	public void changeCarName()
	{
		System.out.println("Enter the name of the car:");
		cname=sc.nextLine();
	}
	public void changeCarRim()
	{
		System.out.println("Enter the Company's name:");
		rims=sc.nextLine();
	}
	public void changeMaxSpeed()
	{
		System.out.println("Enter the max speed of the car:");
		ms=sc.nextFloat();
	}
	public void changeCarMileage()
	{
		System.out.println("Enter the mileage of the car:");
		mil=sc.nextFloat();
	}
	public void changeCarHP()
	{
		System.out.println("Enter the Horsepower of the car:");
		hp=sc.nextFloat();
	}
	public void carTotalCost()
	{
		if(wind=="Tinted")
		pw=25000;
		else
		pw=10000;
		if(ms>200)
		pms=100000;
		else if(ms>150)
		pms=75000;
		else
		pms=50000;
		if(mil>20)
		pmil=150000;
		else if(mil>15)
		pmil=125000;
		else
		pmil=100000;
		if(hp>600)
		php=1000000;
		else if(hp>400)
		php=500000;
		else
		php=300000;
		totprice=(pw+pms+pmil+php+baseprice);
	}
	public void dispHatchbackData()
	{
		
		System.out.println("Car's Name                : "+cname);
		System.out.println("Color                     : "+color);
		System.out.println("Windows                   : "+wind);
		System.out.println("Rim Company               : "+rims);
		System.out.println("Mileage                   : "+mil);
		System.out.println("Maximum Speed             : "+ms);
		System.out.println("Horsepower                : "+hp);
		System.out.println("Total Cost Of Construction: "+totprice);
		System.out.println("Budget                    : "+bud);
		if(totprice>bud)
		System.out.println("The car you have designed is out of your budget!\n Try changing the max speed, mileage and horsepower of your car OR increase your budget!");
		else
		System.out.println("Your car is in your budget! Perhaps you can improve some features using the remaining money!\nAvailable Funds: "+(bud-totprice));
		System.out.println("\n\n");
	}
}
class Sedan extends Factory
{
	private String cname,wind,color,rims;
	private float ms,mil,hp,pw,pms,pmil,php,baseprice=500000,totprice;
	private char ans;
	Scanner sc= new Scanner(System.in);
	public void sedanDetails()
	{
		System.out.println("Enter Car Details:");
		System.out.print("Name Of Your Car: ");
		cname=sc.nextLine();
		System.out.print("Do you want your windows to be tinted?(Y/N): ");
		ans=sc.next().charAt(0);
		if(ans=='y'||ans=='Y')
		wind="Tinted";
		else
		wind="Plain";
		System.out.print("Color Of Your Car: ");
		sc.nextLine();
		color=sc.nextLine();
		System.out.print("Company Of Rims: ");
		rims=sc.nextLine();
		System.out.print("Maximum Speed Of Your Car: ");
		ms=sc.nextFloat();
		System.out.print("Mileage Of Car: ");
		mil=sc.nextFloat();
		System.out.print("Horsepower Of Your Car: ");
		hp=sc.nextFloat();
	}
	public void changeCarColor()
	{
		System.out.println("Enter the Color:");
		color=sc.nextLine();
	}
	public void changeCarName()
	{
		System.out.println("Enter the name of the car:");
		cname=sc.nextLine();
	}
	public void changeCarRim()
	{
		System.out.println("Enter the Company's name:");
		rims=sc.nextLine();
	}
	public void changeMaxSpeed()
	{
		System.out.println("Enter the max speed of the car:");
		ms=sc.nextFloat();
	}
	public void changeCarMileage()
	{
		System.out.println("Enter the mileage of the car:");
		mil=sc.nextFloat();
	}
	public void changeCarHP()
	{
		System.out.println("Enter the Horsepower of the car:");
		hp=sc.nextFloat();
	}
	public void carTotalCost()
	{
		if(wind=="Tinted")
		pw=25000;
		else
		pw=10000;
		if(ms>200)
		pms=100000;
		else if(ms>150)
		pms=75000;
		else
		pms=50000;
		if(mil>20)
		pmil=150000;
		else if(mil>15)
		pmil=125000;
		else
		pmil=100000;
		if(hp>600)
		php=1000000;
		else if(hp>400)
		php=500000;
		else
		php=300000;
		totprice=(pw+pms+pmil+php+baseprice);
	}
	public void dispSedanData()
	{
		
		System.out.println("Car's Name                : "+cname);
		System.out.println("Color                     : "+color);
		System.out.println("Windows                   : "+wind);
		System.out.println("Rim Company               : "+rims);
		System.out.println("Mileage                   : "+mil);
		System.out.println("Maximum Speed             : "+ms);
		System.out.println("Horsepower                : "+hp);
		System.out.println("Total Cost Of Construction: "+totprice);
		System.out.println("\n\n");
	}
}
class SUV extends Factory
{
	private String cname,wind,color,rims;
	private float ms,mil,hp,pw,pms,pmil,php,baseprice=100000,totprice;
	private char ans;
	Scanner sc= new Scanner(System.in);
	public void SUVDetails()
	{
		System.out.println("Enter Car Details:");
		System.out.print("Name Of Your Car: ");
		cname=sc.nextLine();
		System.out.print("Do you want your windows to be tinted?(Y/N): ");
		ans=sc.next().charAt(0);
		if(ans=='y'||ans=='Y')
		wind="Tinted";
		else
		wind="Plain";
		System.out.print("Color Of Your Car: ");
		sc.nextLine();
		color=sc.nextLine();
		System.out.print("Company Of Rims: ");
		rims=sc.nextLine();
		System.out.print("Maximum Speed Of Your Car: ");
		ms=sc.nextFloat();
		System.out.print("Mileage Of Car: ");
		mil=sc.nextFloat();
		System.out.print("Horsepower Of Your Car: ");
		hp=sc.nextFloat();
	}
	public void changeCarColor()
	{
		System.out.println("Enter the Color:");
		color=sc.nextLine();
	}
	public void changeCarName()
	{
		System.out.println("Enter the name of the car:");
		cname=sc.nextLine();
	}
	public void changeCarRim()
	{
		System.out.println("Enter the Company's name:");
		rims=sc.nextLine();
	}
	public void changeMaxSpeed()
	{
		System.out.println("Enter the max speed of the car:");
		ms=sc.nextFloat();
	}
	public void changeCarMileage()
	{
		System.out.println("Enter the mileage of the car:");
		mil=sc.nextFloat();
	}
	public void changeCarHP()
	{
		System.out.println("Enter the Horsepower of the car:");
		hp=sc.nextFloat();
	}
	public void carTotalCost()
	{
		if(wind=="Tinted")
		pw=25000;
		else
		pw=10000;
		if(ms>200)
		pms=100000;
		else if(ms>150)
		pms=75000;
		else
		pms=50000;
		if(mil>20)
		pmil=150000;
		else if(mil>15)
		pmil=125000;
		else
		pmil=100000;
		if(hp>600)
		php=1000000;
		else if(hp>400)
		php=500000;
		else
		php=300000;
		totprice=(pw+pms+pmil+php+baseprice);
	}
	public void dispSUVData()
	{
		
		System.out.println("Car's Name                : "+cname);
		System.out.println("Color                     : "+color);
		System.out.println("Windows                   : "+wind);
		System.out.println("Rim Company               : "+rims);
		System.out.println("Mileage                   : "+mil);
		System.out.println("Maximum Speed             : "+ms);
		System.out.println("Horsepower                : "+hp);
		System.out.println("Total Cost Of Construction: "+totprice);
		System.out.println("\n\n");
	}
}
public class carfactory
{
	public static void main(String arg[])
	{
		Hatchback h[]= new Hatchback[100];
		SUV suv[]= new SUV[100];
		Sedan sed[]= new Sedan[100];
		Scanner sc= new Scanner(System.in);
		int ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,nh=0,ns=0,nsuv=0,i1=0,i2=0,i3=0,j,k,flag=0,rn;
		char ans1;
		do
		{
		System.out.println("THAKUR CAR MANUFACTURING COMPANY");
		System.out.println("MAIN MENU");
		System.out.println("1. Create New Car\n2. Access Created Car Data\n3. Delete Car Data\n4. Edit Car Data\n5. Display Entire Database\n6. Exit Program\n");
		System.out.print("Enter your choice:");
		ch1=sc.nextInt();
		switch(ch1)
		{
			case 1: System.out.println("CAR CREATION MENU");
				System.out.println("1. Create A Hatchback Vehicle\n2. Create A Sedan Vehicle\n3. Create A SUV Vehicle\n4. Exit Program\n");
				System.out.print("Enter your choice=");
				ch2=sc.nextInt();
				switch(ch2)
				{
					case 1: nh++;
						h[i1]= new Hatchback();
						h[i1].ownerDetails();
						h[i1].hatchbackDetails();
						i1++;
						break;
					case 2: ns++;
						sed[i2]= new Sedan();
						sed[i2].ownerDetails();
						sed[i2].sedanDetails();
						i2++;
						break;
					case 3: nsuv++;
						suv[i3]= new SUV();
						suv[i3].ownerDetails();
						suv[i3].SUVDetails();
						i3++;
						break;
					case 4: System.out.println("Thank You! Have A Good Day!");
						break;
					default:System.out.println("Invalid Option! Try Again!");
						break;
				}
				break;
			case 2: System.out.println("CAR ACCESSS MENU");
				System.out.println("1. Access A Hatchback Vehicle\n2. Access A Sedan Vehicle\n3. Access A SUV Vehicle\n4. Exit Program\n");
				System.out.print("Enter your choice=");
				ch3=sc.nextInt();
				switch(ch3)
				{
					case 1: System.out.print("Enter registeration number of Hatchback=");
						rn=sc.nextInt();
						for(j=0;j<=nh-1;j++)
        					{
       							if (h[j].search(rn))
       							{
       								flag=1;
       								h[j].dispOwnerData();
								h[j].carTotalCost();
								h[j].dispHatchbackData();
       							}
       						}
       						if(flag==1)
       						{
        						System.out.println("Car Data Displayed!");
        						flag=0;
        					}
        					else
        					System.out.println("Car Data Does Not Exist. Try Again Using Valid Registeration Number.");
						break;
					case 2: System.out.print("Enter registeration number of Sedan=");
						rn=sc.nextInt();
						for(j=0;j<=ns-1;j++)
        					{
       							if (sed[j].search(rn))
       							{
       								flag=1;
       								sed[j].dispOwnerData();
								sed[j].carTotalCost();
								sed[j].dispSedanData();
       							}
       						}
       						if(flag==1)
       						{
        						System.out.println("Car Data Displayed!");
        						flag=0;
        					}
        					else
        					System.out.println("Car Data Does Not Exist. Try Again Using Valid Registeration Number.");
						break;
					case 3: System.out.print("Enter registeration number of SUV=");
						rn=sc.nextInt();
						for(j=0;j<=nsuv-1;j++)
        					{
       							if (suv[j].search(rn))
       							{
       								flag=1;
       								suv[j].dispOwnerData();
								suv[j].carTotalCost();
								suv[j].dispSUVData();
       							}
       						}
       						if(flag==1)
       						{
        						System.out.println("Car Data Displayed!");
        						flag=0;
        					}
        					else
        					System.out.println("Car Data Does Not Exist. Try Again Using Valid Registeration Number.");
						break;
					case 4: System.out.println("Thank You! Have A Good Day!");
						break;
					default:System.out.println("Invalid Option! Try Again!");
						break;
				}
				break;
			case 3: System.out.println("CAR DELETION MENU\n\n");
				System.out.println("1. Delete A Hatchback Vehicle\n2. Delete A Sedan Vehicle\n3. Delete A SUV Vehicle\n4. Exit Program\n\n");
				System.out.print("Enter your choice=");
				ch4=sc.nextInt();
				switch(ch4)
				{
					case 1: System.out.print("Enter registeration number of Hatchback=");
						rn=sc.nextInt();
						for(j=0;j<=nh-1;j++)
        					{
        						if (h[j].search(rn))
       							{
        							flag=1;
       								for(k=j;k<=nh-2;k++)
        							{
        								h[k]=h[k+1];
        							}
        							nh--;
        							i1--;
       							 }
        					}
       						if(flag==1)
        					{
       							System.out.println("Car Data deleted!");
        						flag=0;
        					}
        					else
        					System.out.println("Car Data Does Not Exist.\n");
						break;
					case 2: System.out.print("Enter registeration number of Sedan=");
						rn=sc.nextInt();;
						for(j=0;j<=ns-1;j++)
        					{
        						if (sed[j].search(rn))
       							{
        							flag=1;
       								for(k=j;k<=ns-2;k++)
        							{
        								sed[k]=sed[k+1];
        							}
        							ns--;
        							i2--;
       							 }
        					}
       						if(flag==1)
        					{
       							System.out.println("Car Data deleted!");
        						flag=0;
        					}
        					else
        					System.out.println("Car Data Does Not Exist.\n");
						break;
					case 3: System.out.print("Enter registeration number of Sedan=");
						rn=sc.nextInt();
						for(j=0;j<=nsuv-1;j++)
        					{
        						if (suv[j].search(rn))
       							{
        							flag=1;
       								for(k=j;k<=nsuv-2;k++)
        							{
        								suv[k]=suv[k+1];
        							}
        							nsuv--;
        							i3--;
       							 }
        					}
       						if(flag==1)
        					{
       							System.out.println("Car Data deleted!");
        						flag=0;
        					}
        					else
        					System.out.println("Car Data Does Not Exist.");
						break;
					case 4: System.out.println("Thank You! Have A Good Day!");
						break;
					default:System.out.println("Invalid Option! Try Again!");
						break;
				}
				break;
			case 4: System.out.println("CAR EDITING MENU\n\n");
				System.out.println("1. Edit A Hatchback Vehicle\n2. Edit A Sedan Vehicle\n3. Edit A SUV Vehicle\n4. Exit Program\n\n");
				System.out.print("Enter your choice=");
				ch5=sc.nextInt();
				switch(ch5)
				{
					case 1: if(nh==0)
						{
							System.out.println("No data Exists!");
						}
						else
						{
							System.out.print("Enter registeration number of Hatchback=");
							rn=sc.nextInt();
							for(j=0;j<=nh-1;j++)
        						{
        							if(h[j].search(rn))
        							{
        								flag=1;
        								do{
        									System.out.println("*****EDITING MENU*****:");
       	 									System.out.print("\n1. Rename Car\n2. Rename Rim Company\n3. Change Color\n4. Revise Max Speed\n5. Revise Mileage\n6. Revise Horspepower\n7. Exit program\n");
        									ch6=sc.nextInt();
        									if(ch6==1)
        									{
        										flag=1;
        										h[j].changeCarName();
             									}
       										else if(ch6==2)
        									{
        										flag=1;
        										h[j].changeCarRim();
        									}
        									else if(ch6==3)
        									{
        										flag=1;
        										h[j].changeCarColor();
        									}
       										else if(ch6==4)
      										{
       											flag=1;
      											h[j].changeMaxSpeed();
        									}	
       										else if(ch6==5)
       										{ 
											flag=1;
											h[j].changeCarMileage();
										}
										else if(ch6==6)
										{
											flag=1;
											h[j].changeCarHP();
										}
       										else if(ch6==7)
        									{
        										System.out.println("Invalid option. Please Try Again!");
        									}
        								}while(ch6!=7);
        							}
        							else 
        							System.out.println("car Data Does Not Exist. Try Again Using Registeration Number.");
        							flag=0;
        						}
						}
						break;
					case 2: if(ns==0)
						{
							System.out.println("No data Exists!");
						}
						else
						{
							System.out.print("Enter registeration number of Hatchback=");
							rn=sc.nextInt();	
							System.out.println();
							for(j=0;j<=ns-1;j++)
        						{
        							if(sed[j].search(rn))
        							{
        								flag=1;
        								do{
        									System.out.println("*****EDITING MENU*****:");
       	 									System.out.print("\n1. Rename Car\n2. Rename Rim Company\n3. Change Color\n4. Revise Max Speed\n5. Revise Mileage\n6. Revise Horspepower\n7. Exit program\n");
        									ch7=sc.nextInt();
										System.out.println();
        									if(ch7==1)
        									{
        										flag=1;
        										sed[j].changeCarName();
             									}
       										else if(ch7==2)
        									{
        										flag=1;
        										sed[j].changeCarRim();
        									}
        									else if(ch7==3)
        									{
        										flag=1;
        										sed[j].changeCarColor();
        									}
       										else if(ch7==4)
      										{
       											flag=1;
      											sed[j].changeMaxSpeed();
        									}	
       										else if(ch7==5)
       										{ 
											flag=1;
											sed[j].changeCarMileage();
										}
										else if(ch7==6)
										{
											flag=1;
											sed[j].changeCarHP();
										}
       										else if(ch7==7)
        									{
        										System.out.println("Invalid option. Please Try Again!");
        									}
        								}while(ch7!=7);
        							}
        							else 
        							System.out.println("car Data Does Not Exist. Try Again Using Registeration Number.");
        							flag=0;
        						}
						}
						break;
					case 3: if(nsuv==0)
						{
							System.out.println("No data Exists!");
						}
						else
						{
							System.out.print("Enter registeration number of Hatchback=");
							rn=sc.nextInt();
							System.out.println();
							for(j=0;j<=nsuv-1;j++)
        						{
        							if(h[j].search(rn))
        							{
        								flag=1;
        								do{
        									System.out.println("*****EDITING MENU*****:");
										System.out.println();
       	 									System.out.print("\n--->1. Rename Car\n--->2. Rename Rim Company\n--->3. Change Color\n--->4. Revise Max Speed\n--->5. Revise Mileage\n--->6. Revise Horspepower\n--->7. Exit program\n");
        									ch8=sc.nextInt();
										System.out.println();
        									if(ch8==1)
        									{
        										flag=1;
        										suv[j].changeCarName();
             									}
       										else if(ch8==2)
        									{
        										flag=1;
        										suv[j].changeCarRim();
        									}
        									else if(ch8==3)
        									{
        										flag=1;
        										suv[j].changeCarColor();
               									}
       										else if(ch8==4)
      										{
       											flag=1;
      											suv[j].changeMaxSpeed();
        									}	
       										else if(ch8==5)
       										{ 
											flag=1;
											suv[j].changeCarMileage();
										}
										else if(ch8==6)
										{
											flag=1;
											suv[j].changeCarHP();
										}
       										else if(ch8==7)
        									{
        										System.out.println("Invalid option. Please Try Again!");
        									}
        								}while(ch8!=7);
        							}
        							else 
        							System.out.println("Car Data Does Not Exist. Try Again Using Registeration Number.");
        							flag=0;
        						}
						}
						break;
					case 4: System.out.println("Thank You! Have A Good Day!");
						break;
					default:System.out.println("Invalid Option! Try Again!");
						break;
				}
				break;
			case 5: if(nh==0)
				{
					System.out.println("No data Exists!");
				}
				else
				{
					System.out.println("Complete Hatchback Details:");
					System.out.println();
					for(j=0;j<=nh-1;j++)
        				{
       						h[j].dispOwnerData();
						h[j].carTotalCost();
						h[j].dispHatchbackData();		
       					}
					System.out.println("\n");
				}
				if(ns==0)
				{
					
					System.out.println("No data Exists!");
				}
				else
				{
					System.out.println("Complete Sedan Details:");	
					System.out.println();
					for(j=0;j<=ns-1;j++)
        				{
       						sed[j].dispOwnerData();
						sed[j].carTotalCost();
						sed[j].dispSedanData();		
       					}
					System.out.println("\n");
				}
				if(nsuv==0)
				{
					
					System.out.println("No data Exists!");
				}
				else
				{
					System.out.println("Complete SUV Details:");
					System.out.println();
					for(j=0;j<=nsuv-1;j++)
        				{
       						suv[j].dispOwnerData();
						suv[j].carTotalCost();
						suv[j].dispSUVData();		
       					}
				}
				break;
			case 6: System.out.println("Thank You For Using The System! Have A Great Day!");
				break;
			default:System.out.println("Invalid Option! Please Try Again!");
				break;

		}
		System.out.println("Do you wish to perform another operation?(Y/N)");
		ans1=sc.next().charAt(0);
		if(ans1=='N'||ans1=='n')
		System.out.println("Thank You For Using The System! Have A Great Day!");
		}while(ans1=='y'||ans1=='Y');
	}
}