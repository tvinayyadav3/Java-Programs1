package Question5;
class PatternA58{
	public static void main(String[] arr){
	int num=2;
	for(int i=1;i<=4;i++){
	for(int j=1;j<=i;j++){
	while(true){
	boolean flag=true;
	for(int k=2;k<=num/2;k++){
	if(num%k==0){
	flag=false;
	break;
	}
	}
	if(flag==true){
	System.out.print(num+" ");
	num++;
	break;
	}
	num++;
	}
	}
	System.out.println();
	}
	}
	}
