
public class star {
	public static void main(String[] args) {
		star s=new star();
		s.pairstar("Hello");

	}
	public void pairstar(String a)
	{
		char ch[]=a.toCharArray();
        int b=ch.length;
        int i;
        for( i=0;i<ch.length-1;i++){
		 if(ch[i]!=ch[i+1]){
			 System.out.print(ch[i]+"");
			}
		 else{
			 if(ch[i]==ch[i+1]){
				 System.out.print(ch[i]+"*");
				 
			 }
		 }
		}

		System.out.println(ch[i]+"");
	}

}
