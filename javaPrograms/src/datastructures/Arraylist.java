package datastructures;

public class Arraylist {
	
 Object []a=new Object[10];
 int count=0;
 
 public void increse() {
	 Object []obj=new Object[a.length+5];
	 for(int i=0;i<size();i++) {
		 obj[i]=a[i];
	 }
	 a=obj;
 }
 public int size() {
	 return count;
 }
 public void add(Object ele) {
	 if(count==a.length) {
		 increse();
	 }
	 a[count]=ele;
	 count++;
 }
 public Object get(int index) {
	 if(index<0||index>size())throw new IndexOutOfBoundsException();
	 return a[index];
	 
 }
 public void set(Object ele,int index) {
	 if(index<0||index>size()) throw new IndexOutOfBoundsException();
	 a[index]= ele;
 }
  public int indexof(Object ele) {
	  
	  for(int i=0; i<size();i++) {
		  if (a[i]==ele) 
			  return i;
			  }
	  return -1;
  }
	  public void addpos(Object ele,int index) {
		  if(index<0||index>size()) throw new IndexOutOfBoundsException();
		  if(index==count)increse();
		  for(int i=size();i>index;i--) {
			  a[i]=a[i-1];
		  }
		  a[index]=ele;
		  count++;
	  }
	  
	  public Object remove(int index) {
		  if(index<0||index>size()) throw new IndexOutOfBoundsException();
		  Object ele=a[index];
		  for(int i=index+1;i<size();i++) {
			  a[i-1]=a[i];
		  }
	count--;  
		return ele;
		  
	  }
	  }
	  
 
 
 
 
