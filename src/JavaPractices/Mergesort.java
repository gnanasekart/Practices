package JavaPractices;

public class Mergesort
{
int[] arr;
int[] temparr;

void merge(int[] arr)
{
this.arr = arr;
this.temparr = new int[arr.length];
doMerge(0, arr.length-1);
}

void doMerge(int low, int high)
{
if(low < high)
{
int middle = low + (high - low)/2;
doMerge(low, middle);
doMerge(middle+1, high);
merge(low, middle, high);
												 
}
}

//   0  1  2  3

//   4  1  7  3

void merge(int low, int middle, int high)
{
for (int i = low; i<= high; i++)

	temparr[i] = arr[i];
	int i = low;
	int j = middle + 1;
	int k = low;
	while(i <= middle && j <= high)
	{
		if(temparr[i] <= temparr[j])
		{
			arr[k] = temparr[i];
			i++;
		}
		i++;	
	}
	else
	{
		arr[k] = temparr[j];
		j++;
	}
	k++;

while (i <= middle)
{
	arr[k] = temparr[i];
	k++;
	i++;										   
}
}

public static void main(String[] args)
{
int[] arr= {4,1,7,3};
new Mergesort().merge(arr);
System.out.println("after sorting");
for(int i = 0; i<arr.length; i++)
{
	System.out.print(arr[i]+ " ");
}
}
}