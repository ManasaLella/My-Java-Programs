package com.jsp.arrays;
import java.util.Scanner;
public class Allprograms 
	{
		public static void Sum(int a[]){
			int sum=0;
			for(int i=0;i<a.length;i++)
				sum+=a[i];
			System.out.println("Sum OF Elements is: "+sum);
		}

		public static void EvenOddIndSum(int a[]){
			int Esum=0;
			int Osum=0;
			for(int i=0;i<a.length;i++){
				if(i%2==0)
					Esum+=a[i];
				else
					Osum+=a[i];
			}
			System.out.println("The Even Index Value Sum is: "+Esum);
			System.out.println("The Odd Index Value Sum is: "+Osum);

		}
		public static void EvenValSum(int a[]){
			int sum=0;
			for(int i=0;i<a.length;i++){
				if(a[i]%2==0)
					sum+=a[i];
			}
			System.out.println("The Even Value Sum is: "+sum);
		}

		public static void OddValSum(int a[]){
			int sum=0;
			for(int i=0;i<a.length;i++){
				if(a[i]%2!=0)
					sum+=a[i];
			}
			System.out.println("The Odd Value Sum is: "+sum);
		}

		public static void SecondLaEl(int a[]){
			for(int i=a.length-2;i>=0;i--){
				System.out.println("The Second Last Element is: "+a[i]);
				break;
			}
		}

		public static boolean isPrime(int n){
			if(n<=1)
				return false;
			for(int i=2;i<n/2;i++){
				if(n%i==0) return false;
			}
			return true;
				
		}

		public static void Prime(int a[]){
			for(int i=0;i<a.length;i++){
				if(isPrime(a[i]))
					System.out.println(a[i]);
			}
		}

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Size: ");
			int size = sc.nextInt();

			int a[] = new int[size];

			System.out.println("Enter Elements :");


			for(int i=0;i<a.length;i++){
				a[i]=sc.nextInt();
			} 

			System.out.println("Enter Choice: 1.EvenValues\n2.EvenOddIndexValues\n3.SumOfArray\n4.Second Last Element\n5.Prime On given Array\n6.Odd Values Of Given Array");
			int choice=sc.nextInt();

			switch(choice){
				case 1:
					EvenValSum(a);
					break;
				case 2:
					EvenOddIndSum(a);
					break;
				case 3:
					Sum(a);
					break;
				case 4:
					SecondLaEl(a);
					break;
				case 5:
					Prime(a);
					break;
				case 6:
					OddValSum(a);
					break;
				default:
					System.out.println("Invalid Choice: ");

			}
			
		}
	}


